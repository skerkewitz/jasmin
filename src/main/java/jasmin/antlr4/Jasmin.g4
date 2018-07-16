// Grammer definition for the Java human readable assembler file called Jasmin
grammar Jasmin;

Insn
  : 'aaload' | 'aastore' | 'aconst_null'
  | 'aload' | 'aload_w' | 'aload_0'
  | 'aload_1' | 'aload_2' | 'aload_3'
  | 'anewarray' | 'areturn' | 'arraylength'
  | 'astore' | 'astore_w' | 'astore_0'
  | 'astore_1' | 'astore_2' | 'astore_3'
  | 'athrow' | 'baload' | 'bastore'
  | 'bipush' | 'breakpoint' | 'caload'
  | 'castore' | 'checkcast' | 'd2f'
  | 'd2i' | 'd2l' | 'dadd'
  | 'daload' | 'dastore' | 'dcmpg'
  | 'dcmpl' | 'dconst_0' | 'dconst_1'
  | 'ddiv' | 'dload' | 'dload_w'
  | 'dload_0' | 'dload_1' | 'dload_2'
  | 'dload_3' | 'dmul' | 'dneg'
  | 'drem' | 'dreturn' | 'dstore'
  | 'dstore_w' | 'dstore_0' | 'dstore_1'
  | 'dstore_2' | 'dstore_3' | 'dsub'
  | 'dup' | 'dup2' | 'dup2_x1'
  | 'dup2_x2' | 'dup_x1' | 'dup_x2'
  | 'f2d' | 'f2i' | 'f2l'
  | 'fadd' | 'faload' | 'fastore'
  | 'fcmpg' | 'fcmpl' | 'fconst_0'
  | 'fconst_1' | 'fconst_2' | 'fdiv'
  | 'fload' | 'fload_w' | 'fload_0'
  | 'fload_1' |  'fload_2' | 'fload_3'
  | 'fmul' | 'fneg' | 'frem' | 'freturn'
  | 'fstore' | 'fstore_w' | 'fstore_0'
  | 'fstore_1' | 'fstore_2' | 'fstore_3'
  | 'fsub' | 'getfield' | 'getstatic'
  | 'goto' | 'goto_w' | 'i2d'
  | 'i2f' | 'i2l' | 'iadd' | 'iaload'
  | 'iand' | 'iastore' | 'iconst_0'
  | 'iconst_1' | 'iconst_2' | 'iconst_3'
  | 'iconst_4' | 'iconst_5' | 'iconst_m1'
  | 'idiv' | 'if_acmpeq' | 'if_acmpne'
  | 'if_icmpeq' | 'if_icmpge' | 'if_icmpgt'
  | 'if_icmple' | 'if_icmplt' | 'if_icmpne'
  | 'ifeq' | 'ifge' | 'ifgt' | 'ifle'
  | 'iflt' | 'ifne' | 'ifnonnull' | 'ifnull'
  | 'iinc' | 'iinc_w' | 'iload' | 'iload_w'
  | 'iload_0' | 'iload_1' | 'iload_2'
  | 'iload_3' | 'imul' | 'ineg'
  | 'instanceof' | 'int2byte' | 'int2char'
  | 'int2short' |
  // added this synonym
    'i2b' |
    // added this synonym
    'i2c' |
    // added this synonym
    'i2s' |
    'invokedynamic' |
    'invokeinterface' |
    'invokenonvirtual' |
    // added this synonym
    'invokespecial' |
    'invokestatic' |
    'invokevirtual' |
    'ior' |
    'irem' |
    'ireturn' |
    'ishl' |
    'ishr' |
    'istore' |
    'istore_w' |
    'istore_0' |
    'istore_1' |
    'istore_2' |
    'istore_3' |
    'isub' |
    'iushr' |
    'ixor' |
    'jsr' |
    'jsr_w' |
    'l2d' |
    'l2f' |
    'l2i' |
    'ladd' |
    'laload' |
    'land' |
    'lastore' |
    'lcmp' |
    'lconst_0' |
    'lconst_1' |
    'ldc' |
    'ldc_w' |
    'ldc2_w' |
    'ldiv' |
    'lload' |
    'lload_w' |
    'lload_0' |
    'lload_1' |
    'lload_2' |
    'lload_3' |
    'lmul' |
    'lneg' |
    'lookupswitch' |
    'lor' |
    'lrem' |
    'lreturn' |
    'lshl' |
    'lshr' |
    'lstore' |
    'lstore_w' |
    'lstore_0' |
    'lstore_1' |
    'lstore_2' |
    'lstore_3' |
    'lsub' |
    'lushr' |
    'lxor' |
    'monitorenter' |
    'monitorexit' |
    'multianewarray' |
    'new' |
    'newarray' |
    'nop' |
    'pop' |
    'pop2' |
    'putfield' |
    'putstatic' |
    'ret' |
    'ret_w' |
    'return' |
    'saload' |
    'sastore' |
    'sipush' |
    'swap' |
    'tableswitch';





