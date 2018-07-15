/* --- Copyright Jonathan Meyer 1997. All rights reserved. -----------------
 > File:        jasmin/src/jasmin/ClassFile.java
 > Purpose:     Uses a parser_ and the JAS package to create Java class files
 > Author:      Jonathan Meyer, 10 July 1996
 */

package jasmin;


/*
 * This class is a bit monolithic, and should probably be converted into
 * several smaller classes. However, for this specific application,
 * its acceptable.
 *
 */

import jas.*;
import jasmin.parser_.Scanner;
import jasmin.parser_.parser;
import jasmin.util.ScannerUtils;
import java_cup.internal_error;

import java.io.*;
import java.util.*;

/**
 * A ClassFile object is used to represent the binary data that makes up a
 * Java class file - it also serves as the public
 * API to the jasmin.Jasmin assembler, though users should beware: the API
 * is likely to change in future versions (though its such a small API
 * at the moment that changes are likely to have only a small impact).<p>
 * <p>
 * To assemble a file, you first construct a jasmin.ClassFile object, then
 * call readJasmin() to read in the contents of a jasmin.Jasmin assembly file, then
 * call write() to write out the binary representation of the class file.<p>
 * <p>
 * There are a few other utility methods as well. See Assembler.java for an example
 * which uses all of the public methods provided in ClassFile.
 *
 * @author Jonathan Meyer
 * @version 1.05, 8 Feb 1997
 */
public class ClassFile {

  private static final boolean PARSER_DEBUG = false;

  // state info for the class being built
  String filename;
  ClassEnv class_env;
  String class_name;
  String source_name;
  jasmin.parser_.Scanner scanner;

  // state info for the current method being defined
  ExceptAttr except_attr;
  Catchtable catch_table;
  LocalVarTableAttr var_table;
  LocalVarTypeTableAttr vtype_table;
  LineTableAttr line_table;
  CodeAttr code;
  Method cur_method;
  Var cur_field;
  Hashtable labels;
  StackMap stackmap;
  VerifyFrame verifyframe;
  Annotation cur_annotation;

  int line_label_count, line_num, stack_map_label_count;
  boolean auto_number, class_header;
  Insn buffered_insn;

  // state info for lookupswitch and tableswitch instructions
  Vector switch_vec;
  int low_value;
  int high_value;


  static final String BGN_METHOD = "jasmin_reserved_bgnmethod:";
  static final String END_METHOD = "jasmin_reserved_endmethod:";

  // number of errors reported in a file.
  int errors;

  //
  // Error reporting method
  //
  public void report_error(String msg) {
    report_error(msg, false);
  }

  void report_error(String msg, boolean BadIntVal) {

    errors++;

    // Print out filename/linenumber/message
    System.err.print(filename + ":");
    if (scanner == null)
      System.err.println(" " + msg + ".");
    else {
      String dia_line;
      int dia_linnum, dia_charpos;

      if (BadIntVal && scanner.char_num >= 0) {
        dia_line = scanner.int_line;
        dia_linnum = scanner.int_line_num;
        dia_charpos = scanner.int_char_num;
      } else {
        dia_line = scanner.line.toString();
        dia_linnum = scanner.line_num;
        dia_charpos = scanner.char_num;
      }
      System.err.println(dia_linnum + ": " + msg + ".");
      if (scanner.char_num >= 0) {
        System.err.println(dia_line);

        // Print out where on the line the scanner got to
        int i;
        for (i = 0; i < dia_charpos; i++) {
          if (dia_line.charAt(i) == '\t') {
            System.err.print("\t");
          } else {
            System.err.print(" ");
          }
        }
        System.err.println("^");
      }
    }
  }

  //
  // called by the .source directive
  //
  public void setSource(String name) {
    source_name = name;
  }

  //
  // called by the .bytecode directive
  //
  public void setVersion(Number version) {
    String str = version.toString();
    int idx = str.indexOf(".");
    if (!(version instanceof Float) || (idx == -1))
      report_error("invalid bytecode version number : " + str);
    class_env.setVersion(Short.parseShort(str.substring(0, idx)), Short.parseShort(str.substring(idx + 1, str.length())));
  }

