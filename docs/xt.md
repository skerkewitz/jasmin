# JasminXT Syntax

Daniel Reynaud, Mart 2006


## About This Document

This guide describes the rules and syntax used in JasminXT, the extension of the jasmin.Jasmin language in version 2.0. If you are new to jasmin.Jasmin, you should refer to the jasmin.Jasmin user guide. Note that this document doesn't explain the Java Virtual Machine itself, or give syntax notes for every instruction known to jasmin.Jasmin. See the Java Virtual Machine specification for more information on the JVM.<p>

## Why a new Jasmin language?

Jasmin is the de-facto standard Java assembly language. It is useful to explore the possibilities of bytecode, but it does not offer a real low level control over the produced output. Therefore it is not suitable to generate test cases for virtual machines or bytecode verifier. This new version of the jasmin.Jasmin language, called JasminXT, provides optional directives and other syntax updates to have more control over the output and to stick with the latest changes of the Java language.

JasminXT has been defined for the tinapoc project. The purpose of the tinapoc project is to create a reliable Java reverse engineering toolkit. See the tinapoc homepage for more information : [http://tinapoc.sourceforge.net/](http://tinapoc.sourceforge.net/)

## Summary of the new features

  * Since 2.4:
    * accept 'd'-suffix in float constant (no attempt cast to float)
    * redesign to dynamic compiler class creation
    * some cosmetic bugfixes
  * Since 2.3:
    * added 'wide'-aliases to two-face instructions
  * Since 2.2:
    * some bug fixes in the diagnostic
    * added support for attribute StackMapTable (directive .stack) described in JDK1.6
    * added keyword 'use' to directive .stack
    * added support for \uXXXX escape sequence in the names (just as in the Java)
    * instruction ldc_w always generates wide index
    * changed syntaxes of the non-standard identifiers (or overloaded keywords), now it hasto be signgle quoted  and can't be empty
  * Since 2.1:
    * some bug fixes with string and number parsing
    * added support for \uXXXX escape sequences
    * added support for access flags ACC_STRICT (fpstrict) and ACC_SYNTHETIC (synthetic)
    * added signatures for local variables support
    * several .debug directives are permitted
    * added the invokedynamic instruction
    * improved the syntax of the StackMap attribute (.stack directive)
    * new command-line option -e to support different encodings
    * added support for non-standard identifiers in double-quotes
    * fields can now be defined on multiple lines
    * new directives have been included : .inner, .attribute, .deprecated, .annotation
  * Since 2.0:
    * use of offsets for branch targets, local variable visibility and exception handlers. The offsets can either be absolute or relative:
    * the following access flags are now supported: ACC_ENUM, ACC_ANNOTATION, ACC_BRIDGE and ACC_VARARGS
    * the .bytecode directive has been added, to set the bytecode version in the class file. Example: `.bytecode 49.0`
    * it is now possible to add a SourceDebugExtension attribute to the class with the following directive: `.debug "some string here"`
    * same thing for the EnclosingMethod attribute: `.enclosing method "some/package/Foo/someMethod(I)V"`
    * support for the Signature attribute (in the classes, methods and fields): `.signature "<my::own>Signature()"` .field myField Ljava/lang/String; signature "<my::own>Signature()"</pre><br>
    * support for the StackMap attribute, using the .stack directive in a method definition
    * it is now possible to give the offset of an instruction before the instruction itself, like in the following code snippet:

### Relative offset example

      goto  12  ; absolute offset : go to bytecode at offset 12
      goto +5   ; relative offset : go 12 bytes forward
      goto -8   ; relative offset : go 8 bytes backwards
      
### Instruction offset example        
      0: aload_0
      1: invokespecial java/lang/Object/<init>()V
      4: aload_0
      5: ldc2_w 3.14159


## JasminXT File Format

This new version is an extension of the existing jasmin.Jasmin language, therefore old Jasmin files should still compile correctly with newer versions of Jasmin. JasminXT is supported by Jasmin 2.0 or higher. **Changes in Jasmin 2.4 are in bold**.

In the rest of this document, words between \[ and \] are optional. The syntax of a JasminXT file is the following:

    <jas_file> {
      <jasmin_header>
      [<field>]*
      [<method>]*
    }


## JasminXT Header

    <jasmin_header> {
      [.bytecode <x.y>]
      [.source <sourcefile>]
      <class_spec>
      <super_spec>
      <implements>
      [.signature "<signature>"]
      [.enclosing method <method_name>]
      [.debug "<debug_source_extension>"]*
      [.inner class [<access>] [<name>] [inner <lassname>] [outer <name>]]*
      [.inner interface [<access>] [<name>] [inner <classname>] [outer <name>]]*
    }

example:
    
    .bytecode 49.0
    .source hello.j
    .class hello
    .super java/lang/Object
    .signature "<my::own>Signature()"
    .enclosing method foo/bar/Whatever/someMethod()</pre>
    .debug "this string will be included in the SourceDebugExtension attribute"
    .debug "this string too"

The `.bytecode` directive sets the version of the bytecode in the class file.

The `.signature` directive, when used in the header of the jasmin.Jasmin file, sets the Signature attribute for the class (the argument is a string between double quotes)

The `.enclosing` directive sets the EnclosingMethod attribute for the class. The argument is a supposed to be a method name, but it can be any string between double quotes.

The `.debug` directive sets the SourceDebugExtension attribute for the class (the argument is also a string between double quotes)</p>


## JasminXT Class, Super Class and Interfaces Definition

    <class_spec> {
      .class <access_spec> <class_name>
    }


where `<access_spec>` is any number of words taken from this list: `public, private, protected, static, final, synchronized, native, final, super, interface, abstract, annotation, enum, bridge/volatile, transient/varargs` and `<class_name>` is the fully qualified internal form of the class, such as `my/package/MyClass`

    <super_spec> {
      .super <class_name>
    }


    <mplements> {
      .implements <class_name>*
    }


The .super and .implements directives have not been modified in JasminXT<br>
The .implements directive can be repeated in order to implement multiple interfaces</p><br>


## jasminXT Field Definition

    <field> {
      .field <access_spec> <field_name> <descriptor> [signature <signature>] [ = <value> ]
    | .field <access_spec> <field_name> <descriptor> [signature <signature>] [ = <value> ]
          [<field_attribute>]*
      .end field          
    }


If present, the Signature attribute will be set in the class file for this field with the given
quoted string as an argument.</p>


    <field_attribute> {
      .deprecated
    | .attribute <name> <file_name>
    | .signature <signature>
    | .annotation (...)
    }


(see below for the definition of the annotation and the attribute directives)

examples :
    
    .field enum myField Ljava/lang/String; signature "<my::own>Signature()" = "val"
    .field static hello_string Ljava/lang/String;
      .signature "mySignature"
      .deprecated
    .end field


## JasminXT Method Definition

The general format of a method definition has not changed in JasminXT.


    <method> {
      .method <access_spec> <method_name> <descriptor>
        <statement>*
      .end method
    }

## JasminXT Method Statements

    <statement> {
      .limit stack <integer>
      | .limit locals <integer>
      | .line <integer>
      | .var <var_number> is <var_name> <descriptor> [signature <sign>] from <label1> to <label2>
      | .var <var_number> is <var_name> <descriptor> [signature <sign>] from <offset1> to <offset2>
      | .throws <classname>
      | .catch <classname> from <label1> to <label2> using <label3>
      | .catch <classname> from <offset1> to <offset2> using <offset3>
      | .signature "<signature>"
      | .stack
           [offset {<pc> | <label>}]
           [locals <verification_type> [<verification_arg>]]
          (...)
          [stack  <verification_type> [<verification_arg>]]
          (...)
      .end stack
      | .stack use [n] locals
           (...)
      .end stack
      | <instruction> [<instruction_args>]
      | <Label>:
      | .deprecated
      | <generic> ; see below for the use of generic attributes
    }


In Jasmin XT you can now use offsets instead of labels for the local variable definitions and for the exception handlers definitions.</p>

The .signature sets the Signature attribute for this method with the given quoted string.

You can now also define StackMap (or StackMapTable) attributes using the .stack directive. <pc> is an offset in the local bytecode array.
<verification_type> is one of the following keywords : Top, Integer, Float, Long, Double, Null, UninitializedThis, Object or Uninitialized. Object takes a <classname> as a parameter. Uninitialized takes an integer or a
label as a parameter. Also, jasmin  allows to use "short" notation. The '.stack use \[n\] locals' directive results in copy first <n> values from
previous .stack directive. If <n> is omitted, all values are copied.</p> 
<p>NOTE: If bytecode version is 50 or above jasmin generates StackMapTable attribute in accordance with specification of the new 'ClassFile  Format'
edition. If bytecode version is 49 or below jasmin generate StakMap attribute in accordance with CLDC specification.<p>

examples :

    .stack
        offset 16
        locals Null
        locals Top
        locals Object allo
        stack Uninitialized 12
    .end stack

    .stack
        ; offset is not specified, the offset of the current opcode will be used
        locals Null
        locals Top
        locals Object allo
        stack Uninitialized Label0
    .end stack


This statement defines a single stack map frame. All the stack map frames defined in a method are then aggregated and form the StackMap attribute for the method. The last example my be wrote at the short notation as:


    .stack use locals
        stack Uninitialized Label0
    .end stack

## JasminXT Instructions

    <instruction> {
      [<pc>:] <opcode> [<instruction_args>]
    }

The main change in JasminXT is that it is now possible to put the offset of the instruction before the opcode (the <pc>: statement). The pc is processed as a label, therefore you can virtually put any number as the pc but it won't change
the actual pc of the bytecode.


Another update is that it is now possible to use offsets (both relative and absolute) as branch targets instead of labels. The offset is considered to be relative if it begins with '$+' or '$-'.

example :

    goto  n  ; absolute offset : go to the bytecode labelled n
    goto $+n  ; relative offset : go n bytes forward (from the offset of this goto)
    goto $-n  ; relative offset : go n bytes backwards


If something hasn't been documented here, it means that it hasn't changed, so you can still refer to the jasmin.Jasmin <a href="guide.html">user guide


**Added '_w' aliase to \[adfli\]-load/store, iinc and ret instructions (e.g. aload - aload_w). Using '_w' postfix guarantees wide-form of byte-code generation**

## Generic Attributes

Generic attributes are supported in class/field/method definitions as follows :
    
    generic> = {
      .attribute <name> <file_name>
    }

<name> is the name of the attribute and <file_name> is the name of the file containing the data of the attribute (between double quotes). If the generic attribute is in the body of the method, the following logic is used : if it is the first statement in the method, the attribute will be added as a method attribute, otherwise it will be added as a Code attribute.

<h1>Annotations</h1>
Thanks to Iouri Kharon for implementing this. Here are his explanations :<br>

<p>Added a new directive .annotation to create the AnnotationDefault,
   RuntimeVisibleAnnotation, RuntimeInvisibleAnnotation,
   RuntimeVisibeParameterAnnotation, RuntimeInvisibleParameterAnnotation
   attributes. The directive arguments are verified to have valid values
   and correct signatures.<br>
   Complex (nested) annotations are supported as well as arrays of them.<br>
   The generic format is:
<pre>
<annotation> = {
    .annotation visible <classname>
  | .annotation invisible <classname>>
  | .annotation visibleparam <paramnum> <classname>
  | .annotation invisibleparam <paramnum> <classname>
  | .annotation default
         ........
    .end annotation

Field format (except AnnotationDefault):

    <name> <signchar> = <value>*
  | <name> @ = .annotation
            ........
    .end annotation
}
</pre>

AnnotationDefault supports only one field and the <name> tag is not used. Nested annotations must be with the <name> tag and can have any number of fields. Besides, 'empty annotation' is forbidden for AnnotationDefault. Lastly, AnnotationDefault can be used only once for each method. Other annotation types can be used many times and will accumulate information.


Copyright (c) Daniel Reynaud, Mart 2006