DANNOTATION: '.annotation';
DBYTECODE: '.bytecode';
DATTRIBUTE: '.attribute';
DCATCH: '.catch';
DCLASS: '.class';
DDEPRECATED: '.deprecated';
DEND: '.end';
DFIELD: '.field';
DIMPLEMENTS: '.implements';
DINNER: '.inner';
DINTERFACE: '.interface';
DLIMIT: '.limit';
DLINE: '.line';
DMETHOD: '.method';
DSET: '.set';
DSOURCE: '.source';
DSUPER: '.super';
DTHROWS: '.throws';
DVAR: '.var';
DDEBUG: '.debug';
DENCLOSING: '.enclosing';
DSIGNATURE: '.signature';
DSTACK: '.stack';

// reserved_words used in jasmin.Jasmin directives
FIELD: 'field';
FROM: 'from';
METHOD:  'method';
TO: 'to';
IS: 'is';
USING: 'using';
SIGNATURE: 'signature';
STACK:'stack';
OFFSET:'offset';
LOCALS:'locals';
USE:'use';
INNER:'inner';
OUTER:'outer';
CLASS:'class';
VISIBLE:'visible';
INVISIBLE:'invisible';
VISIBLEPARAM:'visibleparam';
INVISIBLEPARAM:'invisibleparam';

// Special-case instructions
TABLESWITCH:'tableswitch';
LOOKUPSWITCH:'lookupswitch';
DEFAULT: 'default';

// Access flags
PUBLIC : 'public';
PRIVATE: 'private';
PROTECTED: 'protected';
STATIC: 'static';
FINAL: 'final';
SYNCHRONIZED: 'synchronized';
VOLATILE: 'volatile';
TRANSIENT: 'transient';
NATIVE: 'native';
INTERFACE: 'interface';
ABSTRACT: 'abstract';

ANNOTATION: 'annotation';
ENUM: 'enum';
BRIDGE: 'bridge';
VARARGS: 'varargs';
STRICT: 'fpstrict';
SYNTHETIC: 'synthetic';

COLON: ':';
EQ: '=';

LINE_COMMENT : ';' ~[\r\n]* -> skip;
WS : [ \t\r\n]+ -> skip ; // skip spaces, tabs, newlines
//WS : [ \t]+ -> skip ; // skip spaces, tabs, newlines
//SEP: '\n';

compilation_unit
  : jasmin_header method_spec+ EOF
//  : jasmin_header inners? fields? methods EOF
  ;

jasmin_header
//  : bytecode_spec? source_spec? class_spec super_spec impls? signature_spec? enclosing_spec?
//  deprecated_spec? annotations? generic_attributes? debug_extension?
//  ;
  : class_spec super_spec
  ;



// ---- Signature specification
signature_spec
  : DSIGNATURE signature_expr //SEP
  ;

signature_expr
  : sig=Str // Str:sig
  ;


// ---- Deprecated attribute
deprecated_spec
  : DDEPRECATED deprecated_expr //SEP
  ;