  //
  // called by the .class directive
  //
  public void setClass(String name, short acc) {
    class_name = name;
    class_env.setClass(new ClassCP(name));
    class_env.setClassAccess(acc);
    class_header = true;
  }

  //
  // called by the .super directive
  //
  public void setSuperClass(String name) {
    class_env.setSuperClass(new ClassCP(name));
  }

  //
  // called by the .implements directive
  //
  public void addInterface(String name) {
    class_env.addInterface(new ClassCP(name));
  }


  //
  // called by the .debug directive
  //
  public void setSourceDebugExtension(String str) {
    class_env.setSourceDebugExtension(str);
  }


  //
  // called by the .enclosing directive
  //
  public void setEnclosingMethod(String str) {
    try {
      if (str.indexOf("(") != -1) { // full method description
        String[] split = ScannerUtils.splitClassMethodSignature(str);
        class_env.setEnclosingMethod(split[0], split[1], split[2]);
      } else                         // just a class name
        class_env.setEnclosingMethod(str, null, null);
    } catch (IllegalArgumentException e) {
      report_error(e.toString());
    }
  }

  // parser_ diagnostics
  private static void opened_annotation(String fld) throws jasError {
    throw new jasError("Skipped .end annotation in " + fld);
  }

  private static void outside(String dir) throws jasError {
    throw new jasError("illegal use of " + dir +
            " outside of method/field definition or class header");
  }

  //
  // called at end of jasmin-header (resolve class variables)
  //
  public void endHeader() throws jasError {
    if (cur_annotation != null)
      opened_annotation("class header");

    class_env.endHeader();  // resolve annotations
    class_header = false;
  }

  //
  // called by the .signature directive
  //
  public void setSignature(String str) throws jasError {
    SignatureAttr sig = new SignatureAttr(str);
    if (cur_method != null) {
      cur_method.setSignature(sig);
    } else if (cur_field != null) {
      cur_field.setSignature(sig);
    } else if (class_header) {
      class_env.setSignature(str);
    } else {
      outside(".signature");
    }
  }

  //
  // called by the .deprecated directive
  //
  //
  public void setDeprecated() throws jasError {
    DeprecatedAttr depr = new DeprecatedAttr();
    if (cur_method != null) {
      cur_method.setDeprecated(depr);
    } else if (cur_field != null) {
      cur_field.setDeprecated(depr);
    } else if (class_header) {
      class_env.setDeprecated(depr);
    } else {
      outside(".deprecated");
    }
  }

  //
  // called by the .attribute directive
  //
  public void addGenericAttr(String name, String file)
          throws IOException, jasError {
    GenericAttr gattr = new GenericAttr(name, file);
    if (cur_method != null) {
      flushInsnBuffer();
      if (code != null) code.addGenericAttr(gattr);
      else cur_method.addGenericAttr(gattr);
    } else if (cur_field != null) {
      cur_field.addGenericAttr(gattr);
    } else if (class_header) {
      class_env.addGenericAttr(gattr);
    } else {
      outside(".attribute");
    }
  }

  //
  // called by the .inner directive
  //
  //
  public void addInner(short iacc, String name, String inner, String outer) {
    class_env.addInnerClass(iacc, name, inner, outer);
  }

  //
  // procedure group for annotation description
  //
  private static void annotation_internal() throws jasError {
    throw new jasError("logic error in .annotation parsing");
  }

  public void addAnnotation() throws jasError {
    if (cur_method == null) Annotation.ParserError();
    cur_annotation = cur_method.addAnnotation();
  }

  public void addAnnotation(boolean visible, String clname, int paramnum)
          throws jasError {
    if (cur_method == null) Annotation.ParserError();
    cur_annotation = cur_method.addAnnotation(visible, clname, paramnum);
  }

  public void addAnnotation(boolean visible, String clname) throws jasError {
    if (cur_method != null) {
      cur_annotation = cur_method.addAnnotation(visible, clname);
    } else if (cur_field != null) {
      cur_annotation = cur_field.addAnnotation(visible, clname);
    } else if (class_header) {
      cur_annotation = class_env.addAnnotation(visible, clname);
    } else {
      outside(".annotation");
    }
  }

