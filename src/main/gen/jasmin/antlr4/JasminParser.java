// Generated from C:/Users/stefa/IdeaProjects/jasmin/src/main/java/jasmin/antlr4\Jasmin.g4 by ANTLR 4.7
package jasmin.antlr4;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JasminParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Insn=1, DANNOTATION=2, DBYTECODE=3, DATTRIBUTE=4, DCATCH=5, DCLASS=6, 
		DDEPRECATED=7, DEND=8, DFIELD=9, DIMPLEMENTS=10, DINNER=11, DINTERFACE=12, 
		DLIMIT=13, DLINE=14, DMETHOD=15, DSET=16, DSOURCE=17, DSUPER=18, DTHROWS=19, 
		DVAR=20, DDEBUG=21, DENCLOSING=22, DSIGNATURE=23, DSTACK=24, FIELD=25, 
		FROM=26, METHOD=27, TO=28, IS=29, USING=30, SIGNATURE=31, STACK=32, OFFSET=33, 
		LOCALS=34, USE=35, INNER=36, OUTER=37, CLASS=38, VISIBLE=39, INVISIBLE=40, 
		VISIBLEPARAM=41, INVISIBLEPARAM=42, TABLESWITCH=43, LOOKUPSWITCH=44, DEFAULT=45, 
		PUBLIC=46, PRIVATE=47, PROTECTED=48, STATIC=49, FINAL=50, SYNCHRONIZED=51, 
		VOLATILE=52, TRANSIENT=53, NATIVE=54, INTERFACE=55, ABSTRACT=56, ANNOTATION=57, 
		ENUM=58, BRIDGE=59, VARARGS=60, STRICT=61, SYNTHETIC=62, COLON=63, EQ=64, 
		LINE_COMMENT=65, WS=66, Word=67, Str=68, Relative=69, Int=70, Num=71;
	public static final int
		RULE_compilation_unit = 0, RULE_jasmin_header = 1, RULE_signature_spec = 2, 
		RULE_signature_expr = 3, RULE_deprecated_spec = 4, RULE_deprecated_expr = 5, 
		RULE_bytecode_spec = 6, RULE_source_spec = 7, RULE_class_spec = 8, RULE_classname = 9, 
		RULE_access = 10, RULE_access_list = 11, RULE_access_item = 12, RULE_super_spec = 13, 
		RULE_impls = 14, RULE_implements_list = 15, RULE_implements_spec = 16, 
		RULE_annotations = 17, RULE_ann_cls_list = 18, RULE_ann_cls_spec = 19, 
		RULE_endannotationsep = 20, RULE_endannotation = 21, RULE_ann_cls_expr = 22, 
		RULE_ann_clf_expr = 23, RULE_ann_met_expr = 24, RULE_ann_arglist = 25, 
		RULE_ann_arg_list = 26, RULE_ann_arg_spec = 27, RULE_ann_arg_expr = 28, 
		RULE_ann_def_spec = 29, RULE_ann_value_list = 30, RULE_ann_value_items = 31, 
		RULE_ann_value = 32, RULE_ann_ann_list = 33, RULE_ann_ann_value = 34, 
		RULE_ann_nest = 35, RULE_ann_def_val = 36, RULE_ann_def_expr = 37, RULE_debug_extension = 38, 
		RULE_debug_list = 39, RULE_debug_spec = 40, RULE_enclosing_spec = 41, 
		RULE_generic_attributes = 42, RULE_generic_list = 43, RULE_generic_spec = 44, 
		RULE_generic_expr = 45, RULE_fields = 46, RULE_field_list = 47, RULE_field_spec = 48, 
		RULE_optional_default = 49, RULE_field_start = 50, RULE_endfield = 51, 
		RULE_field_exts = 52, RULE_field_ext_list = 53, RULE_field_ext_expr = 54, 
		RULE_item = 55, RULE_any_item = 56, RULE_inners = 57, RULE_inner_list = 58, 
		RULE_inner_spec = 59, RULE_inner_name = 60, RULE_inner_inner = 61, RULE_inner_outer = 62, 
		RULE_methods = 63, RULE_method_spec = 64, RULE_defmethod = 65, RULE_endmethod = 66, 
		RULE_statements = 67, RULE_statement = 68, RULE_label = 69, RULE_directive = 70, 
		RULE_stackmap = 71, RULE_defstack_same = 72, RULE_defstack_same_expr = 73, 
		RULE_defstack = 74, RULE_stack_map_frame_desc = 75, RULE_stack_offset_def = 76, 
		RULE_stack_items = 77, RULE_stack_item = 78, RULE_stack_item_expr = 79, 
		RULE_endstack = 80, RULE_var_expr = 81, RULE_optional_signature = 82, 
		RULE_line_expr = 83, RULE_throws_expr = 84, RULE_catch_expr = 85, RULE_set_expr = 86, 
		RULE_instruction = 87, RULE_simple_instruction = 88, RULE_complex_instruction = 89, 
		RULE_lookup = 90, RULE_lookup_args = 91, RULE_lookup_list = 92, RULE_lookup_entry = 93, 
		RULE_lookup_default = 94, RULE_table = 95, RULE_table_args = 96, RULE_table_list = 97, 
		RULE_table_entry = 98, RULE_table_default = 99;
	public static final String[] ruleNames = {
		"compilation_unit", "jasmin_header", "signature_spec", "signature_expr", 
		"deprecated_spec", "deprecated_expr", "bytecode_spec", "source_spec", 
		"class_spec", "classname", "access", "access_list", "access_item", "super_spec", 
		"impls", "implements_list", "implements_spec", "annotations", "ann_cls_list", 
		"ann_cls_spec", "endannotationsep", "endannotation", "ann_cls_expr", "ann_clf_expr", 
		"ann_met_expr", "ann_arglist", "ann_arg_list", "ann_arg_spec", "ann_arg_expr", 
		"ann_def_spec", "ann_value_list", "ann_value_items", "ann_value", "ann_ann_list", 
		"ann_ann_value", "ann_nest", "ann_def_val", "ann_def_expr", "debug_extension", 
		"debug_list", "debug_spec", "enclosing_spec", "generic_attributes", "generic_list", 
		"generic_spec", "generic_expr", "fields", "field_list", "field_spec", 
		"optional_default", "field_start", "endfield", "field_exts", "field_ext_list", 
		"field_ext_expr", "item", "any_item", "inners", "inner_list", "inner_spec", 
		"inner_name", "inner_inner", "inner_outer", "methods", "method_spec", 
		"defmethod", "endmethod", "statements", "statement", "label", "directive", 
		"stackmap", "defstack_same", "defstack_same_expr", "defstack", "stack_map_frame_desc", 
		"stack_offset_def", "stack_items", "stack_item", "stack_item_expr", "endstack", 
		"var_expr", "optional_signature", "line_expr", "throws_expr", "catch_expr", 
		"set_expr", "instruction", "simple_instruction", "complex_instruction", 
		"lookup", "lookup_args", "lookup_list", "lookup_entry", "lookup_default", 
		"table", "table_args", "table_list", "table_entry", "table_default"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, "'.annotation'", "'.bytecode'", "'.attribute'", "'.catch'", 
		"'.class'", "'.deprecated'", "'.end'", "'.field'", "'.implements'", "'.inner'", 
		"'.interface'", "'.limit'", "'.line'", "'.method'", "'.set'", "'.source'", 
		"'.super'", "'.throws'", "'.var'", "'.debug'", "'.enclosing'", "'.signature'", 
		"'.stack'", "'field'", "'from'", "'method'", "'to'", "'is'", "'using'", 
		"'signature'", "'stack'", "'offset'", "'locals'", "'use'", "'inner'", 
		"'outer'", "'class'", "'visible'", "'invisible'", "'visibleparam'", "'invisibleparam'", 
		"'tableswitch'", "'lookupswitch'", "'default'", "'public'", "'private'", 
		"'protected'", "'static'", "'final'", "'synchronized'", "'volatile'", 
		"'transient'", "'native'", "'interface'", "'abstract'", "'annotation'", 
		"'enum'", "'bridge'", "'varargs'", "'fpstrict'", "'synthetic'", "':'", 
		"'='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "Insn", "DANNOTATION", "DBYTECODE", "DATTRIBUTE", "DCATCH", "DCLASS", 
		"DDEPRECATED", "DEND", "DFIELD", "DIMPLEMENTS", "DINNER", "DINTERFACE", 
		"DLIMIT", "DLINE", "DMETHOD", "DSET", "DSOURCE", "DSUPER", "DTHROWS", 
		"DVAR", "DDEBUG", "DENCLOSING", "DSIGNATURE", "DSTACK", "FIELD", "FROM", 
		"METHOD", "TO", "IS", "USING", "SIGNATURE", "STACK", "OFFSET", "LOCALS", 
		"USE", "INNER", "OUTER", "CLASS", "VISIBLE", "INVISIBLE", "VISIBLEPARAM", 
		"INVISIBLEPARAM", "TABLESWITCH", "LOOKUPSWITCH", "DEFAULT", "PUBLIC", 
		"PRIVATE", "PROTECTED", "STATIC", "FINAL", "SYNCHRONIZED", "VOLATILE", 
		"TRANSIENT", "NATIVE", "INTERFACE", "ABSTRACT", "ANNOTATION", "ENUM", 
		"BRIDGE", "VARARGS", "STRICT", "SYNTHETIC", "COLON", "EQ", "LINE_COMMENT", 
		"WS", "Word", "Str", "Relative", "Int", "Num"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Jasmin.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public JasminParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class Compilation_unitContext extends ParserRuleContext {
		public Jasmin_headerContext jasmin_header() {
			return getRuleContext(Jasmin_headerContext.class,0);
		}
		public MethodsContext methods() {
			return getRuleContext(MethodsContext.class,0);
		}
		public TerminalNode EOF() { return getToken(JasminParser.EOF, 0); }
		public Compilation_unitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilation_unit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasminListener ) ((JasminListener)listener).enterCompilation_unit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasminListener ) ((JasminListener)listener).exitCompilation_unit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasminVisitor ) return ((JasminVisitor<? extends T>)visitor).visitCompilation_unit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Compilation_unitContext compilation_unit() throws RecognitionException {
		Compilation_unitContext _localctx = new Compilation_unitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_compilation_unit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			jasmin_header();
			setState(201);
			methods();
			setState(202);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Jasmin_headerContext extends ParserRuleContext {
		public Class_specContext class_spec() {
			return getRuleContext(Class_specContext.class,0);
		}
		public Super_specContext super_spec() {
			return getRuleContext(Super_specContext.class,0);
		}
		public Jasmin_headerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jasmin_header; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasminListener ) ((JasminListener)listener).enterJasmin_header(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasminListener ) ((JasminListener)listener).exitJasmin_header(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasminVisitor ) return ((JasminVisitor<? extends T>)visitor).visitJasmin_header(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Jasmin_headerContext jasmin_header() throws RecognitionException {
		Jasmin_headerContext _localctx = new Jasmin_headerContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_jasmin_header);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			class_spec();
			setState(205);
			super_spec();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Signature_specContext extends ParserRuleContext {
		public TerminalNode DSIGNATURE() { return getToken(JasminParser.DSIGNATURE, 0); }
		public Signature_exprContext signature_expr() {
			return getRuleContext(Signature_exprContext.class,0);
		}
		public Signature_specContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signature_spec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasminListener ) ((JasminListener)listener).enterSignature_spec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasminListener ) ((JasminListener)listener).exitSignature_spec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasminVisitor ) return ((JasminVisitor<? extends T>)visitor).visitSignature_spec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Signature_specContext signature_spec() throws RecognitionException {
		Signature_specContext _localctx = new Signature_specContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_signature_spec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			match(DSIGNATURE);
			setState(208);
			signature_expr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Signature_exprContext extends ParserRuleContext {
		public Token sig;
		public TerminalNode Str() { return getToken(JasminParser.Str, 0); }
		public Signature_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signature_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasminListener ) ((JasminListener)listener).enterSignature_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasminListener ) ((JasminListener)listener).exitSignature_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasminVisitor ) return ((JasminVisitor<? extends T>)visitor).visitSignature_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Signature_exprContext signature_expr() throws RecognitionException {
		Signature_exprContext _localctx = new Signature_exprContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_signature_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			((Signature_exprContext)_localctx).sig = match(Str);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Deprecated_specContext extends ParserRuleContext {
		public TerminalNode DDEPRECATED() { return getToken(JasminParser.DDEPRECATED, 0); }
		public Deprecated_exprContext deprecated_expr() {
			return getRuleContext(Deprecated_exprContext.class,0);
		}
		public Deprecated_specContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deprecated_spec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasminListener ) ((JasminListener)listener).enterDeprecated_spec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasminListener ) ((JasminListener)listener).exitDeprecated_spec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasminVisitor ) return ((JasminVisitor<? extends T>)visitor).visitDeprecated_spec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Deprecated_specContext deprecated_spec() throws RecognitionException {
		Deprecated_specContext _localctx = new Deprecated_specContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_deprecated_spec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			match(DDEPRECATED);
			setState(213);
			deprecated_expr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Deprecated_exprContext extends ParserRuleContext {
		public Deprecated_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deprecated_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasminListener ) ((JasminListener)listener).enterDeprecated_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasminListener ) ((JasminListener)listener).exitDeprecated_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasminVisitor ) return ((JasminVisitor<? extends T>)visitor).visitDeprecated_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Deprecated_exprContext deprecated_expr() throws RecognitionException {
		Deprecated_exprContext _localctx = new Deprecated_exprContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_deprecated_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Bytecode_specContext extends ParserRuleContext {
		public Token n;
		public TerminalNode DBYTECODE() { return getToken(JasminParser.DBYTECODE, 0); }
		public TerminalNode Num() { return getToken(JasminParser.Num, 0); }
		public Bytecode_specContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bytecode_spec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasminListener ) ((JasminListener)listener).enterBytecode_spec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasminListener ) ((JasminListener)listener).exitBytecode_spec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasminVisitor ) return ((JasminVisitor<? extends T>)visitor).visitBytecode_spec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bytecode_specContext bytecode_spec() throws RecognitionException {
		Bytecode_specContext _localctx = new Bytecode_specContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_bytecode_spec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			match(DBYTECODE);
			setState(218);
			((Bytecode_specContext)_localctx).n = match(Num);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Source_specContext extends ParserRuleContext {
		public Token s;
		public Token w;
		public TerminalNode DSOURCE() { return getToken(JasminParser.DSOURCE, 0); }
		public TerminalNode Str() { return getToken(JasminParser.Str, 0); }
		public TerminalNode Word() { return getToken(JasminParser.Word, 0); }
		public Source_specContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_source_spec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasminListener ) ((JasminListener)listener).enterSource_spec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasminListener ) ((JasminListener)listener).exitSource_spec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasminVisitor ) return ((JasminVisitor<? extends T>)visitor).visitSource_spec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Source_specContext source_spec() throws RecognitionException {
		Source_specContext _localctx = new Source_specContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_source_spec);
		try {
			setState(225);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(220);
				match(DSOURCE);
				setState(221);
				((Source_specContext)_localctx).s = match(Str);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(222);
				match(DSOURCE);
				setState(223);
				((Source_specContext)_localctx).w = match(Word);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Class_specContext extends ParserRuleContext {
		public AccessContext a;
		public ClassnameContext name;
		public TerminalNode DCLASS() { return getToken(JasminParser.DCLASS, 0); }
		public AccessContext access() {
			return getRuleContext(AccessContext.class,0);
		}
		public ClassnameContext classname() {
			return getRuleContext(ClassnameContext.class,0);
		}
		public TerminalNode DINTERFACE() { return getToken(JasminParser.DINTERFACE, 0); }
		public Class_specContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_spec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasminListener ) ((JasminListener)listener).enterClass_spec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasminListener ) ((JasminListener)listener).exitClass_spec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasminVisitor ) return ((JasminVisitor<? extends T>)visitor).visitClass_spec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Class_specContext class_spec() throws RecognitionException {
		Class_specContext _localctx = new Class_specContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_class_spec);
		try {
			setState(235);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DCLASS:
				enterOuterAlt(_localctx, 1);
				{
				setState(227);
				match(DCLASS);
				setState(228);
				((Class_specContext)_localctx).a = access();
				setState(229);
				((Class_specContext)_localctx).name = classname();
				}
				break;
			case DINTERFACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(231);
				match(DINTERFACE);
				setState(232);
				((Class_specContext)_localctx).a = access();
				setState(233);
				((Class_specContext)_localctx).name = classname();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassnameContext extends ParserRuleContext {
		public Token w;
		public TerminalNode Word() { return getToken(JasminParser.Word, 0); }
		public ClassnameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classname; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasminListener ) ((JasminListener)listener).enterClassname(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasminListener ) ((JasminListener)listener).exitClassname(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasminVisitor ) return ((JasminVisitor<? extends T>)visitor).visitClassname(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassnameContext classname() throws RecognitionException {
		ClassnameContext _localctx = new ClassnameContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_classname);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			((ClassnameContext)_localctx).w = match(Word);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AccessContext extends ParserRuleContext {
		public Access_listContext access_list() {
			return getRuleContext(Access_listContext.class,0);
		}
		public AccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_access; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasminListener ) ((JasminListener)listener).enterAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasminListener ) ((JasminListener)listener).exitAccess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasminVisitor ) return ((JasminVisitor<? extends T>)visitor).visitAccess(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AccessContext access() throws RecognitionException {
		AccessContext _localctx = new AccessContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_access);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			access_list();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Access_listContext extends ParserRuleContext {
		public List<Access_itemContext> access_item() {
			return getRuleContexts(Access_itemContext.class);
		}
		public Access_itemContext access_item(int i) {
			return getRuleContext(Access_itemContext.class,i);
		}
		public Access_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_access_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasminListener ) ((JasminListener)listener).enterAccess_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasminListener ) ((JasminListener)listener).exitAccess_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasminVisitor ) return ((JasminVisitor<? extends T>)visitor).visitAccess_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Access_listContext access_list() throws RecognitionException {
		Access_listContext _localctx = new Access_listContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_access_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(242); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(241);
					access_item();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(244); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Access_itemContext extends ParserRuleContext {
		public TerminalNode PUBLIC() { return getToken(JasminParser.PUBLIC, 0); }
		public TerminalNode PRIVATE() { return getToken(JasminParser.PRIVATE, 0); }
		public TerminalNode PROTECTED() { return getToken(JasminParser.PROTECTED, 0); }
		public TerminalNode STATIC() { return getToken(JasminParser.STATIC, 0); }
		public TerminalNode FINAL() { return getToken(JasminParser.FINAL, 0); }
		public TerminalNode SYNCHRONIZED() { return getToken(JasminParser.SYNCHRONIZED, 0); }
		public TerminalNode VOLATILE() { return getToken(JasminParser.VOLATILE, 0); }
		public TerminalNode TRANSIENT() { return getToken(JasminParser.TRANSIENT, 0); }
		public TerminalNode NATIVE() { return getToken(JasminParser.NATIVE, 0); }
		public TerminalNode INTERFACE() { return getToken(JasminParser.INTERFACE, 0); }
		public TerminalNode ABSTRACT() { return getToken(JasminParser.ABSTRACT, 0); }
		public TerminalNode ANNOTATION() { return getToken(JasminParser.ANNOTATION, 0); }
		public TerminalNode ENUM() { return getToken(JasminParser.ENUM, 0); }
		public TerminalNode BRIDGE() { return getToken(JasminParser.BRIDGE, 0); }
		public TerminalNode VARARGS() { return getToken(JasminParser.VARARGS, 0); }
		public TerminalNode STRICT() { return getToken(JasminParser.STRICT, 0); }
		public TerminalNode SYNTHETIC() { return getToken(JasminParser.SYNTHETIC, 0); }
		public Access_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_access_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasminListener ) ((JasminListener)listener).enterAccess_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasminListener ) ((JasminListener)listener).exitAccess_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasminVisitor ) return ((JasminVisitor<? extends T>)visitor).visitAccess_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Access_itemContext access_item() throws RecognitionException {
		Access_itemContext _localctx = new Access_itemContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_access_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PUBLIC) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << STATIC) | (1L << FINAL) | (1L << SYNCHRONIZED) | (1L << VOLATILE) | (1L << TRANSIENT) | (1L << NATIVE) | (1L << INTERFACE) | (1L << ABSTRACT) | (1L << ANNOTATION) | (1L << ENUM) | (1L << BRIDGE) | (1L << VARARGS) | (1L << STRICT) | (1L << SYNTHETIC))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Super_specContext extends ParserRuleContext {
		public ClassnameContext name;
		public TerminalNode DSUPER() { return getToken(JasminParser.DSUPER, 0); }
		public ClassnameContext classname() {
			return getRuleContext(ClassnameContext.class,0);
		}
		public Super_specContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_super_spec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasminListener ) ((JasminListener)listener).enterSuper_spec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasminListener ) ((JasminListener)listener).exitSuper_spec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasminVisitor ) return ((JasminVisitor<? extends T>)visitor).visitSuper_spec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Super_specContext super_spec() throws RecognitionException {
		Super_specContext _localctx = new Super_specContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_super_spec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
			match(DSUPER);
			setState(249);
			((Super_specContext)_localctx).name = classname();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImplsContext extends ParserRuleContext {
		public Implements_listContext implements_list() {
			return getRuleContext(Implements_listContext.class,0);
		}
		public ImplsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_impls; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasminListener ) ((JasminListener)listener).enterImpls(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasminListener ) ((JasminListener)listener).exitImpls(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasminVisitor ) return ((JasminVisitor<? extends T>)visitor).visitImpls(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImplsContext impls() throws RecognitionException {
		ImplsContext _localctx = new ImplsContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_impls);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
			implements_list(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Implements_listContext extends ParserRuleContext {
		public Implements_specContext implements_spec() {
			return getRuleContext(Implements_specContext.class,0);
		}
		public Implements_listContext implements_list() {
			return getRuleContext(Implements_listContext.class,0);
		}
		public Implements_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_implements_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasminListener ) ((JasminListener)listener).enterImplements_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasminListener ) ((JasminListener)listener).exitImplements_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasminVisitor ) return ((JasminVisitor<? extends T>)visitor).visitImplements_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Implements_listContext implements_list() throws RecognitionException {
		return implements_list(0);
	}

	private Implements_listContext implements_list(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Implements_listContext _localctx = new Implements_listContext(_ctx, _parentState);
		Implements_listContext _prevctx = _localctx;
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_implements_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(254);
			implements_spec();
			}
			_ctx.stop = _input.LT(-1);
			setState(260);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Implements_listContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_implements_list);
					setState(256);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(257);
					implements_spec();
					}
					} 
				}
				setState(262);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Implements_specContext extends ParserRuleContext {
		public ClassnameContext name;
		public TerminalNode DIMPLEMENTS() { return getToken(JasminParser.DIMPLEMENTS, 0); }
		public ClassnameContext classname() {
			return getRuleContext(ClassnameContext.class,0);
		}
		public Implements_specContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_implements_spec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasminListener ) ((JasminListener)listener).enterImplements_spec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasminListener ) ((JasminListener)listener).exitImplements_spec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasminVisitor ) return ((JasminVisitor<? extends T>)visitor).visitImplements_spec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Implements_specContext implements_spec() throws RecognitionException {
		Implements_specContext _localctx = new Implements_specContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_implements_spec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			match(DIMPLEMENTS);
			setState(264);
			((Implements_specContext)_localctx).name = classname();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationsContext extends ParserRuleContext {
		public Ann_cls_listContext ann_cls_list() {
			return getRuleContext(Ann_cls_listContext.class,0);
		}
		public AnnotationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasminListener ) ((JasminListener)listener).enterAnnotations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasminListener ) ((JasminListener)listener).exitAnnotations(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasminVisitor ) return ((JasminVisitor<? extends T>)visitor).visitAnnotations(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationsContext annotations() throws RecognitionException {
		AnnotationsContext _localctx = new AnnotationsContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_annotations);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			ann_cls_list(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Ann_cls_listContext extends ParserRuleContext {
		public Ann_cls_specContext ann_cls_spec() {
			return getRuleContext(Ann_cls_specContext.class,0);
		}
		public Ann_cls_listContext ann_cls_list() {
			return getRuleContext(Ann_cls_listContext.class,0);
		}
		public Ann_cls_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ann_cls_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasminListener ) ((JasminListener)listener).enterAnn_cls_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasminListener ) ((JasminListener)listener).exitAnn_cls_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasminVisitor ) return ((JasminVisitor<? extends T>)visitor).visitAnn_cls_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ann_cls_listContext ann_cls_list() throws RecognitionException {
		return ann_cls_list(0);
	}

	private Ann_cls_listContext ann_cls_list(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Ann_cls_listContext _localctx = new Ann_cls_listContext(_ctx, _parentState);
		Ann_cls_listContext _prevctx = _localctx;
		int _startState = 36;
		enterRecursionRule(_localctx, 36, RULE_ann_cls_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(269);
			ann_cls_spec();
			}
			_ctx.stop = _input.LT(-1);
			setState(275);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Ann_cls_listContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_ann_cls_list);
					setState(271);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(272);
					ann_cls_spec();
					}
					} 
				}
				setState(277);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Ann_cls_specContext extends ParserRuleContext {
		public Ann_cls_exprContext ann_cls_expr() {
			return getRuleContext(Ann_cls_exprContext.class,0);
		}
		public Ann_arglistContext ann_arglist() {
			return getRuleContext(Ann_arglistContext.class,0);
		}
		public EndannotationsepContext endannotationsep() {
			return getRuleContext(EndannotationsepContext.class,0);
		}
		public Ann_cls_specContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ann_cls_spec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasminListener ) ((JasminListener)listener).enterAnn_cls_spec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasminListener ) ((JasminListener)listener).exitAnn_cls_spec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasminVisitor ) return ((JasminVisitor<? extends T>)visitor).visitAnn_cls_spec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ann_cls_specContext ann_cls_spec() throws RecognitionException {
		Ann_cls_specContext _localctx = new Ann_cls_specContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_ann_cls_spec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			ann_cls_expr();
			setState(279);
			ann_arglist();
			setState(280);
			endannotationsep();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EndannotationsepContext extends ParserRuleContext {
		public EndannotationContext endannotation() {
			return getRuleContext(EndannotationContext.class,0);
		}
		public EndannotationsepContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_endannotationsep; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasminListener ) ((JasminListener)listener).enterEndannotationsep(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasminListener ) ((JasminListener)listener).exitEndannotationsep(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasminVisitor ) return ((JasminVisitor<? extends T>)visitor).visitEndannotationsep(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EndannotationsepContext endannotationsep() throws RecognitionException {
		EndannotationsepContext _localctx = new EndannotationsepContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_endannotationsep);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			endannotation();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EndannotationContext extends ParserRuleContext {
		public TerminalNode DEND() { return getToken(JasminParser.DEND, 0); }
		public TerminalNode ANNOTATION() { return getToken(JasminParser.ANNOTATION, 0); }
		public EndannotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_endannotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasminListener ) ((JasminListener)listener).enterEndannotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasminListener ) ((JasminListener)listener).exitEndannotation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasminVisitor ) return ((JasminVisitor<? extends T>)visitor).visitEndannotation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EndannotationContext endannotation() throws RecognitionException {
		EndannotationContext _localctx = new EndannotationContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_endannotation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			match(DEND);
			setState(285);
			match(ANNOTATION);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Ann_cls_exprContext extends ParserRuleContext {
		public TerminalNode DANNOTATION() { return getToken(JasminParser.DANNOTATION, 0); }
		public Ann_clf_exprContext ann_clf_expr() {
			return getRuleContext(Ann_clf_exprContext.class,0);
		}
		public Ann_cls_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ann_cls_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasminListener ) ((JasminListener)listener).enterAnn_cls_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasminListener ) ((JasminListener)listener).exitAnn_cls_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasminVisitor ) return ((JasminVisitor<? extends T>)visitor).visitAnn_cls_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ann_cls_exprContext ann_cls_expr() throws RecognitionException {
		Ann_cls_exprContext _localctx = new Ann_cls_exprContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_ann_cls_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			match(DANNOTATION);
			setState(288);
			ann_clf_expr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Ann_clf_exprContext extends ParserRuleContext {
		public ClassnameContext name;
		public TerminalNode VISIBLE() { return getToken(JasminParser.VISIBLE, 0); }
		public ClassnameContext classname() {
			return getRuleContext(ClassnameContext.class,0);
		}
		public TerminalNode INVISIBLE() { return getToken(JasminParser.INVISIBLE, 0); }
		public Ann_clf_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ann_clf_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasminListener ) ((JasminListener)listener).enterAnn_clf_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasminListener ) ((JasminListener)listener).exitAnn_clf_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasminVisitor ) return ((JasminVisitor<? extends T>)visitor).visitAnn_clf_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ann_clf_exprContext ann_clf_expr() throws RecognitionException {
		Ann_clf_exprContext _localctx = new Ann_clf_exprContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_ann_clf_expr);
		try {
			setState(294);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VISIBLE:
				enterOuterAlt(_localctx, 1);
				{
				setState(290);
				match(VISIBLE);
				setState(291);
				((Ann_clf_exprContext)_localctx).name = classname();
				}
				break;
			case INVISIBLE:
				enterOuterAlt(_localctx, 2);
				{
				setState(292);
				match(INVISIBLE);
				setState(293);
				((Ann_clf_exprContext)_localctx).name = classname();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Ann_met_exprContext extends ParserRuleContext {
		public ClassnameContext name;
		public Token n;
		public TerminalNode VISIBLE() { return getToken(JasminParser.VISIBLE, 0); }
		public ClassnameContext classname() {
			return getRuleContext(ClassnameContext.class,0);
		}
		public TerminalNode INVISIBLE() { return getToken(JasminParser.INVISIBLE, 0); }
		public TerminalNode VISIBLEPARAM() { return getToken(JasminParser.VISIBLEPARAM, 0); }
		public TerminalNode Int() { return getToken(JasminParser.Int, 0); }
		public TerminalNode INVISIBLEPARAM() { return getToken(JasminParser.INVISIBLEPARAM, 0); }
		public Ann_met_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ann_met_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasminListener ) ((JasminListener)listener).enterAnn_met_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasminListener ) ((JasminListener)listener).exitAnn_met_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasminVisitor ) return ((JasminVisitor<? extends T>)visitor).visitAnn_met_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ann_met_exprContext ann_met_expr() throws RecognitionException {
		Ann_met_exprContext _localctx = new Ann_met_exprContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_ann_met_expr);
		try {
			setState(306);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VISIBLE:
				enterOuterAlt(_localctx, 1);
				{
				setState(296);
				match(VISIBLE);
				setState(297);
				((Ann_met_exprContext)_localctx).name = classname();
				}
				break;
			case INVISIBLE:
				enterOuterAlt(_localctx, 2);
				{
				setState(298);
				match(INVISIBLE);
				setState(299);
				((Ann_met_exprContext)_localctx).name = classname();
				}
				break;
			case VISIBLEPARAM:
				enterOuterAlt(_localctx, 3);
				{
				setState(300);
				match(VISIBLEPARAM);
				setState(301);
				((Ann_met_exprContext)_localctx).n = match(Int);
				setState(302);
				((Ann_met_exprContext)_localctx).name = classname();
				}
				break;
			case INVISIBLEPARAM:
				enterOuterAlt(_localctx, 4);
				{
				setState(303);
				match(INVISIBLEPARAM);
				setState(304);
				((Ann_met_exprContext)_localctx).n = match(Int);
				setState(305);
				((Ann_met_exprContext)_localctx).name = classname();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Ann_arglistContext extends ParserRuleContext {
		public Ann_arg_listContext ann_arg_list() {
			return getRuleContext(Ann_arg_listContext.class,0);
		}
		public Ann_arglistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ann_arglist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasminListener ) ((JasminListener)listener).enterAnn_arglist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasminListener ) ((JasminListener)listener).exitAnn_arglist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasminVisitor ) return ((JasminVisitor<? extends T>)visitor).visitAnn_arglist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ann_arglistContext ann_arglist() throws RecognitionException {
		Ann_arglistContext _localctx = new Ann_arglistContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_ann_arglist);
		try {
			setState(310);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Word:
				enterOuterAlt(_localctx, 1);
				{
				setState(308);
				ann_arg_list(0);
				}
				break;
			case DEND:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Ann_arg_listContext extends ParserRuleContext {
		public Ann_arg_specContext ann_arg_spec() {
			return getRuleContext(Ann_arg_specContext.class,0);
		}
		public Ann_arg_listContext ann_arg_list() {
			return getRuleContext(Ann_arg_listContext.class,0);
		}
		public Ann_arg_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ann_arg_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasminListener ) ((JasminListener)listener).enterAnn_arg_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasminListener ) ((JasminListener)listener).exitAnn_arg_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasminVisitor ) return ((JasminVisitor<? extends T>)visitor).visitAnn_arg_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ann_arg_listContext ann_arg_list() throws RecognitionException {
		return ann_arg_list(0);
	}

	private Ann_arg_listContext ann_arg_list(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Ann_arg_listContext _localctx = new Ann_arg_listContext(_ctx, _parentState);
		Ann_arg_listContext _prevctx = _localctx;
		int _startState = 52;
		enterRecursionRule(_localctx, 52, RULE_ann_arg_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(313);
			ann_arg_spec();
			}
			_ctx.stop = _input.LT(-1);
			setState(319);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Ann_arg_listContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_ann_arg_list);
					setState(315);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(316);
					ann_arg_spec();
					}
					} 
				}
				setState(321);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Ann_arg_specContext extends ParserRuleContext {
		public Ann_arg_exprContext ann_arg_expr() {
			return getRuleContext(Ann_arg_exprContext.class,0);
		}
		public TerminalNode EQ() { return getToken(JasminParser.EQ, 0); }
		public Ann_value_listContext ann_value_list() {
			return getRuleContext(Ann_value_listContext.class,0);
		}
		public Ann_arg_specContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ann_arg_spec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasminListener ) ((JasminListener)listener).enterAnn_arg_spec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasminListener ) ((JasminListener)listener).exitAnn_arg_spec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasminVisitor ) return ((JasminVisitor<? extends T>)visitor).visitAnn_arg_spec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ann_arg_specContext ann_arg_spec() throws RecognitionException {
		Ann_arg_specContext _localctx = new Ann_arg_specContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_ann_arg_spec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(322);
			ann_arg_expr();
			setState(323);
			match(EQ);
			setState(324);
			ann_value_list();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Ann_arg_exprContext extends ParserRuleContext {
		public Token n;
		public Token dsc;
		public Token desc;
		public Token sub;
		public List<TerminalNode> Word() { return getTokens(JasminParser.Word); }
		public TerminalNode Word(int i) {
			return getToken(JasminParser.Word, i);
		}
		public Ann_arg_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ann_arg_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasminListener ) ((JasminListener)listener).enterAnn_arg_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasminListener ) ((JasminListener)listener).exitAnn_arg_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasminVisitor ) return ((JasminVisitor<? extends T>)visitor).visitAnn_arg_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ann_arg_exprContext ann_arg_expr() throws RecognitionException {
		Ann_arg_exprContext _localctx = new Ann_arg_exprContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_ann_arg_expr);
		try {
			setState(331);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(326);
				((Ann_arg_exprContext)_localctx).n = match(Word);
				setState(327);
				((Ann_arg_exprContext)_localctx).dsc = match(Word);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(328);
				((Ann_arg_exprContext)_localctx).n = match(Word);
				setState(329);
				((Ann_arg_exprContext)_localctx).desc = match(Word);
				setState(330);
				((Ann_arg_exprContext)_localctx).sub = match(Word);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Ann_def_specContext extends ParserRuleContext {
		public TerminalNode DEFAULT() { return getToken(JasminParser.DEFAULT, 0); }
		public Ann_def_specContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ann_def_spec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasminListener ) ((JasminListener)listener).enterAnn_def_spec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasminListener ) ((JasminListener)listener).exitAnn_def_spec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasminVisitor ) return ((JasminVisitor<? extends T>)visitor).visitAnn_def_spec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ann_def_specContext ann_def_spec() throws RecognitionException {
		Ann_def_specContext _localctx = new Ann_def_specContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_ann_def_spec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(333);
			match(DEFAULT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Ann_value_listContext extends ParserRuleContext {
		public Ann_value_itemsContext ann_value_items() {
			return getRuleContext(Ann_value_itemsContext.class,0);
		}
		public Ann_ann_listContext ann_ann_list() {
			return getRuleContext(Ann_ann_listContext.class,0);
		}
		public Ann_value_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ann_value_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasminListener ) ((JasminListener)listener).enterAnn_value_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasminListener ) ((JasminListener)listener).exitAnn_value_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasminVisitor ) return ((JasminVisitor<? extends T>)visitor).visitAnn_value_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ann_value_listContext ann_value_list() throws RecognitionException {
		Ann_value_listContext _localctx = new Ann_value_listContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_ann_value_list);
		try {
			setState(337);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Word:
			case Str:
			case Int:
			case Num:
				enterOuterAlt(_localctx, 1);
				{
				setState(335);
				ann_value_items(0);
				}
				break;
			case DANNOTATION:
				enterOuterAlt(_localctx, 2);
				{
				setState(336);
				ann_ann_list(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Ann_value_itemsContext extends ParserRuleContext {
		public Ann_valueContext ann_value() {
			return getRuleContext(Ann_valueContext.class,0);
		}
		public Ann_value_itemsContext ann_value_items() {
			return getRuleContext(Ann_value_itemsContext.class,0);
		}
		public Ann_value_itemsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ann_value_items; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasminListener ) ((JasminListener)listener).enterAnn_value_items(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasminListener ) ((JasminListener)listener).exitAnn_value_items(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasminVisitor ) return ((JasminVisitor<? extends T>)visitor).visitAnn_value_items(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ann_value_itemsContext ann_value_items() throws RecognitionException {
		return ann_value_items(0);
	}

	private Ann_value_itemsContext ann_value_items(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Ann_value_itemsContext _localctx = new Ann_value_itemsContext(_ctx, _parentState);
		Ann_value_itemsContext _prevctx = _localctx;
		int _startState = 62;
		enterRecursionRule(_localctx, 62, RULE_ann_value_items, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(340);
			ann_value();
			}
			_ctx.stop = _input.LT(-1);
			setState(346);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Ann_value_itemsContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_ann_value_items);
					setState(342);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(343);
					ann_value();
					}
					} 
				}
				setState(348);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Ann_valueContext extends ParserRuleContext {
		public Any_itemContext v;
		public Any_itemContext any_item() {
			return getRuleContext(Any_itemContext.class,0);
		}
		public Ann_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ann_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasminListener ) ((JasminListener)listener).enterAnn_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasminListener ) ((JasminListener)listener).exitAnn_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasminVisitor ) return ((JasminVisitor<? extends T>)visitor).visitAnn_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ann_valueContext ann_value() throws RecognitionException {
		Ann_valueContext _localctx = new Ann_valueContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_ann_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(349);
			((Ann_valueContext)_localctx).v = any_item();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Ann_ann_listContext extends ParserRuleContext {
		public Ann_ann_valueContext ann_ann_value() {
			return getRuleContext(Ann_ann_valueContext.class,0);
		}
		public Ann_ann_listContext ann_ann_list() {
			return getRuleContext(Ann_ann_listContext.class,0);
		}
		public Ann_ann_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ann_ann_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasminListener ) ((JasminListener)listener).enterAnn_ann_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasminListener ) ((JasminListener)listener).exitAnn_ann_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasminVisitor ) return ((JasminVisitor<? extends T>)visitor).visitAnn_ann_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ann_ann_listContext ann_ann_list() throws RecognitionException {
		return ann_ann_list(0);
	}

	private Ann_ann_listContext ann_ann_list(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Ann_ann_listContext _localctx = new Ann_ann_listContext(_ctx, _parentState);
		Ann_ann_listContext _prevctx = _localctx;
		int _startState = 66;
		enterRecursionRule(_localctx, 66, RULE_ann_ann_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(352);
			ann_ann_value();
			}
			_ctx.stop = _input.LT(-1);
			setState(358);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Ann_ann_listContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_ann_ann_list);
					setState(354);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(355);
					ann_ann_value();
					}
					} 
				}
				setState(360);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Ann_ann_valueContext extends ParserRuleContext {
		public TerminalNode DANNOTATION() { return getToken(JasminParser.DANNOTATION, 0); }
		public Ann_nestContext ann_nest() {
			return getRuleContext(Ann_nestContext.class,0);
		}
		public Ann_arglistContext ann_arglist() {
			return getRuleContext(Ann_arglistContext.class,0);
		}
		public EndannotationsepContext endannotationsep() {
			return getRuleContext(EndannotationsepContext.class,0);
		}
		public Ann_ann_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ann_ann_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasminListener ) ((JasminListener)listener).enterAnn_ann_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasminListener ) ((JasminListener)listener).exitAnn_ann_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasminVisitor ) return ((JasminVisitor<? extends T>)visitor).visitAnn_ann_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ann_ann_valueContext ann_ann_value() throws RecognitionException {
		Ann_ann_valueContext _localctx = new Ann_ann_valueContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_ann_ann_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(361);
			match(DANNOTATION);
			setState(362);
			ann_nest();
			setState(363);
			ann_arglist();
			setState(364);
			endannotationsep();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Ann_nestContext extends ParserRuleContext {
		public Ann_nestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ann_nest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasminListener ) ((JasminListener)listener).enterAnn_nest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasminListener ) ((JasminListener)listener).exitAnn_nest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasminVisitor ) return ((JasminVisitor<? extends T>)visitor).visitAnn_nest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ann_nestContext ann_nest() throws RecognitionException {
		Ann_nestContext _localctx = new Ann_nestContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_ann_nest);
		try {
			enterOuterAlt(_localctx, 1);
			{
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Ann_def_valContext extends ParserRuleContext {
		public Ann_def_exprContext ann_def_expr() {
			return getRuleContext(Ann_def_exprContext.class,0);
		}
		public TerminalNode EQ() { return getToken(JasminParser.EQ, 0); }
		public Ann_value_listContext ann_value_list() {
			return getRuleContext(Ann_value_listContext.class,0);
		}
		public Ann_def_valContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ann_def_val; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasminListener ) ((JasminListener)listener).enterAnn_def_val(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasminListener ) ((JasminListener)listener).exitAnn_def_val(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasminVisitor ) return ((JasminVisitor<? extends T>)visitor).visitAnn_def_val(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ann_def_valContext ann_def_val() throws RecognitionException {
		Ann_def_valContext _localctx = new Ann_def_valContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_ann_def_val);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(368);
			ann_def_expr();
			setState(369);
			match(EQ);
			setState(370);
			ann_value_list();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Ann_def_exprContext extends ParserRuleContext {
		public Token dsc;
		public Token sub;
		public List<TerminalNode> Word() { return getTokens(JasminParser.Word); }
		public TerminalNode Word(int i) {
			return getToken(JasminParser.Word, i);
		}
		public Ann_def_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ann_def_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasminListener ) ((JasminListener)listener).enterAnn_def_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasminListener ) ((JasminListener)listener).exitAnn_def_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasminVisitor ) return ((JasminVisitor<? extends T>)visitor).visitAnn_def_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ann_def_exprContext ann_def_expr() throws RecognitionException {
		Ann_def_exprContext _localctx = new Ann_def_exprContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_ann_def_expr);
		try {
			setState(375);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(372);
				((Ann_def_exprContext)_localctx).dsc = match(Word);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(373);
				((Ann_def_exprContext)_localctx).dsc = match(Word);
				setState(374);
				((Ann_def_exprContext)_localctx).sub = match(Word);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Debug_extensionContext extends ParserRuleContext {
		public Debug_listContext debug_list() {
			return getRuleContext(Debug_listContext.class,0);
		}
		public Debug_extensionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_debug_extension; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasminListener ) ((JasminListener)listener).enterDebug_extension(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasminListener ) ((JasminListener)listener).exitDebug_extension(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasminVisitor ) return ((JasminVisitor<? extends T>)visitor).visitDebug_extension(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Debug_extensionContext debug_extension() throws RecognitionException {
		Debug_extensionContext _localctx = new Debug_extensionContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_debug_extension);
		try {
			setState(379);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DDEBUG:
				enterOuterAlt(_localctx, 1);
				{
				setState(377);
				debug_list(0);
				}
				break;
			case EOF:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Debug_listContext extends ParserRuleContext {
		public Debug_specContext debug_spec() {
			return getRuleContext(Debug_specContext.class,0);
		}
		public Debug_listContext debug_list() {
			return getRuleContext(Debug_listContext.class,0);
		}
		public Debug_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_debug_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasminListener ) ((JasminListener)listener).enterDebug_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasminListener ) ((JasminListener)listener).exitDebug_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasminVisitor ) return ((JasminVisitor<? extends T>)visitor).visitDebug_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Debug_listContext debug_list() throws RecognitionException {
		return debug_list(0);
	}

	private Debug_listContext debug_list(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Debug_listContext _localctx = new Debug_listContext(_ctx, _parentState);
		Debug_listContext _prevctx = _localctx;
		int _startState = 78;
		enterRecursionRule(_localctx, 78, RULE_debug_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(382);
			debug_spec();
			}
			_ctx.stop = _input.LT(-1);
			setState(388);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Debug_listContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_debug_list);
					setState(384);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(385);
					debug_spec();
					}
					} 
				}
				setState(390);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Debug_specContext extends ParserRuleContext {
		public Token s;
		public TerminalNode DDEBUG() { return getToken(JasminParser.DDEBUG, 0); }
		public TerminalNode Str() { return getToken(JasminParser.Str, 0); }
		public Debug_specContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_debug_spec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasminListener ) ((JasminListener)listener).enterDebug_spec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasminListener ) ((JasminListener)listener).exitDebug_spec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasminVisitor ) return ((JasminVisitor<? extends T>)visitor).visitDebug_spec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Debug_specContext debug_spec() throws RecognitionException {
		Debug_specContext _localctx = new Debug_specContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_debug_spec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(391);
			match(DDEBUG);
			setState(392);
			((Debug_specContext)_localctx).s = match(Str);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Enclosing_specContext extends ParserRuleContext {
		public Token w;
		public TerminalNode DENCLOSING() { return getToken(JasminParser.DENCLOSING, 0); }
		public TerminalNode METHOD() { return getToken(JasminParser.METHOD, 0); }
		public TerminalNode Word() { return getToken(JasminParser.Word, 0); }
		public Enclosing_specContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enclosing_spec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasminListener ) ((JasminListener)listener).enterEnclosing_spec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasminListener ) ((JasminListener)listener).exitEnclosing_spec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasminVisitor ) return ((JasminVisitor<? extends T>)visitor).visitEnclosing_spec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Enclosing_specContext enclosing_spec() throws RecognitionException {
		Enclosing_specContext _localctx = new Enclosing_specContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_enclosing_spec);
		try {
			setState(398);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DENCLOSING:
				enterOuterAlt(_localctx, 1);
				{
				setState(394);
				match(DENCLOSING);
				setState(395);
				match(METHOD);
				setState(396);
				((Enclosing_specContext)_localctx).w = match(Word);
				}
				break;
			case EOF:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Generic_attributesContext extends ParserRuleContext {
		public Generic_listContext generic_list() {
			return getRuleContext(Generic_listContext.class,0);
		}
		public Generic_attributesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_generic_attributes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasminListener ) ((JasminListener)listener).enterGeneric_attributes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasminListener ) ((JasminListener)listener).exitGeneric_attributes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasminVisitor ) return ((JasminVisitor<? extends T>)visitor).visitGeneric_attributes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Generic_attributesContext generic_attributes() throws RecognitionException {
		Generic_attributesContext _localctx = new Generic_attributesContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_generic_attributes);
		try {
			setState(402);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DATTRIBUTE:
				enterOuterAlt(_localctx, 1);
				{
				setState(400);
				generic_list(0);
				}
				break;
			case EOF:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Generic_listContext extends ParserRuleContext {
		public Generic_specContext generic_spec() {
			return getRuleContext(Generic_specContext.class,0);
		}
		public Generic_listContext generic_list() {
			return getRuleContext(Generic_listContext.class,0);
		}
		public Generic_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_generic_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasminListener ) ((JasminListener)listener).enterGeneric_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasminListener ) ((JasminListener)listener).exitGeneric_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasminVisitor ) return ((JasminVisitor<? extends T>)visitor).visitGeneric_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Generic_listContext generic_list() throws RecognitionException {
		return generic_list(0);
	}

	private Generic_listContext generic_list(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Generic_listContext _localctx = new Generic_listContext(_ctx, _parentState);
		Generic_listContext _prevctx = _localctx;
		int _startState = 86;
		enterRecursionRule(_localctx, 86, RULE_generic_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(405);
			generic_spec();
			}
			_ctx.stop = _input.LT(-1);
			setState(411);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Generic_listContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_generic_list);
					setState(407);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(408);
					generic_spec();
					}
					} 
				}
				setState(413);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Generic_specContext extends ParserRuleContext {
		public TerminalNode DATTRIBUTE() { return getToken(JasminParser.DATTRIBUTE, 0); }
		public Generic_exprContext generic_expr() {
			return getRuleContext(Generic_exprContext.class,0);
		}
		public Generic_specContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_generic_spec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasminListener ) ((JasminListener)listener).enterGeneric_spec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasminListener ) ((JasminListener)listener).exitGeneric_spec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasminVisitor ) return ((JasminVisitor<? extends T>)visitor).visitGeneric_spec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Generic_specContext generic_spec() throws RecognitionException {
		Generic_specContext _localctx = new Generic_specContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_generic_spec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(414);
			match(DATTRIBUTE);
			setState(415);
			generic_expr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Generic_exprContext extends ParserRuleContext {
		public Token name;
		public Token file;
		public TerminalNode Word() { return getToken(JasminParser.Word, 0); }
		public TerminalNode Str() { return getToken(JasminParser.Str, 0); }
		public Generic_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_generic_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasminListener ) ((JasminListener)listener).enterGeneric_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasminListener ) ((JasminListener)listener).exitGeneric_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasminVisitor ) return ((JasminVisitor<? extends T>)visitor).visitGeneric_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Generic_exprContext generic_expr() throws RecognitionException {
		Generic_exprContext _localctx = new Generic_exprContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_generic_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(417);
			((Generic_exprContext)_localctx).name = match(Word);
			setState(418);
			((Generic_exprContext)_localctx).file = match(Str);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldsContext extends ParserRuleContext {
		public Field_listContext field_list() {
			return getRuleContext(Field_listContext.class,0);
		}
		public FieldsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fields; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasminListener ) ((JasminListener)listener).enterFields(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasminListener ) ((JasminListener)listener).exitFields(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasminVisitor ) return ((JasminVisitor<? extends T>)visitor).visitFields(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldsContext fields() throws RecognitionException {
		FieldsContext _localctx = new FieldsContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_fields);
		try {
			setState(422);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DFIELD:
				enterOuterAlt(_localctx, 1);
				{
				setState(420);
				field_list(0);
				}
				break;
			case EOF:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Field_listContext extends ParserRuleContext {
		public Field_specContext field_spec() {
			return getRuleContext(Field_specContext.class,0);
		}
		public Field_listContext field_list() {
			return getRuleContext(Field_listContext.class,0);
		}
		public Field_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasminListener ) ((JasminListener)listener).enterField_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasminListener ) ((JasminListener)listener).exitField_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasminVisitor ) return ((JasminVisitor<? extends T>)visitor).visitField_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Field_listContext field_list() throws RecognitionException {
		return field_list(0);
	}

	private Field_listContext field_list(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Field_listContext _localctx = new Field_listContext(_ctx, _parentState);
		Field_listContext _prevctx = _localctx;
		int _startState = 94;
		enterRecursionRule(_localctx, 94, RULE_field_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(425);
			field_spec();
			}
			_ctx.stop = _input.LT(-1);
			setState(431);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Field_listContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_field_list);
					setState(427);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(428);
					field_spec();
					}
					} 
				}
				setState(433);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Field_specContext extends ParserRuleContext {
		public AccessContext a;
		public Token name;
		public Token desc;
		public Token sig;
		public Optional_defaultContext v;
		public TerminalNode DFIELD() { return getToken(JasminParser.DFIELD, 0); }
		public TerminalNode SIGNATURE() { return getToken(JasminParser.SIGNATURE, 0); }
		public AccessContext access() {
			return getRuleContext(AccessContext.class,0);
		}
		public List<TerminalNode> Word() { return getTokens(JasminParser.Word); }
		public TerminalNode Word(int i) {
			return getToken(JasminParser.Word, i);
		}
		public TerminalNode Str() { return getToken(JasminParser.Str, 0); }
		public Optional_defaultContext optional_default() {
			return getRuleContext(Optional_defaultContext.class,0);
		}
		public Field_startContext field_start() {
			return getRuleContext(Field_startContext.class,0);
		}
		public Field_extsContext field_exts() {
			return getRuleContext(Field_extsContext.class,0);
		}
		public EndfieldContext endfield() {
			return getRuleContext(EndfieldContext.class,0);
		}
		public Field_specContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_spec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasminListener ) ((JasminListener)listener).enterField_spec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasminListener ) ((JasminListener)listener).exitField_spec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasminVisitor ) return ((JasminVisitor<? extends T>)visitor).visitField_spec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Field_specContext field_spec() throws RecognitionException {
		Field_specContext _localctx = new Field_specContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_field_spec);
		try {
			setState(453);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(434);
				match(DFIELD);
				setState(435);
				((Field_specContext)_localctx).a = access();
				setState(436);
				((Field_specContext)_localctx).name = match(Word);
				setState(437);
				((Field_specContext)_localctx).desc = match(Word);
				setState(438);
				match(SIGNATURE);
				setState(439);
				((Field_specContext)_localctx).sig = match(Str);
				setState(440);
				((Field_specContext)_localctx).v = optional_default();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(442);
				match(DFIELD);
				setState(443);
				((Field_specContext)_localctx).a = access();
				setState(444);
				((Field_specContext)_localctx).name = match(Word);
				setState(445);
				((Field_specContext)_localctx).desc = match(Word);
				setState(446);
				((Field_specContext)_localctx).v = optional_default();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(448);
				match(DFIELD);
				setState(449);
				field_start();
				setState(450);
				field_exts();
				setState(451);
				endfield();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Optional_defaultContext extends ParserRuleContext {
		public ItemContext v;
		public TerminalNode EQ() { return getToken(JasminParser.EQ, 0); }
		public ItemContext item() {
			return getRuleContext(ItemContext.class,0);
		}
		public Optional_defaultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optional_default; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasminListener ) ((JasminListener)listener).enterOptional_default(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasminListener ) ((JasminListener)listener).exitOptional_default(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasminVisitor ) return ((JasminVisitor<? extends T>)visitor).visitOptional_default(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Optional_defaultContext optional_default() throws RecognitionException {
		Optional_defaultContext _localctx = new Optional_defaultContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_optional_default);
		try {
			setState(458);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(455);
				match(EQ);
				setState(456);
				((Optional_defaultContext)_localctx).v = item();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Field_startContext extends ParserRuleContext {
		public AccessContext a;
		public Token name;
		public Token desc;
		public Optional_defaultContext v;
		public AccessContext access() {
			return getRuleContext(AccessContext.class,0);
		}
		public List<TerminalNode> Word() { return getTokens(JasminParser.Word); }
		public TerminalNode Word(int i) {
			return getToken(JasminParser.Word, i);
		}
		public Optional_defaultContext optional_default() {
			return getRuleContext(Optional_defaultContext.class,0);
		}
		public Field_startContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasminListener ) ((JasminListener)listener).enterField_start(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasminListener ) ((JasminListener)listener).exitField_start(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasminVisitor ) return ((JasminVisitor<? extends T>)visitor).visitField_start(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Field_startContext field_start() throws RecognitionException {
		Field_startContext _localctx = new Field_startContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_field_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(460);
			((Field_startContext)_localctx).a = access();
			setState(461);
			((Field_startContext)_localctx).name = match(Word);
			setState(462);
			((Field_startContext)_localctx).desc = match(Word);
			setState(463);
			((Field_startContext)_localctx).v = optional_default();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EndfieldContext extends ParserRuleContext {
		public TerminalNode DEND() { return getToken(JasminParser.DEND, 0); }
		public TerminalNode FIELD() { return getToken(JasminParser.FIELD, 0); }
		public EndfieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_endfield; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasminListener ) ((JasminListener)listener).enterEndfield(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasminListener ) ((JasminListener)listener).exitEndfield(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasminVisitor ) return ((JasminVisitor<? extends T>)visitor).visitEndfield(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EndfieldContext endfield() throws RecognitionException {
		EndfieldContext _localctx = new EndfieldContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_endfield);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(465);
			match(DEND);
			setState(466);
			match(FIELD);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Field_extsContext extends ParserRuleContext {
		public Field_ext_listContext field_ext_list() {
			return getRuleContext(Field_ext_listContext.class,0);
		}
		public Field_extsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_exts; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasminListener ) ((JasminListener)listener).enterField_exts(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasminListener ) ((JasminListener)listener).exitField_exts(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasminVisitor ) return ((JasminVisitor<? extends T>)visitor).visitField_exts(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Field_extsContext field_exts() throws RecognitionException {
		Field_extsContext _localctx = new Field_extsContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_field_exts);
		try {
			setState(470);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DANNOTATION:
			case DATTRIBUTE:
			case DDEPRECATED:
			case DSIGNATURE:
				enterOuterAlt(_localctx, 1);
				{
				setState(468);
				field_ext_list(0);
				}
				break;
			case DEND:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Field_ext_listContext extends ParserRuleContext {
		public Field_ext_exprContext field_ext_expr() {
			return getRuleContext(Field_ext_exprContext.class,0);
		}
		public Field_ext_listContext field_ext_list() {
			return getRuleContext(Field_ext_listContext.class,0);
		}
		public Field_ext_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_ext_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasminListener ) ((JasminListener)listener).enterField_ext_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasminListener ) ((JasminListener)listener).exitField_ext_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasminVisitor ) return ((JasminVisitor<? extends T>)visitor).visitField_ext_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Field_ext_listContext field_ext_list() throws RecognitionException {
		return field_ext_list(0);
	}

	private Field_ext_listContext field_ext_list(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Field_ext_listContext _localctx = new Field_ext_listContext(_ctx, _parentState);
		Field_ext_listContext _prevctx = _localctx;
		int _startState = 106;
		enterRecursionRule(_localctx, 106, RULE_field_ext_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(473);
			field_ext_expr();
			}
			_ctx.stop = _input.LT(-1);
			setState(479);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Field_ext_listContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_field_ext_list);
					setState(475);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(476);
					field_ext_expr();
					}
					} 
				}
				setState(481);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Field_ext_exprContext extends ParserRuleContext {
		public TerminalNode DSIGNATURE() { return getToken(JasminParser.DSIGNATURE, 0); }
		public Signature_exprContext signature_expr() {
			return getRuleContext(Signature_exprContext.class,0);
		}
		public TerminalNode DATTRIBUTE() { return getToken(JasminParser.DATTRIBUTE, 0); }
		public Generic_exprContext generic_expr() {
			return getRuleContext(Generic_exprContext.class,0);
		}
		public TerminalNode DDEPRECATED() { return getToken(JasminParser.DDEPRECATED, 0); }
		public Deprecated_exprContext deprecated_expr() {
			return getRuleContext(Deprecated_exprContext.class,0);
		}
		public TerminalNode DANNOTATION() { return getToken(JasminParser.DANNOTATION, 0); }
		public Ann_clf_exprContext ann_clf_expr() {
			return getRuleContext(Ann_clf_exprContext.class,0);
		}
		public Ann_arglistContext ann_arglist() {
			return getRuleContext(Ann_arglistContext.class,0);
		}
		public EndannotationsepContext endannotationsep() {
			return getRuleContext(EndannotationsepContext.class,0);
		}
		public Field_ext_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_ext_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasminListener ) ((JasminListener)listener).enterField_ext_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasminListener ) ((JasminListener)listener).exitField_ext_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasminVisitor ) return ((JasminVisitor<? extends T>)visitor).visitField_ext_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Field_ext_exprContext field_ext_expr() throws RecognitionException {
		Field_ext_exprContext _localctx = new Field_ext_exprContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_field_ext_expr);
		try {
			setState(493);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DSIGNATURE:
				enterOuterAlt(_localctx, 1);
				{
				setState(482);
				match(DSIGNATURE);
				setState(483);
				signature_expr();
				}
				break;
			case DATTRIBUTE:
				enterOuterAlt(_localctx, 2);
				{
				setState(484);
				match(DATTRIBUTE);
				setState(485);
				generic_expr();
				}
				break;
			case DDEPRECATED:
				enterOuterAlt(_localctx, 3);
				{
				setState(486);
				match(DDEPRECATED);
				setState(487);
				deprecated_expr();
				}
				break;
			case DANNOTATION:
				enterOuterAlt(_localctx, 4);
				{
				setState(488);
				match(DANNOTATION);
				setState(489);
				ann_clf_expr();
				setState(490);
				ann_arglist();
				setState(491);
				endannotationsep();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ItemContext extends ParserRuleContext {
		public Token i;
		public Token n;
		public Token s;
		public TerminalNode Int() { return getToken(JasminParser.Int, 0); }
		public TerminalNode Num() { return getToken(JasminParser.Num, 0); }
		public TerminalNode Str() { return getToken(JasminParser.Str, 0); }
		public ItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasminListener ) ((JasminListener)listener).enterItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasminListener ) ((JasminListener)listener).exitItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasminVisitor ) return ((JasminVisitor<? extends T>)visitor).visitItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ItemContext item() throws RecognitionException {
		ItemContext _localctx = new ItemContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_item);
		try {
			setState(498);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Int:
				enterOuterAlt(_localctx, 1);
				{
				setState(495);
				((ItemContext)_localctx).i = match(Int);
				}
				break;
			case Num:
				enterOuterAlt(_localctx, 2);
				{
				setState(496);
				((ItemContext)_localctx).n = match(Num);
				}
				break;
			case Str:
				enterOuterAlt(_localctx, 3);
				{
				setState(497);
				((ItemContext)_localctx).s = match(Str);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Any_itemContext extends ParserRuleContext {
		public Token w;
		public ItemContext v;
		public TerminalNode Word() { return getToken(JasminParser.Word, 0); }
		public ItemContext item() {
			return getRuleContext(ItemContext.class,0);
		}
		public Any_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_any_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasminListener ) ((JasminListener)listener).enterAny_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasminListener ) ((JasminListener)listener).exitAny_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasminVisitor ) return ((JasminVisitor<? extends T>)visitor).visitAny_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Any_itemContext any_item() throws RecognitionException {
		Any_itemContext _localctx = new Any_itemContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_any_item);
		try {
			setState(502);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Word:
				enterOuterAlt(_localctx, 1);
				{
				setState(500);
				((Any_itemContext)_localctx).w = match(Word);
				}
				break;
			case Str:
			case Int:
			case Num:
				enterOuterAlt(_localctx, 2);
				{
				setState(501);
				((Any_itemContext)_localctx).v = item();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InnersContext extends ParserRuleContext {
		public Inner_listContext inner_list() {
			return getRuleContext(Inner_listContext.class,0);
		}
		public InnersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inners; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasminListener ) ((JasminListener)listener).enterInners(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasminListener ) ((JasminListener)listener).exitInners(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasminVisitor ) return ((JasminVisitor<? extends T>)visitor).visitInners(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InnersContext inners() throws RecognitionException {
		InnersContext _localctx = new InnersContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_inners);
		try {
			setState(506);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DINNER:
				enterOuterAlt(_localctx, 1);
				{
				setState(504);
				inner_list(0);
				}
				break;
			case EOF:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Inner_listContext extends ParserRuleContext {
		public Inner_specContext inner_spec() {
			return getRuleContext(Inner_specContext.class,0);
		}
		public Inner_listContext inner_list() {
			return getRuleContext(Inner_listContext.class,0);
		}
		public Inner_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inner_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasminListener ) ((JasminListener)listener).enterInner_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasminListener ) ((JasminListener)listener).exitInner_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasminVisitor ) return ((JasminVisitor<? extends T>)visitor).visitInner_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Inner_listContext inner_list() throws RecognitionException {
		return inner_list(0);
	}

	private Inner_listContext inner_list(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Inner_listContext _localctx = new Inner_listContext(_ctx, _parentState);
		Inner_listContext _prevctx = _localctx;
		int _startState = 116;
		enterRecursionRule(_localctx, 116, RULE_inner_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(509);
			inner_spec();
			}
			_ctx.stop = _input.LT(-1);
			setState(515);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Inner_listContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_inner_list);
					setState(511);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(512);
					inner_spec();
					}
					} 
				}
				setState(517);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Inner_specContext extends ParserRuleContext {
		public AccessContext a;
		public Inner_nameContext n;
		public Inner_innerContext i;
		public Inner_outerContext o;
		public TerminalNode DINNER() { return getToken(JasminParser.DINNER, 0); }
		public TerminalNode CLASS() { return getToken(JasminParser.CLASS, 0); }
		public AccessContext access() {
			return getRuleContext(AccessContext.class,0);
		}
		public Inner_nameContext inner_name() {
			return getRuleContext(Inner_nameContext.class,0);
		}
		public Inner_innerContext inner_inner() {
			return getRuleContext(Inner_innerContext.class,0);
		}
		public Inner_outerContext inner_outer() {
			return getRuleContext(Inner_outerContext.class,0);
		}
		public TerminalNode INTERFACE() { return getToken(JasminParser.INTERFACE, 0); }
		public Inner_specContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inner_spec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasminListener ) ((JasminListener)listener).enterInner_spec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasminListener ) ((JasminListener)listener).exitInner_spec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasminVisitor ) return ((JasminVisitor<? extends T>)visitor).visitInner_spec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Inner_specContext inner_spec() throws RecognitionException {
		Inner_specContext _localctx = new Inner_specContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_inner_spec);
		try {
			setState(532);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(518);
				match(DINNER);
				setState(519);
				match(CLASS);
				setState(520);
				((Inner_specContext)_localctx).a = access();
				setState(521);
				((Inner_specContext)_localctx).n = inner_name();
				setState(522);
				((Inner_specContext)_localctx).i = inner_inner();
				setState(523);
				((Inner_specContext)_localctx).o = inner_outer();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(525);
				match(DINNER);
				setState(526);
				match(INTERFACE);
				setState(527);
				((Inner_specContext)_localctx).a = access();
				setState(528);
				((Inner_specContext)_localctx).n = inner_name();
				setState(529);
				((Inner_specContext)_localctx).i = inner_inner();
				setState(530);
				((Inner_specContext)_localctx).o = inner_outer();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Inner_nameContext extends ParserRuleContext {
		public Token w;
		public TerminalNode Word() { return getToken(JasminParser.Word, 0); }
		public Inner_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inner_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasminListener ) ((JasminListener)listener).enterInner_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasminListener ) ((JasminListener)listener).exitInner_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasminVisitor ) return ((JasminVisitor<? extends T>)visitor).visitInner_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Inner_nameContext inner_name() throws RecognitionException {
		Inner_nameContext _localctx = new Inner_nameContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_inner_name);
		try {
			setState(536);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(534);
				((Inner_nameContext)_localctx).w = match(Word);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Inner_innerContext extends ParserRuleContext {
		public ClassnameContext w;
		public TerminalNode INNER() { return getToken(JasminParser.INNER, 0); }
		public ClassnameContext classname() {
			return getRuleContext(ClassnameContext.class,0);
		}
		public Inner_innerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inner_inner; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasminListener ) ((JasminListener)listener).enterInner_inner(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasminListener ) ((JasminListener)listener).exitInner_inner(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasminVisitor ) return ((JasminVisitor<? extends T>)visitor).visitInner_inner(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Inner_innerContext inner_inner() throws RecognitionException {
		Inner_innerContext _localctx = new Inner_innerContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_inner_inner);
		try {
			setState(541);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(538);
				match(INNER);
				setState(539);
				((Inner_innerContext)_localctx).w = classname();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Inner_outerContext extends ParserRuleContext {
		public ClassnameContext w;
		public TerminalNode OUTER() { return getToken(JasminParser.OUTER, 0); }
		public ClassnameContext classname() {
			return getRuleContext(ClassnameContext.class,0);
		}
		public Inner_outerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inner_outer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasminListener ) ((JasminListener)listener).enterInner_outer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasminListener ) ((JasminListener)listener).exitInner_outer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasminVisitor ) return ((JasminVisitor<? extends T>)visitor).visitInner_outer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Inner_outerContext inner_outer() throws RecognitionException {
		Inner_outerContext _localctx = new Inner_outerContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_inner_outer);
		try {
			setState(546);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(543);
				match(OUTER);
				setState(544);
				((Inner_outerContext)_localctx).w = classname();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodsContext extends ParserRuleContext {
		public List<Method_specContext> method_spec() {
			return getRuleContexts(Method_specContext.class);
		}
		public Method_specContext method_spec(int i) {
			return getRuleContext(Method_specContext.class,i);
		}
		public MethodsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methods; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasminListener ) ((JasminListener)listener).enterMethods(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasminListener ) ((JasminListener)listener).exitMethods(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasminVisitor ) return ((JasminVisitor<? extends T>)visitor).visitMethods(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodsContext methods() throws RecognitionException {
		MethodsContext _localctx = new MethodsContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_methods);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(549); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(548);
				method_spec();
				}
				}
				setState(551); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==DMETHOD );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Method_specContext extends ParserRuleContext {
		public DefmethodContext defmethod() {
			return getRuleContext(DefmethodContext.class,0);
		}
		public EndmethodContext endmethod() {
			return getRuleContext(EndmethodContext.class,0);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public Method_specContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_spec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasminListener ) ((JasminListener)listener).enterMethod_spec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasminListener ) ((JasminListener)listener).exitMethod_spec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasminVisitor ) return ((JasminVisitor<? extends T>)visitor).visitMethod_spec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Method_specContext method_spec() throws RecognitionException {
		Method_specContext _localctx = new Method_specContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_method_spec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(553);
			defmethod();
			setState(555);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Insn) | (1L << DANNOTATION) | (1L << DATTRIBUTE) | (1L << DCATCH) | (1L << DDEPRECATED) | (1L << DLIMIT) | (1L << DLINE) | (1L << DSET) | (1L << DTHROWS) | (1L << DVAR) | (1L << DSIGNATURE) | (1L << DSTACK) | (1L << TABLESWITCH) | (1L << LOOKUPSWITCH))) != 0) || _la==Word || _la==Int) {
				{
				setState(554);
				statements();
				}
			}

			setState(557);
			endmethod();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DefmethodContext extends ParserRuleContext {
		public AccessContext i;
		public Token name;
		public TerminalNode DMETHOD() { return getToken(JasminParser.DMETHOD, 0); }
		public AccessContext access() {
			return getRuleContext(AccessContext.class,0);
		}
		public TerminalNode Word() { return getToken(JasminParser.Word, 0); }
		public DefmethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defmethod; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasminListener ) ((JasminListener)listener).enterDefmethod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasminListener ) ((JasminListener)listener).exitDefmethod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasminVisitor ) return ((JasminVisitor<? extends T>)visitor).visitDefmethod(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefmethodContext defmethod() throws RecognitionException {
		DefmethodContext _localctx = new DefmethodContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_defmethod);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(559);
			match(DMETHOD);
			setState(560);
			((DefmethodContext)_localctx).i = access();
			setState(561);
			((DefmethodContext)_localctx).name = match(Word);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EndmethodContext extends ParserRuleContext {
		public TerminalNode DEND() { return getToken(JasminParser.DEND, 0); }
		public TerminalNode METHOD() { return getToken(JasminParser.METHOD, 0); }
		public EndmethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_endmethod; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasminListener ) ((JasminListener)listener).enterEndmethod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasminListener ) ((JasminListener)listener).exitEndmethod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasminVisitor ) return ((JasminVisitor<? extends T>)visitor).visitEndmethod(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EndmethodContext endmethod() throws RecognitionException {
		EndmethodContext _localctx = new EndmethodContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_endmethod);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(563);
			match(DEND);
			setState(564);
			match(METHOD);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementsContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasminListener ) ((JasminListener)listener).enterStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasminListener ) ((JasminListener)listener).exitStatements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasminVisitor ) return ((JasminVisitor<? extends T>)visitor).visitStatements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_statements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(567); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(566);
				statement();
				}
				}
				setState(569); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Insn) | (1L << DANNOTATION) | (1L << DATTRIBUTE) | (1L << DCATCH) | (1L << DDEPRECATED) | (1L << DLIMIT) | (1L << DLINE) | (1L << DSET) | (1L << DTHROWS) | (1L << DVAR) | (1L << DSIGNATURE) | (1L << DSTACK) | (1L << TABLESWITCH) | (1L << LOOKUPSWITCH))) != 0) || _la==Word || _la==Int );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public InstructionContext instruction() {
			return getRuleContext(InstructionContext.class,0);
		}
		public DirectiveContext directive() {
			return getRuleContext(DirectiveContext.class,0);
		}
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasminListener ) ((JasminListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasminListener ) ((JasminListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasminVisitor ) return ((JasminVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_statement);
		try {
			setState(574);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Insn:
			case TABLESWITCH:
			case LOOKUPSWITCH:
				enterOuterAlt(_localctx, 1);
				{
				setState(571);
				instruction();
				}
				break;
			case DANNOTATION:
			case DATTRIBUTE:
			case DCATCH:
			case DDEPRECATED:
			case DLIMIT:
			case DLINE:
			case DSET:
			case DTHROWS:
			case DVAR:
			case DSIGNATURE:
			case DSTACK:
				enterOuterAlt(_localctx, 2);
				{
				setState(572);
				directive();
				}
				break;
			case Word:
			case Int:
				enterOuterAlt(_localctx, 3);
				{
				setState(573);
				label();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LabelContext extends ParserRuleContext {
		public Token l;
		public TerminalNode COLON() { return getToken(JasminParser.COLON, 0); }
		public TerminalNode Word() { return getToken(JasminParser.Word, 0); }
		public InstructionContext instruction() {
			return getRuleContext(InstructionContext.class,0);
		}
		public TerminalNode Int() { return getToken(JasminParser.Int, 0); }
		public LabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_label; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasminListener ) ((JasminListener)listener).enterLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasminListener ) ((JasminListener)listener).exitLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasminVisitor ) return ((JasminVisitor<? extends T>)visitor).visitLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LabelContext label() throws RecognitionException {
		LabelContext _localctx = new LabelContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_label);
		try {
			setState(581);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Word:
				enterOuterAlt(_localctx, 1);
				{
				setState(576);
				((LabelContext)_localctx).l = match(Word);
				setState(577);
				match(COLON);
				}
				break;
			case Int:
				enterOuterAlt(_localctx, 2);
				{
				setState(578);
				((LabelContext)_localctx).l = match(Int);
				setState(579);
				match(COLON);
				setState(580);
				instruction();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DirectiveContext extends ParserRuleContext {
		public Token v;
		public TerminalNode DVAR() { return getToken(JasminParser.DVAR, 0); }
		public Var_exprContext var_expr() {
			return getRuleContext(Var_exprContext.class,0);
		}
		public TerminalNode DLIMIT() { return getToken(JasminParser.DLIMIT, 0); }
		public TerminalNode LOCALS() { return getToken(JasminParser.LOCALS, 0); }
		public TerminalNode Int() { return getToken(JasminParser.Int, 0); }
		public TerminalNode STACK() { return getToken(JasminParser.STACK, 0); }
		public TerminalNode DLINE() { return getToken(JasminParser.DLINE, 0); }
		public Line_exprContext line_expr() {
			return getRuleContext(Line_exprContext.class,0);
		}
		public TerminalNode DTHROWS() { return getToken(JasminParser.DTHROWS, 0); }
		public Throws_exprContext throws_expr() {
			return getRuleContext(Throws_exprContext.class,0);
		}
		public TerminalNode DCATCH() { return getToken(JasminParser.DCATCH, 0); }
		public Catch_exprContext catch_expr() {
			return getRuleContext(Catch_exprContext.class,0);
		}
		public TerminalNode DSET() { return getToken(JasminParser.DSET, 0); }
		public Set_exprContext set_expr() {
			return getRuleContext(Set_exprContext.class,0);
		}
		public TerminalNode DSIGNATURE() { return getToken(JasminParser.DSIGNATURE, 0); }
		public Signature_exprContext signature_expr() {
			return getRuleContext(Signature_exprContext.class,0);
		}
		public TerminalNode DATTRIBUTE() { return getToken(JasminParser.DATTRIBUTE, 0); }
		public Generic_exprContext generic_expr() {
			return getRuleContext(Generic_exprContext.class,0);
		}
		public TerminalNode DDEPRECATED() { return getToken(JasminParser.DDEPRECATED, 0); }
		public Deprecated_exprContext deprecated_expr() {
			return getRuleContext(Deprecated_exprContext.class,0);
		}
		public TerminalNode DANNOTATION() { return getToken(JasminParser.DANNOTATION, 0); }
		public Ann_met_exprContext ann_met_expr() {
			return getRuleContext(Ann_met_exprContext.class,0);
		}
		public Ann_arglistContext ann_arglist() {
			return getRuleContext(Ann_arglistContext.class,0);
		}
		public EndannotationContext endannotation() {
			return getRuleContext(EndannotationContext.class,0);
		}
		public Ann_def_specContext ann_def_spec() {
			return getRuleContext(Ann_def_specContext.class,0);
		}
		public Ann_def_valContext ann_def_val() {
			return getRuleContext(Ann_def_valContext.class,0);
		}
		public TerminalNode DSTACK() { return getToken(JasminParser.DSTACK, 0); }
		public StackmapContext stackmap() {
			return getRuleContext(StackmapContext.class,0);
		}
		public DirectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_directive; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasminListener ) ((JasminListener)listener).enterDirective(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasminListener ) ((JasminListener)listener).exitDirective(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasminVisitor ) return ((JasminVisitor<? extends T>)visitor).visitDirective(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DirectiveContext directive() throws RecognitionException {
		DirectiveContext _localctx = new DirectiveContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_directive);
		try {
			setState(617);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(583);
				match(DVAR);
				setState(584);
				var_expr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(585);
				match(DLIMIT);
				setState(586);
				match(LOCALS);
				setState(587);
				((DirectiveContext)_localctx).v = match(Int);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(588);
				match(DLIMIT);
				setState(589);
				match(STACK);
				setState(590);
				((DirectiveContext)_localctx).v = match(Int);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(591);
				match(DLINE);
				setState(592);
				line_expr();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(593);
				match(DTHROWS);
				setState(594);
				throws_expr();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(595);
				match(DCATCH);
				setState(596);
				catch_expr();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(597);
				match(DSET);
				setState(598);
				set_expr();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(599);
				match(DSIGNATURE);
				setState(600);
				signature_expr();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(601);
				match(DATTRIBUTE);
				setState(602);
				generic_expr();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(603);
				match(DDEPRECATED);
				setState(604);
				deprecated_expr();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(605);
				match(DANNOTATION);
				setState(606);
				ann_met_expr();
				setState(607);
				ann_arglist();
				setState(608);
				endannotation();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(610);
				match(DANNOTATION);
				setState(611);
				ann_def_spec();
				setState(612);
				ann_def_val();
				setState(613);
				endannotation();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(615);
				match(DSTACK);
				setState(616);
				stackmap();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StackmapContext extends ParserRuleContext {
		public DefstackContext defstack() {
			return getRuleContext(DefstackContext.class,0);
		}
		public Stack_map_frame_descContext stack_map_frame_desc() {
			return getRuleContext(Stack_map_frame_descContext.class,0);
		}
		public EndstackContext endstack() {
			return getRuleContext(EndstackContext.class,0);
		}
		public TerminalNode USE() { return getToken(JasminParser.USE, 0); }
		public Defstack_sameContext defstack_same() {
			return getRuleContext(Defstack_sameContext.class,0);
		}
		public StackmapContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stackmap; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasminListener ) ((JasminListener)listener).enterStackmap(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasminListener ) ((JasminListener)listener).exitStackmap(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasminVisitor ) return ((JasminVisitor<? extends T>)visitor).visitStackmap(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StackmapContext stackmap() throws RecognitionException {
		StackmapContext _localctx = new StackmapContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_stackmap);
		try {
			setState(628);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(619);
				defstack();
				setState(620);
				stack_map_frame_desc();
				setState(621);
				endstack();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(623);
				match(USE);
				setState(624);
				defstack_same();
				setState(625);
				stack_map_frame_desc();
				setState(626);
				endstack();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Defstack_sameContext extends ParserRuleContext {
		public Defstack_same_exprContext defstack_same_expr() {
			return getRuleContext(Defstack_same_exprContext.class,0);
		}
		public TerminalNode LOCALS() { return getToken(JasminParser.LOCALS, 0); }
		public Defstack_sameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defstack_same; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasminListener ) ((JasminListener)listener).enterDefstack_same(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasminListener ) ((JasminListener)listener).exitDefstack_same(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasminVisitor ) return ((JasminVisitor<? extends T>)visitor).visitDefstack_same(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Defstack_sameContext defstack_same() throws RecognitionException {
		Defstack_sameContext _localctx = new Defstack_sameContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_defstack_same);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(630);
			defstack_same_expr();
			setState(631);
			match(LOCALS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Defstack_same_exprContext extends ParserRuleContext {
		public Token n;
		public TerminalNode Int() { return getToken(JasminParser.Int, 0); }
		public Defstack_same_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defstack_same_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasminListener ) ((JasminListener)listener).enterDefstack_same_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasminListener ) ((JasminListener)listener).exitDefstack_same_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasminVisitor ) return ((JasminVisitor<? extends T>)visitor).visitDefstack_same_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Defstack_same_exprContext defstack_same_expr() throws RecognitionException {
		Defstack_same_exprContext _localctx = new Defstack_same_exprContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_defstack_same_expr);
		try {
			setState(635);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Int:
				enterOuterAlt(_localctx, 1);
				{
				setState(633);
				((Defstack_same_exprContext)_localctx).n = match(Int);
				}
				break;
			case LOCALS:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DefstackContext extends ParserRuleContext {
		public DefstackContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defstack; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasminListener ) ((JasminListener)listener).enterDefstack(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasminListener ) ((JasminListener)listener).exitDefstack(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasminVisitor ) return ((JasminVisitor<? extends T>)visitor).visitDefstack(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefstackContext defstack() throws RecognitionException {
		DefstackContext _localctx = new DefstackContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_defstack);
		try {
			enterOuterAlt(_localctx, 1);
			{
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Stack_map_frame_descContext extends ParserRuleContext {
		public Stack_offset_defContext stack_offset_def() {
			return getRuleContext(Stack_offset_defContext.class,0);
		}
		public Stack_itemsContext stack_items() {
			return getRuleContext(Stack_itemsContext.class,0);
		}
		public Stack_map_frame_descContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stack_map_frame_desc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasminListener ) ((JasminListener)listener).enterStack_map_frame_desc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasminListener ) ((JasminListener)listener).exitStack_map_frame_desc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasminVisitor ) return ((JasminVisitor<? extends T>)visitor).visitStack_map_frame_desc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Stack_map_frame_descContext stack_map_frame_desc() throws RecognitionException {
		Stack_map_frame_descContext _localctx = new Stack_map_frame_descContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_stack_map_frame_desc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(639);
			stack_offset_def();
			setState(640);
			stack_items(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Stack_offset_defContext extends ParserRuleContext {
		public Token n;
		public Token w;
		public TerminalNode OFFSET() { return getToken(JasminParser.OFFSET, 0); }
		public TerminalNode Int() { return getToken(JasminParser.Int, 0); }
		public TerminalNode Word() { return getToken(JasminParser.Word, 0); }
		public Stack_offset_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stack_offset_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasminListener ) ((JasminListener)listener).enterStack_offset_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasminListener ) ((JasminListener)listener).exitStack_offset_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasminVisitor ) return ((JasminVisitor<? extends T>)visitor).visitStack_offset_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Stack_offset_defContext stack_offset_def() throws RecognitionException {
		Stack_offset_defContext _localctx = new Stack_offset_defContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_stack_offset_def);
		try {
			setState(647);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(642);
				match(OFFSET);
				setState(643);
				((Stack_offset_defContext)_localctx).n = match(Int);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(644);
				match(OFFSET);
				setState(645);
				((Stack_offset_defContext)_localctx).w = match(Word);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Stack_itemsContext extends ParserRuleContext {
		public Stack_itemsContext stack_items() {
			return getRuleContext(Stack_itemsContext.class,0);
		}
		public Stack_itemContext stack_item() {
			return getRuleContext(Stack_itemContext.class,0);
		}
		public Stack_itemsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stack_items; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasminListener ) ((JasminListener)listener).enterStack_items(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasminListener ) ((JasminListener)listener).exitStack_items(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasminVisitor ) return ((JasminVisitor<? extends T>)visitor).visitStack_items(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Stack_itemsContext stack_items() throws RecognitionException {
		return stack_items(0);
	}

	private Stack_itemsContext stack_items(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Stack_itemsContext _localctx = new Stack_itemsContext(_ctx, _parentState);
		Stack_itemsContext _prevctx = _localctx;
		int _startState = 154;
		enterRecursionRule(_localctx, 154, RULE_stack_items, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			}
			_ctx.stop = _input.LT(-1);
			setState(654);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Stack_itemsContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_stack_items);
					setState(650);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(651);
					stack_item();
					}
					} 
				}
				setState(656);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Stack_itemContext extends ParserRuleContext {
		public Stack_item_exprContext stack_item_expr() {
			return getRuleContext(Stack_item_exprContext.class,0);
		}
		public Stack_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stack_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasminListener ) ((JasminListener)listener).enterStack_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasminListener ) ((JasminListener)listener).exitStack_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasminVisitor ) return ((JasminVisitor<? extends T>)visitor).visitStack_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Stack_itemContext stack_item() throws RecognitionException {
		Stack_itemContext _localctx = new Stack_itemContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_stack_item);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(657);
			stack_item_expr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Stack_item_exprContext extends ParserRuleContext {
		public Token w;
		public Token val;
		public Token n;
		public TerminalNode LOCALS() { return getToken(JasminParser.LOCALS, 0); }
		public List<TerminalNode> Word() { return getTokens(JasminParser.Word); }
		public TerminalNode Word(int i) {
			return getToken(JasminParser.Word, i);
		}
		public TerminalNode Int() { return getToken(JasminParser.Int, 0); }
		public TerminalNode STACK() { return getToken(JasminParser.STACK, 0); }
		public Stack_item_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stack_item_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasminListener ) ((JasminListener)listener).enterStack_item_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasminListener ) ((JasminListener)listener).exitStack_item_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasminVisitor ) return ((JasminVisitor<? extends T>)visitor).visitStack_item_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Stack_item_exprContext stack_item_expr() throws RecognitionException {
		Stack_item_exprContext _localctx = new Stack_item_exprContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_stack_item_expr);
		try {
			setState(675);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(659);
				match(LOCALS);
				setState(660);
				((Stack_item_exprContext)_localctx).w = match(Word);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(661);
				match(LOCALS);
				setState(662);
				((Stack_item_exprContext)_localctx).w = match(Word);
				setState(663);
				((Stack_item_exprContext)_localctx).val = match(Word);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(664);
				match(LOCALS);
				setState(665);
				((Stack_item_exprContext)_localctx).w = match(Word);
				setState(666);
				((Stack_item_exprContext)_localctx).n = match(Int);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(667);
				match(STACK);
				setState(668);
				((Stack_item_exprContext)_localctx).w = match(Word);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(669);
				match(STACK);
				setState(670);
				((Stack_item_exprContext)_localctx).w = match(Word);
				setState(671);
				((Stack_item_exprContext)_localctx).val = match(Word);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(672);
				match(STACK);
				setState(673);
				((Stack_item_exprContext)_localctx).w = match(Word);
				setState(674);
				((Stack_item_exprContext)_localctx).n = match(Int);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EndstackContext extends ParserRuleContext {
		public TerminalNode DEND() { return getToken(JasminParser.DEND, 0); }
		public TerminalNode STACK() { return getToken(JasminParser.STACK, 0); }
		public EndstackContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_endstack; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasminListener ) ((JasminListener)listener).enterEndstack(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasminListener ) ((JasminListener)listener).exitEndstack(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasminVisitor ) return ((JasminVisitor<? extends T>)visitor).visitEndstack(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EndstackContext endstack() throws RecognitionException {
		EndstackContext _localctx = new EndstackContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_endstack);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(677);
			match(DEND);
			setState(678);
			match(STACK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Var_exprContext extends ParserRuleContext {
		public Token reg;
		public Token name;
		public Token desc;
		public Optional_signatureContext sign;
		public Token slab;
		public Token elab;
		public Token soff;
		public Token eoff;
		public TerminalNode IS() { return getToken(JasminParser.IS, 0); }
		public TerminalNode FROM() { return getToken(JasminParser.FROM, 0); }
		public TerminalNode TO() { return getToken(JasminParser.TO, 0); }
		public List<TerminalNode> Int() { return getTokens(JasminParser.Int); }
		public TerminalNode Int(int i) {
			return getToken(JasminParser.Int, i);
		}
		public List<TerminalNode> Word() { return getTokens(JasminParser.Word); }
		public TerminalNode Word(int i) {
			return getToken(JasminParser.Word, i);
		}
		public Optional_signatureContext optional_signature() {
			return getRuleContext(Optional_signatureContext.class,0);
		}
		public Var_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasminListener ) ((JasminListener)listener).enterVar_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasminListener ) ((JasminListener)listener).exitVar_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasminVisitor ) return ((JasminVisitor<? extends T>)visitor).visitVar_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_exprContext var_expr() throws RecognitionException {
		Var_exprContext _localctx = new Var_exprContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_var_expr);
		try {
			setState(705);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(680);
				((Var_exprContext)_localctx).reg = match(Int);
				setState(681);
				match(IS);
				setState(682);
				((Var_exprContext)_localctx).name = match(Word);
				setState(683);
				((Var_exprContext)_localctx).desc = match(Word);
				setState(684);
				((Var_exprContext)_localctx).sign = optional_signature();
				setState(685);
				match(FROM);
				setState(686);
				((Var_exprContext)_localctx).slab = match(Word);
				setState(687);
				match(TO);
				setState(688);
				((Var_exprContext)_localctx).elab = match(Word);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(690);
				((Var_exprContext)_localctx).reg = match(Int);
				setState(691);
				match(IS);
				setState(692);
				((Var_exprContext)_localctx).name = match(Word);
				setState(693);
				((Var_exprContext)_localctx).desc = match(Word);
				setState(694);
				((Var_exprContext)_localctx).sign = optional_signature();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(695);
				((Var_exprContext)_localctx).reg = match(Int);
				setState(696);
				match(IS);
				setState(697);
				((Var_exprContext)_localctx).name = match(Word);
				setState(698);
				((Var_exprContext)_localctx).desc = match(Word);
				setState(699);
				((Var_exprContext)_localctx).sign = optional_signature();
				setState(700);
				match(FROM);
				setState(701);
				((Var_exprContext)_localctx).soff = match(Int);
				setState(702);
				match(TO);
				setState(703);
				((Var_exprContext)_localctx).eoff = match(Int);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Optional_signatureContext extends ParserRuleContext {
		public Token s;
		public TerminalNode SIGNATURE() { return getToken(JasminParser.SIGNATURE, 0); }
		public TerminalNode Str() { return getToken(JasminParser.Str, 0); }
		public Optional_signatureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optional_signature; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasminListener ) ((JasminListener)listener).enterOptional_signature(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasminListener ) ((JasminListener)listener).exitOptional_signature(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasminVisitor ) return ((JasminVisitor<? extends T>)visitor).visitOptional_signature(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Optional_signatureContext optional_signature() throws RecognitionException {
		Optional_signatureContext _localctx = new Optional_signatureContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_optional_signature);
		try {
			setState(710);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SIGNATURE:
				enterOuterAlt(_localctx, 1);
				{
				setState(707);
				match(SIGNATURE);
				setState(708);
				((Optional_signatureContext)_localctx).s = match(Str);
				}
				break;
			case Insn:
			case DANNOTATION:
			case DATTRIBUTE:
			case DCATCH:
			case DDEPRECATED:
			case DEND:
			case DLIMIT:
			case DLINE:
			case DSET:
			case DTHROWS:
			case DVAR:
			case DSIGNATURE:
			case DSTACK:
			case FROM:
			case TABLESWITCH:
			case LOOKUPSWITCH:
			case Word:
			case Int:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Line_exprContext extends ParserRuleContext {
		public Token v;
		public TerminalNode Int() { return getToken(JasminParser.Int, 0); }
		public Line_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasminListener ) ((JasminListener)listener).enterLine_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasminListener ) ((JasminListener)listener).exitLine_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasminVisitor ) return ((JasminVisitor<? extends T>)visitor).visitLine_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Line_exprContext line_expr() throws RecognitionException {
		Line_exprContext _localctx = new Line_exprContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_line_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(712);
			((Line_exprContext)_localctx).v = match(Int);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Throws_exprContext extends ParserRuleContext {
		public ClassnameContext s;
		public ClassnameContext classname() {
			return getRuleContext(ClassnameContext.class,0);
		}
		public Throws_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_throws_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasminListener ) ((JasminListener)listener).enterThrows_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasminListener ) ((JasminListener)listener).exitThrows_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasminVisitor ) return ((JasminVisitor<? extends T>)visitor).visitThrows_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Throws_exprContext throws_expr() throws RecognitionException {
		Throws_exprContext _localctx = new Throws_exprContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_throws_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(714);
			((Throws_exprContext)_localctx).s = classname();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Catch_exprContext extends ParserRuleContext {
		public ClassnameContext aclass;
		public Token fromlab;
		public Token tolab;
		public Token branchlab;
		public Token fromoff;
		public Token tooff;
		public Token branchoff;
		public TerminalNode FROM() { return getToken(JasminParser.FROM, 0); }
		public TerminalNode TO() { return getToken(JasminParser.TO, 0); }
		public TerminalNode USING() { return getToken(JasminParser.USING, 0); }
		public ClassnameContext classname() {
			return getRuleContext(ClassnameContext.class,0);
		}
		public List<TerminalNode> Word() { return getTokens(JasminParser.Word); }
		public TerminalNode Word(int i) {
			return getToken(JasminParser.Word, i);
		}
		public List<TerminalNode> Int() { return getTokens(JasminParser.Int); }
		public TerminalNode Int(int i) {
			return getToken(JasminParser.Int, i);
		}
		public Catch_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catch_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasminListener ) ((JasminListener)listener).enterCatch_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasminListener ) ((JasminListener)listener).exitCatch_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasminVisitor ) return ((JasminVisitor<? extends T>)visitor).visitCatch_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Catch_exprContext catch_expr() throws RecognitionException {
		Catch_exprContext _localctx = new Catch_exprContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_catch_expr);
		try {
			setState(732);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(716);
				((Catch_exprContext)_localctx).aclass = classname();
				setState(717);
				match(FROM);
				setState(718);
				((Catch_exprContext)_localctx).fromlab = match(Word);
				setState(719);
				match(TO);
				setState(720);
				((Catch_exprContext)_localctx).tolab = match(Word);
				setState(721);
				match(USING);
				setState(722);
				((Catch_exprContext)_localctx).branchlab = match(Word);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(724);
				((Catch_exprContext)_localctx).aclass = classname();
				setState(725);
				match(FROM);
				setState(726);
				((Catch_exprContext)_localctx).fromoff = match(Int);
				setState(727);
				match(TO);
				setState(728);
				((Catch_exprContext)_localctx).tooff = match(Int);
				setState(729);
				match(USING);
				setState(730);
				((Catch_exprContext)_localctx).branchoff = match(Int);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Set_exprContext extends ParserRuleContext {
		public Token name;
		public Any_itemContext v;
		public TerminalNode Word() { return getToken(JasminParser.Word, 0); }
		public Any_itemContext any_item() {
			return getRuleContext(Any_itemContext.class,0);
		}
		public Set_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasminListener ) ((JasminListener)listener).enterSet_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasminListener ) ((JasminListener)listener).exitSet_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasminVisitor ) return ((JasminVisitor<? extends T>)visitor).visitSet_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Set_exprContext set_expr() throws RecognitionException {
		Set_exprContext _localctx = new Set_exprContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_set_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(734);
			((Set_exprContext)_localctx).name = match(Word);
			setState(735);
			((Set_exprContext)_localctx).v = any_item();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InstructionContext extends ParserRuleContext {
		public Simple_instructionContext simple_instruction() {
			return getRuleContext(Simple_instructionContext.class,0);
		}
		public Complex_instructionContext complex_instruction() {
			return getRuleContext(Complex_instructionContext.class,0);
		}
		public InstructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasminListener ) ((JasminListener)listener).enterInstruction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasminListener ) ((JasminListener)listener).exitInstruction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasminVisitor ) return ((JasminVisitor<? extends T>)visitor).visitInstruction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstructionContext instruction() throws RecognitionException {
		InstructionContext _localctx = new InstructionContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_instruction);
		try {
			setState(739);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Insn:
				enterOuterAlt(_localctx, 1);
				{
				setState(737);
				simple_instruction();
				}
				break;
			case TABLESWITCH:
			case LOOKUPSWITCH:
				enterOuterAlt(_localctx, 2);
				{
				setState(738);
				complex_instruction();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Simple_instructionContext extends ParserRuleContext {
		public Token i;
		public Token n1;
		public Token n2;
		public Token n;
		public TerminalNode Insn() { return getToken(JasminParser.Insn, 0); }
		public List<TerminalNode> Int() { return getTokens(JasminParser.Int); }
		public TerminalNode Int(int i) {
			return getToken(JasminParser.Int, i);
		}
		public TerminalNode Num() { return getToken(JasminParser.Num, 0); }
		public List<TerminalNode> Word() { return getTokens(JasminParser.Word); }
		public TerminalNode Word(int i) {
			return getToken(JasminParser.Word, i);
		}
		public TerminalNode Str() { return getToken(JasminParser.Str, 0); }
		public TerminalNode Relative() { return getToken(JasminParser.Relative, 0); }
		public Simple_instructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_instruction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasminListener ) ((JasminListener)listener).enterSimple_instruction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasminListener ) ((JasminListener)listener).exitSimple_instruction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasminVisitor ) return ((JasminVisitor<? extends T>)visitor).visitSimple_instruction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Simple_instructionContext simple_instruction() throws RecognitionException {
		Simple_instructionContext _localctx = new Simple_instructionContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_simple_instruction);
		try {
			setState(761);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(741);
				((Simple_instructionContext)_localctx).i = match(Insn);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(742);
				((Simple_instructionContext)_localctx).i = match(Insn);
				setState(743);
				((Simple_instructionContext)_localctx).n1 = match(Int);
				setState(744);
				((Simple_instructionContext)_localctx).n2 = match(Int);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(745);
				((Simple_instructionContext)_localctx).i = match(Insn);
				setState(746);
				((Simple_instructionContext)_localctx).n = match(Int);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(747);
				((Simple_instructionContext)_localctx).i = match(Insn);
				setState(748);
				((Simple_instructionContext)_localctx).n = match(Num);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(749);
				((Simple_instructionContext)_localctx).i = match(Insn);
				setState(750);
				((Simple_instructionContext)_localctx).n = match(Word);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(751);
				((Simple_instructionContext)_localctx).i = match(Insn);
				setState(752);
				((Simple_instructionContext)_localctx).n = match(Word);
				setState(753);
				((Simple_instructionContext)_localctx).n2 = match(Int);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(754);
				((Simple_instructionContext)_localctx).i = match(Insn);
				setState(755);
				((Simple_instructionContext)_localctx).n1 = match(Word);
				setState(756);
				((Simple_instructionContext)_localctx).n2 = match(Word);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(757);
				((Simple_instructionContext)_localctx).i = match(Insn);
				setState(758);
				((Simple_instructionContext)_localctx).n = match(Str);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(759);
				((Simple_instructionContext)_localctx).i = match(Insn);
				setState(760);
				((Simple_instructionContext)_localctx).n = match(Relative);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Complex_instructionContext extends ParserRuleContext {
		public TerminalNode LOOKUPSWITCH() { return getToken(JasminParser.LOOKUPSWITCH, 0); }
		public LookupContext lookup() {
			return getRuleContext(LookupContext.class,0);
		}
		public TerminalNode TABLESWITCH() { return getToken(JasminParser.TABLESWITCH, 0); }
		public TableContext table() {
			return getRuleContext(TableContext.class,0);
		}
		public Complex_instructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_complex_instruction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasminListener ) ((JasminListener)listener).enterComplex_instruction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasminListener ) ((JasminListener)listener).exitComplex_instruction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasminVisitor ) return ((JasminVisitor<? extends T>)visitor).visitComplex_instruction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Complex_instructionContext complex_instruction() throws RecognitionException {
		Complex_instructionContext _localctx = new Complex_instructionContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_complex_instruction);
		try {
			setState(767);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LOOKUPSWITCH:
				enterOuterAlt(_localctx, 1);
				{
				setState(763);
				match(LOOKUPSWITCH);
				setState(764);
				lookup();
				}
				break;
			case TABLESWITCH:
				enterOuterAlt(_localctx, 2);
				{
				setState(765);
				match(TABLESWITCH);
				setState(766);
				table();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LookupContext extends ParserRuleContext {
		public Lookup_argsContext lookup_args() {
			return getRuleContext(Lookup_argsContext.class,0);
		}
		public Lookup_listContext lookup_list() {
			return getRuleContext(Lookup_listContext.class,0);
		}
		public Lookup_defaultContext lookup_default() {
			return getRuleContext(Lookup_defaultContext.class,0);
		}
		public LookupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lookup; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasminListener ) ((JasminListener)listener).enterLookup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasminListener ) ((JasminListener)listener).exitLookup(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasminVisitor ) return ((JasminVisitor<? extends T>)visitor).visitLookup(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LookupContext lookup() throws RecognitionException {
		LookupContext _localctx = new LookupContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_lookup);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(769);
			lookup_args();
			setState(770);
			lookup_list(0);
			setState(771);
			lookup_default();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Lookup_argsContext extends ParserRuleContext {
		public Lookup_argsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lookup_args; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasminListener ) ((JasminListener)listener).enterLookup_args(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasminListener ) ((JasminListener)listener).exitLookup_args(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasminVisitor ) return ((JasminVisitor<? extends T>)visitor).visitLookup_args(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Lookup_argsContext lookup_args() throws RecognitionException {
		Lookup_argsContext _localctx = new Lookup_argsContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_lookup_args);
		try {
			enterOuterAlt(_localctx, 1);
			{
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Lookup_listContext extends ParserRuleContext {
		public Lookup_entryContext lookup_entry() {
			return getRuleContext(Lookup_entryContext.class,0);
		}
		public Lookup_listContext lookup_list() {
			return getRuleContext(Lookup_listContext.class,0);
		}
		public Lookup_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lookup_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasminListener ) ((JasminListener)listener).enterLookup_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasminListener ) ((JasminListener)listener).exitLookup_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasminVisitor ) return ((JasminVisitor<? extends T>)visitor).visitLookup_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Lookup_listContext lookup_list() throws RecognitionException {
		return lookup_list(0);
	}

	private Lookup_listContext lookup_list(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Lookup_listContext _localctx = new Lookup_listContext(_ctx, _parentState);
		Lookup_listContext _prevctx = _localctx;
		int _startState = 184;
		enterRecursionRule(_localctx, 184, RULE_lookup_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(776);
			lookup_entry();
			}
			_ctx.stop = _input.LT(-1);
			setState(782);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Lookup_listContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_lookup_list);
					setState(778);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(779);
					lookup_entry();
					}
					} 
				}
				setState(784);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Lookup_entryContext extends ParserRuleContext {
		public Token i;
		public Token w;
		public Token off;
		public TerminalNode COLON() { return getToken(JasminParser.COLON, 0); }
		public List<TerminalNode> Int() { return getTokens(JasminParser.Int); }
		public TerminalNode Int(int i) {
			return getToken(JasminParser.Int, i);
		}
		public TerminalNode Word() { return getToken(JasminParser.Word, 0); }
		public Lookup_entryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lookup_entry; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasminListener ) ((JasminListener)listener).enterLookup_entry(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasminListener ) ((JasminListener)listener).exitLookup_entry(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasminVisitor ) return ((JasminVisitor<? extends T>)visitor).visitLookup_entry(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Lookup_entryContext lookup_entry() throws RecognitionException {
		Lookup_entryContext _localctx = new Lookup_entryContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_lookup_entry);
		try {
			setState(791);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(785);
				((Lookup_entryContext)_localctx).i = match(Int);
				setState(786);
				match(COLON);
				setState(787);
				((Lookup_entryContext)_localctx).w = match(Word);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(788);
				((Lookup_entryContext)_localctx).i = match(Int);
				setState(789);
				match(COLON);
				setState(790);
				((Lookup_entryContext)_localctx).off = match(Int);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Lookup_defaultContext extends ParserRuleContext {
		public Token w;
		public Token off;
		public TerminalNode DEFAULT() { return getToken(JasminParser.DEFAULT, 0); }
		public TerminalNode COLON() { return getToken(JasminParser.COLON, 0); }
		public TerminalNode Word() { return getToken(JasminParser.Word, 0); }
		public TerminalNode Int() { return getToken(JasminParser.Int, 0); }
		public Lookup_defaultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lookup_default; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasminListener ) ((JasminListener)listener).enterLookup_default(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasminListener ) ((JasminListener)listener).exitLookup_default(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasminVisitor ) return ((JasminVisitor<? extends T>)visitor).visitLookup_default(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Lookup_defaultContext lookup_default() throws RecognitionException {
		Lookup_defaultContext _localctx = new Lookup_defaultContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_lookup_default);
		try {
			setState(799);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(793);
				match(DEFAULT);
				setState(794);
				match(COLON);
				setState(795);
				((Lookup_defaultContext)_localctx).w = match(Word);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(796);
				match(DEFAULT);
				setState(797);
				match(COLON);
				setState(798);
				((Lookup_defaultContext)_localctx).off = match(Int);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TableContext extends ParserRuleContext {
		public Table_argsContext table_args() {
			return getRuleContext(Table_argsContext.class,0);
		}
		public Table_listContext table_list() {
			return getRuleContext(Table_listContext.class,0);
		}
		public Table_defaultContext table_default() {
			return getRuleContext(Table_defaultContext.class,0);
		}
		public TableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasminListener ) ((JasminListener)listener).enterTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasminListener ) ((JasminListener)listener).exitTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasminVisitor ) return ((JasminVisitor<? extends T>)visitor).visitTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableContext table() throws RecognitionException {
		TableContext _localctx = new TableContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_table);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(801);
			table_args();
			setState(802);
			table_list(0);
			setState(803);
			table_default();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_argsContext extends ParserRuleContext {
		public Token low;
		public Token high;
		public List<TerminalNode> Int() { return getTokens(JasminParser.Int); }
		public TerminalNode Int(int i) {
			return getToken(JasminParser.Int, i);
		}
		public Table_argsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_args; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasminListener ) ((JasminListener)listener).enterTable_args(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasminListener ) ((JasminListener)listener).exitTable_args(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasminVisitor ) return ((JasminVisitor<? extends T>)visitor).visitTable_args(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_argsContext table_args() throws RecognitionException {
		Table_argsContext _localctx = new Table_argsContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_table_args);
		try {
			setState(808);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(805);
				((Table_argsContext)_localctx).low = match(Int);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(806);
				((Table_argsContext)_localctx).low = match(Int);
				setState(807);
				((Table_argsContext)_localctx).high = match(Int);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_listContext extends ParserRuleContext {
		public Table_entryContext table_entry() {
			return getRuleContext(Table_entryContext.class,0);
		}
		public Table_listContext table_list() {
			return getRuleContext(Table_listContext.class,0);
		}
		public Table_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasminListener ) ((JasminListener)listener).enterTable_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasminListener ) ((JasminListener)listener).exitTable_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasminVisitor ) return ((JasminVisitor<? extends T>)visitor).visitTable_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_listContext table_list() throws RecognitionException {
		return table_list(0);
	}

	private Table_listContext table_list(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Table_listContext _localctx = new Table_listContext(_ctx, _parentState);
		Table_listContext _prevctx = _localctx;
		int _startState = 194;
		enterRecursionRule(_localctx, 194, RULE_table_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(811);
			table_entry();
			}
			_ctx.stop = _input.LT(-1);
			setState(817);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Table_listContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_table_list);
					setState(813);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(814);
					table_entry();
					}
					} 
				}
				setState(819);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Table_entryContext extends ParserRuleContext {
		public Token w;
		public Token off;
		public TerminalNode Word() { return getToken(JasminParser.Word, 0); }
		public TerminalNode Int() { return getToken(JasminParser.Int, 0); }
		public Table_entryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_entry; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasminListener ) ((JasminListener)listener).enterTable_entry(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasminListener ) ((JasminListener)listener).exitTable_entry(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasminVisitor ) return ((JasminVisitor<? extends T>)visitor).visitTable_entry(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_entryContext table_entry() throws RecognitionException {
		Table_entryContext _localctx = new Table_entryContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_table_entry);
		try {
			setState(822);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Word:
				enterOuterAlt(_localctx, 1);
				{
				setState(820);
				((Table_entryContext)_localctx).w = match(Word);
				}
				break;
			case Int:
				enterOuterAlt(_localctx, 2);
				{
				setState(821);
				((Table_entryContext)_localctx).off = match(Int);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_defaultContext extends ParserRuleContext {
		public Token w;
		public Token off;
		public TerminalNode DEFAULT() { return getToken(JasminParser.DEFAULT, 0); }
		public TerminalNode COLON() { return getToken(JasminParser.COLON, 0); }
		public TerminalNode Word() { return getToken(JasminParser.Word, 0); }
		public TerminalNode Int() { return getToken(JasminParser.Int, 0); }
		public Table_defaultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_default; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasminListener ) ((JasminListener)listener).enterTable_default(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasminListener ) ((JasminListener)listener).exitTable_default(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasminVisitor ) return ((JasminVisitor<? extends T>)visitor).visitTable_default(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_defaultContext table_default() throws RecognitionException {
		Table_defaultContext _localctx = new Table_defaultContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_table_default);
		try {
			setState(830);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(824);
				match(DEFAULT);
				setState(825);
				match(COLON);
				setState(826);
				((Table_defaultContext)_localctx).w = match(Word);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(827);
				match(DEFAULT);
				setState(828);
				match(COLON);
				setState(829);
				((Table_defaultContext)_localctx).off = match(Int);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 15:
			return implements_list_sempred((Implements_listContext)_localctx, predIndex);
		case 18:
			return ann_cls_list_sempred((Ann_cls_listContext)_localctx, predIndex);
		case 26:
			return ann_arg_list_sempred((Ann_arg_listContext)_localctx, predIndex);
		case 31:
			return ann_value_items_sempred((Ann_value_itemsContext)_localctx, predIndex);
		case 33:
			return ann_ann_list_sempred((Ann_ann_listContext)_localctx, predIndex);
		case 39:
			return debug_list_sempred((Debug_listContext)_localctx, predIndex);
		case 43:
			return generic_list_sempred((Generic_listContext)_localctx, predIndex);
		case 47:
			return field_list_sempred((Field_listContext)_localctx, predIndex);
		case 53:
			return field_ext_list_sempred((Field_ext_listContext)_localctx, predIndex);
		case 58:
			return inner_list_sempred((Inner_listContext)_localctx, predIndex);
		case 77:
			return stack_items_sempred((Stack_itemsContext)_localctx, predIndex);
		case 92:
			return lookup_list_sempred((Lookup_listContext)_localctx, predIndex);
		case 97:
			return table_list_sempred((Table_listContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean implements_list_sempred(Implements_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean ann_cls_list_sempred(Ann_cls_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean ann_arg_list_sempred(Ann_arg_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean ann_value_items_sempred(Ann_value_itemsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean ann_ann_list_sempred(Ann_ann_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean debug_list_sempred(Debug_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean generic_list_sempred(Generic_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean field_list_sempred(Field_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 7:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean field_ext_list_sempred(Field_ext_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 8:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean inner_list_sempred(Inner_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 9:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean stack_items_sempred(Stack_itemsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 10:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean lookup_list_sempred(Lookup_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 11:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean table_list_sempred(Table_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 12:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3I\u0343\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4"+
		"\3\4\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\5\t\u00e4"+
		"\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00ee\n\n\3\13\3\13\3\f\3\f\3"+
		"\r\6\r\u00f5\n\r\r\r\16\r\u00f6\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\21"+
		"\3\21\3\21\3\21\3\21\7\21\u0105\n\21\f\21\16\21\u0108\13\21\3\22\3\22"+
		"\3\22\3\23\3\23\3\24\3\24\3\24\3\24\3\24\7\24\u0114\n\24\f\24\16\24\u0117"+
		"\13\24\3\25\3\25\3\25\3\25\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3\31"+
		"\3\31\3\31\3\31\5\31\u0129\n\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\5\32\u0135\n\32\3\33\3\33\5\33\u0139\n\33\3\34\3\34\3\34\3"+
		"\34\3\34\7\34\u0140\n\34\f\34\16\34\u0143\13\34\3\35\3\35\3\35\3\35\3"+
		"\36\3\36\3\36\3\36\3\36\5\36\u014e\n\36\3\37\3\37\3 \3 \5 \u0154\n \3"+
		"!\3!\3!\3!\3!\7!\u015b\n!\f!\16!\u015e\13!\3\"\3\"\3#\3#\3#\3#\3#\7#\u0167"+
		"\n#\f#\16#\u016a\13#\3$\3$\3$\3$\3$\3%\3%\3&\3&\3&\3&\3\'\3\'\3\'\5\'"+
		"\u017a\n\'\3(\3(\5(\u017e\n(\3)\3)\3)\3)\3)\7)\u0185\n)\f)\16)\u0188\13"+
		")\3*\3*\3*\3+\3+\3+\3+\5+\u0191\n+\3,\3,\5,\u0195\n,\3-\3-\3-\3-\3-\7"+
		"-\u019c\n-\f-\16-\u019f\13-\3.\3.\3.\3/\3/\3/\3\60\3\60\5\60\u01a9\n\60"+
		"\3\61\3\61\3\61\3\61\3\61\7\61\u01b0\n\61\f\61\16\61\u01b3\13\61\3\62"+
		"\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62"+
		"\3\62\3\62\3\62\3\62\5\62\u01c8\n\62\3\63\3\63\3\63\5\63\u01cd\n\63\3"+
		"\64\3\64\3\64\3\64\3\64\3\65\3\65\3\65\3\66\3\66\5\66\u01d9\n\66\3\67"+
		"\3\67\3\67\3\67\3\67\7\67\u01e0\n\67\f\67\16\67\u01e3\13\67\38\38\38\3"+
		"8\38\38\38\38\38\38\38\58\u01f0\n8\39\39\39\59\u01f5\n9\3:\3:\5:\u01f9"+
		"\n:\3;\3;\5;\u01fd\n;\3<\3<\3<\3<\3<\7<\u0204\n<\f<\16<\u0207\13<\3=\3"+
		"=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\5=\u0217\n=\3>\3>\5>\u021b\n>\3"+
		"?\3?\3?\5?\u0220\n?\3@\3@\3@\5@\u0225\n@\3A\6A\u0228\nA\rA\16A\u0229\3"+
		"B\3B\5B\u022e\nB\3B\3B\3C\3C\3C\3C\3D\3D\3D\3E\6E\u023a\nE\rE\16E\u023b"+
		"\3F\3F\3F\5F\u0241\nF\3G\3G\3G\3G\3G\5G\u0248\nG\3H\3H\3H\3H\3H\3H\3H"+
		"\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H"+
		"\3H\3H\3H\3H\5H\u026c\nH\3I\3I\3I\3I\3I\3I\3I\3I\3I\5I\u0277\nI\3J\3J"+
		"\3J\3K\3K\5K\u027e\nK\3L\3L\3M\3M\3M\3N\3N\3N\3N\3N\5N\u028a\nN\3O\3O"+
		"\3O\7O\u028f\nO\fO\16O\u0292\13O\3P\3P\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3"+
		"Q\3Q\3Q\3Q\3Q\3Q\5Q\u02a6\nQ\3R\3R\3R\3S\3S\3S\3S\3S\3S\3S\3S\3S\3S\3"+
		"S\3S\3S\3S\3S\3S\3S\3S\3S\3S\3S\3S\3S\3S\3S\5S\u02c4\nS\3T\3T\3T\5T\u02c9"+
		"\nT\3U\3U\3V\3V\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\5W\u02df"+
		"\nW\3X\3X\3X\3Y\3Y\5Y\u02e6\nY\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z"+
		"\3Z\3Z\3Z\3Z\3Z\3Z\3Z\5Z\u02fc\nZ\3[\3[\3[\3[\5[\u0302\n[\3\\\3\\\3\\"+
		"\3\\\3]\3]\3^\3^\3^\3^\3^\7^\u030f\n^\f^\16^\u0312\13^\3_\3_\3_\3_\3_"+
		"\3_\5_\u031a\n_\3`\3`\3`\3`\3`\3`\5`\u0322\n`\3a\3a\3a\3a\3b\3b\3b\5b"+
		"\u032b\nb\3c\3c\3c\3c\3c\7c\u0332\nc\fc\16c\u0335\13c\3d\3d\5d\u0339\n"+
		"d\3e\3e\3e\3e\3e\3e\5e\u0341\ne\3e\2\17 &\66@DPX`lv\u009c\u00ba\u00c4"+
		"f\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDF"+
		"HJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c"+
		"\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4"+
		"\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc"+
		"\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\2\3\3\2\60@\2\u0338\2\u00ca\3\2\2"+
		"\2\4\u00ce\3\2\2\2\6\u00d1\3\2\2\2\b\u00d4\3\2\2\2\n\u00d6\3\2\2\2\f\u00d9"+
		"\3\2\2\2\16\u00db\3\2\2\2\20\u00e3\3\2\2\2\22\u00ed\3\2\2\2\24\u00ef\3"+
		"\2\2\2\26\u00f1\3\2\2\2\30\u00f4\3\2\2\2\32\u00f8\3\2\2\2\34\u00fa\3\2"+
		"\2\2\36\u00fd\3\2\2\2 \u00ff\3\2\2\2\"\u0109\3\2\2\2$\u010c\3\2\2\2&\u010e"+
		"\3\2\2\2(\u0118\3\2\2\2*\u011c\3\2\2\2,\u011e\3\2\2\2.\u0121\3\2\2\2\60"+
		"\u0128\3\2\2\2\62\u0134\3\2\2\2\64\u0138\3\2\2\2\66\u013a\3\2\2\28\u0144"+
		"\3\2\2\2:\u014d\3\2\2\2<\u014f\3\2\2\2>\u0153\3\2\2\2@\u0155\3\2\2\2B"+
		"\u015f\3\2\2\2D\u0161\3\2\2\2F\u016b\3\2\2\2H\u0170\3\2\2\2J\u0172\3\2"+
		"\2\2L\u0179\3\2\2\2N\u017d\3\2\2\2P\u017f\3\2\2\2R\u0189\3\2\2\2T\u0190"+
		"\3\2\2\2V\u0194\3\2\2\2X\u0196\3\2\2\2Z\u01a0\3\2\2\2\\\u01a3\3\2\2\2"+
		"^\u01a8\3\2\2\2`\u01aa\3\2\2\2b\u01c7\3\2\2\2d\u01cc\3\2\2\2f\u01ce\3"+
		"\2\2\2h\u01d3\3\2\2\2j\u01d8\3\2\2\2l\u01da\3\2\2\2n\u01ef\3\2\2\2p\u01f4"+
		"\3\2\2\2r\u01f8\3\2\2\2t\u01fc\3\2\2\2v\u01fe\3\2\2\2x\u0216\3\2\2\2z"+
		"\u021a\3\2\2\2|\u021f\3\2\2\2~\u0224\3\2\2\2\u0080\u0227\3\2\2\2\u0082"+
		"\u022b\3\2\2\2\u0084\u0231\3\2\2\2\u0086\u0235\3\2\2\2\u0088\u0239\3\2"+
		"\2\2\u008a\u0240\3\2\2\2\u008c\u0247\3\2\2\2\u008e\u026b\3\2\2\2\u0090"+
		"\u0276\3\2\2\2\u0092\u0278\3\2\2\2\u0094\u027d\3\2\2\2\u0096\u027f\3\2"+
		"\2\2\u0098\u0281\3\2\2\2\u009a\u0289\3\2\2\2\u009c\u028b\3\2\2\2\u009e"+
		"\u0293\3\2\2\2\u00a0\u02a5\3\2\2\2\u00a2\u02a7\3\2\2\2\u00a4\u02c3\3\2"+
		"\2\2\u00a6\u02c8\3\2\2\2\u00a8\u02ca\3\2\2\2\u00aa\u02cc\3\2\2\2\u00ac"+
		"\u02de\3\2\2\2\u00ae\u02e0\3\2\2\2\u00b0\u02e5\3\2\2\2\u00b2\u02fb\3\2"+
		"\2\2\u00b4\u0301\3\2\2\2\u00b6\u0303\3\2\2\2\u00b8\u0307\3\2\2\2\u00ba"+
		"\u0309\3\2\2\2\u00bc\u0319\3\2\2\2\u00be\u0321\3\2\2\2\u00c0\u0323\3\2"+
		"\2\2\u00c2\u032a\3\2\2\2\u00c4\u032c\3\2\2\2\u00c6\u0338\3\2\2\2\u00c8"+
		"\u0340\3\2\2\2\u00ca\u00cb\5\4\3\2\u00cb\u00cc\5\u0080A\2\u00cc\u00cd"+
		"\7\2\2\3\u00cd\3\3\2\2\2\u00ce\u00cf\5\22\n\2\u00cf\u00d0\5\34\17\2\u00d0"+
		"\5\3\2\2\2\u00d1\u00d2\7\31\2\2\u00d2\u00d3\5\b\5\2\u00d3\7\3\2\2\2\u00d4"+
		"\u00d5\7F\2\2\u00d5\t\3\2\2\2\u00d6\u00d7\7\t\2\2\u00d7\u00d8\5\f\7\2"+
		"\u00d8\13\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\r\3\2\2\2\u00db\u00dc\7\5"+
		"\2\2\u00dc\u00dd\7I\2\2\u00dd\17\3\2\2\2\u00de\u00df\7\23\2\2\u00df\u00e4"+
		"\7F\2\2\u00e0\u00e1\7\23\2\2\u00e1\u00e4\7E\2\2\u00e2\u00e4\3\2\2\2\u00e3"+
		"\u00de\3\2\2\2\u00e3\u00e0\3\2\2\2\u00e3\u00e2\3\2\2\2\u00e4\21\3\2\2"+
		"\2\u00e5\u00e6\7\b\2\2\u00e6\u00e7\5\26\f\2\u00e7\u00e8\5\24\13\2\u00e8"+
		"\u00ee\3\2\2\2\u00e9\u00ea\7\16\2\2\u00ea\u00eb\5\26\f\2\u00eb\u00ec\5"+
		"\24\13\2\u00ec\u00ee\3\2\2\2\u00ed\u00e5\3\2\2\2\u00ed\u00e9\3\2\2\2\u00ee"+
		"\23\3\2\2\2\u00ef\u00f0\7E\2\2\u00f0\25\3\2\2\2\u00f1\u00f2\5\30\r\2\u00f2"+
		"\27\3\2\2\2\u00f3\u00f5\5\32\16\2\u00f4\u00f3\3\2\2\2\u00f5\u00f6\3\2"+
		"\2\2\u00f6\u00f4\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\31\3\2\2\2\u00f8\u00f9"+
		"\t\2\2\2\u00f9\33\3\2\2\2\u00fa\u00fb\7\24\2\2\u00fb\u00fc\5\24\13\2\u00fc"+
		"\35\3\2\2\2\u00fd\u00fe\5 \21\2\u00fe\37\3\2\2\2\u00ff\u0100\b\21\1\2"+
		"\u0100\u0101\5\"\22\2\u0101\u0106\3\2\2\2\u0102\u0103\f\4\2\2\u0103\u0105"+
		"\5\"\22\2\u0104\u0102\3\2\2\2\u0105\u0108\3\2\2\2\u0106\u0104\3\2\2\2"+
		"\u0106\u0107\3\2\2\2\u0107!\3\2\2\2\u0108\u0106\3\2\2\2\u0109\u010a\7"+
		"\f\2\2\u010a\u010b\5\24\13\2\u010b#\3\2\2\2\u010c\u010d\5&\24\2\u010d"+
		"%\3\2\2\2\u010e\u010f\b\24\1\2\u010f\u0110\5(\25\2\u0110\u0115\3\2\2\2"+
		"\u0111\u0112\f\4\2\2\u0112\u0114\5(\25\2\u0113\u0111\3\2\2\2\u0114\u0117"+
		"\3\2\2\2\u0115\u0113\3\2\2\2\u0115\u0116\3\2\2\2\u0116\'\3\2\2\2\u0117"+
		"\u0115\3\2\2\2\u0118\u0119\5.\30\2\u0119\u011a\5\64\33\2\u011a\u011b\5"+
		"*\26\2\u011b)\3\2\2\2\u011c\u011d\5,\27\2\u011d+\3\2\2\2\u011e\u011f\7"+
		"\n\2\2\u011f\u0120\7;\2\2\u0120-\3\2\2\2\u0121\u0122\7\4\2\2\u0122\u0123"+
		"\5\60\31\2\u0123/\3\2\2\2\u0124\u0125\7)\2\2\u0125\u0129\5\24\13\2\u0126"+
		"\u0127\7*\2\2\u0127\u0129\5\24\13\2\u0128\u0124\3\2\2\2\u0128\u0126\3"+
		"\2\2\2\u0129\61\3\2\2\2\u012a\u012b\7)\2\2\u012b\u0135\5\24\13\2\u012c"+
		"\u012d\7*\2\2\u012d\u0135\5\24\13\2\u012e\u012f\7+\2\2\u012f\u0130\7H"+
		"\2\2\u0130\u0135\5\24\13\2\u0131\u0132\7,\2\2\u0132\u0133\7H\2\2\u0133"+
		"\u0135\5\24\13\2\u0134\u012a\3\2\2\2\u0134\u012c\3\2\2\2\u0134\u012e\3"+
		"\2\2\2\u0134\u0131\3\2\2\2\u0135\63\3\2\2\2\u0136\u0139\5\66\34\2\u0137"+
		"\u0139\3\2\2\2\u0138\u0136\3\2\2\2\u0138\u0137\3\2\2\2\u0139\65\3\2\2"+
		"\2\u013a\u013b\b\34\1\2\u013b\u013c\58\35\2\u013c\u0141\3\2\2\2\u013d"+
		"\u013e\f\4\2\2\u013e\u0140\58\35\2\u013f\u013d\3\2\2\2\u0140\u0143\3\2"+
		"\2\2\u0141\u013f\3\2\2\2\u0141\u0142\3\2\2\2\u0142\67\3\2\2\2\u0143\u0141"+
		"\3\2\2\2\u0144\u0145\5:\36\2\u0145\u0146\7B\2\2\u0146\u0147\5> \2\u0147"+
		"9\3\2\2\2\u0148\u0149\7E\2\2\u0149\u014e\7E\2\2\u014a\u014b\7E\2\2\u014b"+
		"\u014c\7E\2\2\u014c\u014e\7E\2\2\u014d\u0148\3\2\2\2\u014d\u014a\3\2\2"+
		"\2\u014e;\3\2\2\2\u014f\u0150\7/\2\2\u0150=\3\2\2\2\u0151\u0154\5@!\2"+
		"\u0152\u0154\5D#\2\u0153\u0151\3\2\2\2\u0153\u0152\3\2\2\2\u0154?\3\2"+
		"\2\2\u0155\u0156\b!\1\2\u0156\u0157\5B\"\2\u0157\u015c\3\2\2\2\u0158\u0159"+
		"\f\4\2\2\u0159\u015b\5B\"\2\u015a\u0158\3\2\2\2\u015b\u015e\3\2\2\2\u015c"+
		"\u015a\3\2\2\2\u015c\u015d\3\2\2\2\u015dA\3\2\2\2\u015e\u015c\3\2\2\2"+
		"\u015f\u0160\5r:\2\u0160C\3\2\2\2\u0161\u0162\b#\1\2\u0162\u0163\5F$\2"+
		"\u0163\u0168\3\2\2\2\u0164\u0165\f\4\2\2\u0165\u0167\5F$\2\u0166\u0164"+
		"\3\2\2\2\u0167\u016a\3\2\2\2\u0168\u0166\3\2\2\2\u0168\u0169\3\2\2\2\u0169"+
		"E\3\2\2\2\u016a\u0168\3\2\2\2\u016b\u016c\7\4\2\2\u016c\u016d\5H%\2\u016d"+
		"\u016e\5\64\33\2\u016e\u016f\5*\26\2\u016fG\3\2\2\2\u0170\u0171\3\2\2"+
		"\2\u0171I\3\2\2\2\u0172\u0173\5L\'\2\u0173\u0174\7B\2\2\u0174\u0175\5"+
		"> \2\u0175K\3\2\2\2\u0176\u017a\7E\2\2\u0177\u0178\7E\2\2\u0178\u017a"+
		"\7E\2\2\u0179\u0176\3\2\2\2\u0179\u0177\3\2\2\2\u017aM\3\2\2\2\u017b\u017e"+
		"\5P)\2\u017c\u017e\3\2\2\2\u017d\u017b\3\2\2\2\u017d\u017c\3\2\2\2\u017e"+
		"O\3\2\2\2\u017f\u0180\b)\1\2\u0180\u0181\5R*\2\u0181\u0186\3\2\2\2\u0182"+
		"\u0183\f\4\2\2\u0183\u0185\5R*\2\u0184\u0182\3\2\2\2\u0185\u0188\3\2\2"+
		"\2\u0186\u0184\3\2\2\2\u0186\u0187\3\2\2\2\u0187Q\3\2\2\2\u0188\u0186"+
		"\3\2\2\2\u0189\u018a\7\27\2\2\u018a\u018b\7F\2\2\u018bS\3\2\2\2\u018c"+
		"\u018d\7\30\2\2\u018d\u018e\7\35\2\2\u018e\u0191\7E\2\2\u018f\u0191\3"+
		"\2\2\2\u0190\u018c\3\2\2\2\u0190\u018f\3\2\2\2\u0191U\3\2\2\2\u0192\u0195"+
		"\5X-\2\u0193\u0195\3\2\2\2\u0194\u0192\3\2\2\2\u0194\u0193\3\2\2\2\u0195"+
		"W\3\2\2\2\u0196\u0197\b-\1\2\u0197\u0198\5Z.\2\u0198\u019d\3\2\2\2\u0199"+
		"\u019a\f\4\2\2\u019a\u019c\5Z.\2\u019b\u0199\3\2\2\2\u019c\u019f\3\2\2"+
		"\2\u019d\u019b\3\2\2\2\u019d\u019e\3\2\2\2\u019eY\3\2\2\2\u019f\u019d"+
		"\3\2\2\2\u01a0\u01a1\7\6\2\2\u01a1\u01a2\5\\/\2\u01a2[\3\2\2\2\u01a3\u01a4"+
		"\7E\2\2\u01a4\u01a5\7F\2\2\u01a5]\3\2\2\2\u01a6\u01a9\5`\61\2\u01a7\u01a9"+
		"\3\2\2\2\u01a8\u01a6\3\2\2\2\u01a8\u01a7\3\2\2\2\u01a9_\3\2\2\2\u01aa"+
		"\u01ab\b\61\1\2\u01ab\u01ac\5b\62\2\u01ac\u01b1\3\2\2\2\u01ad\u01ae\f"+
		"\4\2\2\u01ae\u01b0\5b\62\2\u01af\u01ad\3\2\2\2\u01b0\u01b3\3\2\2\2\u01b1"+
		"\u01af\3\2\2\2\u01b1\u01b2\3\2\2\2\u01b2a\3\2\2\2\u01b3\u01b1\3\2\2\2"+
		"\u01b4\u01b5\7\13\2\2\u01b5\u01b6\5\26\f\2\u01b6\u01b7\7E\2\2\u01b7\u01b8"+
		"\7E\2\2\u01b8\u01b9\7!\2\2\u01b9\u01ba\7F\2\2\u01ba\u01bb\5d\63\2\u01bb"+
		"\u01c8\3\2\2\2\u01bc\u01bd\7\13\2\2\u01bd\u01be\5\26\f\2\u01be\u01bf\7"+
		"E\2\2\u01bf\u01c0\7E\2\2\u01c0\u01c1\5d\63\2\u01c1\u01c8\3\2\2\2\u01c2"+
		"\u01c3\7\13\2\2\u01c3\u01c4\5f\64\2\u01c4\u01c5\5j\66\2\u01c5\u01c6\5"+
		"h\65\2\u01c6\u01c8\3\2\2\2\u01c7\u01b4\3\2\2\2\u01c7\u01bc\3\2\2\2\u01c7"+
		"\u01c2\3\2\2\2\u01c8c\3\2\2\2\u01c9\u01ca\7B\2\2\u01ca\u01cd\5p9\2\u01cb"+
		"\u01cd\3\2\2\2\u01cc\u01c9\3\2\2\2\u01cc\u01cb\3\2\2\2\u01cde\3\2\2\2"+
		"\u01ce\u01cf\5\26\f\2\u01cf\u01d0\7E\2\2\u01d0\u01d1\7E\2\2\u01d1\u01d2"+
		"\5d\63\2\u01d2g\3\2\2\2\u01d3\u01d4\7\n\2\2\u01d4\u01d5\7\33\2\2\u01d5"+
		"i\3\2\2\2\u01d6\u01d9\5l\67\2\u01d7\u01d9\3\2\2\2\u01d8\u01d6\3\2\2\2"+
		"\u01d8\u01d7\3\2\2\2\u01d9k\3\2\2\2\u01da\u01db\b\67\1\2\u01db\u01dc\5"+
		"n8\2\u01dc\u01e1\3\2\2\2\u01dd\u01de\f\4\2\2\u01de\u01e0\5n8\2\u01df\u01dd"+
		"\3\2\2\2\u01e0\u01e3\3\2\2\2\u01e1\u01df\3\2\2\2\u01e1\u01e2\3\2\2\2\u01e2"+
		"m\3\2\2\2\u01e3\u01e1\3\2\2\2\u01e4\u01e5\7\31\2\2\u01e5\u01f0\5\b\5\2"+
		"\u01e6\u01e7\7\6\2\2\u01e7\u01f0\5\\/\2\u01e8\u01e9\7\t\2\2\u01e9\u01f0"+
		"\5\f\7\2\u01ea\u01eb\7\4\2\2\u01eb\u01ec\5\60\31\2\u01ec\u01ed\5\64\33"+
		"\2\u01ed\u01ee\5*\26\2\u01ee\u01f0\3\2\2\2\u01ef\u01e4\3\2\2\2\u01ef\u01e6"+
		"\3\2\2\2\u01ef\u01e8\3\2\2\2\u01ef\u01ea\3\2\2\2\u01f0o\3\2\2\2\u01f1"+
		"\u01f5\7H\2\2\u01f2\u01f5\7I\2\2\u01f3\u01f5\7F\2\2\u01f4\u01f1\3\2\2"+
		"\2\u01f4\u01f2\3\2\2\2\u01f4\u01f3\3\2\2\2\u01f5q\3\2\2\2\u01f6\u01f9"+
		"\7E\2\2\u01f7\u01f9\5p9\2\u01f8\u01f6\3\2\2\2\u01f8\u01f7\3\2\2\2\u01f9"+
		"s\3\2\2\2\u01fa\u01fd\5v<\2\u01fb\u01fd\3\2\2\2\u01fc\u01fa\3\2\2\2\u01fc"+
		"\u01fb\3\2\2\2\u01fdu\3\2\2\2\u01fe\u01ff\b<\1\2\u01ff\u0200\5x=\2\u0200"+
		"\u0205\3\2\2\2\u0201\u0202\f\4\2\2\u0202\u0204\5x=\2\u0203\u0201\3\2\2"+
		"\2\u0204\u0207\3\2\2\2\u0205\u0203\3\2\2\2\u0205\u0206\3\2\2\2\u0206w"+
		"\3\2\2\2\u0207\u0205\3\2\2\2\u0208\u0209\7\r\2\2\u0209\u020a\7(\2\2\u020a"+
		"\u020b\5\26\f\2\u020b\u020c\5z>\2\u020c\u020d\5|?\2\u020d\u020e\5~@\2"+
		"\u020e\u0217\3\2\2\2\u020f\u0210\7\r\2\2\u0210\u0211\79\2\2\u0211\u0212"+
		"\5\26\f\2\u0212\u0213\5z>\2\u0213\u0214\5|?\2\u0214\u0215\5~@\2\u0215"+
		"\u0217\3\2\2\2\u0216\u0208\3\2\2\2\u0216\u020f\3\2\2\2\u0217y\3\2\2\2"+
		"\u0218\u021b\7E\2\2\u0219\u021b\3\2\2\2\u021a\u0218\3\2\2\2\u021a\u0219"+
		"\3\2\2\2\u021b{\3\2\2\2\u021c\u021d\7&\2\2\u021d\u0220\5\24\13\2\u021e"+
		"\u0220\3\2\2\2\u021f\u021c\3\2\2\2\u021f\u021e\3\2\2\2\u0220}\3\2\2\2"+
		"\u0221\u0222\7\'\2\2\u0222\u0225\5\24\13\2\u0223\u0225\3\2\2\2\u0224\u0221"+
		"\3\2\2\2\u0224\u0223\3\2\2\2\u0225\177\3\2\2\2\u0226\u0228\5\u0082B\2"+
		"\u0227\u0226\3\2\2\2\u0228\u0229\3\2\2\2\u0229\u0227\3\2\2\2\u0229\u022a"+
		"\3\2\2\2\u022a\u0081\3\2\2\2\u022b\u022d\5\u0084C\2\u022c\u022e\5\u0088"+
		"E\2\u022d\u022c\3\2\2\2\u022d\u022e\3\2\2\2\u022e\u022f\3\2\2\2\u022f"+
		"\u0230\5\u0086D\2\u0230\u0083\3\2\2\2\u0231\u0232\7\21\2\2\u0232\u0233"+
		"\5\26\f\2\u0233\u0234\7E\2\2\u0234\u0085\3\2\2\2\u0235\u0236\7\n\2\2\u0236"+
		"\u0237\7\35\2\2\u0237\u0087\3\2\2\2\u0238\u023a\5\u008aF\2\u0239\u0238"+
		"\3\2\2\2\u023a\u023b\3\2\2\2\u023b\u0239\3\2\2\2\u023b\u023c\3\2\2\2\u023c"+
		"\u0089\3\2\2\2\u023d\u0241\5\u00b0Y\2\u023e\u0241\5\u008eH\2\u023f\u0241"+
		"\5\u008cG\2\u0240\u023d\3\2\2\2\u0240\u023e\3\2\2\2\u0240\u023f\3\2\2"+
		"\2\u0241\u008b\3\2\2\2\u0242\u0243\7E\2\2\u0243\u0248\7A\2\2\u0244\u0245"+
		"\7H\2\2\u0245\u0246\7A\2\2\u0246\u0248\5\u00b0Y\2\u0247\u0242\3\2\2\2"+
		"\u0247\u0244\3\2\2\2\u0248\u008d\3\2\2\2\u0249\u024a\7\26\2\2\u024a\u026c"+
		"\5\u00a4S\2\u024b\u024c\7\17\2\2\u024c\u024d\7$\2\2\u024d\u026c\7H\2\2"+
		"\u024e\u024f\7\17\2\2\u024f\u0250\7\"\2\2\u0250\u026c\7H\2\2\u0251\u0252"+
		"\7\20\2\2\u0252\u026c\5\u00a8U\2\u0253\u0254\7\25\2\2\u0254\u026c\5\u00aa"+
		"V\2\u0255\u0256\7\7\2\2\u0256\u026c\5\u00acW\2\u0257\u0258\7\22\2\2\u0258"+
		"\u026c\5\u00aeX\2\u0259\u025a\7\31\2\2\u025a\u026c\5\b\5\2\u025b\u025c"+
		"\7\6\2\2\u025c\u026c\5\\/\2\u025d\u025e\7\t\2\2\u025e\u026c\5\f\7\2\u025f"+
		"\u0260\7\4\2\2\u0260\u0261\5\62\32\2\u0261\u0262\5\64\33\2\u0262\u0263"+
		"\5,\27\2\u0263\u026c\3\2\2\2\u0264\u0265\7\4\2\2\u0265\u0266\5<\37\2\u0266"+
		"\u0267\5J&\2\u0267\u0268\5,\27\2\u0268\u026c\3\2\2\2\u0269\u026a\7\32"+
		"\2\2\u026a\u026c\5\u0090I\2\u026b\u0249\3\2\2\2\u026b\u024b\3\2\2\2\u026b"+
		"\u024e\3\2\2\2\u026b\u0251\3\2\2\2\u026b\u0253\3\2\2\2\u026b\u0255\3\2"+
		"\2\2\u026b\u0257\3\2\2\2\u026b\u0259\3\2\2\2\u026b\u025b\3\2\2\2\u026b"+
		"\u025d\3\2\2\2\u026b\u025f\3\2\2\2\u026b\u0264\3\2\2\2\u026b\u0269\3\2"+
		"\2\2\u026c\u008f\3\2\2\2\u026d\u026e\5\u0096L\2\u026e\u026f\5\u0098M\2"+
		"\u026f\u0270\5\u00a2R\2\u0270\u0277\3\2\2\2\u0271\u0272\7%\2\2\u0272\u0273"+
		"\5\u0092J\2\u0273\u0274\5\u0098M\2\u0274\u0275\5\u00a2R\2\u0275\u0277"+
		"\3\2\2\2\u0276\u026d\3\2\2\2\u0276\u0271\3\2\2\2\u0277\u0091\3\2\2\2\u0278"+
		"\u0279\5\u0094K\2\u0279\u027a\7$\2\2\u027a\u0093\3\2\2\2\u027b\u027e\7"+
		"H\2\2\u027c\u027e\3\2\2\2\u027d\u027b\3\2\2\2\u027d\u027c\3\2\2\2\u027e"+
		"\u0095\3\2\2\2\u027f\u0280\3\2\2\2\u0280\u0097\3\2\2\2\u0281\u0282\5\u009a"+
		"N\2\u0282\u0283\5\u009cO\2\u0283\u0099\3\2\2\2\u0284\u0285\7#\2\2\u0285"+
		"\u028a\7H\2\2\u0286\u0287\7#\2\2\u0287\u028a\7E\2\2\u0288\u028a\3\2\2"+
		"\2\u0289\u0284\3\2\2\2\u0289\u0286\3\2\2\2\u0289\u0288\3\2\2\2\u028a\u009b"+
		"\3\2\2\2\u028b\u0290\bO\1\2\u028c\u028d\f\4\2\2\u028d\u028f\5\u009eP\2"+
		"\u028e\u028c\3\2\2\2\u028f\u0292\3\2\2\2\u0290\u028e\3\2\2\2\u0290\u0291"+
		"\3\2\2\2\u0291\u009d\3\2\2\2\u0292\u0290\3\2\2\2\u0293\u0294\5\u00a0Q"+
		"\2\u0294\u009f\3\2\2\2\u0295\u0296\7$\2\2\u0296\u02a6\7E\2\2\u0297\u0298"+
		"\7$\2\2\u0298\u0299\7E\2\2\u0299\u02a6\7E\2\2\u029a\u029b\7$\2\2\u029b"+
		"\u029c\7E\2\2\u029c\u02a6\7H\2\2\u029d\u029e\7\"\2\2\u029e\u02a6\7E\2"+
		"\2\u029f\u02a0\7\"\2\2\u02a0\u02a1\7E\2\2\u02a1\u02a6\7E\2\2\u02a2\u02a3"+
		"\7\"\2\2\u02a3\u02a4\7E\2\2\u02a4\u02a6\7H\2\2\u02a5\u0295\3\2\2\2\u02a5"+
		"\u0297\3\2\2\2\u02a5\u029a\3\2\2\2\u02a5\u029d\3\2\2\2\u02a5\u029f\3\2"+
		"\2\2\u02a5\u02a2\3\2\2\2\u02a6\u00a1\3\2\2\2\u02a7\u02a8\7\n\2\2\u02a8"+
		"\u02a9\7\"\2\2\u02a9\u00a3\3\2\2\2\u02aa\u02ab\7H\2\2\u02ab\u02ac\7\37"+
		"\2\2\u02ac\u02ad\7E\2\2\u02ad\u02ae\7E\2\2\u02ae\u02af\5\u00a6T\2\u02af"+
		"\u02b0\7\34\2\2\u02b0\u02b1\7E\2\2\u02b1\u02b2\7\36\2\2\u02b2\u02b3\7"+
		"E\2\2\u02b3\u02c4\3\2\2\2\u02b4\u02b5\7H\2\2\u02b5\u02b6\7\37\2\2\u02b6"+
		"\u02b7\7E\2\2\u02b7\u02b8\7E\2\2\u02b8\u02c4\5\u00a6T\2\u02b9\u02ba\7"+
		"H\2\2\u02ba\u02bb\7\37\2\2\u02bb\u02bc\7E\2\2\u02bc\u02bd\7E\2\2\u02bd"+
		"\u02be\5\u00a6T\2\u02be\u02bf\7\34\2\2\u02bf\u02c0\7H\2\2\u02c0\u02c1"+
		"\7\36\2\2\u02c1\u02c2\7H\2\2\u02c2\u02c4\3\2\2\2\u02c3\u02aa\3\2\2\2\u02c3"+
		"\u02b4\3\2\2\2\u02c3\u02b9\3\2\2\2\u02c4\u00a5\3\2\2\2\u02c5\u02c6\7!"+
		"\2\2\u02c6\u02c9\7F\2\2\u02c7\u02c9\3\2\2\2\u02c8\u02c5\3\2\2\2\u02c8"+
		"\u02c7\3\2\2\2\u02c9\u00a7\3\2\2\2\u02ca\u02cb\7H\2\2\u02cb\u00a9\3\2"+
		"\2\2\u02cc\u02cd\5\24\13\2\u02cd\u00ab\3\2\2\2\u02ce\u02cf\5\24\13\2\u02cf"+
		"\u02d0\7\34\2\2\u02d0\u02d1\7E\2\2\u02d1\u02d2\7\36\2\2\u02d2\u02d3\7"+
		"E\2\2\u02d3\u02d4\7 \2\2\u02d4\u02d5\7E\2\2\u02d5\u02df\3\2\2\2\u02d6"+
		"\u02d7\5\24\13\2\u02d7\u02d8\7\34\2\2\u02d8\u02d9\7H\2\2\u02d9\u02da\7"+
		"\36\2\2\u02da\u02db\7H\2\2\u02db\u02dc\7 \2\2\u02dc\u02dd\7H\2\2\u02dd"+
		"\u02df\3\2\2\2\u02de\u02ce\3\2\2\2\u02de\u02d6\3\2\2\2\u02df\u00ad\3\2"+
		"\2\2\u02e0\u02e1\7E\2\2\u02e1\u02e2\5r:\2\u02e2\u00af\3\2\2\2\u02e3\u02e6"+
		"\5\u00b2Z\2\u02e4\u02e6\5\u00b4[\2\u02e5\u02e3\3\2\2\2\u02e5\u02e4\3\2"+
		"\2\2\u02e6\u00b1\3\2\2\2\u02e7\u02fc\7\3\2\2\u02e8\u02e9\7\3\2\2\u02e9"+
		"\u02ea\7H\2\2\u02ea\u02fc\7H\2\2\u02eb\u02ec\7\3\2\2\u02ec\u02fc\7H\2"+
		"\2\u02ed\u02ee\7\3\2\2\u02ee\u02fc\7I\2\2\u02ef\u02f0\7\3\2\2\u02f0\u02fc"+
		"\7E\2\2\u02f1\u02f2\7\3\2\2\u02f2\u02f3\7E\2\2\u02f3\u02fc\7H\2\2\u02f4"+
		"\u02f5\7\3\2\2\u02f5\u02f6\7E\2\2\u02f6\u02fc\7E\2\2\u02f7\u02f8\7\3\2"+
		"\2\u02f8\u02fc\7F\2\2\u02f9\u02fa\7\3\2\2\u02fa\u02fc\7G\2\2\u02fb\u02e7"+
		"\3\2\2\2\u02fb\u02e8\3\2\2\2\u02fb\u02eb\3\2\2\2\u02fb\u02ed\3\2\2\2\u02fb"+
		"\u02ef\3\2\2\2\u02fb\u02f1\3\2\2\2\u02fb\u02f4\3\2\2\2\u02fb\u02f7\3\2"+
		"\2\2\u02fb\u02f9\3\2\2\2\u02fc\u00b3\3\2\2\2\u02fd\u02fe\7.\2\2\u02fe"+
		"\u0302\5\u00b6\\\2\u02ff\u0300\7-\2\2\u0300\u0302\5\u00c0a\2\u0301\u02fd"+
		"\3\2\2\2\u0301\u02ff\3\2\2\2\u0302\u00b5\3\2\2\2\u0303\u0304\5\u00b8]"+
		"\2\u0304\u0305\5\u00ba^\2\u0305\u0306\5\u00be`\2\u0306\u00b7\3\2\2\2\u0307"+
		"\u0308\3\2\2\2\u0308\u00b9\3\2\2\2\u0309\u030a\b^\1\2\u030a\u030b\5\u00bc"+
		"_\2\u030b\u0310\3\2\2\2\u030c\u030d\f\4\2\2\u030d\u030f\5\u00bc_\2\u030e"+
		"\u030c\3\2\2\2\u030f\u0312\3\2\2\2\u0310\u030e\3\2\2\2\u0310\u0311\3\2"+
		"\2\2\u0311\u00bb\3\2\2\2\u0312\u0310\3\2\2\2\u0313\u0314\7H\2\2\u0314"+
		"\u0315\7A\2\2\u0315\u031a\7E\2\2\u0316\u0317\7H\2\2\u0317\u0318\7A\2\2"+
		"\u0318\u031a\7H\2\2\u0319\u0313\3\2\2\2\u0319\u0316\3\2\2\2\u031a\u00bd"+
		"\3\2\2\2\u031b\u031c\7/\2\2\u031c\u031d\7A\2\2\u031d\u0322\7E\2\2\u031e"+
		"\u031f\7/\2\2\u031f\u0320\7A\2\2\u0320\u0322\7H\2\2\u0321\u031b\3\2\2"+
		"\2\u0321\u031e\3\2\2\2\u0322\u00bf\3\2\2\2\u0323\u0324\5\u00c2b\2\u0324"+
		"\u0325\5\u00c4c\2\u0325\u0326\5\u00c8e\2\u0326\u00c1\3\2\2\2\u0327\u032b"+
		"\7H\2\2\u0328\u0329\7H\2\2\u0329\u032b\7H\2\2\u032a\u0327\3\2\2\2\u032a"+
		"\u0328\3\2\2\2\u032b\u00c3\3\2\2\2\u032c\u032d\bc\1\2\u032d\u032e\5\u00c6"+
		"d\2\u032e\u0333\3\2\2\2\u032f\u0330\f\4\2\2\u0330\u0332\5\u00c6d\2\u0331"+
		"\u032f\3\2\2\2\u0332\u0335\3\2\2\2\u0333\u0331\3\2\2\2\u0333\u0334\3\2"+
		"\2\2\u0334\u00c5\3\2\2\2\u0335\u0333\3\2\2\2\u0336\u0339\7E\2\2\u0337"+
		"\u0339\7H\2\2\u0338\u0336\3\2\2\2\u0338\u0337\3\2\2\2\u0339\u00c7\3\2"+
		"\2\2\u033a\u033b\7/\2\2\u033b\u033c\7A\2\2\u033c\u0341\7E\2\2\u033d\u033e"+
		"\7/\2\2\u033e\u033f\7A\2\2\u033f\u0341\7H\2\2\u0340\u033a\3\2\2\2\u0340"+
		"\u033d\3\2\2\2\u0341\u00c9\3\2\2\2<\u00e3\u00ed\u00f6\u0106\u0115\u0128"+
		"\u0134\u0138\u0141\u014d\u0153\u015c\u0168\u0179\u017d\u0186\u0190\u0194"+
		"\u019d\u01a8\u01b1\u01c7\u01cc\u01d8\u01e1\u01ef\u01f4\u01f8\u01fc\u0205"+
		"\u0216\u021a\u021f\u0224\u0229\u022d\u023b\u0240\u0247\u026b\u0276\u027d"+
		"\u0289\u0290\u02a5\u02c3\u02c8\u02de\u02e5\u02fb\u0301\u0310\u0319\u0321"+
		"\u032a\u0333\u0338\u0340";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}