deprecated_expr
  :
//  {: classFile.setDeprecated(); :}
  ;

// ---- Bytecode version specification
bytecode_spec
  : DBYTECODE n=Float //SEP
//  {: classFile.setVersion(n.num_val); :}
  ;

// ---- Source specification
source_spec
  : DSOURCE s=Str //SEP
//  {: classFile.setSource(s.str_val); :}
  | DSOURCE w=Word //SEP
//  {: classFile.setSource(w.str_val); :}
  | /* nothing */
  ;

// ---- Class specification
class_spec
  : DCLASS a=access name=classname //SEP
//  {: classFile.setClass(name.str_val, (short)(a.int_val | RuntimeConstants.ACC_SUPER)); :}
  | DINTERFACE a=access name=classname //SEP
//  {: classFile.setClass(name.str_val, (short)(a.int_val | RuntimeConstants.ACC_SUPER | RuntimeConstants.ACC_INTERFACE)); :}
  ;

classname
  : w=Word
  ;

access: access_list;
access_list: access_item+;

access_item
  : PUBLIC
  | PRIVATE
  | PROTECTED
  | STATIC
  | FINAL
  | SYNCHRONIZED
  | VOLATILE
  | TRANSIENT
  | NATIVE
  | INTERFACE
  | ABSTRACT
  | ANNOTATION
  | ENUM
  | BRIDGE
  | VARARGS
  | STRICT
  | SYNTHETIC
  ;


// ---- Superclass specification
super_spec
  : DSUPER name=classname //SEP
  ;

// ---- Implements specification
impls
  : implements_list
  //| /* empty */
  ;

implements_list
  : implements_list implements_spec
  | implements_spec
  ;

implements_spec
  : DIMPLEMENTS name=classname //SEP
  ;

// ---- Annotation specification
annotations
  : ann_cls_list
  //| /* empty */
  ;

ann_cls_list
  : ann_cls_list ann_cls_spec
  | ann_cls_spec
  ;

ann_cls_spec
  : ann_cls_expr ann_arglist endannotationsep
  ;

endannotationsep
  : endannotation //SEP
  ;

endannotation
  : DEND ANNOTATION
  ;

ann_cls_expr
  : DANNOTATION ann_clf_expr
  ;

ann_clf_expr
  : VISIBLE name=classname //SEP
  | INVISIBLE name=classname //SEP
  ;

ann_met_expr
  : VISIBLE name=classname //SEP
  | INVISIBLE name=classname //SEP
  | VISIBLEPARAM n=Int name=classname //SEP
  | INVISIBLEPARAM n=Int name=classname //SEP
  ;

ann_arglist: ann_arg_list | /* empty */ ;

ann_arg_list: ann_arg_list ann_arg_spec | ann_arg_spec ;
ann_arg_spec: ann_arg_expr EQ ann_value_list ;

ann_arg_expr
  : n=Word dsc=Word
  	//{: classFile.addAnnotationField(n.str_val, dsc.str_val, null); :}
  | n=Word desc=Word sub=Word
//  	{: classFile.addAnnotationField(n.str_val, dsc.str_val, sub.str_val); :}
  ;

ann_def_spec
  : DEFAULT //SEP
  ;

ann_value_list
  : ann_value_items
  | ann_ann_list
  ;
ann_value_items: ann_value_items ann_value | ann_value ;

ann_value
  : v=any_item
//  	{: classFile.addAnnotationValue(v.var_val); :}
  ;

ann_ann_list: ann_ann_list ann_ann_value | ann_ann_value ;
ann_ann_value: DANNOTATION ann_nest ann_arglist endannotationsep ;

ann_nest
//  : SEP
  :
//{: classFile.nestAnnotation(); :}
  ;

ann_def_val
  : ann_def_expr EQ ann_value_list
  ;

ann_def_expr
  : dsc=Word
//  {: classFile.addAnnotationField(null, dsc.str_val, null); :}
  | dsc=Word sub=Word