  public void addAnnotationField(String name, String type, String add)
          throws jasError {
    if (cur_annotation == null) annotation_internal();
    cur_annotation.addField(name, type, add);
  }

  public void addAnnotationValue(Object value) throws jasError {
    if (cur_annotation == null) annotation_internal();
    cur_annotation.addValue(value);
  }

  public void nestAnnotation() throws jasError {
    if (cur_annotation == null) annotation_internal();
    cur_annotation = cur_annotation.nestAnnotation();
  }

  public void endAnnotation() throws jasError {
    if (cur_annotation == null)
      throw new jasError(".end annotation without .annotation");
    cur_annotation = cur_annotation.endAnnotation();
  }

  // called by the .field directive to begin 'prompted' field
  //
  public void beginField(short access, String name, String desc, Object value)
          throws jasError {
    ConstAttr ca = null;

    if (value != null) {
      CP cp;
      // create a constant pool entry for the initial value
      if (value instanceof Integer) {
        cp = new IntegerCP((Integer) value);
      } else if (value instanceof Float) {
        cp = new FloatCP((Float) value);
      } else if (value instanceof Double) {
        cp = new DoubleCP((Double) value);
      } else if (value instanceof Long) {
        cp = new LongCP((Long) value);
      } else if (value instanceof String) {
        cp = new StringCP((String) value);
      } else {
        throw new jasError("usupported value type");
      }
      ca = new ConstAttr(cp);
    }
    cur_field = new Var(access, new AsciiCP(name), new AsciiCP(desc), ca);
  }

  //
  // called by the .end field directive to end 'prompted' field
  //
  public void endField() throws jasError {
    if (cur_field == null)
      throw new jasError(".end field without .field");

    if (cur_annotation != null)
      opened_annotation("field");

    class_env.addField(cur_field);
    cur_field = null;
  }

  //
  // called by the .field directive
  //
  public void addField(short access, String name, String desc,
                       String sig, Object value) throws jasError {
    beginField(access, name, desc, value);
    if (sig != null) cur_field.setSignature(new SignatureAttr(sig));
    endField();
  }

  //
  // called by the .method directive to start the definition for a method
  //
  public void newMethod(String name, String descriptor, int access) {
    // set method state variables
    labels = new Hashtable();
    code = null;
    except_attr = null;
    catch_table = null;
    var_table = null;
    vtype_table = null;
    line_table = null;
    line_label_count = 0;
    stack_map_label_count = 0;
    stackmap = null;
    verifyframe = null;
    cur_method = new Method((short) access, new AsciiCP(name),
            new AsciiCP(descriptor));
  }


  //
  // called by the .end method directive to end the definition for a method
  //
  public void endMethod() throws jasError {
    if (cur_method == null)
      throw new jasError(".end method without .method");

    if (cur_annotation != null)
      opened_annotation("method");

    if (code != null) {

      plantLabel(END_METHOD);
      flushInsnBuffer();

      if (catch_table != null) {
        code.setCatchtable(catch_table);
      }

      if (var_table != null) {
        code.setLocalVarTable(var_table);
      }
      if (vtype_table != null) {
        code.setLocalVarTypeTable(vtype_table);
      }
      if (line_table != null) {
        code.setLineTable(line_table);
      }
      if (stackmap != null) {
        code.setStackMap(stackmap);
      }
    }
    cur_method.setCode(code, except_attr);
    class_env.addMethod(cur_method);

    // clear method state variables
    cur_method = null;
    code = null;
    labels = null;
    catch_table = null;
    line_table = null;
    var_table = null;
    vtype_table = null;
    stackmap = null;
    verifyframe = null;
  }

  // get last stackmap locals vector
  private Vector prevStack(int count) throws jasError {
    Vector prev = null;
    if (stackmap != null)
      prev = stackmap.getLastFrame(count);
    return prev;
  }

  // define a new stack map frame (possible with copy previous)
  public void beginStack(boolean copy) throws jasError {
    Vector prev = null;
    if (copy)
      prev = prevStack(0);
    verifyframe = new VerifyFrame(prev);
  }

