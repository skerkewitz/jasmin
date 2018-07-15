
/* Constants used in JVM class files */

package jas;

public interface RuntimeConstants {

  // top-level constants
  int JAVA_MAGIC = -889275714;
  int JAVA_VERSION = 45;
  int JAVA_MINOR_VERSION = 3;

  // constant pool entry types
  int CONSTANT_UTF8 = 1;
  int CONSTANT_UNICODE = 2;
  int CONSTANT_INTEGER = 3;
  int CONSTANT_FLOAT = 4;
  int CONSTANT_LONG = 5;
  int CONSTANT_DOUBLE = 6;
  int CONSTANT_CLASS = 7;
  int CONSTANT_STRING = 8;
  int CONSTANT_FIELD = 9;
  int CONSTANT_METHOD = 10;
  int CONSTANT_INTERFACEMETHOD = 11;
  int CONSTANT_NAMEANDTYPE = 12;

  // access flags
  int ACC_PUBLIC = 0x0001;
  int ACC_PRIVATE = 0x0002;
  int ACC_PROTECTED = 0x0004;
  int ACC_STATIC = 0x0008;
  int ACC_FINAL = 0x0010;
  int ACC_SYNCHRONIZED = 0x0020; // method
  int ACC_SUPER = 0x0020; // class(auto)
  int ACC_VOLATILE = 0x0040; // field
  int ACC_BRIDGE = 0x0040; // method
  int ACC_TRANSIENT = 0x0080; // field
  int ACC_VARARGS = 0x0080; // method
  int ACC_NATIVE = 0x0100;
  int ACC_INTERFACE = 0x0200;
  int ACC_ABSTRACT = 0x0400;
  int ACC_STRICT = 0x0800;
  int ACC_SYNTHETIC = 0x1000;
  int ACC_ANNOTATION = 0x2000;
  int ACC_ENUM = 0x4000;

  // types for newarray
  int T_CLASS = 2;
  int T_BOOLEAN = 4;
  int T_CHAR = 5;
  int T_FLOAT = 6;
  int T_DOUBLE = 7;
  int T_BYTE = 8;
  int T_SHORT = 9;
  int T_INT = 10;
  int T_LONG = 11;