//  {: classFile.addAnnotationField(null, dsc.str_val, sub.str_val); :}
  ;

// ---- SourceDebugExtension attribute specification
debug_extension: debug_list | /* empty */ ;
debug_list: debug_list debug_spec | debug_spec ;
debug_spec
  : DDEBUG s=Str //SEP
//  {: classFile.setSourceDebugExtension(s.str_val); :}
  ;


// ---- EnclosingMethod attribute specification
enclosing_spec
  : DENCLOSING METHOD w=Word //SEP
//  {: classFile.setEnclosingMethod(w.str_val); :}
  |
  ;


// ---- Generic attributes specification
generic_attributes: generic_list | /* empty */ ;
generic_list: generic_list generic_spec | generic_spec ;
generic_spec: DATTRIBUTE generic_expr; //SEP ;

generic_expr
  : name=Word file=Str
//  {: classFile.addGenericAttr(name.str_val, file.str_val); :}
  ;

// ---- Fields
fields: field_list | /* empty */ ;
field_list: field_list field_spec | field_spec ;
field_spec
  : DFIELD a=access name=Word desc=Word SIGNATURE sig=Str v=optional_default //SEP
//  {: classFile.addField((short)a.int_val, name.str_val, desc.str_val, sig.str_val, v.var_val); :}
  | DFIELD a=access name=Word desc=Word v=optional_default //SEP
//  {: classFile.addField((short)a.int_val, name.str_val, desc.str_val, null, v.var_val); :}
  | DFIELD field_start field_exts endfield
  ;

// default value for a field
optional_default
  : EQ v=item
//  {: RESULT.var_val = v.var_val; :}
  | /* empty */
  //    {: RESULT.var_val = null; :}
  ;

// multiline form of field description
field_start
  : a=access name=Word desc=Word v=optional_default //SEP
  //{: classFile.beginField((short)a.int_val, name.str_val, desc.str_val, v.var_val); :}
  ;

endfield
  : DEND FIELD //SEP
//  {: classFile.endField(); :}
  ;

field_exts: field_ext_list | /* empty */ ;
field_ext_list: field_ext_list field_ext_expr | field_ext_expr ;
field_ext_expr
  : DSIGNATURE signature_expr //SEP
  | DATTRIBUTE generic_expr //SEP
  | DDEPRECATED deprecated_expr //SEP
  | DANNOTATION ann_clf_expr ann_arglist endannotationsep
  ;

// an item is an integer, a float/double/long, or a quoted string
item
  : i=Int //{: RESULT.var_val = new Integer(i.int_val); :}
  | n=Float //{: RESULT.var_val = n.num_val; :}
  | s=Str //{: RESULT.var_val = s.str_val; :}
  ;

// an item is any possible type
any_item
  : w=Word //{: RESULT.var_val = w.str_val; :}       // for enum
  | v=item //{: RESULT.var_val = v.var_val; :}
  ;

// ---- Inner classes
inners: inner_list | /* empty */ ;
inner_list: inner_list inner_spec | inner_spec ;

inner_spec
  : DINNER CLASS a=access n=inner_name i=inner_inner o=inner_outer //SEP
//  {: classFile.addInner((short)a.int_val, n.str_val, i.str_val, o.str_val); :}
  | DINNER INTERFACE a=access n=inner_name i=inner_inner o=inner_outer //SEP
//  {: classFile.addInner((short)(a.int_val | RuntimeConstants.ACC_INTERFACE), n.str_val, i.str_val, o.str_val); :}
  ;

inner_name
  : w=Word
//  {: RESULT.str_val = w.str_val; :}
  | /* empty */
//  {: RESULT.str_val = null; :}
  ;

inner_inner
  : INNER w=classname
//  {: RESULT.str_val = w.str_val; :}
  | /* empty */
//  {: RESULT.str_val = null; :}
  ;

inner_outer
  : OUTER w=classname
//  {: RESULT.str_val = w.str_val; :}
  | /* empty */
//  {: RESULT.str_val = null; :}
  ;