  // define a new stack map frame and copy 'n' previous
// (type-independet) elements
  public void beginStack(int n) throws jasError {
    if (n <= 0)
      throw new jasError("Invalid counter", true);
    verifyframe = new VerifyFrame(prevStack(n));
  }

  // define the offset of the current stack map frame
  public void plantStackOffset(int n) {
    try {
      verifyframe.setOffset(n);
    } catch (jasError e) {
      report_error(e.toString());
    }
  }

  public void plantStackOffset(String label) throws jasError {
    Label l = getLabel(label);
    try {
      verifyframe.setOffset(l);
    } catch (jasError e) {
      report_error(e.toString());
    }
  }

  // add a local variable item to the current stack map frame
  public void plantStackLocals(String item, String val) {
    try {
      verifyframe.addLocalsItem(item, val);
    } catch (jasError e) {
      report_error(e.toString());
    }
  }

  // add a stack item element to the current stack map frame
  public void plantStackStack(String item, String val) {
    try {
      verifyframe.addStackItem(item, val);
    } catch (jasError e) {
      report_error(e.toString());
    }
  }

  // add the current stack map frame to the current stack map attribute
  public void endStack() {
    if (!verifyframe.haveOffset()) {
      String l = "jasmin_reserved_SM:" + (stack_map_label_count++);
      try {
        plantLabel(l);
        verifyframe.setOffset(getLabel(l));
      } catch (jasError e) {
        report_error(e.toString());
      }
    }
    if (stackmap == null)
      stackmap = new StackMap(class_env);

    stackmap.addFrame(verifyframe);
    verifyframe = null; // PARANOYA
  }


  //
  // plant routines - these use addInsn to add instructions to the
  //                  code for the current method.
  //

  //
  // used for instructions that take no arguments
  //
  public void plant(String name) throws jasError {
    InsnInfo insn = InsnInfo.get(name);
    autoNumber();
    flushInsnBuffer();

    if (insn.args.equals("")) {
      bufferInsn(new Insn(insn.opcode));
    } else {
      throw new jasError("Missing arguments for instruction " + name);
    }
  }

  //
  // used for relative branch targets (ie $+5, $-12, ...)
  //
  public void plantRelativeGoto(String name, int val) throws jasError {
    InsnInfo insn = InsnInfo.get(name);
    if (insn.args.equals("label")) {
      bufferInsn(new Insn(insn.opcode, val, true));
    } else {  // forward the request for "normal" instructions
      plant(name, val);
    }
  }


  //
  // used for iinc
  //
  public void plant(String name, int v1, int v2)
          throws jasError {
    InsnInfo insn = InsnInfo.get(name);
    autoNumber();
    flushInsnBuffer();

    if (insn.args.equalsIgnoreCase("ii")) {
      bufferInsn(new IincInsn(v1, v2, insn.args.charAt(0) == 'I'));
    } else {
      throw new jasError("Bad arguments for instruction " + name);
    }
  }

  //
  // used for instructions that take an integer parameter
  // (branches are part of this, the int is converted to a label)
  //
  public void plant(String name, int val) throws jasError {
    InsnInfo insn = InsnInfo.get(name);
    CodeAttr code = _getCode();
    autoNumber();
    flushInsnBuffer();

    if (insn.args.equalsIgnoreCase("i")) {
      bufferInsn(new Insn(insn.opcode, val, insn.args.charAt(0) == 'I'));
    } else if (insn.args.equals("constant")) {
      bufferInsn(new Insn(insn.opcode, new IntegerCP(val)));
    } else if (insn.args.equals("bigconstant")) {
      bufferInsn(new Insn(insn.opcode, new LongCP(val)));
    } else if (insn.args.equals("label")) {
      plant(name, String.valueOf(val));        // the target is not signed
      // assume it is a label
    } else {
      throw new jasError("Bad arguments for instruction " + name);
    }
  }