  // opcodes
  int opc_try = -3;
  int opc_dead = -2;
  int opc_label = -1;
  int opc_nop = 0;
  int opc_aconst_null = 1;
  int opc_iconst_m1 = 2;
  int opc_iconst_0 = 3;
  int opc_iconst_1 = 4;
  int opc_iconst_2 = 5;
  int opc_iconst_3 = 6;
  int opc_iconst_4 = 7;
  int opc_iconst_5 = 8;
  int opc_lconst_0 = 9;
  int opc_lconst_1 = 10;
  int opc_fconst_0 = 11;
  int opc_fconst_1 = 12;
  int opc_fconst_2 = 13;
  int opc_dconst_0 = 14;
  int opc_dconst_1 = 15;
  int opc_bipush = 16;
  int opc_sipush = 17;
  int opc_ldc = 18;
  int opc_ldc_w = 19;
  int opc_ldc2_w = 20;
  int opc_iload = 21;
  int opc_lload = 22;
  int opc_fload = 23;
  int opc_dload = 24;
  int opc_aload = 25;
  int opc_iload_0 = 26;
  int opc_iload_1 = 27;
  int opc_iload_2 = 28;
  int opc_iload_3 = 29;
  int opc_lload_0 = 30;
  int opc_lload_1 = 31;
  int opc_lload_2 = 32;
  int opc_lload_3 = 33;
  int opc_fload_0 = 34;
  int opc_fload_1 = 35;
  int opc_fload_2 = 36;
  int opc_fload_3 = 37;
  int opc_dload_0 = 38;
  int opc_dload_1 = 39;
  int opc_dload_2 = 40;
  int opc_dload_3 = 41;
  int opc_aload_0 = 42;
  int opc_aload_1 = 43;
  int opc_aload_2 = 44;
  int opc_aload_3 = 45;
  int opc_iaload = 46;
  int opc_laload = 47;
  int opc_faload = 48;
  int opc_daload = 49;
  int opc_aaload = 50;
  int opc_baload = 51;
  int opc_caload = 52;
  int opc_saload = 53;
  int opc_istore = 54;
  int opc_lstore = 55;
  int opc_fstore = 56;
  int opc_dstore = 57;
  int opc_astore = 58;
  int opc_istore_0 = 59;
  int opc_istore_1 = 60;
  int opc_istore_2 = 61;
  int opc_istore_3 = 62;
  int opc_lstore_0 = 63;
  int opc_lstore_1 = 64;
  int opc_lstore_2 = 65;
  int opc_lstore_3 = 66;
  int opc_fstore_0 = 67;
  int opc_fstore_1 = 68;
  int opc_fstore_2 = 69;
  int opc_fstore_3 = 70;
  int opc_dstore_0 = 71;
  int opc_dstore_1 = 72;
  int opc_dstore_2 = 73;
  int opc_dstore_3 = 74;
  int opc_astore_0 = 75;
  int opc_astore_1 = 76;
  int opc_astore_2 = 77;
  int opc_astore_3 = 78;
  int opc_iastore = 79;
  int opc_lastore = 80;
  int opc_fastore = 81;
  int opc_dastore = 82;
  int opc_aastore = 83;
  int opc_bastore = 84;
  int opc_castore = 85;
  int opc_sastore = 86;
  int opc_pop = 87;
  int opc_pop2 = 88;
  int opc_dup = 89;
  int opc_dup_x1 = 90;
  int opc_dup_x2 = 91;
  int opc_dup2 = 92;
  int opc_dup2_x1 = 93;
  int opc_dup2_x2 = 94;
  int opc_swap = 95;
  int opc_iadd = 96;
  int opc_ladd = 97;
  int opc_fadd = 98;
  int opc_dadd = 99;
  int opc_isub = 100;
  int opc_lsub = 101;
  int opc_fsub = 102;
  int opc_dsub = 103;
  int opc_imul = 104;
  int opc_lmul = 105;
  int opc_fmul = 106;
  int opc_dmul = 107;
  int opc_idiv = 108;
  int opc_ldiv = 109;
  int opc_fdiv = 110;
  int opc_ddiv = 111;
  int opc_irem = 112;
  int opc_lrem = 113;
  int opc_frem = 114;
  int opc_drem = 115;
  int opc_ineg = 116;
  int opc_lneg = 117;
  int opc_fneg = 118;
  int opc_dneg = 119;
  int opc_ishl = 120;
  int opc_lshl = 121;
  int opc_ishr = 122;
  int opc_lshr = 123;
  int opc_iushr = 124;
  int opc_lushr = 125;
  int opc_iand = 126;
  int opc_land = 127;
  int opc_ior = 128;
  int opc_lor = 129;
  int opc_ixor = 130;
  int opc_lxor = 131;
  int opc_iinc = 132;
  int opc_i2l = 133;
  int opc_i2f = 134;
  int opc_i2d = 135;
  int opc_l2i = 136;
  int opc_l2f = 137;
  int opc_l2d = 138;
  int opc_f2i = 139;
  int opc_f2l = 140;
  int opc_f2d = 141;
  int opc_d2i = 142;
  int opc_d2l = 143;
  int opc_d2f = 144;
  int opc_i2b = 145;
  int opc_i2c = 146;
  int opc_i2s = 147;
  int opc_lcmp = 148;
  int opc_fcmpl = 149;
  int opc_fcmpg = 150;
  int opc_dcmpl = 151;
  int opc_dcmpg = 152;
  int opc_ifeq = 153;
  int opc_ifne = 154;
  int opc_iflt = 155;
  int opc_ifge = 156;
  int opc_ifgt = 157;
  int opc_ifle = 158;
  int opc_if_icmpeq = 159;
  int opc_if_icmpne = 160;
  int opc_if_icmplt = 161;
  int opc_if_icmpge = 162;
  int opc_if_icmpgt = 163;
  int opc_if_icmple = 164;
  int opc_if_acmpeq = 165;
  int opc_if_acmpne = 166;
  int opc_goto = 167;
  int opc_jsr = 168;
  int opc_ret = 169;
  int opc_tableswitch = 170;
  int opc_lookupswitch = 171;
  int opc_ireturn = 172;
  int opc_lreturn = 173;
  int opc_freturn = 174;
  int opc_dreturn = 175;
  int opc_areturn = 176;
  int opc_return = 177;
  int opc_getstatic = 178;
  int opc_putstatic = 179;
  int opc_getfield = 180;
  int opc_putfield = 181;
  int opc_invokevirtual = 182;
  int opc_invokespecial = 183;
  int opc_invokestatic = 184;
  int opc_invokeinterface = 185;
  int opc_invokedynamic = 186;
  int opc_new = 187;
  int opc_newarray = 188;
  int opc_anewarray = 189;
  int opc_arraylength = 190;
  int opc_athrow = 191;
  int opc_checkcast = 192;
  int opc_instanceof = 193;
  int opc_monitorenter = 194;
  int opc_monitorexit = 195;
  int opc_wide = 196;
  int opc_multianewarray = 197;
  int opc_ifnull = 198;
  int opc_ifnonnull = 199;
  int opc_goto_w = 200;
  int opc_jsr_w = 201;
  int opc_breakpoint = 202;
  // for backwards compatibility with 1.0
  int opc_int2byte = opc_i2b;
  int opc_int2char = opc_i2c;
  int opc_int2short = opc_i2s;
  int opc_invokenonvirtual = opc_invokespecial;