// --- Methods ---
method_spec: DMETHOD i=access name=Word statement* DEND METHOD;

statement
  : instruction     #InstructionStatement
  | directive       #DirectiveStatement
  | label           #LabelStatement
  ;

label
  : l=Word COLON
  | l=Int COLON instruction
  ;

// Directives (.catch, .set, .limit, etc.)
directive
  : DVAR var_expr
  | DLIMIT LOCALS v=Int         // .limit locals
  | DLIMIT STACK v=Int          // .limit stack
  | DLINE line_expr
  | DTHROWS throws_expr
  | DCATCH catch_expr
  | DSET set_expr
  | DSIGNATURE signature_expr
  | DATTRIBUTE generic_expr
  | DDEPRECATED deprecated_expr
  | DANNOTATION ann_met_expr ann_arglist endannotation
  | DANNOTATION ann_def_spec ann_def_val endannotation
  | DSTACK stackmap
  ;

// .stack
stackmap
  : defstack stack_map_frame_desc endstack
  | USE defstack_same stack_map_frame_desc endstack
  ;

defstack_same
  : defstack_same_expr LOCALS //SEP
  ;

defstack_same_expr
  : n=Int
//  {: classFile.beginStack(n.int_val); :}
  | /* empty */
//  {: classFile.beginStack(true); :}
  ;

defstack
  : //SEP
//  {: classFile.beginStack(false); :}
  ;

stack_map_frame_desc
  : stack_offset_def stack_items
  ;

stack_offset_def
  : OFFSET n=Int //SEP
//  {: classFile.plantStackOffset(n.int_val); :}
  | OFFSET w=Word //SEP
//  {: classFile.plantStackOffset(w.str_val); :}
  | /* nothing */
  ;

stack_items
  : stack_items stack_item
  | /* nothing */
  ;

stack_item
  : stack_item_expr //SEP
  ;

stack_item_expr
  : LOCALS w=Word
//  {: classFile.plantStackLocals(w.str_val, null); :}
  | LOCALS w=Word val=Word
//  {: classFile.plantStackLocals(w.str_val, val.str_val); :}
  | LOCALS w=Word n=Int
//  {: classFile.plantStackLocals(w.str_val, String.valueOf(n.int_val)); :}
  | STACK w=Word
//  {: classFile.plantStackStack(w.str_val, null); :}
  | STACK w=Word val=Word
//  {: classFile.plantStackStack(w.str_val, val.str_val); :}
  | STACK w=Word n=Int
//  {: classFile.plantStackStack(w.str_val, String.valueOf(n.int_val)); :}
  ;

endstack
  : DEND STACK
//  {: classFile.endStack(); :}
  ;

//
// .var <num> is <name> <desc> from StartLab to EndLab
// .var <num> is <name> <desc> signature <sign> from StartLab to EndLab
//
var_expr
  : reg=Int IS name=Word desc=Word sign=optional_signature FROM slab=Word TO elab=Word
//  {: classFile.addVar(slab.str_val, elab.str_val, name.str_val, desc.str_val, sign.str_val, reg.int_val); :}
  | reg=Int IS name=Word desc=Word sign=optional_signature
//  {: classFile.addVar(null, null, name.str_val, desc.str_val, sign.str_val,  reg.int_val); :}
  | reg=Int IS name=Word desc=Word sign=optional_signature FROM soff=Int TO eoff=Int
//  {: classFile.addVar(soff.int_val, eoff.int_val, name.str_val, desc.str_val, sign.str_val, reg.int_val); :}
  ;

// optional signature specification for a .var
optional_signature
  : SIGNATURE s=Str
//  {: RESULT.str_val = s.str_val; :}
  | /* empty */
//  {: RESULT.str_val = null; :}
  ;

// .line <num>
line_expr
  : v=Int
  ;

// .throws <class>
throws_expr
  : s=classname
//  {: classFile.addThrow(s.str_val); :}
  ;