  //
  // used for ldc and other instructions that take a numeric argument
  //
  public void plant(String name, Number val) throws jasError {
    InsnInfo insn = InsnInfo.get(name);
    CodeAttr code = _getCode();
    autoNumber();
    flushInsnBuffer();

    if (insn.args.equalsIgnoreCase("i") && (val instanceof Integer)) {
      bufferInsn(new Insn(insn.opcode, val.intValue(), insn.args.charAt(0) == 'I'));
    } else if (insn.args.equals("constant")) {
      if (val instanceof Integer || val instanceof Long) {
        bufferInsn(new Insn(insn.opcode,
                new IntegerCP(val.intValue())));
      } else if (val instanceof Float || val instanceof Double) {
        bufferInsn(new Insn(insn.opcode,
                new FloatCP(val.floatValue())));
      }
    } else if (insn.args.equals("bigconstant")) {
      if (val instanceof Integer || val instanceof Long) {
        bufferInsn(new Insn(insn.opcode,
                new LongCP(val.longValue())));
      } else if (val instanceof Float || val instanceof Double) {
        bufferInsn(new Insn(insn.opcode,
                new DoubleCP(val.doubleValue())));
      }
    } else {
      throw new jasError("Bad arguments for instruction " + name);
    }
  }

  //
  // used for ldc <quoted-string>
  //
  public void plantString(String name, String val) throws jasError {
    InsnInfo insn = InsnInfo.get(name);
    autoNumber();
    flushInsnBuffer();

    if (insn.args.equals("constant")) {
      bufferInsn(new Insn(insn.opcode, new StringCP(val)));
    } else {
      throw new jasError("Bad arguments for instruction " + name);
    }
  }

  //
  // used for invokeinterface and multianewarray
  //
  public void plant(String name, String val, int nargs)
          throws jasError {
    InsnInfo insn = InsnInfo.get(name);
    CodeAttr code = _getCode();
    autoNumber();
    flushInsnBuffer();

    if (insn.args.equals("interface")) {
      String split[] = ScannerUtils.splitClassMethodSignature(val);
      bufferInsn(new InvokeinterfaceInsn(
              new InterfaceCP(split[0], split[1],
                      split[2]), nargs));

    } else if (insn.args.equals("marray")) {
      bufferInsn(new MultiarrayInsn(new ClassCP(val), nargs));
    } else {
      throw new jasError("Bad arguments for instruction " + name);
    }
  }

  //
  // used for instructions that take a word as a parameter
  // (e.g. branches, newarray, invokemethod)
  //
  public void plant(String name, String val) throws jasError {
    InsnInfo insn = InsnInfo.get(name);
    CodeAttr code = _getCode();
    autoNumber();
    flushInsnBuffer();

    if (insn.args.equals("method")) {
      String split[] = ScannerUtils.splitClassMethodSignature(val);
      bufferInsn(new Insn(insn.opcode,
              new MethodCP(split[0], split[1], split[2])));
    } else if (insn.args.equals("constant")) {
      bufferInsn(new Insn(insn.opcode, new ClassCP(val)));
    } else if (insn.args.equals("atype")) {
      int atype = 0;
      if (val.equals("boolean")) {
        atype = 4;
      } else if (val.equals("char")) {
        atype = 5;
      } else if (val.equals("float")) {
        atype = 6;
      } else if (val.equals("double")) {
        atype = 7;
      } else if (val.equals("byte")) {
        atype = 8;
      } else if (val.equals("short")) {
        atype = 9;
      } else if (val.equals("int")) {
        atype = 10;
      } else if (val.equals("long")) {
        atype = 11;
      } else {
        throw new jasError("Bad array type: " + name);
      }
      bufferInsn(new Insn(insn.opcode, atype, false));
    } else if (insn.args.indexOf("label") >= 0) {
      bufferInsn(new Insn(insn.opcode, getLabel(val), scanner.line_num));
    } else if (insn.args.equals("class")) {
      bufferInsn(new Insn(insn.opcode, new ClassCP(val)));
    } else {
      throw new jasError("(gloups)Bad arguments for instruction " + name);
    }
  }

  //
  // used for instructions that take a field and a signature as parameters
  // (e.g. getstatic, putstatic)
  //
  public void plant(String name, String v1, String v2)
          throws jasError {
    InsnInfo info = InsnInfo.get(name);
    CodeAttr code = _getCode();
    autoNumber();
    flushInsnBuffer();

    if (info.args.equals("field")) {
      String split[] = ScannerUtils.splitClassField(v1);
      if (split[1] == null)
        throw new jasError("can't extract field from " + v1);
      bufferInsn(new Insn(info.opcode,
              new FieldCP(split[0], split[1], v2)));
    } else {
      throw new jasError("Bad arguments for instruction " + name);
    }
  }