  // names of opcodes
  String opcNames[] = {
          "opc_nop", "opc_aconst_null", "opc_iconst_m1", "opc_iconst_0",
          "opc_iconst_1", "opc_iconst_2", "opc_iconst_3", "opc_iconst_4",
          "opc_iconst_5", "opc_lconst_0", "opc_lconst_1", "opc_fconst_0",
          "opc_fconst_1", "opc_fconst_2", "opc_dconst_0", "opc_dconst_1",
          "opc_bipush", "opc_sipush", "opc_ldc", "opc_ldc_w", "opc_ldc2_w",
          "opc_iload", "opc_lload", "opc_fload", "opc_dload", "opc_aload",
          "opc_iload_0", "opc_iload_1", "opc_iload_2", "opc_iload_3",
          "opc_lload_0", "opc_lload_1", "opc_lload_2", "opc_lload_3",
          "opc_fload_0", "opc_fload_1", "opc_fload_2", "opc_fload_3",
          "opc_dload_0", "opc_dload_1", "opc_dload_2", "opc_dload_3",
          "opc_aload_0", "opc_aload_1", "opc_aload_2", "opc_aload_3",
          "opc_iaload", "opc_laload", "opc_faload", "opc_daload", "opc_aaload",
          "opc_baload", "opc_caload", "opc_saload", "opc_istore", "opc_lstore",
          "opc_fstore", "opc_dstore", "opc_astore", "opc_istore_0",
          "opc_istore_1", "opc_istore_2", "opc_istore_3", "opc_lstore_0",
          "opc_lstore_1", "opc_lstore_2", "opc_lstore_3", "opc_fstore_0",
          "opc_fstore_1", "opc_fstore_2", "opc_fstore_3", "opc_dstore_0",
          "opc_dstore_1", "opc_dstore_2", "opc_dstore_3", "opc_astore_0",
          "opc_astore_1", "opc_astore_2", "opc_astore_3", "opc_iastore",
          "opc_lastore", "opc_fastore", "opc_dastore", "opc_aastore",
          "opc_bastore", "opc_castore", "opc_sastore", "opc_pop", "opc_pop2",
          "opc_dup", "opc_dup_x1", "opc_dup_x2", "opc_dup2", "opc_dup2_x1",
          "opc_dup2_x2", "opc_swap", "opc_iadd", "opc_ladd", "opc_fadd",
          "opc_dadd", "opc_isub", "opc_lsub", "opc_fsub", "opc_dsub",
          "opc_imul", "opc_lmul", "opc_fmul", "opc_dmul", "opc_idiv",
          "opc_ldiv", "opc_fdiv", "opc_ddiv", "opc_irem", "opc_lrem",
          "opc_frem", "opc_drem", "opc_ineg", "opc_lneg", "opc_fneg",
          "opc_dneg", "opc_ishl", "opc_lshl", "opc_ishr", "opc_lshr",
          "opc_iushr", "opc_lushr", "opc_iand", "opc_land", "opc_ior",
          "opc_lor", "opc_ixor", "opc_lxor", "opc_iinc", "opc_i2l", "opc_i2f",
          "opc_i2d", "opc_l2i", "opc_l2f", "opc_l2d", "opc_f2i", "opc_f2l",
          "opc_f2d", "opc_d2i", "opc_d2l", "opc_d2f", "opc_i2b", "opc_i2c",
          "opc_i2s", "opc_lcmp", "opc_fcmpl", "opc_fcmpg", "opc_dcmpl",
          "opc_dcmpg", "opc_ifeq", "opc_ifne", "opc_iflt", "opc_ifge",
          "opc_ifgt", "opc_ifle", "opc_if_icmpeq", "opc_if_icmpne",
          "opc_if_icmplt", "opc_if_icmpge", "opc_if_icmpgt", "opc_if_icmple",
          "opc_if_acmpeq", "opc_if_acmpne", "opc_goto", "opc_jsr", "opc_ret",
          "opc_tableswitch", "opc_lookupswitch", "opc_ireturn", "opc_lreturn",
          "opc_freturn", "opc_dreturn", "opc_areturn", "opc_return",
          "opc_getstatic", "opc_putstatic", "opc_getfield", "opc_putfield",
          "opc_invokevirtual", "opc_invokespecial", "opc_invokestatic",
          "opc_invokeinterface", "opc_invokedynamic", "opc_new", "opc_newarray",
          "opc_anewarray", "opc_arraylength", "opc_athrow", "opc_checkcast",
          "opc_instanceof", "opc_monitorenter", "opc_monitorexit", "opc_wide",
          "opc_multianewarray", "opc_ifnull", "opc_ifnonnull", "opc_goto_w",
          "opc_jsr_w", "opc_breakpoint"
  };

  // and their lengths
  int opcLengths[] = {
          1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 3, 2, 3, 3, 2, 2,
          2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
          1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
          1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
          1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
          1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 3, 1, 1, 1, 1, 1,
          1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 3, 3, 3, 3, 3, 3, 3, 3,
          3, 3, 3, 3, 3, 3, 3, 3, 2, 99, 99, 1, 1, 1, 1, 1, 1, 3, 3, 3, 3, 3, 3,
          3, 5, 3, 3, 2, 3, 1, 1, 3, 3, 1, 1, 0, 4, 3, 3, 5, 5, 1
  };
}
