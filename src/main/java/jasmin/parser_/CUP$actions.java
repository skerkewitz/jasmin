package jasmin.parser_;

import jas.RuntimeConstants;
import jas.jasError;
import jasmin.ClassFile;
import jasmin.util.ScannerUtils;
import java_cup.runtime.int_token;
import java_cup.runtime.str_token;
import java_cup.runtime.symbol;

import java.io.IOException;

/** JavaCup generated class to encapsulate user supplied action code.*/
class CUP$actions {


    short access_val;
	public ClassFile classFile;
    public Scanner scanner;


  /** Constructor */
  CUP$actions() { }

  /** Method with the actual generated action code. */
  public final java_cup.runtime.symbol CUP$do_action(
    int                        CUP$act_num,
    java_cup.runtime.lr_parser CUP$parser,
    java.util.Stack            CUP$stack,
    int                        CUP$top) throws jasError, IOException {
      /* object for return from actions */
      java_cup.runtime.symbol CUP$result;

      /* select the action based on the action number */
      switch (CUP$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 222: // table_default ::= DEFAULT COLON Int
            {
              CUP$result = new symbol(/*table_default*/46);
               classFile.endTableswitch((/*off*/(int_token)CUP$stack.elementAt(CUP$top-0)).int_val);
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 221: // table_default ::= DEFAULT COLON Word
            {
              CUP$result = new symbol(/*table_default*/46);
               classFile.endTableswitch((/*w*/(str_token)CUP$stack.elementAt(CUP$top-0)).str_val);
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 220: // table_entry ::= Int SEP
            {
              CUP$result = new symbol(/*table_entry*/47);
               classFile.addTableswitch((/*off*/(int_token)CUP$stack.elementAt(CUP$top-1)).int_val);
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 219: // table_entry ::= Word SEP
            {
              CUP$result = new symbol(/*table_entry*/47);
               classFile.addTableswitch((/*w*/(str_token)CUP$stack.elementAt(CUP$top-1)).str_val);
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 218: // table_list ::= table_entry
            {
              CUP$result = new symbol(/*table_list*/48);

            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 217: // table_list ::= table_list table_entry
            {
              CUP$result = new symbol(/*table_list*/48);

            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 216: // table_args ::= Int Int SEP
            {
              CUP$result = new symbol(/*table_args*/44);
               classFile.newTableswitch((/*low*/(int_token)CUP$stack.elementAt(CUP$top-2)).int_val, (/*high*/(int_token)CUP$stack.elementAt(CUP$top-1)).int_val);
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 215: // table_args ::= Int SEP
            {
              CUP$result = new symbol(/*table_args*/44);
               classFile.newTableswitch((/*low*/(int_token)CUP$stack.elementAt(CUP$top-1)).int_val);
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 214: // table ::= table_args table_list table_default
            {
              CUP$result = new symbol(/*table*/43);

            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 213: // lookup_default ::= DEFAULT COLON Int
            {
              CUP$result = new symbol(/*lookup_default*/30);
               classFile.endLookupswitch((/*off*/(int_token)CUP$stack.elementAt(CUP$top-0)).int_val);
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 212: // lookup_default ::= DEFAULT COLON Word
            {
              CUP$result = new symbol(/*lookup_default*/30);
               classFile.endLookupswitch((/*w*/(str_token)CUP$stack.elementAt(CUP$top-0)).str_val);
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 211: // lookup_entry ::= Int COLON Int SEP
            {
              CUP$result = new symbol(/*lookup_entry*/31);
               classFile.addLookupswitch((/*i*/(int_token)CUP$stack.elementAt(CUP$top-3)).int_val, (/*off*/(int_token)CUP$stack.elementAt(CUP$top-1)).int_val);
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 210: // lookup_entry ::= Int COLON Word SEP
            {
              CUP$result = new symbol(/*lookup_entry*/31);
               classFile.addLookupswitch((/*i*/(int_token)CUP$stack.elementAt(CUP$top-3)).int_val, (/*w*/(str_token)CUP$stack.elementAt(CUP$top-1)).str_val);
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 209: // lookup_list ::= lookup_entry
            {
              CUP$result = new symbol(/*lookup_list*/32);

            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 208: // lookup_list ::= lookup_list lookup_entry
            {
              CUP$result = new symbol(/*lookup_list*/32);

            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 207: // lookup_args ::= SEP
            {
              CUP$result = new symbol(/*lookup_args*/29);
               classFile.newLookupswitch();
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 206: // lookup ::= lookup_args lookup_list lookup_default
            {
              CUP$result = new symbol(/*lookup*/28);

            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 205: // complex_instruction ::= TABLESWITCH table
            {
              CUP$result = new symbol(/*complex_instruction*/14);

            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 204: // complex_instruction ::= LOOKUPSWITCH lookup
            {
              CUP$result = new symbol(/*complex_instruction*/14);

            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 203: // simple_instruction ::= Insn Relative
            {
              CUP$result = new symbol(/*simple_instruction*/37);
               classFile.plantRelativeGoto((/*i*/(str_token)CUP$stack.elementAt(CUP$top-1)).str_val, (/*n*/(relative_num_token)CUP$stack.elementAt(CUP$top-0)).int_val);
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 202: // simple_instruction ::= Insn Str
            {
              CUP$result = new symbol(/*simple_instruction*/37);
               classFile.plantString((/*i*/(str_token)CUP$stack.elementAt(CUP$top-1)).str_val, (/*n*/(str_token)CUP$stack.elementAt(CUP$top-0)).str_val);
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 201: // simple_instruction ::= Insn Word Word
            {
              CUP$result = new symbol(/*simple_instruction*/37);
               classFile.plant((/*i*/(str_token)CUP$stack.elementAt(CUP$top-2)).str_val, (/*n1*/(str_token)CUP$stack.elementAt(CUP$top-1)).str_val, (/*n2*/(str_token)CUP$stack.elementAt(CUP$top-0)).str_val);
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 200: // simple_instruction ::= Insn Word Int
            {
              CUP$result = new symbol(/*simple_instruction*/37);
               classFile.plant((/*i*/(str_token)CUP$stack.elementAt(CUP$top-2)).str_val, (/*n*/(str_token)CUP$stack.elementAt(CUP$top-1)).str_val, (/*n2*/(int_token)CUP$stack.elementAt(CUP$top-0)).int_val);
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 199: // simple_instruction ::= Insn Word
            {
              CUP$result = new symbol(/*simple_instruction*/37);
               classFile.plant((/*i*/(str_token)CUP$stack.elementAt(CUP$top-1)).str_val, (/*n*/(str_token)CUP$stack.elementAt(CUP$top-0)).str_val);
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 198: // simple_instruction ::= Insn Num
            {
              CUP$result = new symbol(/*simple_instruction*/37);
               classFile.plant((/*i*/(str_token)CUP$stack.elementAt(CUP$top-1)).str_val, (Integer) (/*n*/(num_token)CUP$stack.elementAt(CUP$top-0)).num_val);
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 197: // simple_instruction ::= Insn Int
            {
              CUP$result = new symbol(/*simple_instruction*/37);
               classFile.plant((/*i*/(str_token)CUP$stack.elementAt(CUP$top-1)).str_val, (/*n*/(int_token)CUP$stack.elementAt(CUP$top-0)).int_val);
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 196: // simple_instruction ::= Insn Int Int
            {
              CUP$result = new symbol(/*simple_instruction*/37);
               classFile.plant((/*i*/(str_token)CUP$stack.elementAt(CUP$top-2)).str_val, (/*n1*/(int_token)CUP$stack.elementAt(CUP$top-1)).int_val, (/*n2*/(int_token)CUP$stack.elementAt(CUP$top-0)).int_val);
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 195: // simple_instruction ::= Insn
            {
              CUP$result = new symbol(/*simple_instruction*/37);
               classFile.plant((/*i*/(str_token)CUP$stack.elementAt(CUP$top-0)).str_val);
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 194: // instruction ::= complex_instruction
            {
              CUP$result = new symbol(/*instruction*/21);

            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 193: // instruction ::= simple_instruction
            {
              CUP$result = new symbol(/*instruction*/21);

            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 192: // set_expr ::= Word any_item
            {
              CUP$result = new symbol(/*set_expr*/36);
               scanner.dict.put((/*name*/(str_token)CUP$stack.elementAt(CUP$top-1)).str_val, (/*v*/(var_token)CUP$stack.elementAt(CUP$top-0)));
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 191: // catch_expr ::= classname FROM Int TO Int USING Int
            {
              CUP$result = new symbol(/*catch_expr*/12);
               classFile.addCatch((/*aclass*/(str_token)CUP$stack.elementAt(CUP$top-6)).str_val,
                              (/*fromoff*/(int_token)CUP$stack.elementAt(CUP$top-4)).int_val,
                              (/*tooff*/(int_token)CUP$stack.elementAt(CUP$top-2)).int_val,
                              (/*branchoff*/(int_token)CUP$stack.elementAt(CUP$top-0)).int_val);
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 190: // catch_expr ::= classname FROM Word TO Word USING Word
            {
              CUP$result = new symbol(/*catch_expr*/12);
               classFile.addCatch((/*aclass*/(str_token)CUP$stack.elementAt(CUP$top-6)).str_val,
                              (/*fromlab*/(str_token)CUP$stack.elementAt(CUP$top-4)).str_val,
                              (/*tolab*/(str_token)CUP$stack.elementAt(CUP$top-2)).str_val,
                              (/*branchlab*/(str_token)CUP$stack.elementAt(CUP$top-0)).str_val);
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 189: // throws_expr ::= classname
            {
              CUP$result = new symbol(/*throws_expr*/49);
               classFile.addThrow((/*s*/(str_token)CUP$stack.elementAt(CUP$top-0)).str_val);
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 188: // line_expr ::= Int
            {
              CUP$result = new symbol(/*line_expr*/45);
               classFile.addLine((/*v*/(int_token)CUP$stack.elementAt(CUP$top-0)).int_val);
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 187: // limit_expr ::= Word Int
            {
              CUP$result = new symbol(/*limit_expr*/27);
               classFile.report_error(".limit expected \"stack\" or \"locals\", but got "
                                + (/*w*/(str_token)CUP$stack.elementAt(CUP$top-1)).str_val);
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 186: // limit_expr ::= STACK Int
            {
              CUP$result = new symbol(/*limit_expr*/27);
               classFile.setStackSize((/*v*/(int_token)CUP$stack.elementAt(CUP$top-0)).int_val);
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 185: // limit_expr ::= LOCALS Int
            {
              CUP$result = new symbol(/*limit_expr*/27);
               classFile.setVarSize((/*v*/(int_token)CUP$stack.elementAt(CUP$top-0)).int_val);
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 184: // optional_signature ::=
            {
              CUP$result = new str_token(/*optional_signature*/5);
               ((str_token)CUP$result).str_val = null;
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 183: // optional_signature ::= SIGNATURE Str
            {
              CUP$result = new str_token(/*optional_signature*/5);
               ((str_token)CUP$result).str_val = (/*s*/(str_token)CUP$stack.elementAt(CUP$top-0)).str_val;
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 182: // var_expr ::= Int IS Word Word optional_signature FROM Int TO Int
            {
              CUP$result = new symbol(/*var_expr*/50);
               classFile.addVar((/*soff*/(int_token)CUP$stack.elementAt(CUP$top-2)).int_val, (/*eoff*/(int_token)CUP$stack.elementAt(CUP$top-0)).int_val, (/*name*/(str_token)CUP$stack.elementAt(CUP$top-6)).str_val,
                            (/*desc*/(str_token)CUP$stack.elementAt(CUP$top-5)).str_val, (/*sign*/(str_token)CUP$stack.elementAt(CUP$top-4)).str_val, (/*reg*/(int_token)CUP$stack.elementAt(CUP$top-8)).int_val);
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 181: // var_expr ::= Int IS Word Word optional_signature
            {
              CUP$result = new symbol(/*var_expr*/50);
               classFile.addVar(null, null, (/*name*/(str_token)CUP$stack.elementAt(CUP$top-2)).str_val, (/*desc*/(str_token)CUP$stack.elementAt(CUP$top-1)).str_val,
                            (/*sign*/(str_token)CUP$stack.elementAt(CUP$top-0)).str_val,  (/*reg*/(int_token)CUP$stack.elementAt(CUP$top-4)).int_val);
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 180: // var_expr ::= Int IS Word Word optional_signature FROM Word TO Word
            {
              CUP$result = new symbol(/*var_expr*/50);
               classFile.addVar((/*slab*/(str_token)CUP$stack.elementAt(CUP$top-2)).str_val, (/*elab*/(str_token)CUP$stack.elementAt(CUP$top-0)).str_val, (/*name*/(str_token)CUP$stack.elementAt(CUP$top-6)).str_val,
                            (/*desc*/(str_token)CUP$stack.elementAt(CUP$top-5)).str_val, (/*sign*/(str_token)CUP$stack.elementAt(CUP$top-4)).str_val, (/*reg*/(int_token)CUP$stack.elementAt(CUP$top-8)).int_val);
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 179: // endstack ::= DEND STACK
            {
              CUP$result = new symbol(/*endstack*/96);
               classFile.endStack();
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 178: // stack_item_expr ::= STACK Word Int
            {
              CUP$result = new symbol(/*stack_item_expr*/100);
               classFile.plantStackStack((/*w*/(str_token)CUP$stack.elementAt(CUP$top-1)).str_val, String.valueOf((/*n*/(int_token)CUP$stack.elementAt(CUP$top-0)).int_val));
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 177: // stack_item_expr ::= STACK Word Word
            {
              CUP$result = new symbol(/*stack_item_expr*/100);
               classFile.plantStackStack((/*w*/(str_token)CUP$stack.elementAt(CUP$top-1)).str_val, (/*val*/(str_token)CUP$stack.elementAt(CUP$top-0)).str_val);
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 176: // stack_item_expr ::= STACK Word
            {
              CUP$result = new symbol(/*stack_item_expr*/100);
               classFile.plantStackStack((/*w*/(str_token)CUP$stack.elementAt(CUP$top-0)).str_val, null);
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 175: // stack_item_expr ::= LOCALS Word Int
            {
              CUP$result = new symbol(/*stack_item_expr*/100);
               classFile.plantStackLocals((/*w*/(str_token)CUP$stack.elementAt(CUP$top-1)).str_val, String.valueOf((/*n*/(int_token)CUP$stack.elementAt(CUP$top-0)).int_val));
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 174: // stack_item_expr ::= LOCALS Word Word
            {
              CUP$result = new symbol(/*stack_item_expr*/100);
               classFile.plantStackLocals((/*w*/(str_token)CUP$stack.elementAt(CUP$top-1)).str_val, (/*val*/(str_token)CUP$stack.elementAt(CUP$top-0)).str_val);
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 173: // stack_item_expr ::= LOCALS Word
            {
              CUP$result = new symbol(/*stack_item_expr*/100);
               classFile.plantStackLocals((/*w*/(str_token)CUP$stack.elementAt(CUP$top-0)).str_val, null);
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 172: // stack_item ::= stack_item_expr SEP
            {
              CUP$result = new symbol(/*stack_item*/99);

            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 171: // stack_items ::=
            {
              CUP$result = new symbol(/*stack_items*/98);

            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 170: // stack_items ::= stack_items stack_item
            {
              CUP$result = new symbol(/*stack_items*/98);

            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 169: // stack_offset_def ::=
            {
              CUP$result = new symbol(/*stack_offset_def*/97);

            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 168: // stack_offset_def ::= OFFSET Word SEP
            {
              CUP$result = new symbol(/*stack_offset_def*/97);
               classFile.plantStackOffset((/*w*/(str_token)CUP$stack.elementAt(CUP$top-1)).str_val);
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 167: // stack_offset_def ::= OFFSET Int SEP
            {
              CUP$result = new symbol(/*stack_offset_def*/97);
               classFile.plantStackOffset((/*n*/(int_token)CUP$stack.elementAt(CUP$top-1)).int_val);
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 166: // stack_map_frame_desc ::= stack_offset_def stack_items
            {
              CUP$result = new symbol(/*stack_map_frame_desc*/95);

            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 165: // defstack ::= SEP
            {
              CUP$result = new symbol(/*defstack*/94);
               classFile.beginStack(false);
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 164: // defstack_same_expr ::=
            {
              CUP$result = new symbol(/*defstack_same_expr*/103);
               classFile.beginStack(true);
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 163: // defstack_same_expr ::= Int
            {
              CUP$result = new symbol(/*defstack_same_expr*/103);
               classFile.beginStack((/*n*/(int_token)CUP$stack.elementAt(CUP$top-0)).int_val);
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 162: // defstack_same ::= defstack_same_expr LOCALS SEP
            {
              CUP$result = new symbol(/*defstack_same*/102);

            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 161: // stackmap ::= USE defstack_same stack_map_frame_desc endstack
            {
              CUP$result = new symbol(/*stackmap*/101);

            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 160: // stackmap ::= defstack stack_map_frame_desc endstack
            {
              CUP$result = new symbol(/*stackmap*/101);

            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 159: // directive ::= DSTACK stackmap
            {
              CUP$result = new symbol(/*directive*/16);

            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 158: // directive ::= DANNOTATION ann_def_spec ann_def_val endannotation
            {
              CUP$result = new symbol(/*directive*/16);

            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 157: // directive ::= DANNOTATION ann_met_expr ann_arglist endannotation
            {
              CUP$result = new symbol(/*directive*/16);

            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 156: // directive ::= DDEPRECATED deprecated_expr
            {
              CUP$result = new symbol(/*directive*/16);

            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 155: // directive ::= DATTRIBUTE generic_expr
            {
              CUP$result = new symbol(/*directive*/16);

            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 154: // directive ::= DSIGNATURE signature_expr
            {
              CUP$result = new symbol(/*directive*/16);

            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 153: // directive ::= DSET set_expr
            {
              CUP$result = new symbol(/*directive*/16);

            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 152: // directive ::= DCATCH catch_expr
            {
              CUP$result = new symbol(/*directive*/16);

            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 151: // directive ::= DTHROWS throws_expr
            {
              CUP$result = new symbol(/*directive*/16);

            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 150: // directive ::= DLINE line_expr
            {
              CUP$result = new symbol(/*directive*/16);

            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 149: // directive ::= DLIMIT limit_expr
            {
              CUP$result = new symbol(/*directive*/16);

            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 148: // directive ::= DVAR var_expr
            {
              CUP$result = new symbol(/*directive*/16);

            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 147: // label ::= Int COLON instruction
            {
              CUP$result = new symbol(/*label*/26);
               classFile.plantLabel(String.valueOf((/*label*/(int_token)CUP$stack.elementAt(CUP$top-2)).int_val));
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 146: // label ::= Word COLON
            {
              CUP$result = new symbol(/*label*/26);
               classFile.plantLabel((/*label*/(str_token)CUP$stack.elementAt(CUP$top-1)).str_val);
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 145: // stmnt ::=
            {
              CUP$result = new symbol(/*stmnt*/41);

            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 144: // stmnt ::= label
            {
              CUP$result = new symbol(/*stmnt*/41);

            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 143: // stmnt ::= error
            {
              CUP$result = new symbol(/*stmnt*/41);

            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 142: // stmnt ::= directive
            {
              CUP$result = new symbol(/*stmnt*/41);

            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 141: // stmnt ::= instruction
            {
              CUP$result = new symbol(/*stmnt*/41);

            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 140: // statement ::= NT$1 stmnt SEP
            {
              CUP$result = new symbol(/*statement*/39);

            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 139: // NT$1 ::=
            {
              CUP$result = new java_cup.runtime.token(/*NT$1*/106);
               classFile.setLine(scanner.token_line_num);
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 138: // statements ::= statement
            {
              CUP$result = new symbol(/*statements*/40);

            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 137: // statements ::= statements statement
            {
              CUP$result = new symbol(/*statements*/40);

            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 136: // endmethod ::= DEND METHOD SEP
            {
              CUP$result = new symbol(/*endmethod*/17);
               classFile.endMethod();
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 135: // defmethod ::= DMETHOD access Word SEP
            {
              CUP$result = new symbol(/*defmethod*/15);
               String split[] = ScannerUtils.splitMethodSignature((/*name*/(str_token)CUP$stack.elementAt(CUP$top-1)).str_val);
           classFile.newMethod(split[0], split[1], (/*i*/(int_token)CUP$stack.elementAt(CUP$top-2)).int_val);
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 134: // method_spec ::= defmethod endmethod
            {
              CUP$result = new symbol(/*method_spec*/34);

            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 133: // method_spec ::= defmethod statements endmethod
            {
              CUP$result = new symbol(/*method_spec*/34);

            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 132: // method_list ::= method_spec
            {
              CUP$result = new symbol(/*method_list*/33);

            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 131: // method_list ::= method_list method_spec
            {
              CUP$result = new symbol(/*method_list*/33);

            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 130: // methods ::=
            {
              CUP$result = new symbol(/*methods*/35);

            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 129: // methods ::= method_list
            {
              CUP$result = new symbol(/*methods*/35);

            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 128: // inner_outer ::=
            {
              CUP$result = new str_token(/*inner_outer*/4);
               ((str_token)CUP$result).str_val = null;
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 127: // inner_outer ::= OUTER classname
            {
              CUP$result = new str_token(/*inner_outer*/4);
               ((str_token)CUP$result).str_val = (/*w*/(str_token)CUP$stack.elementAt(CUP$top-0)).str_val;
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 126: // inner_inner ::=
            {
              CUP$result = new str_token(/*inner_inner*/3);
               ((str_token)CUP$result).str_val = null;
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 125: // inner_inner ::= INNER classname
            {
              CUP$result = new str_token(/*inner_inner*/3);
               ((str_token)CUP$result).str_val = (/*w*/(str_token)CUP$stack.elementAt(CUP$top-0)).str_val;
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 124: // inner_name ::=
            {
              CUP$result = new str_token(/*inner_name*/2);
               ((str_token)CUP$result).str_val = null;
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 123: // inner_name ::= Word
            {
              CUP$result = new str_token(/*inner_name*/2);
               ((str_token)CUP$result).str_val = (/*w*/(str_token)CUP$stack.elementAt(CUP$top-0)).str_val;
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 122: // inner_spec ::= DINNER INTERFACE access inner_name inner_inner inner_outer SEP
            {
              CUP$result = new symbol(/*inner_spec*/72);
               classFile.addInner((short)((/*a*/(int_token)CUP$stack.elementAt(CUP$top-4)).int_val |
                              RuntimeConstants.ACC_INTERFACE),
                                (/*n*/(str_token)CUP$stack.elementAt(CUP$top-3)).str_val, (/*i*/(str_token)CUP$stack.elementAt(CUP$top-2)).str_val, (/*o*/(str_token)CUP$stack.elementAt(CUP$top-1)).str_val);
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 121: // inner_spec ::= DINNER CLASS access inner_name inner_inner inner_outer SEP
            {
              CUP$result = new symbol(/*inner_spec*/72);
               classFile.addInner((short)(/*a*/(int_token)CUP$stack.elementAt(CUP$top-4)).int_val,
                              (/*n*/(str_token)CUP$stack.elementAt(CUP$top-3)).str_val, (/*i*/(str_token)CUP$stack.elementAt(CUP$top-2)).str_val, (/*o*/(str_token)CUP$stack.elementAt(CUP$top-1)).str_val);
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 120: // inner_list ::= inner_spec
            {
              CUP$result = new symbol(/*inner_list*/71);

            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 119: // inner_list ::= inner_list inner_spec
            {
              CUP$result = new symbol(/*inner_list*/71);

            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 118: // inners ::=
            {
              CUP$result = new symbol(/*inners*/70);

            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 117: // inners ::= inner_list
            {
              CUP$result = new symbol(/*inners*/70);

            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 116: // any_item ::= item
            {
              CUP$result = new var_token(/*any_item*/8);
               ((var_token)CUP$result).var_val = (/*v*/(var_token)CUP$stack.elementAt(CUP$top-0)).var_val;
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 115: // any_item ::= Word
            {
              CUP$result = new var_token(/*any_item*/8);
               ((var_token)CUP$result).var_val = (/*w*/(str_token)CUP$stack.elementAt(CUP$top-0)).str_val;
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 114: // item ::= Str
            {
              CUP$result = new var_token(/*item*/7);
               ((var_token)CUP$result).var_val = (/*s*/(str_token)CUP$stack.elementAt(CUP$top-0)).str_val;
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 113: // item ::= Num
            {
              CUP$result = new var_token(/*item*/7);
               ((var_token)CUP$result).var_val = (/*n*/(num_token)CUP$stack.elementAt(CUP$top-0)).num_val;
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 112: // item ::= Int
            {
              CUP$result = new var_token(/*item*/7);
               ((var_token)CUP$result).var_val = (/*i*/(int_token)CUP$stack.elementAt(CUP$top-0)).int_val;
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 111: // field_ext_expr ::= DANNOTATION ann_clf_expr ann_arglist endannotationsep
            {
              CUP$result = new symbol(/*field_ext_expr*/69);

            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 110: // field_ext_expr ::= DDEPRECATED deprecated_expr SEP
            {
              CUP$result = new symbol(/*field_ext_expr*/69);

            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 109: // field_ext_expr ::= DATTRIBUTE generic_expr SEP
            {
              CUP$result = new symbol(/*field_ext_expr*/69);

            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 108: // field_ext_expr ::= DSIGNATURE signature_expr SEP
            {
              CUP$result = new symbol(/*field_ext_expr*/69);

            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 107: // field_ext_list ::= field_ext_expr
            {
              CUP$result = new symbol(/*field_ext_list*/68);

            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 106: // field_ext_list ::= field_ext_list field_ext_expr
            {
              CUP$result = new symbol(/*field_ext_list*/68);

            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 105: // field_exts ::=
            {
              CUP$result = new symbol(/*field_exts*/67);

            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 104: // field_exts ::= field_ext_list
            {
              CUP$result = new symbol(/*field_exts*/67);

            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 103: // endfield ::= DEND FIELD SEP
            {
              CUP$result = new symbol(/*endfield*/66);
               classFile.endField();
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 102: // field_start ::= access Word Word optional_default SEP
            {
              CUP$result = new symbol(/*field_start*/65);
               classFile.beginField((short)(/*a*/(int_token)CUP$stack.elementAt(CUP$top-4)).int_val, (/*name*/(str_token)CUP$stack.elementAt(CUP$top-3)).str_val,
                              (/*desc*/(str_token)CUP$stack.elementAt(CUP$top-2)).str_val, (/*v*/(var_token)CUP$stack.elementAt(CUP$top-1)).var_val);
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 101: // optional_default ::=
            {
              CUP$result = new var_token(/*optional_default*/6);
               ((var_token)CUP$result).var_val = null;
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 100: // optional_default ::= EQ item
            {
              CUP$result = new var_token(/*optional_default*/6);
               ((var_token)CUP$result).var_val = (/*v*/(var_token)CUP$stack.elementAt(CUP$top-0)).var_val;
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 99: // field_spec ::= DFIELD field_start field_exts endfield
            {
              CUP$result = new symbol(/*field_spec*/19);

            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 98: // field_spec ::= DFIELD access Word Word optional_default SEP
            {
              CUP$result = new symbol(/*field_spec*/19);
               classFile.addField((short)(/*a*/(int_token)CUP$stack.elementAt(CUP$top-4)).int_val, (/*name*/(str_token)CUP$stack.elementAt(CUP$top-3)).str_val, (/*desc*/(str_token)CUP$stack.elementAt(CUP$top-2)).str_val,
                               null, (/*v*/(var_token)CUP$stack.elementAt(CUP$top-1)).var_val);
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 97: // field_spec ::= DFIELD access Word Word SIGNATURE Str optional_default SEP
            {
              CUP$result = new symbol(/*field_spec*/19);
               classFile.addField((short)(/*a*/(int_token)CUP$stack.elementAt(CUP$top-6)).int_val, (/*name*/(str_token)CUP$stack.elementAt(CUP$top-5)).str_val, (/*desc*/(str_token)CUP$stack.elementAt(CUP$top-4)).str_val,
                              (/*sig*/(str_token)CUP$stack.elementAt(CUP$top-2)).str_val, (/*v*/(var_token)CUP$stack.elementAt(CUP$top-1)).var_val);
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 96: // field_list ::= field_spec
            {
              CUP$result = new symbol(/*field_list*/18);

            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 95: // field_list ::= field_list field_spec
            {
              CUP$result = new symbol(/*field_list*/18);

            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 94: // fields ::=
            {
              CUP$result = new symbol(/*fields*/20);

            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 93: // fields ::= field_list
            {
              CUP$result = new symbol(/*fields*/20);

            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 92: // generic_expr ::= Word Str
            {
              CUP$result = new symbol(/*generic_expr*/64);
               classFile.addGenericAttr((/*name*/(str_token)CUP$stack.elementAt(CUP$top-1)).str_val, (/*file*/(str_token)CUP$stack.elementAt(CUP$top-0)).str_val);
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 91: // generic_spec ::= DATTRIBUTE generic_expr SEP
            {
              CUP$result = new symbol(/*generic_spec*/63);

            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 90: // generic_list ::= generic_spec
            {
              CUP$result = new symbol(/*generic_list*/62);

            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 89: // generic_list ::= generic_list generic_spec
            {
              CUP$result = new symbol(/*generic_list*/62);

            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 88: // generic_attributes ::=
            {
              CUP$result = new symbol(/*generic_attributes*/61);

            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 87: // generic_attributes ::= generic_list
            {
              CUP$result = new symbol(/*generic_attributes*/61);

            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 86: // enclosing_spec ::=
            {
              CUP$result = new symbol(/*enclosing_spec*/53);

            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 85: // enclosing_spec ::= DENCLOSING METHOD Word SEP
            {
              CUP$result = new symbol(/*enclosing_spec*/53);
               classFile.setEnclosingMethod((/*w*/(str_token)CUP$stack.elementAt(CUP$top-1)).str_val);
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 84: // debug_spec ::= DDEBUG Str SEP
            {
              CUP$result = new symbol(/*debug_spec*/58);
               classFile.setSourceDebugExtension((/*s*/(str_token)CUP$stack.elementAt(CUP$top-1)).str_val);
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 83: // debug_list ::= debug_spec
            {
              CUP$result = new symbol(/*debug_list*/57);

            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 82: // debug_list ::= debug_list debug_spec
            {
              CUP$result = new symbol(/*debug_list*/57);

            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 81: // debug_extension ::=
            {
              CUP$result = new symbol(/*debug_extension*/52);

            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 80: // debug_extension ::= debug_list
            {
              CUP$result = new symbol(/*debug_extension*/52);

            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 79: // ann_def_expr ::= Word Word
            {
              CUP$result = new symbol(/*ann_def_expr*/87);
               classFile.addAnnotationField(null, (/*dsc*/(str_token)CUP$stack.elementAt(CUP$top-1)).str_val, (/*sub*/(str_token)CUP$stack.elementAt(CUP$top-0)).str_val);
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 78: // ann_def_expr ::= Word
            {
              CUP$result = new symbol(/*ann_def_expr*/87);
               classFile.addAnnotationField(null, (/*dsc*/(str_token)CUP$stack.elementAt(CUP$top-0)).str_val, null);
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 77: // ann_def_val ::= ann_def_expr EQ ann_value_list
            {
              CUP$result = new symbol(/*ann_def_val*/84);

            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 76: // ann_nest ::= SEP
            {
              CUP$result = new symbol(/*ann_nest*/89);
               classFile.nestAnnotation();
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 75: // ann_ann_value ::= DANNOTATION ann_nest ann_arglist endannotationsep
            {
              CUP$result = new symbol(/*ann_ann_value*/91);

            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 74: // ann_ann_list ::= ann_ann_value
            {
              CUP$result = new symbol(/*ann_ann_list*/92);

            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 73: // ann_ann_list ::= ann_ann_list ann_ann_value
            {
              CUP$result = new symbol(/*ann_ann_list*/92);

            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 72: // ann_value ::= any_item
            {
              CUP$result = new symbol(/*ann_value*/86);
               classFile.addAnnotationValue((/*v*/(var_token)CUP$stack.elementAt(CUP$top-0)).var_val);
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 71: // ann_value_items ::= ann_value
            {
              CUP$result = new symbol(/*ann_value_items*/85);

            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 70: // ann_value_items ::= ann_value_items ann_value
            {
              CUP$result = new symbol(/*ann_value_items*/85);

            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 69: // ann_value_list ::= ann_ann_list
            {
              CUP$result = new symbol(/*ann_value_list*/93);

            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 68: // ann_value_list ::= ann_value_items SEP
            {
              CUP$result = new symbol(/*ann_value_list*/93);

            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 67: // ann_def_spec ::= DEFAULT SEP
            {
              CUP$result = new symbol(/*ann_def_spec*/83);
               classFile.addAnnotation();
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 66: // ann_arg_expr ::= Word Word Word
            {
              CUP$result = new symbol(/*ann_arg_expr*/88);
               classFile.addAnnotationField((/*n*/(str_token)CUP$stack.elementAt(CUP$top-2)).str_val, (/*dsc*/(str_token)CUP$stack.elementAt(CUP$top-1)).str_val, (/*sub*/(str_token)CUP$stack.elementAt(CUP$top-0)).str_val);
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 65: // ann_arg_expr ::= Word Word
            {
              CUP$result = new symbol(/*ann_arg_expr*/88);
               classFile.addAnnotationField((/*n*/(str_token)CUP$stack.elementAt(CUP$top-1)).str_val, (/*dsc*/(str_token)CUP$stack.elementAt(CUP$top-0)).str_val, null);
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 64: // ann_arg_spec ::= ann_arg_expr EQ ann_value_list
            {
              CUP$result = new symbol(/*ann_arg_spec*/82);

            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 63: // ann_arg_list ::= ann_arg_spec
            {
              CUP$result = new symbol(/*ann_arg_list*/81);

            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 62: // ann_arg_list ::= ann_arg_list ann_arg_spec
            {
              CUP$result = new symbol(/*ann_arg_list*/81);

            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 61: // ann_arglist ::=
            {
              CUP$result = new symbol(/*ann_arglist*/80);

            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 60: // ann_arglist ::= ann_arg_list
            {
              CUP$result = new symbol(/*ann_arglist*/80);

            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 59: // ann_met_expr ::= INVISIBLEPARAM Int classname SEP
            {
              CUP$result = new symbol(/*ann_met_expr*/79);
               classFile.addAnnotation(false, (/*name*/(str_token)CUP$stack.elementAt(CUP$top-1)).str_val, (/*n*/(int_token)CUP$stack.elementAt(CUP$top-2)).int_val);
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 58: // ann_met_expr ::= VISIBLEPARAM Int classname SEP
            {
              CUP$result = new symbol(/*ann_met_expr*/79);
               classFile.addAnnotation(true, (/*name*/(str_token)CUP$stack.elementAt(CUP$top-1)).str_val, (/*n*/(int_token)CUP$stack.elementAt(CUP$top-2)).int_val);
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 57: // ann_met_expr ::= INVISIBLE classname SEP
            {
              CUP$result = new symbol(/*ann_met_expr*/79);
               classFile.addAnnotation(false, (/*name*/(str_token)CUP$stack.elementAt(CUP$top-1)).str_val);
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 56: // ann_met_expr ::= VISIBLE classname SEP
            {
              CUP$result = new symbol(/*ann_met_expr*/79);
               classFile.addAnnotation(true, (/*name*/(str_token)CUP$stack.elementAt(CUP$top-1)).str_val);
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 55: // ann_clf_expr ::= INVISIBLE classname SEP
            {
              CUP$result = new symbol(/*ann_clf_expr*/78);
               classFile.addAnnotation(false, (/*name*/(str_token)CUP$stack.elementAt(CUP$top-1)).str_val);
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 54: // ann_clf_expr ::= VISIBLE classname SEP
            {
              CUP$result = new symbol(/*ann_clf_expr*/78);
               classFile.addAnnotation(true, (/*name*/(str_token)CUP$stack.elementAt(CUP$top-1)).str_val);
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 53: // ann_cls_expr ::= DANNOTATION ann_clf_expr
            {
              CUP$result = new symbol(/*ann_cls_expr*/77);

            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 52: // endannotation ::= DEND ANNOTATION
            {
              CUP$result = new symbol(/*endannotation*/76);
               classFile.endAnnotation();
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 51: // endannotationsep ::= endannotation SEP
            {
              CUP$result = new symbol(/*endannotationsep*/90);

            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 50: // ann_cls_spec ::= ann_cls_expr ann_arglist endannotationsep
            {
              CUP$result = new symbol(/*ann_cls_spec*/75);

            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 49: // ann_cls_list ::= ann_cls_spec
            {
              CUP$result = new symbol(/*ann_cls_list*/74);

            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 48: // ann_cls_list ::= ann_cls_list ann_cls_spec
            {
              CUP$result = new symbol(/*ann_cls_list*/74);

            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 47: // annotations ::=
            {
              CUP$result = new symbol(/*annotations*/73);

            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 46: // annotations ::= ann_cls_list
            {
              CUP$result = new symbol(/*annotations*/73);

            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 45: // implements_spec ::= DIMPLEMENTS classname SEP
            {
              CUP$result = new symbol(/*implements_spec*/24);
               classFile.addInterface((/*name*/(str_token)CUP$stack.elementAt(CUP$top-1)).str_val);
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 44: // implements_list ::= implements_spec
            {
              CUP$result = new symbol(/*implements_list*/23);

            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 43: // implements_list ::= implements_list implements_spec
            {
              CUP$result = new symbol(/*implements_list*/23);

            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 42: // implements ::=
            {
              CUP$result = new symbol(/*implements*/22);

            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 41: // implements ::= implements_list
            {
              CUP$result = new symbol(/*implements*/22);

            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 40: // super_spec ::= DSUPER classname SEP
            {
              CUP$result = new symbol(/*super_spec*/42);
               classFile.setSuperClass((/*name*/(str_token)CUP$stack.elementAt(CUP$top-1)).str_val);
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 39: // access_item ::= SYNTHETIC
            {
              CUP$result = new symbol(/*access_item*/9);
               access_val |= RuntimeConstants.ACC_SYNTHETIC;
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 38: // access_item ::= STRICT
            {
              CUP$result = new symbol(/*access_item*/9);
               access_val |= RuntimeConstants.ACC_STRICT;
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 37: // access_item ::= VARARGS
            {
              CUP$result = new symbol(/*access_item*/9);
               access_val |= RuntimeConstants.ACC_VARARGS;
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 36: // access_item ::= BRIDGE
            {
              CUP$result = new symbol(/*access_item*/9);
               access_val |= RuntimeConstants.ACC_BRIDGE;
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 35: // access_item ::= ENUM
            {
              CUP$result = new symbol(/*access_item*/9);
               access_val |= RuntimeConstants.ACC_ENUM;
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 34: // access_item ::= ANNOTATION
            {
              CUP$result = new symbol(/*access_item*/9);
               access_val |= RuntimeConstants.ACC_ANNOTATION;
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 33: // access_item ::= ABSTRACT
            {
              CUP$result = new symbol(/*access_item*/9);
               access_val |= RuntimeConstants.ACC_ABSTRACT;
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 32: // access_item ::= INTERFACE
            {
              CUP$result = new symbol(/*access_item*/9);
               access_val |= RuntimeConstants.ACC_INTERFACE;
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 31: // access_item ::= NATIVE
            {
              CUP$result = new symbol(/*access_item*/9);
               access_val |= RuntimeConstants.ACC_NATIVE;
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 30: // access_item ::= TRANSIENT
            {
              CUP$result = new symbol(/*access_item*/9);
               access_val |= RuntimeConstants.ACC_TRANSIENT;
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 29: // access_item ::= VOLATILE
            {
              CUP$result = new symbol(/*access_item*/9);
               access_val |= RuntimeConstants.ACC_VOLATILE;
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 28: // access_item ::= SYNCHRONIZED
            {
              CUP$result = new symbol(/*access_item*/9);
               access_val |= RuntimeConstants.ACC_SYNCHRONIZED;
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 27: // access_item ::= FINAL
            {
              CUP$result = new symbol(/*access_item*/9);
               access_val |= RuntimeConstants.ACC_FINAL;
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 26: // access_item ::= STATIC
            {
              CUP$result = new symbol(/*access_item*/9);
               access_val |= RuntimeConstants.ACC_STATIC;
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 25: // access_item ::= PROTECTED
            {
              CUP$result = new symbol(/*access_item*/9);
               access_val |= RuntimeConstants.ACC_PROTECTED;
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 24: // access_item ::= PRIVATE
            {
              CUP$result = new symbol(/*access_item*/9);
               access_val |= RuntimeConstants.ACC_PRIVATE;
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // access_item ::= PUBLIC
            {
              CUP$result = new symbol(/*access_item*/9);
               access_val |= RuntimeConstants.ACC_PUBLIC;
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // access_items ::= access_item
            {
              CUP$result = new symbol(/*access_items*/10);

            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // access_items ::= access_items access_item
            {
              CUP$result = new symbol(/*access_items*/10);

            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // access_list ::=
            {
              CUP$result = new symbol(/*access_list*/11);

            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // access_list ::= access_items
            {
              CUP$result = new symbol(/*access_list*/11);

            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // access ::= NT$0 access_list
            {
              CUP$result = new int_token(/*access*/104);
               ((int_token)CUP$result).int_val = access_val;
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // NT$0 ::=
            {
              CUP$result = new java_cup.runtime.token(/*NT$0*/105);
               access_val = 0;
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // classname ::= Word
            {
              CUP$result = new str_token(/*classname*/1);
               ((str_token)CUP$result).str_val = ScannerUtils.convertDots((/*w*/(str_token)CUP$stack.elementAt(CUP$top-0)).str_val);
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // class_spec ::= DINTERFACE access classname SEP
            {
              CUP$result = new symbol(/*class_spec*/13);
               classFile.setClass((/*name*/(str_token)CUP$stack.elementAt(CUP$top-1)).str_val,
                (short)((/*a*/(int_token)CUP$stack.elementAt(CUP$top-2)).int_val |
                        RuntimeConstants.ACC_SUPER |
                        RuntimeConstants.ACC_INTERFACE));
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // class_spec ::= DCLASS access classname SEP
            {
              CUP$result = new symbol(/*class_spec*/13);
               classFile.setClass((/*name*/(str_token)CUP$stack.elementAt(CUP$top-1)).str_val,
                (short)((/*a*/(int_token)CUP$stack.elementAt(CUP$top-2)).int_val | RuntimeConstants.ACC_SUPER));
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // source_spec ::=
            {
              CUP$result = new symbol(/*source_spec*/38);

            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // source_spec ::= DSOURCE Word SEP
            {
              CUP$result = new symbol(/*source_spec*/38);
               classFile.setSource((/*w*/(str_token)CUP$stack.elementAt(CUP$top-1)).str_val);
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // source_spec ::= DSOURCE Str SEP
            {
              CUP$result = new symbol(/*source_spec*/38);
               classFile.setSource((/*s*/(str_token)CUP$stack.elementAt(CUP$top-1)).str_val);
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // bytecode_spec ::=
            {
              CUP$result = new symbol(/*bytecode_spec*/51);

            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // bytecode_spec ::= DBYTECODE Num SEP
            {
              CUP$result = new symbol(/*bytecode_spec*/51);
               classFile.setVersion((/*n*/(num_token)CUP$stack.elementAt(CUP$top-1)).num_val);
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // deprecated_expr ::=
            {
              CUP$result = new symbol(/*deprecated_expr*/60);
               classFile.setDeprecated();
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // deprecated_spec ::=
            {
              CUP$result = new symbol(/*deprecated_spec*/59);

            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // deprecated_spec ::= DDEPRECATED deprecated_expr SEP
            {
              CUP$result = new symbol(/*deprecated_spec*/59);

            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // signature_expr ::= Str
            {
              CUP$result = new symbol(/*signature_expr*/55);
               classFile.setSignature((/*sig*/(str_token)CUP$stack.elementAt(CUP$top-0)).str_val);
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // signature_spec ::=
            {
              CUP$result = new symbol(/*signature_spec*/54);

            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // signature_spec ::= DSIGNATURE signature_expr SEP
            {
              CUP$result = new symbol(/*signature_spec*/54);

            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // jasmin_header ::= bytecode_spec source_spec class_spec super_spec implements signature_spec enclosing_spec deprecated_spec annotations generic_attributes debug_extension
            {
              CUP$result = new symbol(/*jasmin_header*/56);
               classFile.endHeader();
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // $START ::= jas_file EOF
            {
              CUP$result = new java_cup.runtime.token(/*$START*/0);

            }
          /* ACCEPT */
          CUP$parser.done_parsing();
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // jas_file ::= jasmin_header inners fields methods
            {
              CUP$result = new symbol(/*jas_file*/25);

            }
          return CUP$result;

          /* . . . . . .*/
          default:
            throw new RuntimeException("Invalid action number found in internal parse table");

        }
    }
}