  //
  // Lookupswitch instruction
  //
  public void newLookupswitch() throws jasError {
    switch_vec = new Vector();
    autoNumber();
  }

  ;

  public void addLookupswitch(int val, String label)
          throws jasError {
    switch_vec.addElement(val);
    switch_vec.addElement(new LabelOrOffset(getLabel(label)));
  }

  ;

  public void addLookupswitch(int val, int offset)
          throws jasError {
    switch_vec.addElement(val);
    switch_vec.addElement(new LabelOrOffset(offset));
  }

  ;

  public void endLookupswitch(String deflabel) throws jasError {
    flushInsnBuffer();
    Object[] offlabs = checkLookupswitch();
    int[] offsets = (int[]) offlabs[0];
    LabelOrOffset[] labels = (LabelOrOffset[]) offlabs[1];
    LabelOrOffset defl = new LabelOrOffset(getLabel(deflabel));
    bufferInsn(new LookupswitchInsn(defl, offsets, labels));
  }

  public void endLookupswitch(int defoffset) throws jasError {
    flushInsnBuffer();
    Object[] offlabs = checkLookupswitch();
    int[] offsets = (int[]) offlabs[0];
    LabelOrOffset[] labels = (LabelOrOffset[]) offlabs[1];
    bufferInsn(new LookupswitchInsn(new LabelOrOffset(defoffset),
            offsets, labels));
  }


  //
  // called by both endLookupswitch() methods
  //
  private Object[] checkLookupswitch() {
    int n = switch_vec.size() >> 1;
    int offsets[] = new int[n];
    LabelOrOffset labels[] = new LabelOrOffset[n];
    Enumeration e = switch_vec.elements();
    int i = 0;
    while (e.hasMoreElements()) {
      offsets[i] = ((Integer) e.nextElement()).intValue();
      labels[i] = (LabelOrOffset) e.nextElement();
      i++;
    }
    Object result[] = {offsets, labels};
    return result;
  }


  //
  // Tableswitch instruction
  //
  public void newTableswitch(int lowval) throws jasError {
    newTableswitch(lowval, -1);
  }

  ;

  public void newTableswitch(int lowval, int hival) throws jasError {
    switch_vec = new Vector();
    low_value = lowval;
    high_value = hival;
    autoNumber();
  }

  ;

  public void addTableswitch(String label) throws jasError {
    switch_vec.addElement(new LabelOrOffset(getLabel(label)));
  }

  ;

  public void addTableswitch(int offset) throws jasError {
    switch_vec.addElement(new LabelOrOffset(offset));
  }

  ;

  public void endTableswitch(String deflabel) throws jasError {
    flushInsnBuffer();
    LabelOrOffset labels[] = checkTableswitch();
    bufferInsn(new TableswitchInsn(low_value,
            low_value + labels.length - 1,
            new LabelOrOffset(getLabel(deflabel)),
            labels));
  }

  public void endTableswitch(int defoffset) throws jasError {
    flushInsnBuffer();
    LabelOrOffset labels[] = checkTableswitch();
    bufferInsn(new TableswitchInsn(low_value,
            low_value + labels.length - 1, new LabelOrOffset(defoffset), labels));
  }


  //
  // called by both endTableswitch() methods
  //
  private LabelOrOffset[] checkTableswitch() {
    int n = switch_vec.size();
    LabelOrOffset labels[] = new LabelOrOffset[n];
    Enumeration e = switch_vec.elements();
    int i = 0;
    while (e.hasMoreElements()) {
      labels[i] = (LabelOrOffset) e.nextElement();
      i++;
    }
    if (high_value != -1 && (high_value != low_value + n - 1)) {
      report_error("tableswitch - given incorrect value for <high>");
    }
    return labels;
  }


  // Used by the parser_ to tell ClassFile what the line number
  // for the next statement is. ClassFile's autoNumber mechanism
  // uses this info.
  public void setLine(int l) {
    line_num = l;
  }