// .catch <class> from <label1> to <label2> using <branchlab>
catch_expr
  : aclass=classname FROM fromlab=Word TO tolab=Word USING branchlab=Word
//  {: classFile.addCatch(aclass.str_val, fromlab.str_val, tolab.str_val, branchlab.str_val); :}
  | aclass=classname FROM fromoff=Int TO tooff=Int USING branchoff=Int
//  {: classFile.addCatch(aclass.str_val, fromoff.int_val, tooff.int_val, branchoff.int_val); :}
  ;

// .set <var> = <val>
set_expr
  : name=Word v=any_item
//  {: scanner.dict.put(name.str_val, v); :}
  ;

instruction
  : simple_instruction
  | complex_instruction
  ;

// Various patterns of instruction:
//      instruction [<pattern>]
simple_instruction
  : i=Insn                  #Opcode
  | i=Insn n=Int            #OpcodeInt
  | i=Insn n1=Int n2=Int    #OpcodeIntInt
  | i=Insn n=Float          #OpcodeFloat
  | i=Insn n=Word           #OpcodeWord
  | i=Insn n=Word n2=Int    #OpcodeWordInt
  | i=Insn n1=Word n2=Word  #OpcodeWordWord
  | i=Insn n=Str            #OpcodeString
  | i=Insn n=Relative       #OpcodeRelative  // jump +5
  ;

// complex (i.e. multiline) instructions
//      lookupswitch <lookup>
//      tableswitch  <table>
complex_instruction
  : LOOKUPSWITCH lookup
  | TABLESWITCH table
  ;

// lookupswitch
//     <value> : <label>
//     <value> : <label>
//     ...
//     default : <label>
lookup
  : lookup_args lookup_list lookup_default
  ;

lookup_args
  : //SEP     // no arguments to lookupswitch
//  {: classFile.newLookupswitch(); :}
  ;

lookup_list
  : lookup_list lookup_entry
  | lookup_entry
  ;

lookup_entry
  : i=Int COLON w=Word //SEP
//  {: classFile.addLookupswitch(i.int_val, w.str_val); :}
  | i=Int COLON off=Int //SEP
//  {: classFile.addLookupswitch(i.int_val, off.int_val); :}
  ;

lookup_default
  : DEFAULT COLON w=Word
//  {: classFile.endLookupswitch(w.str_val); :}
  | DEFAULT COLON off=Int
//  {: classFile.endLookupswitch(off.int_val); :}
  ;


// tableswitch <low> [<high>]
//     <label>
//     <label>
//     ...
//     default : <label>

table
  : table_args table_list table_default
  ;

table_args
  : low=Int //SEP     /* one argument : the <low> parameter */
//  {: classFile.newTableswitch(low.int_val); :}
  | low=Int high=Int //SEP     /* two arguments : <low> and <high> parameters */
//  {: classFile.newTableswitch(low.int_val, high.int_val); :}
  ;

table_list: table_list table_entry | table_entry ;
table_entry
  : w=Word //SEP
//  {: classFile.addTableswitch(w.str_val); :}
  | off=Int //SEP
//  {: classFile.addTableswitch(off.int_val); :}
  ;

table_default
  : DEFAULT COLON w=Word
//  {: classFile.endTableswitch(w.str_val); :}
  | DEFAULT COLON off=Int
//  {: classFile.endTableswitch(off.int_val); :}
  ;

/// Name
Word: ID_START ID_CONTINUE*;      // Identifer
Str: '"' (~'"')* '"';             // String in "double quotes"
Relative: ID_START ID_CONTINUE*;

Int                               // Int value
  : NON_ZERO_DIGIT DIGIT*
  | '0'+
  ;

Float                             // float value
  : Int FRACTION
  ;

fragment NON_ZERO_DIGIT: [1-9];
fragment DIGIT: [0-9];
fragment FRACTION: '.' DIGIT+;

fragment ID_START
    : '_'
    | '-'
    | '<'
    | '['
    | [A-Z]
    | [a-z]
    ;

fragment ID_CONTINUE: ID_START | [0-9./>()];