  //
  // If auto_number is true, output debugging line number table
  // for jasmin.Jasmin assembly instructions.

  //
  public void autoNumber() throws jasError {
    if (auto_number) {
      // use the line number of the last token
      addLineInfo(line_num);
    }
  }

  //
  // Label management
  //

  //
  // gets the Label object for a label, creating it if it doesn't exist
  //
  public Label getLabel(String name) throws jasError {

    // check that we are inside of a method definition
    if (cur_method == null) {
      throw new jasError("illegal use of label outside of method definition");
    }

    Label lab = (Label) labels.get(name);
    if (lab == null) {
      lab = new Label(name);
      labels.put(name, lab);
    }
    return lab;
  }

  //
  // defines a label
  //
  public void plantLabel(String name) throws jasError {
    //    System.out.println("planting label "+name);
    try {
      Integer.parseInt(name);
      // the label is a number, we must add it *before* the buffered insn
      // this is the reason to use a buffer instructions
      _getCode().addInsn(getLabel(name));
      flushInsnBuffer();
    } catch (NumberFormatException e) {
      // traditional label (word), add it *after* the buffered insn
      flushInsnBuffer();
      bufferInsn(getLabel(name));
    }
  }

  // if there is an instruction in the buffer, add it to the code
// and put the new instruction in the buffer
  void bufferInsn(Insn i) throws jasError {
    if (i == null)
      throw new jasError("trying to buffer a null instruction");
    if (buffered_insn != null)
      flushInsnBuffer();
    buffered_insn = i;
  }

  // if the buffer is not empty, add the instruction to the code array
  void flushInsnBuffer() throws jasError {
    if (buffered_insn != null) {
      _getCode().addInsn(buffered_insn);
      buffered_insn = null;
    }
  }

  //
  // used by the .var directive
  //
  public void addVar(String startLab, String endLab,
                     String name, String desc, String sign, int var_num)
          throws jasError {
    if (startLab == null) {
      startLab = BGN_METHOD;
    }

    if (endLab == null) {
      endLab = END_METHOD;
    }
    Label slab, elab;
    slab = getLabel(startLab);
    elab = getLabel(endLab);

    if (var_table == null) {
      var_table = new LocalVarTableAttr();
    }

    var_table.addEntry(new LocalVarEntry(slab, elab, name, desc, var_num));

    if (sign != null) {
      if (vtype_table == null) {
        vtype_table = new LocalVarTypeTableAttr();
      }

      vtype_table.addEntry(new LocalVarEntry(slab, elab, name, sign, var_num));
    }
  }

  public void addVar(int startOffset, int endOffset, String name,
                     String desc, String sign, int var_num) throws jasError {
    if (var_table == null) {
      var_table = new LocalVarTableAttr();
    }
    var_table.addEntry(new LocalVarEntry(startOffset, endOffset,
            name, desc, var_num));

    if (sign != null) {
      if (vtype_table == null) {
        vtype_table = new LocalVarTypeTableAttr();
      }

      vtype_table.addEntry(new LocalVarEntry(startOffset, endOffset,
              name, sign, var_num));
    }
  }

  //
  // used by .line directive
  //
  void addLineInfo(int line_num) throws jasError {
    String l = "jasmin_reserved_L:" + (line_label_count++);
    if (line_table == null) {
      line_table = new LineTableAttr();
    }
    plantLabel(l);
    line_table.addEntry(getLabel(l), line_num);
  }

  public void addLine(int line_num) throws jasError {
    if (!auto_number) {
      addLineInfo(line_num);
    }
  }

  //
  // used by the .throws directive
  //
  public void addThrow(String name) throws jasError {

    // check that we are inside of a method definition
    if (cur_method == null) {
      throw new jasError("illegal use of .throw outside of method definition");
    }

    if (except_attr == null) {
      except_attr = new ExceptAttr();
    }
    except_attr.addException(new ClassCP(name));
  }

  //
  // used by the .catch directive
  //
  public void addCatch(String name, String start_lab, String end_lab,
                       String branch_lab) throws jasError {
    ClassCP class_cp = checkCatch(name);

    catch_table.addEntry(getLabel(start_lab), getLabel(end_lab),
            getLabel(branch_lab), class_cp);
  }


  public void addCatch(String name, int start_off, int end_off,
                       int branch_off) throws jasError {
    ClassCP class_cp = checkCatch(name);

    catch_table.addEntry(start_off, end_off, branch_off, class_cp);
  }

  short checkLimit(int v) throws jasError {
    if (v < 0 || v > 65535)
      throw new jasError("Illegal limit value", true);
    return (short) v;
  }

  //
  // used by the .limit stack directive
  //
  public void setStackSize(int v) throws jasError {
    _getCode().setStackSize(checkLimit(v));
  }

  //
  // used by the .limit vars directive
  //
  public void setVarSize(int v) throws jasError {
    _getCode().setVarSize(checkLimit(v));
  }

  // --- Private stuff ---


  //
  // verifications made by both addCatch() methods
  //
  private ClassCP checkCatch(String name) throws jasError {
    ClassCP class_cp;
    // check that we are inside of a method definition
    if (cur_method == null) {
      throw new jasError("illegal use of .catch outside of method definition");
    }

    if (catch_table == null) {
      catch_table = new Catchtable();
    }

    if (name.equals("all")) {
      class_cp = null;
    } else {
      class_cp = new ClassCP(name);
    }
    return class_cp;
  }


  //
  // returns the code block, creating it if it doesn't exist
  //
  CodeAttr _getCode() throws jasError {

    // check that we are inside of a method definition
    if (cur_method == null) {
      throw new jasError("illegal use of instruction outside of method definition");
    }

    if (code == null) {
      code = new CodeAttr();
      plantLabel(BGN_METHOD);
    }

    return (code);
  }


  // PUBLIC API TO JASMIN:

  /**
   * Makes a new ClassFile object, used to represent a Java class file.
   * You can then use readJasmin to read in a class file stored in
   * jasmin.Jasmin assembly format.
   */

  public ClassFile() {
  }

  /**
   * Parses a jasmin.Jasmin file, converting it internally into a binary
   * representation.
   * If something goes wrong, this throws one of
   * an IOException, or a jasError, or one of a few other exceptions.
   * I'll tie this down more formally in the next version.
   *
   * @param inputStream is the stream containing the jasmin.Jasmin assembly code for the
   *                    class.
   * @param name        is the name of the stream. This name will be
   *                    concatenated to error messages printed to System.err.
   * @param numberLines true if you want jasmin.Jasmin to generate line
   *                    numbers automatically, based on the assembly source, or
   *                    false if you are using the ".line" directive and don't
   *                    want jasmin.Jasmin to help out.
   */
  public void readJasmin(Reader input, String name, boolean numberLines)
          throws IOException, jasError, internal_error {
    // initialize variables for error reporting
    errors = 0;
    filename = name;
    source_name = name;

    //initialize local-frame variables
    cur_method = null;
    cur_field = null;
    cur_annotation = null;
    class_header = false;

    // if numberLines is true, we output LineTableAttr's that indicate what line
    // numbers the jasmin.Jasmin code falls on.
    auto_number = numberLines;

    // Parse the input file
    class_env = new ClassEnv();

    scanner = new Scanner(input);
    parser parse_obj = new parser(this, scanner);

    if (PARSER_DEBUG) {
      // for debugging
      parse_obj.debug_parse();
    } else {
      parse_obj.parse();
    }
  }

  /**
   * Returns the number of warnings/errors encountered while parsing a file.
   * 0 if everything went OK.
   */
  public int errorCount() {
    return errors;
  }

  /**
   * Returns the name of the class in the file (i.e. the string given to
   * the .class parameter in jasmin.Jasmin)
   */
  public String getClassName() {
    return class_name;
  }

  /**
   * Writes the binary data for the class represented by this ClassFile
   * object to the specified
   * output stream, using the Java Class File format. Throws either an
   * IOException or a jasError if something goes wrong.
   */
  public void write(OutputStream outp) throws IOException, jasError {
    class_env.setSource(source_name);
    class_env.write(new DataOutputStream(outp));
  }
}