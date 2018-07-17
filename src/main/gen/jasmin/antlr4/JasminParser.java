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
		LINE_COMMENT=65, WS=66, Word=67, Str=68, Relative=69, Int=70, Float=71;
	public static final int
		RULE_compilation_unit = 0, RULE_jasmin_header = 1, RULE_signature_spec = 2, 
		RULE_signature_expr = 3, RULE_deprecated_spec = 4, RULE_deprecated_expr = 5, 
		RULE_bytecode_spec = 6, RULE_source_spec = 7, RULE_class_spec = 8, RULE_access = 9, 
		RULE_access_list = 10, RULE_access_item = 11, RULE_super_spec = 12, RULE_impls = 13, 
		RULE_implements_list = 14, RULE_implements_spec = 15, RULE_annotations = 16, 
		RULE_ann_cls_list = 17, RULE_ann_cls_spec = 18, RULE_endannotationsep = 19, 
		RULE_endannotation = 20, RULE_ann_cls_expr = 21, RULE_ann_clf_expr = 22, 
		RULE_ann_met_expr = 23, RULE_ann_arglist = 24, RULE_ann_arg_list = 25, 
		RULE_ann_arg_spec = 26, RULE_ann_arg_expr = 27, RULE_ann_def_spec = 28, 
		RULE_ann_value_list = 29, RULE_ann_value_items = 30, RULE_ann_value = 31, 
		RULE_ann_ann_list = 32, RULE_ann_ann_value = 33, RULE_ann_nest = 34, RULE_ann_def_val = 35, 
		RULE_ann_def_expr = 36, RULE_debug_extension = 37, RULE_debug_list = 38, 
		RULE_debug_spec = 39, RULE_enclosing_spec = 40, RULE_generic_attributes = 41, 
		RULE_generic_list = 42, RULE_generic_spec = 43, RULE_generic_expr = 44, 
		RULE_fields = 45, RULE_field_list = 46, RULE_field_spec = 47, RULE_optional_default = 48, 
		RULE_field_start = 49, RULE_endfield = 50, RULE_field_exts = 51, RULE_field_ext_list = 52, 
		RULE_field_ext_expr = 53, RULE_item = 54, RULE_any_item = 55, RULE_inners = 56, 
		RULE_inner_list = 57, RULE_inner_spec = 58, RULE_inner_name = 59, RULE_inner_inner = 60, 
		RULE_inner_outer = 61, RULE_method_spec = 62, RULE_statement = 63, RULE_label = 64, 
		RULE_directive = 65, RULE_stackmap = 66, RULE_defstack_same = 67, RULE_defstack_same_expr = 68, 
		RULE_defstack = 69, RULE_stack_map_frame_desc = 70, RULE_stack_offset_def = 71, 
		RULE_stack_items = 72, RULE_stack_item = 73, RULE_stack_item_expr = 74, 
		RULE_endstack = 75, RULE_var_expr = 76, RULE_optional_signature = 77, 
		RULE_line_expr = 78, RULE_throws_expr = 79, RULE_catch_expr = 80, RULE_set_expr = 81, 
		RULE_instruction = 82, RULE_simple_instruction = 83, RULE_complex_instruction = 84, 
		RULE_lookup = 85, RULE_lookup_args = 86, RULE_lookup_list = 87, RULE_lookup_entry = 88, 
		RULE_lookup_default = 89, RULE_table = 90, RULE_table_args = 91, RULE_table_list = 92, 
		RULE_table_entry = 93, RULE_table_default = 94;
	public static final String[] ruleNames = {
		"compilation_unit", "jasmin_header", "signature_spec", "signature_expr", 
		"deprecated_spec", "deprecated_expr", "bytecode_spec", "source_spec", 
		"class_spec", "access", "access_list", "access_item", "super_spec", "impls", 
		"implements_list", "implements_spec", "annotations", "ann_cls_list", "ann_cls_spec", 
		"endannotationsep", "endannotation", "ann_cls_expr", "ann_clf_expr", "ann_met_expr", 
		"ann_arglist", "ann_arg_list", "ann_arg_spec", "ann_arg_expr", "ann_def_spec", 
		"ann_value_list", "ann_value_items", "ann_value", "ann_ann_list", "ann_ann_value", 
		"ann_nest", "ann_def_val", "ann_def_expr", "debug_extension", "debug_list", 
		"debug_spec", "enclosing_spec", "generic_attributes", "generic_list", 
		"generic_spec", "generic_expr", "fields", "field_list", "field_spec", 
		"optional_default", "field_start", "endfield", "field_exts", "field_ext_list", 
		"field_ext_expr", "item", "any_item", "inners", "inner_list", "inner_spec", 
		"inner_name", "inner_inner", "inner_outer", "method_spec", "statement", 
		"label", "directive", "stackmap", "defstack_same", "defstack_same_expr", 
		"defstack", "stack_map_frame_desc", "stack_offset_def", "stack_items", 
		"stack_item", "stack_item_expr", "endstack", "var_expr", "optional_signature", 
		"line_expr", "throws_expr", "catch_expr", "set_expr", "instruction", "simple_instruction", 
		"complex_instruction", "lookup", "lookup_args", "lookup_list", "lookup_entry", 
		"lookup_default", "table", "table_args", "table_list", "table_entry", 
		"table_default"
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
		"WS", "Word", "Str", "Relative", "Int", "Float"
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
		public TerminalNode EOF() { return getToken(JasminParser.EOF, 0); }
		public List<Method_specContext> method_spec() {
			return getRuleContexts(Method_specContext.class);
		}
		public Method_specContext method_spec(int i) {
			return getRuleContext(Method_specContext.class,i);
		}
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			jasmin_header();
			setState(192); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(191);
				method_spec();
				}
				}
				setState(194); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==DMETHOD );
			setState(196);
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
			setState(198);
			class_spec();
			setState(199);
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
			setState(201);
			match(DSIGNATURE);
			setState(202);
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
			setState(204);
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
			setState(206);
			match(DDEPRECATED);
			setState(207);
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
		public TerminalNode Float() { return getToken(JasminParser.Float, 0); }
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
			setState(211);
			match(DBYTECODE);
			setState(212);
			((Bytecode_specContext)_localctx).n = match(Float);
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
			setState(219);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(214);
				match(DSOURCE);
				setState(215);
				((Source_specContext)_localctx).s = match(Str);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(216);
				match(DSOURCE);
				setState(217);
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
		public Class_specContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_spec; }
	 
		public Class_specContext() { }
		public void copyFrom(Class_specContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ClassDeclarationContext extends Class_specContext {
		public AccessContext a;
		public Token classname;
		public TerminalNode DCLASS() { return getToken(JasminParser.DCLASS, 0); }
		public AccessContext access() {
			return getRuleContext(AccessContext.class,0);
		}
		public TerminalNode Word() { return getToken(JasminParser.Word, 0); }
		public ClassDeclarationContext(Class_specContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasminListener ) ((JasminListener)listener).enterClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasminListener ) ((JasminListener)listener).exitClassDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasminVisitor ) return ((JasminVisitor<? extends T>)visitor).visitClassDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InterfaceDeclarationContext extends Class_specContext {
		public AccessContext a;
		public Token interfacename;
		public TerminalNode DINTERFACE() { return getToken(JasminParser.DINTERFACE, 0); }
		public AccessContext access() {
			return getRuleContext(AccessContext.class,0);
		}
		public TerminalNode Word() { return getToken(JasminParser.Word, 0); }
		public InterfaceDeclarationContext(Class_specContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasminListener ) ((JasminListener)listener).enterInterfaceDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasminListener ) ((JasminListener)listener).exitInterfaceDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasminVisitor ) return ((JasminVisitor<? extends T>)visitor).visitInterfaceDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Class_specContext class_spec() throws RecognitionException {
		Class_specContext _localctx = new Class_specContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_class_spec);
		try {
			setState(229);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DCLASS:
				_localctx = new ClassDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(221);
				match(DCLASS);
				setState(222);
				((ClassDeclarationContext)_localctx).a = access();
				setState(223);
				((ClassDeclarationContext)_localctx).classname = match(Word);
				}
				break;
			case DINTERFACE:
				_localctx = new InterfaceDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(225);
				match(DINTERFACE);
				setState(226);
				((InterfaceDeclarationContext)_localctx).a = access();
				setState(227);
				((InterfaceDeclarationContext)_localctx).interfacename = match(Word);
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
		enterRule(_localctx, 18, RULE_access);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
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
		enterRule(_localctx, 20, RULE_access_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(234); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(233);
					access_item();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(236); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
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
		enterRule(_localctx, 22, RULE_access_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
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
		public Token classname;
		public TerminalNode DSUPER() { return getToken(JasminParser.DSUPER, 0); }
		public TerminalNode Word() { return getToken(JasminParser.Word, 0); }
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
		enterRule(_localctx, 24, RULE_super_spec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			match(DSUPER);
			setState(241);
			((Super_specContext)_localctx).classname = match(Word);
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
		enterRule(_localctx, 26, RULE_impls);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
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
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_implements_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(246);
			implements_spec();
			}
			_ctx.stop = _input.LT(-1);
			setState(252);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Implements_listContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_implements_list);
					setState(248);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(249);
					implements_spec();
					}
					} 
				}
				setState(254);
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

	public static class Implements_specContext extends ParserRuleContext {
		public Token classname;
		public TerminalNode DIMPLEMENTS() { return getToken(JasminParser.DIMPLEMENTS, 0); }
		public TerminalNode Word() { return getToken(JasminParser.Word, 0); }
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
		enterRule(_localctx, 30, RULE_implements_spec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			match(DIMPLEMENTS);
			setState(256);
			((Implements_specContext)_localctx).classname = match(Word);
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
		enterRule(_localctx, 32, RULE_annotations);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
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
		int _startState = 34;
		enterRecursionRule(_localctx, 34, RULE_ann_cls_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(261);
			ann_cls_spec();
			}
			_ctx.stop = _input.LT(-1);
			setState(267);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Ann_cls_listContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_ann_cls_list);
					setState(263);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(264);
					ann_cls_spec();
					}
					} 
				}
				setState(269);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
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
		enterRule(_localctx, 36, RULE_ann_cls_spec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
			ann_cls_expr();
			setState(271);
			ann_arglist();
			setState(272);
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
		enterRule(_localctx, 38, RULE_endannotationsep);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
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
		enterRule(_localctx, 40, RULE_endannotation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			match(DEND);
			setState(277);
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
		enterRule(_localctx, 42, RULE_ann_cls_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
			match(DANNOTATION);
			setState(280);
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
		public Token classname;
		public TerminalNode VISIBLE() { return getToken(JasminParser.VISIBLE, 0); }
		public TerminalNode Word() { return getToken(JasminParser.Word, 0); }
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
		enterRule(_localctx, 44, RULE_ann_clf_expr);
		try {
			setState(286);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VISIBLE:
				enterOuterAlt(_localctx, 1);
				{
				setState(282);
				match(VISIBLE);
				setState(283);
				((Ann_clf_exprContext)_localctx).classname = match(Word);
				}
				break;
			case INVISIBLE:
				enterOuterAlt(_localctx, 2);
				{
				setState(284);
				match(INVISIBLE);
				setState(285);
				((Ann_clf_exprContext)_localctx).classname = match(Word);
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
		public Token classname;
		public Token n;
		public TerminalNode VISIBLE() { return getToken(JasminParser.VISIBLE, 0); }
		public TerminalNode Word() { return getToken(JasminParser.Word, 0); }
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
		enterRule(_localctx, 46, RULE_ann_met_expr);
		try {
			setState(298);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VISIBLE:
				enterOuterAlt(_localctx, 1);
				{
				setState(288);
				match(VISIBLE);
				setState(289);
				((Ann_met_exprContext)_localctx).classname = match(Word);
				}
				break;
			case INVISIBLE:
				enterOuterAlt(_localctx, 2);
				{
				setState(290);
				match(INVISIBLE);
				setState(291);
				((Ann_met_exprContext)_localctx).classname = match(Word);
				}
				break;
			case VISIBLEPARAM:
				enterOuterAlt(_localctx, 3);
				{
				setState(292);
				match(VISIBLEPARAM);
				setState(293);
				((Ann_met_exprContext)_localctx).n = match(Int);
				setState(294);
				((Ann_met_exprContext)_localctx).classname = match(Word);
				}
				break;
			case INVISIBLEPARAM:
				enterOuterAlt(_localctx, 4);
				{
				setState(295);
				match(INVISIBLEPARAM);
				setState(296);
				((Ann_met_exprContext)_localctx).n = match(Int);
				setState(297);
				((Ann_met_exprContext)_localctx).classname = match(Word);
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
		enterRule(_localctx, 48, RULE_ann_arglist);
		try {
			setState(302);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Word:
				enterOuterAlt(_localctx, 1);
				{
				setState(300);
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
		int _startState = 50;
		enterRecursionRule(_localctx, 50, RULE_ann_arg_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(305);
			ann_arg_spec();
			}
			_ctx.stop = _input.LT(-1);
			setState(311);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Ann_arg_listContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_ann_arg_list);
					setState(307);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(308);
					ann_arg_spec();
					}
					} 
				}
				setState(313);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
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
		enterRule(_localctx, 52, RULE_ann_arg_spec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(314);
			ann_arg_expr();
			setState(315);
			match(EQ);
			setState(316);
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
		enterRule(_localctx, 54, RULE_ann_arg_expr);
		try {
			setState(323);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(318);
				((Ann_arg_exprContext)_localctx).n = match(Word);
				setState(319);
				((Ann_arg_exprContext)_localctx).dsc = match(Word);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(320);
				((Ann_arg_exprContext)_localctx).n = match(Word);
				setState(321);
				((Ann_arg_exprContext)_localctx).desc = match(Word);
				setState(322);
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
		enterRule(_localctx, 56, RULE_ann_def_spec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(325);
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
		enterRule(_localctx, 58, RULE_ann_value_list);
		try {
			setState(329);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Word:
			case Str:
			case Int:
			case Float:
				enterOuterAlt(_localctx, 1);
				{
				setState(327);
				ann_value_items(0);
				}
				break;
			case DANNOTATION:
				enterOuterAlt(_localctx, 2);
				{
				setState(328);
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
		int _startState = 60;
		enterRecursionRule(_localctx, 60, RULE_ann_value_items, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(332);
			ann_value();
			}
			_ctx.stop = _input.LT(-1);
			setState(338);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Ann_value_itemsContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_ann_value_items);
					setState(334);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(335);
					ann_value();
					}
					} 
				}
				setState(340);
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
		enterRule(_localctx, 62, RULE_ann_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(341);
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
		int _startState = 64;
		enterRecursionRule(_localctx, 64, RULE_ann_ann_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(344);
			ann_ann_value();
			}
			_ctx.stop = _input.LT(-1);
			setState(350);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Ann_ann_listContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_ann_ann_list);
					setState(346);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(347);
					ann_ann_value();
					}
					} 
				}
				setState(352);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
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
		enterRule(_localctx, 66, RULE_ann_ann_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(353);
			match(DANNOTATION);
			setState(354);
			ann_nest();
			setState(355);
			ann_arglist();
			setState(356);
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
		enterRule(_localctx, 68, RULE_ann_nest);
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
		enterRule(_localctx, 70, RULE_ann_def_val);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(360);
			ann_def_expr();
			setState(361);
			match(EQ);
			setState(362);
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
		enterRule(_localctx, 72, RULE_ann_def_expr);
		try {
			setState(367);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(364);
				((Ann_def_exprContext)_localctx).dsc = match(Word);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(365);
				((Ann_def_exprContext)_localctx).dsc = match(Word);
				setState(366);
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
		enterRule(_localctx, 74, RULE_debug_extension);
		try {
			setState(371);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DDEBUG:
				enterOuterAlt(_localctx, 1);
				{
				setState(369);
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
		int _startState = 76;
		enterRecursionRule(_localctx, 76, RULE_debug_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(374);
			debug_spec();
			}
			_ctx.stop = _input.LT(-1);
			setState(380);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Debug_listContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_debug_list);
					setState(376);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(377);
					debug_spec();
					}
					} 
				}
				setState(382);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
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
		enterRule(_localctx, 78, RULE_debug_spec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(383);
			match(DDEBUG);
			setState(384);
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
		enterRule(_localctx, 80, RULE_enclosing_spec);
		try {
			setState(390);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DENCLOSING:
				enterOuterAlt(_localctx, 1);
				{
				setState(386);
				match(DENCLOSING);
				setState(387);
				match(METHOD);
				setState(388);
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
		enterRule(_localctx, 82, RULE_generic_attributes);
		try {
			setState(394);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DATTRIBUTE:
				enterOuterAlt(_localctx, 1);
				{
				setState(392);
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
		int _startState = 84;
		enterRecursionRule(_localctx, 84, RULE_generic_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(397);
			generic_spec();
			}
			_ctx.stop = _input.LT(-1);
			setState(403);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Generic_listContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_generic_list);
					setState(399);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(400);
					generic_spec();
					}
					} 
				}
				setState(405);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
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
		enterRule(_localctx, 86, RULE_generic_spec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(406);
			match(DATTRIBUTE);
			setState(407);
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
		enterRule(_localctx, 88, RULE_generic_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(409);
			((Generic_exprContext)_localctx).name = match(Word);
			setState(410);
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
		enterRule(_localctx, 90, RULE_fields);
		try {
			setState(414);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DFIELD:
				enterOuterAlt(_localctx, 1);
				{
				setState(412);
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
		int _startState = 92;
		enterRecursionRule(_localctx, 92, RULE_field_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(417);
			field_spec();
			}
			_ctx.stop = _input.LT(-1);
			setState(423);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Field_listContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_field_list);
					setState(419);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(420);
					field_spec();
					}
					} 
				}
				setState(425);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
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
		enterRule(_localctx, 94, RULE_field_spec);
		try {
			setState(445);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(426);
				match(DFIELD);
				setState(427);
				((Field_specContext)_localctx).a = access();
				setState(428);
				((Field_specContext)_localctx).name = match(Word);
				setState(429);
				((Field_specContext)_localctx).desc = match(Word);
				setState(430);
				match(SIGNATURE);
				setState(431);
				((Field_specContext)_localctx).sig = match(Str);
				setState(432);
				((Field_specContext)_localctx).v = optional_default();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
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
				((Field_specContext)_localctx).v = optional_default();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(440);
				match(DFIELD);
				setState(441);
				field_start();
				setState(442);
				field_exts();
				setState(443);
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
		enterRule(_localctx, 96, RULE_optional_default);
		try {
			setState(450);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(447);
				match(EQ);
				setState(448);
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
		enterRule(_localctx, 98, RULE_field_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(452);
			((Field_startContext)_localctx).a = access();
			setState(453);
			((Field_startContext)_localctx).name = match(Word);
			setState(454);
			((Field_startContext)_localctx).desc = match(Word);
			setState(455);
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
		enterRule(_localctx, 100, RULE_endfield);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(457);
			match(DEND);
			setState(458);
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
		enterRule(_localctx, 102, RULE_field_exts);
		try {
			setState(462);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DANNOTATION:
			case DATTRIBUTE:
			case DDEPRECATED:
			case DSIGNATURE:
				enterOuterAlt(_localctx, 1);
				{
				setState(460);
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
		int _startState = 104;
		enterRecursionRule(_localctx, 104, RULE_field_ext_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(465);
			field_ext_expr();
			}
			_ctx.stop = _input.LT(-1);
			setState(471);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Field_ext_listContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_field_ext_list);
					setState(467);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(468);
					field_ext_expr();
					}
					} 
				}
				setState(473);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
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
		enterRule(_localctx, 106, RULE_field_ext_expr);
		try {
			setState(485);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DSIGNATURE:
				enterOuterAlt(_localctx, 1);
				{
				setState(474);
				match(DSIGNATURE);
				setState(475);
				signature_expr();
				}
				break;
			case DATTRIBUTE:
				enterOuterAlt(_localctx, 2);
				{
				setState(476);
				match(DATTRIBUTE);
				setState(477);
				generic_expr();
				}
				break;
			case DDEPRECATED:
				enterOuterAlt(_localctx, 3);
				{
				setState(478);
				match(DDEPRECATED);
				setState(479);
				deprecated_expr();
				}
				break;
			case DANNOTATION:
				enterOuterAlt(_localctx, 4);
				{
				setState(480);
				match(DANNOTATION);
				setState(481);
				ann_clf_expr();
				setState(482);
				ann_arglist();
				setState(483);
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
		public TerminalNode Float() { return getToken(JasminParser.Float, 0); }
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
		enterRule(_localctx, 108, RULE_item);
		try {
			setState(490);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Int:
				enterOuterAlt(_localctx, 1);
				{
				setState(487);
				((ItemContext)_localctx).i = match(Int);
				}
				break;
			case Float:
				enterOuterAlt(_localctx, 2);
				{
				setState(488);
				((ItemContext)_localctx).n = match(Float);
				}
				break;
			case Str:
				enterOuterAlt(_localctx, 3);
				{
				setState(489);
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
		enterRule(_localctx, 110, RULE_any_item);
		try {
			setState(494);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Word:
				enterOuterAlt(_localctx, 1);
				{
				setState(492);
				((Any_itemContext)_localctx).w = match(Word);
				}
				break;
			case Str:
			case Int:
			case Float:
				enterOuterAlt(_localctx, 2);
				{
				setState(493);
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
		enterRule(_localctx, 112, RULE_inners);
		try {
			setState(498);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DINNER:
				enterOuterAlt(_localctx, 1);
				{
				setState(496);
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
		int _startState = 114;
		enterRecursionRule(_localctx, 114, RULE_inner_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(501);
			inner_spec();
			}
			_ctx.stop = _input.LT(-1);
			setState(507);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Inner_listContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_inner_list);
					setState(503);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(504);
					inner_spec();
					}
					} 
				}
				setState(509);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
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
		enterRule(_localctx, 116, RULE_inner_spec);
		try {
			setState(524);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(510);
				match(DINNER);
				setState(511);
				match(CLASS);
				setState(512);
				((Inner_specContext)_localctx).a = access();
				setState(513);
				((Inner_specContext)_localctx).n = inner_name();
				setState(514);
				((Inner_specContext)_localctx).i = inner_inner();
				setState(515);
				((Inner_specContext)_localctx).o = inner_outer();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(517);
				match(DINNER);
				setState(518);
				match(INTERFACE);
				setState(519);
				((Inner_specContext)_localctx).a = access();
				setState(520);
				((Inner_specContext)_localctx).n = inner_name();
				setState(521);
				((Inner_specContext)_localctx).i = inner_inner();
				setState(522);
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
		enterRule(_localctx, 118, RULE_inner_name);
		try {
			setState(528);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(526);
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
		public Token classname;
		public TerminalNode INNER() { return getToken(JasminParser.INNER, 0); }
		public TerminalNode Word() { return getToken(JasminParser.Word, 0); }
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
		enterRule(_localctx, 120, RULE_inner_inner);
		try {
			setState(533);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(530);
				match(INNER);
				setState(531);
				((Inner_innerContext)_localctx).classname = match(Word);
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
		public Token classname;
		public TerminalNode OUTER() { return getToken(JasminParser.OUTER, 0); }
		public TerminalNode Word() { return getToken(JasminParser.Word, 0); }
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
		enterRule(_localctx, 122, RULE_inner_outer);
		try {
			setState(538);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(535);
				match(OUTER);
				setState(536);
				((Inner_outerContext)_localctx).classname = match(Word);
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

	public static class Method_specContext extends ParserRuleContext {
		public AccessContext i;
		public Token name;
		public TerminalNode DMETHOD() { return getToken(JasminParser.DMETHOD, 0); }
		public TerminalNode DEND() { return getToken(JasminParser.DEND, 0); }
		public TerminalNode METHOD() { return getToken(JasminParser.METHOD, 0); }
		public AccessContext access() {
			return getRuleContext(AccessContext.class,0);
		}
		public TerminalNode Word() { return getToken(JasminParser.Word, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
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
		enterRule(_localctx, 124, RULE_method_spec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(540);
			match(DMETHOD);
			setState(541);
			((Method_specContext)_localctx).i = access();
			setState(542);
			((Method_specContext)_localctx).name = match(Word);
			setState(546);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Insn) | (1L << DANNOTATION) | (1L << DATTRIBUTE) | (1L << DCATCH) | (1L << DDEPRECATED) | (1L << DLIMIT) | (1L << DLINE) | (1L << DSET) | (1L << DTHROWS) | (1L << DVAR) | (1L << DSIGNATURE) | (1L << DSTACK) | (1L << TABLESWITCH) | (1L << LOOKUPSWITCH))) != 0) || _la==Word || _la==Int) {
				{
				{
				setState(543);
				statement();
				}
				}
				setState(548);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(549);
			match(DEND);
			setState(550);
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

	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LabelStatementContext extends StatementContext {
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public LabelStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasminListener ) ((JasminListener)listener).enterLabelStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasminListener ) ((JasminListener)listener).exitLabelStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasminVisitor ) return ((JasminVisitor<? extends T>)visitor).visitLabelStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InstructionStatementContext extends StatementContext {
		public InstructionContext instruction() {
			return getRuleContext(InstructionContext.class,0);
		}
		public InstructionStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasminListener ) ((JasminListener)listener).enterInstructionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasminListener ) ((JasminListener)listener).exitInstructionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasminVisitor ) return ((JasminVisitor<? extends T>)visitor).visitInstructionStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DirectiveStatementContext extends StatementContext {
		public DirectiveContext directive() {
			return getRuleContext(DirectiveContext.class,0);
		}
		public DirectiveStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasminListener ) ((JasminListener)listener).enterDirectiveStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasminListener ) ((JasminListener)listener).exitDirectiveStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasminVisitor ) return ((JasminVisitor<? extends T>)visitor).visitDirectiveStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_statement);
		try {
			setState(555);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Insn:
			case TABLESWITCH:
			case LOOKUPSWITCH:
				_localctx = new InstructionStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(552);
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
				_localctx = new DirectiveStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(553);
				directive();
				}
				break;
			case Word:
			case Int:
				_localctx = new LabelStatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(554);
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
		enterRule(_localctx, 128, RULE_label);
		try {
			setState(562);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Word:
				enterOuterAlt(_localctx, 1);
				{
				setState(557);
				((LabelContext)_localctx).l = match(Word);
				setState(558);
				match(COLON);
				}
				break;
			case Int:
				enterOuterAlt(_localctx, 2);
				{
				setState(559);
				((LabelContext)_localctx).l = match(Int);
				setState(560);
				match(COLON);
				setState(561);
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
		enterRule(_localctx, 130, RULE_directive);
		try {
			setState(598);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(564);
				match(DVAR);
				setState(565);
				var_expr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(566);
				match(DLIMIT);
				setState(567);
				match(LOCALS);
				setState(568);
				((DirectiveContext)_localctx).v = match(Int);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(569);
				match(DLIMIT);
				setState(570);
				match(STACK);
				setState(571);
				((DirectiveContext)_localctx).v = match(Int);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(572);
				match(DLINE);
				setState(573);
				line_expr();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(574);
				match(DTHROWS);
				setState(575);
				throws_expr();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(576);
				match(DCATCH);
				setState(577);
				catch_expr();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(578);
				match(DSET);
				setState(579);
				set_expr();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(580);
				match(DSIGNATURE);
				setState(581);
				signature_expr();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(582);
				match(DATTRIBUTE);
				setState(583);
				generic_expr();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(584);
				match(DDEPRECATED);
				setState(585);
				deprecated_expr();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(586);
				match(DANNOTATION);
				setState(587);
				ann_met_expr();
				setState(588);
				ann_arglist();
				setState(589);
				endannotation();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(591);
				match(DANNOTATION);
				setState(592);
				ann_def_spec();
				setState(593);
				ann_def_val();
				setState(594);
				endannotation();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(596);
				match(DSTACK);
				setState(597);
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
		enterRule(_localctx, 132, RULE_stackmap);
		try {
			setState(609);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(600);
				defstack();
				setState(601);
				stack_map_frame_desc();
				setState(602);
				endstack();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(604);
				match(USE);
				setState(605);
				defstack_same();
				setState(606);
				stack_map_frame_desc();
				setState(607);
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
		enterRule(_localctx, 134, RULE_defstack_same);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(611);
			defstack_same_expr();
			setState(612);
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
		enterRule(_localctx, 136, RULE_defstack_same_expr);
		try {
			setState(616);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Int:
				enterOuterAlt(_localctx, 1);
				{
				setState(614);
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
		enterRule(_localctx, 138, RULE_defstack);
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
		enterRule(_localctx, 140, RULE_stack_map_frame_desc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(620);
			stack_offset_def();
			setState(621);
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
		enterRule(_localctx, 142, RULE_stack_offset_def);
		try {
			setState(628);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(623);
				match(OFFSET);
				setState(624);
				((Stack_offset_defContext)_localctx).n = match(Int);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(625);
				match(OFFSET);
				setState(626);
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
		int _startState = 144;
		enterRecursionRule(_localctx, 144, RULE_stack_items, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			}
			_ctx.stop = _input.LT(-1);
			setState(635);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Stack_itemsContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_stack_items);
					setState(631);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(632);
					stack_item();
					}
					} 
				}
				setState(637);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
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
		enterRule(_localctx, 146, RULE_stack_item);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(638);
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
		enterRule(_localctx, 148, RULE_stack_item_expr);
		try {
			setState(656);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(640);
				match(LOCALS);
				setState(641);
				((Stack_item_exprContext)_localctx).w = match(Word);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(642);
				match(LOCALS);
				setState(643);
				((Stack_item_exprContext)_localctx).w = match(Word);
				setState(644);
				((Stack_item_exprContext)_localctx).val = match(Word);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(645);
				match(LOCALS);
				setState(646);
				((Stack_item_exprContext)_localctx).w = match(Word);
				setState(647);
				((Stack_item_exprContext)_localctx).n = match(Int);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(648);
				match(STACK);
				setState(649);
				((Stack_item_exprContext)_localctx).w = match(Word);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(650);
				match(STACK);
				setState(651);
				((Stack_item_exprContext)_localctx).w = match(Word);
				setState(652);
				((Stack_item_exprContext)_localctx).val = match(Word);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(653);
				match(STACK);
				setState(654);
				((Stack_item_exprContext)_localctx).w = match(Word);
				setState(655);
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
		enterRule(_localctx, 150, RULE_endstack);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(658);
			match(DEND);
			setState(659);
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
		enterRule(_localctx, 152, RULE_var_expr);
		try {
			setState(686);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(661);
				((Var_exprContext)_localctx).reg = match(Int);
				setState(662);
				match(IS);
				setState(663);
				((Var_exprContext)_localctx).name = match(Word);
				setState(664);
				((Var_exprContext)_localctx).desc = match(Word);
				setState(665);
				((Var_exprContext)_localctx).sign = optional_signature();
				setState(666);
				match(FROM);
				setState(667);
				((Var_exprContext)_localctx).slab = match(Word);
				setState(668);
				match(TO);
				setState(669);
				((Var_exprContext)_localctx).elab = match(Word);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(671);
				((Var_exprContext)_localctx).reg = match(Int);
				setState(672);
				match(IS);
				setState(673);
				((Var_exprContext)_localctx).name = match(Word);
				setState(674);
				((Var_exprContext)_localctx).desc = match(Word);
				setState(675);
				((Var_exprContext)_localctx).sign = optional_signature();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(676);
				((Var_exprContext)_localctx).reg = match(Int);
				setState(677);
				match(IS);
				setState(678);
				((Var_exprContext)_localctx).name = match(Word);
				setState(679);
				((Var_exprContext)_localctx).desc = match(Word);
				setState(680);
				((Var_exprContext)_localctx).sign = optional_signature();
				setState(681);
				match(FROM);
				setState(682);
				((Var_exprContext)_localctx).soff = match(Int);
				setState(683);
				match(TO);
				setState(684);
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
		enterRule(_localctx, 154, RULE_optional_signature);
		try {
			setState(691);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SIGNATURE:
				enterOuterAlt(_localctx, 1);
				{
				setState(688);
				match(SIGNATURE);
				setState(689);
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
		enterRule(_localctx, 156, RULE_line_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(693);
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
		public Token classname;
		public TerminalNode Word() { return getToken(JasminParser.Word, 0); }
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
		enterRule(_localctx, 158, RULE_throws_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(695);
			((Throws_exprContext)_localctx).classname = match(Word);
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
		public Token classname;
		public Token fromlab;
		public Token tolab;
		public Token branchlab;
		public Token fromoff;
		public Token tooff;
		public Token branchoff;
		public TerminalNode FROM() { return getToken(JasminParser.FROM, 0); }
		public TerminalNode TO() { return getToken(JasminParser.TO, 0); }
		public TerminalNode USING() { return getToken(JasminParser.USING, 0); }
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
		enterRule(_localctx, 160, RULE_catch_expr);
		try {
			setState(711);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(697);
				((Catch_exprContext)_localctx).classname = match(Word);
				setState(698);
				match(FROM);
				setState(699);
				((Catch_exprContext)_localctx).fromlab = match(Word);
				setState(700);
				match(TO);
				setState(701);
				((Catch_exprContext)_localctx).tolab = match(Word);
				setState(702);
				match(USING);
				setState(703);
				((Catch_exprContext)_localctx).branchlab = match(Word);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(704);
				((Catch_exprContext)_localctx).classname = match(Word);
				setState(705);
				match(FROM);
				setState(706);
				((Catch_exprContext)_localctx).fromoff = match(Int);
				setState(707);
				match(TO);
				setState(708);
				((Catch_exprContext)_localctx).tooff = match(Int);
				setState(709);
				match(USING);
				setState(710);
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
		enterRule(_localctx, 162, RULE_set_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(713);
			((Set_exprContext)_localctx).name = match(Word);
			setState(714);
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
		enterRule(_localctx, 164, RULE_instruction);
		try {
			setState(718);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Insn:
				enterOuterAlt(_localctx, 1);
				{
				setState(716);
				simple_instruction();
				}
				break;
			case TABLESWITCH:
			case LOOKUPSWITCH:
				enterOuterAlt(_localctx, 2);
				{
				setState(717);
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
		public Simple_instructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_instruction; }
	 
		public Simple_instructionContext() { }
		public void copyFrom(Simple_instructionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class OpcodeRelativeContext extends Simple_instructionContext {
		public Token i;
		public Token n;
		public TerminalNode Insn() { return getToken(JasminParser.Insn, 0); }
		public TerminalNode Relative() { return getToken(JasminParser.Relative, 0); }
		public OpcodeRelativeContext(Simple_instructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasminListener ) ((JasminListener)listener).enterOpcodeRelative(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasminListener ) ((JasminListener)listener).exitOpcodeRelative(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasminVisitor ) return ((JasminVisitor<? extends T>)visitor).visitOpcodeRelative(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OpcodeIntContext extends Simple_instructionContext {
		public Token i;
		public Token n;
		public TerminalNode Insn() { return getToken(JasminParser.Insn, 0); }
		public TerminalNode Int() { return getToken(JasminParser.Int, 0); }
		public OpcodeIntContext(Simple_instructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasminListener ) ((JasminListener)listener).enterOpcodeInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasminListener ) ((JasminListener)listener).exitOpcodeInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasminVisitor ) return ((JasminVisitor<? extends T>)visitor).visitOpcodeInt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OpcodeWordContext extends Simple_instructionContext {
		public Token i;
		public Token n;
		public TerminalNode Insn() { return getToken(JasminParser.Insn, 0); }
		public TerminalNode Word() { return getToken(JasminParser.Word, 0); }
		public OpcodeWordContext(Simple_instructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasminListener ) ((JasminListener)listener).enterOpcodeWord(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasminListener ) ((JasminListener)listener).exitOpcodeWord(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasminVisitor ) return ((JasminVisitor<? extends T>)visitor).visitOpcodeWord(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OpcodeStringContext extends Simple_instructionContext {
		public Token i;
		public Token n;
		public TerminalNode Insn() { return getToken(JasminParser.Insn, 0); }
		public TerminalNode Str() { return getToken(JasminParser.Str, 0); }
		public OpcodeStringContext(Simple_instructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasminListener ) ((JasminListener)listener).enterOpcodeString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasminListener ) ((JasminListener)listener).exitOpcodeString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasminVisitor ) return ((JasminVisitor<? extends T>)visitor).visitOpcodeString(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OpcodeWordIntContext extends Simple_instructionContext {
		public Token i;
		public Token n;
		public Token n2;
		public TerminalNode Insn() { return getToken(JasminParser.Insn, 0); }
		public TerminalNode Word() { return getToken(JasminParser.Word, 0); }
		public TerminalNode Int() { return getToken(JasminParser.Int, 0); }
		public OpcodeWordIntContext(Simple_instructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasminListener ) ((JasminListener)listener).enterOpcodeWordInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasminListener ) ((JasminListener)listener).exitOpcodeWordInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasminVisitor ) return ((JasminVisitor<? extends T>)visitor).visitOpcodeWordInt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OpcodeContext extends Simple_instructionContext {
		public Token i;
		public TerminalNode Insn() { return getToken(JasminParser.Insn, 0); }
		public OpcodeContext(Simple_instructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasminListener ) ((JasminListener)listener).enterOpcode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasminListener ) ((JasminListener)listener).exitOpcode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasminVisitor ) return ((JasminVisitor<? extends T>)visitor).visitOpcode(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OpcodeIntIntContext extends Simple_instructionContext {
		public Token i;
		public Token n1;
		public Token n2;
		public TerminalNode Insn() { return getToken(JasminParser.Insn, 0); }
		public List<TerminalNode> Int() { return getTokens(JasminParser.Int); }
		public TerminalNode Int(int i) {
			return getToken(JasminParser.Int, i);
		}
		public OpcodeIntIntContext(Simple_instructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasminListener ) ((JasminListener)listener).enterOpcodeIntInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasminListener ) ((JasminListener)listener).exitOpcodeIntInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasminVisitor ) return ((JasminVisitor<? extends T>)visitor).visitOpcodeIntInt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OpcodeFloatContext extends Simple_instructionContext {
		public Token i;
		public Token n;
		public TerminalNode Insn() { return getToken(JasminParser.Insn, 0); }
		public TerminalNode Float() { return getToken(JasminParser.Float, 0); }
		public OpcodeFloatContext(Simple_instructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasminListener ) ((JasminListener)listener).enterOpcodeFloat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasminListener ) ((JasminListener)listener).exitOpcodeFloat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasminVisitor ) return ((JasminVisitor<? extends T>)visitor).visitOpcodeFloat(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OpcodeWordWordContext extends Simple_instructionContext {
		public Token i;
		public Token n1;
		public Token n2;
		public TerminalNode Insn() { return getToken(JasminParser.Insn, 0); }
		public List<TerminalNode> Word() { return getTokens(JasminParser.Word); }
		public TerminalNode Word(int i) {
			return getToken(JasminParser.Word, i);
		}
		public OpcodeWordWordContext(Simple_instructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasminListener ) ((JasminListener)listener).enterOpcodeWordWord(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasminListener ) ((JasminListener)listener).exitOpcodeWordWord(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasminVisitor ) return ((JasminVisitor<? extends T>)visitor).visitOpcodeWordWord(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Simple_instructionContext simple_instruction() throws RecognitionException {
		Simple_instructionContext _localctx = new Simple_instructionContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_simple_instruction);
		try {
			setState(740);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				_localctx = new OpcodeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(720);
				((OpcodeContext)_localctx).i = match(Insn);
				}
				break;
			case 2:
				_localctx = new OpcodeIntContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(721);
				((OpcodeIntContext)_localctx).i = match(Insn);
				setState(722);
				((OpcodeIntContext)_localctx).n = match(Int);
				}
				break;
			case 3:
				_localctx = new OpcodeIntIntContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(723);
				((OpcodeIntIntContext)_localctx).i = match(Insn);
				setState(724);
				((OpcodeIntIntContext)_localctx).n1 = match(Int);
				setState(725);
				((OpcodeIntIntContext)_localctx).n2 = match(Int);
				}
				break;
			case 4:
				_localctx = new OpcodeFloatContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(726);
				((OpcodeFloatContext)_localctx).i = match(Insn);
				setState(727);
				((OpcodeFloatContext)_localctx).n = match(Float);
				}
				break;
			case 5:
				_localctx = new OpcodeWordContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(728);
				((OpcodeWordContext)_localctx).i = match(Insn);
				setState(729);
				((OpcodeWordContext)_localctx).n = match(Word);
				}
				break;
			case 6:
				_localctx = new OpcodeWordIntContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(730);
				((OpcodeWordIntContext)_localctx).i = match(Insn);
				setState(731);
				((OpcodeWordIntContext)_localctx).n = match(Word);
				setState(732);
				((OpcodeWordIntContext)_localctx).n2 = match(Int);
				}
				break;
			case 7:
				_localctx = new OpcodeWordWordContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(733);
				((OpcodeWordWordContext)_localctx).i = match(Insn);
				setState(734);
				((OpcodeWordWordContext)_localctx).n1 = match(Word);
				setState(735);
				((OpcodeWordWordContext)_localctx).n2 = match(Word);
				}
				break;
			case 8:
				_localctx = new OpcodeStringContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(736);
				((OpcodeStringContext)_localctx).i = match(Insn);
				setState(737);
				((OpcodeStringContext)_localctx).n = match(Str);
				}
				break;
			case 9:
				_localctx = new OpcodeRelativeContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(738);
				((OpcodeRelativeContext)_localctx).i = match(Insn);
				setState(739);
				((OpcodeRelativeContext)_localctx).n = match(Relative);
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
		enterRule(_localctx, 168, RULE_complex_instruction);
		try {
			setState(746);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LOOKUPSWITCH:
				enterOuterAlt(_localctx, 1);
				{
				setState(742);
				match(LOOKUPSWITCH);
				setState(743);
				lookup();
				}
				break;
			case TABLESWITCH:
				enterOuterAlt(_localctx, 2);
				{
				setState(744);
				match(TABLESWITCH);
				setState(745);
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
		enterRule(_localctx, 170, RULE_lookup);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(748);
			lookup_args();
			setState(749);
			lookup_list(0);
			setState(750);
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
		enterRule(_localctx, 172, RULE_lookup_args);
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
		int _startState = 174;
		enterRecursionRule(_localctx, 174, RULE_lookup_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(755);
			lookup_entry();
			}
			_ctx.stop = _input.LT(-1);
			setState(761);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Lookup_listContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_lookup_list);
					setState(757);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(758);
					lookup_entry();
					}
					} 
				}
				setState(763);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
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
		enterRule(_localctx, 176, RULE_lookup_entry);
		try {
			setState(770);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(764);
				((Lookup_entryContext)_localctx).i = match(Int);
				setState(765);
				match(COLON);
				setState(766);
				((Lookup_entryContext)_localctx).w = match(Word);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(767);
				((Lookup_entryContext)_localctx).i = match(Int);
				setState(768);
				match(COLON);
				setState(769);
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
		enterRule(_localctx, 178, RULE_lookup_default);
		try {
			setState(778);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(772);
				match(DEFAULT);
				setState(773);
				match(COLON);
				setState(774);
				((Lookup_defaultContext)_localctx).w = match(Word);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(775);
				match(DEFAULT);
				setState(776);
				match(COLON);
				setState(777);
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
		enterRule(_localctx, 180, RULE_table);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(780);
			table_args();
			setState(781);
			table_list(0);
			setState(782);
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
		enterRule(_localctx, 182, RULE_table_args);
		try {
			setState(787);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(784);
				((Table_argsContext)_localctx).low = match(Int);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(785);
				((Table_argsContext)_localctx).low = match(Int);
				setState(786);
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
		int _startState = 184;
		enterRecursionRule(_localctx, 184, RULE_table_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(790);
			table_entry();
			}
			_ctx.stop = _input.LT(-1);
			setState(796);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Table_listContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_table_list);
					setState(792);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(793);
					table_entry();
					}
					} 
				}
				setState(798);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
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
		enterRule(_localctx, 186, RULE_table_entry);
		try {
			setState(801);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Word:
				enterOuterAlt(_localctx, 1);
				{
				setState(799);
				((Table_entryContext)_localctx).w = match(Word);
				}
				break;
			case Int:
				enterOuterAlt(_localctx, 2);
				{
				setState(800);
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
		enterRule(_localctx, 188, RULE_table_default);
		try {
			setState(809);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(803);
				match(DEFAULT);
				setState(804);
				match(COLON);
				setState(805);
				((Table_defaultContext)_localctx).w = match(Word);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(806);
				match(DEFAULT);
				setState(807);
				match(COLON);
				setState(808);
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
		case 14:
			return implements_list_sempred((Implements_listContext)_localctx, predIndex);
		case 17:
			return ann_cls_list_sempred((Ann_cls_listContext)_localctx, predIndex);
		case 25:
			return ann_arg_list_sempred((Ann_arg_listContext)_localctx, predIndex);
		case 30:
			return ann_value_items_sempred((Ann_value_itemsContext)_localctx, predIndex);
		case 32:
			return ann_ann_list_sempred((Ann_ann_listContext)_localctx, predIndex);
		case 38:
			return debug_list_sempred((Debug_listContext)_localctx, predIndex);
		case 42:
			return generic_list_sempred((Generic_listContext)_localctx, predIndex);
		case 46:
			return field_list_sempred((Field_listContext)_localctx, predIndex);
		case 52:
			return field_ext_list_sempred((Field_ext_listContext)_localctx, predIndex);
		case 57:
			return inner_list_sempred((Inner_listContext)_localctx, predIndex);
		case 72:
			return stack_items_sempred((Stack_itemsContext)_localctx, predIndex);
		case 87:
			return lookup_list_sempred((Lookup_listContext)_localctx, predIndex);
		case 92:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3I\u032e\4\2\t\2\4"+
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
		"`\t`\3\2\3\2\6\2\u00c3\n\2\r\2\16\2\u00c4\3\2\3\2\3\3\3\3\3\3\3\4\3\4"+
		"\3\4\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\5\t\u00de"+
		"\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00e8\n\n\3\13\3\13\3\f\6\f\u00ed"+
		"\n\f\r\f\16\f\u00ee\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3"+
		"\20\3\20\7\20\u00fd\n\20\f\20\16\20\u0100\13\20\3\21\3\21\3\21\3\22\3"+
		"\22\3\23\3\23\3\23\3\23\3\23\7\23\u010c\n\23\f\23\16\23\u010f\13\23\3"+
		"\24\3\24\3\24\3\24\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3"+
		"\30\3\30\5\30\u0121\n\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\5\31\u012d\n\31\3\32\3\32\5\32\u0131\n\32\3\33\3\33\3\33\3\33\3"+
		"\33\7\33\u0138\n\33\f\33\16\33\u013b\13\33\3\34\3\34\3\34\3\34\3\35\3"+
		"\35\3\35\3\35\3\35\5\35\u0146\n\35\3\36\3\36\3\37\3\37\5\37\u014c\n\37"+
		"\3 \3 \3 \3 \3 \7 \u0153\n \f \16 \u0156\13 \3!\3!\3\"\3\"\3\"\3\"\3\""+
		"\7\"\u015f\n\"\f\"\16\"\u0162\13\"\3#\3#\3#\3#\3#\3$\3$\3%\3%\3%\3%\3"+
		"&\3&\3&\5&\u0172\n&\3\'\3\'\5\'\u0176\n\'\3(\3(\3(\3(\3(\7(\u017d\n(\f"+
		"(\16(\u0180\13(\3)\3)\3)\3*\3*\3*\3*\5*\u0189\n*\3+\3+\5+\u018d\n+\3,"+
		"\3,\3,\3,\3,\7,\u0194\n,\f,\16,\u0197\13,\3-\3-\3-\3.\3.\3.\3/\3/\5/\u01a1"+
		"\n/\3\60\3\60\3\60\3\60\3\60\7\60\u01a8\n\60\f\60\16\60\u01ab\13\60\3"+
		"\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3"+
		"\61\3\61\3\61\3\61\3\61\5\61\u01c0\n\61\3\62\3\62\3\62\5\62\u01c5\n\62"+
		"\3\63\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3\65\3\65\5\65\u01d1\n\65\3\66"+
		"\3\66\3\66\3\66\3\66\7\66\u01d8\n\66\f\66\16\66\u01db\13\66\3\67\3\67"+
		"\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\5\67\u01e8\n\67\38\38\3"+
		"8\58\u01ed\n8\39\39\59\u01f1\n9\3:\3:\5:\u01f5\n:\3;\3;\3;\3;\3;\7;\u01fc"+
		"\n;\f;\16;\u01ff\13;\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\5<\u020f"+
		"\n<\3=\3=\5=\u0213\n=\3>\3>\3>\5>\u0218\n>\3?\3?\3?\5?\u021d\n?\3@\3@"+
		"\3@\3@\7@\u0223\n@\f@\16@\u0226\13@\3@\3@\3@\3A\3A\3A\5A\u022e\nA\3B\3"+
		"B\3B\3B\3B\5B\u0235\nB\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3"+
		"C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\5C\u0259\nC\3"+
		"D\3D\3D\3D\3D\3D\3D\3D\3D\5D\u0264\nD\3E\3E\3E\3F\3F\5F\u026b\nF\3G\3"+
		"G\3H\3H\3H\3I\3I\3I\3I\3I\5I\u0277\nI\3J\3J\3J\7J\u027c\nJ\fJ\16J\u027f"+
		"\13J\3K\3K\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\5L\u0293\n"+
		"L\3M\3M\3M\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\3"+
		"N\3N\3N\3N\3N\3N\5N\u02b1\nN\3O\3O\3O\5O\u02b6\nO\3P\3P\3Q\3Q\3R\3R\3"+
		"R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\5R\u02ca\nR\3S\3S\3S\3T\3T\5T\u02d1"+
		"\nT\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\5U\u02e7"+
		"\nU\3V\3V\3V\3V\5V\u02ed\nV\3W\3W\3W\3W\3X\3X\3Y\3Y\3Y\3Y\3Y\7Y\u02fa"+
		"\nY\fY\16Y\u02fd\13Y\3Z\3Z\3Z\3Z\3Z\3Z\5Z\u0305\nZ\3[\3[\3[\3[\3[\3[\5"+
		"[\u030d\n[\3\\\3\\\3\\\3\\\3]\3]\3]\5]\u0316\n]\3^\3^\3^\3^\3^\7^\u031d"+
		"\n^\f^\16^\u0320\13^\3_\3_\5_\u0324\n_\3`\3`\3`\3`\3`\3`\5`\u032c\n`\3"+
		"`\2\17\36$\64>BNV^jt\u0092\u00b0\u00baa\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080"+
		"\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098"+
		"\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0"+
		"\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\2\3\3\2\60@\2\u0327\2\u00c0"+
		"\3\2\2\2\4\u00c8\3\2\2\2\6\u00cb\3\2\2\2\b\u00ce\3\2\2\2\n\u00d0\3\2\2"+
		"\2\f\u00d3\3\2\2\2\16\u00d5\3\2\2\2\20\u00dd\3\2\2\2\22\u00e7\3\2\2\2"+
		"\24\u00e9\3\2\2\2\26\u00ec\3\2\2\2\30\u00f0\3\2\2\2\32\u00f2\3\2\2\2\34"+
		"\u00f5\3\2\2\2\36\u00f7\3\2\2\2 \u0101\3\2\2\2\"\u0104\3\2\2\2$\u0106"+
		"\3\2\2\2&\u0110\3\2\2\2(\u0114\3\2\2\2*\u0116\3\2\2\2,\u0119\3\2\2\2."+
		"\u0120\3\2\2\2\60\u012c\3\2\2\2\62\u0130\3\2\2\2\64\u0132\3\2\2\2\66\u013c"+
		"\3\2\2\28\u0145\3\2\2\2:\u0147\3\2\2\2<\u014b\3\2\2\2>\u014d\3\2\2\2@"+
		"\u0157\3\2\2\2B\u0159\3\2\2\2D\u0163\3\2\2\2F\u0168\3\2\2\2H\u016a\3\2"+
		"\2\2J\u0171\3\2\2\2L\u0175\3\2\2\2N\u0177\3\2\2\2P\u0181\3\2\2\2R\u0188"+
		"\3\2\2\2T\u018c\3\2\2\2V\u018e\3\2\2\2X\u0198\3\2\2\2Z\u019b\3\2\2\2\\"+
		"\u01a0\3\2\2\2^\u01a2\3\2\2\2`\u01bf\3\2\2\2b\u01c4\3\2\2\2d\u01c6\3\2"+
		"\2\2f\u01cb\3\2\2\2h\u01d0\3\2\2\2j\u01d2\3\2\2\2l\u01e7\3\2\2\2n\u01ec"+
		"\3\2\2\2p\u01f0\3\2\2\2r\u01f4\3\2\2\2t\u01f6\3\2\2\2v\u020e\3\2\2\2x"+
		"\u0212\3\2\2\2z\u0217\3\2\2\2|\u021c\3\2\2\2~\u021e\3\2\2\2\u0080\u022d"+
		"\3\2\2\2\u0082\u0234\3\2\2\2\u0084\u0258\3\2\2\2\u0086\u0263\3\2\2\2\u0088"+
		"\u0265\3\2\2\2\u008a\u026a\3\2\2\2\u008c\u026c\3\2\2\2\u008e\u026e\3\2"+
		"\2\2\u0090\u0276\3\2\2\2\u0092\u0278\3\2\2\2\u0094\u0280\3\2\2\2\u0096"+
		"\u0292\3\2\2\2\u0098\u0294\3\2\2\2\u009a\u02b0\3\2\2\2\u009c\u02b5\3\2"+
		"\2\2\u009e\u02b7\3\2\2\2\u00a0\u02b9\3\2\2\2\u00a2\u02c9\3\2\2\2\u00a4"+
		"\u02cb\3\2\2\2\u00a6\u02d0\3\2\2\2\u00a8\u02e6\3\2\2\2\u00aa\u02ec\3\2"+
		"\2\2\u00ac\u02ee\3\2\2\2\u00ae\u02f2\3\2\2\2\u00b0\u02f4\3\2\2\2\u00b2"+
		"\u0304\3\2\2\2\u00b4\u030c\3\2\2\2\u00b6\u030e\3\2\2\2\u00b8\u0315\3\2"+
		"\2\2\u00ba\u0317\3\2\2\2\u00bc\u0323\3\2\2\2\u00be\u032b\3\2\2\2\u00c0"+
		"\u00c2\5\4\3\2\u00c1\u00c3\5~@\2\u00c2\u00c1\3\2\2\2\u00c3\u00c4\3\2\2"+
		"\2\u00c4\u00c2\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c7"+
		"\7\2\2\3\u00c7\3\3\2\2\2\u00c8\u00c9\5\22\n\2\u00c9\u00ca\5\32\16\2\u00ca"+
		"\5\3\2\2\2\u00cb\u00cc\7\31\2\2\u00cc\u00cd\5\b\5\2\u00cd\7\3\2\2\2\u00ce"+
		"\u00cf\7F\2\2\u00cf\t\3\2\2\2\u00d0\u00d1\7\t\2\2\u00d1\u00d2\5\f\7\2"+
		"\u00d2\13\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\r\3\2\2\2\u00d5\u00d6\7\5"+
		"\2\2\u00d6\u00d7\7I\2\2\u00d7\17\3\2\2\2\u00d8\u00d9\7\23\2\2\u00d9\u00de"+
		"\7F\2\2\u00da\u00db\7\23\2\2\u00db\u00de\7E\2\2\u00dc\u00de\3\2\2\2\u00dd"+
		"\u00d8\3\2\2\2\u00dd\u00da\3\2\2\2\u00dd\u00dc\3\2\2\2\u00de\21\3\2\2"+
		"\2\u00df\u00e0\7\b\2\2\u00e0\u00e1\5\24\13\2\u00e1\u00e2\7E\2\2\u00e2"+
		"\u00e8\3\2\2\2\u00e3\u00e4\7\16\2\2\u00e4\u00e5\5\24\13\2\u00e5\u00e6"+
		"\7E\2\2\u00e6\u00e8\3\2\2\2\u00e7\u00df\3\2\2\2\u00e7\u00e3\3\2\2\2\u00e8"+
		"\23\3\2\2\2\u00e9\u00ea\5\26\f\2\u00ea\25\3\2\2\2\u00eb\u00ed\5\30\r\2"+
		"\u00ec\u00eb\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ee\u00ef"+
		"\3\2\2\2\u00ef\27\3\2\2\2\u00f0\u00f1\t\2\2\2\u00f1\31\3\2\2\2\u00f2\u00f3"+
		"\7\24\2\2\u00f3\u00f4\7E\2\2\u00f4\33\3\2\2\2\u00f5\u00f6\5\36\20\2\u00f6"+
		"\35\3\2\2\2\u00f7\u00f8\b\20\1\2\u00f8\u00f9\5 \21\2\u00f9\u00fe\3\2\2"+
		"\2\u00fa\u00fb\f\4\2\2\u00fb\u00fd\5 \21\2\u00fc\u00fa\3\2\2\2\u00fd\u0100"+
		"\3\2\2\2\u00fe\u00fc\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff\37\3\2\2\2\u0100"+
		"\u00fe\3\2\2\2\u0101\u0102\7\f\2\2\u0102\u0103\7E\2\2\u0103!\3\2\2\2\u0104"+
		"\u0105\5$\23\2\u0105#\3\2\2\2\u0106\u0107\b\23\1\2\u0107\u0108\5&\24\2"+
		"\u0108\u010d\3\2\2\2\u0109\u010a\f\4\2\2\u010a\u010c\5&\24\2\u010b\u0109"+
		"\3\2\2\2\u010c\u010f\3\2\2\2\u010d\u010b\3\2\2\2\u010d\u010e\3\2\2\2\u010e"+
		"%\3\2\2\2\u010f\u010d\3\2\2\2\u0110\u0111\5,\27\2\u0111\u0112\5\62\32"+
		"\2\u0112\u0113\5(\25\2\u0113\'\3\2\2\2\u0114\u0115\5*\26\2\u0115)\3\2"+
		"\2\2\u0116\u0117\7\n\2\2\u0117\u0118\7;\2\2\u0118+\3\2\2\2\u0119\u011a"+
		"\7\4\2\2\u011a\u011b\5.\30\2\u011b-\3\2\2\2\u011c\u011d\7)\2\2\u011d\u0121"+
		"\7E\2\2\u011e\u011f\7*\2\2\u011f\u0121\7E\2\2\u0120\u011c\3\2\2\2\u0120"+
		"\u011e\3\2\2\2\u0121/\3\2\2\2\u0122\u0123\7)\2\2\u0123\u012d\7E\2\2\u0124"+
		"\u0125\7*\2\2\u0125\u012d\7E\2\2\u0126\u0127\7+\2\2\u0127\u0128\7H\2\2"+
		"\u0128\u012d\7E\2\2\u0129\u012a\7,\2\2\u012a\u012b\7H\2\2\u012b\u012d"+
		"\7E\2\2\u012c\u0122\3\2\2\2\u012c\u0124\3\2\2\2\u012c\u0126\3\2\2\2\u012c"+
		"\u0129\3\2\2\2\u012d\61\3\2\2\2\u012e\u0131\5\64\33\2\u012f\u0131\3\2"+
		"\2\2\u0130\u012e\3\2\2\2\u0130\u012f\3\2\2\2\u0131\63\3\2\2\2\u0132\u0133"+
		"\b\33\1\2\u0133\u0134\5\66\34\2\u0134\u0139\3\2\2\2\u0135\u0136\f\4\2"+
		"\2\u0136\u0138\5\66\34\2\u0137\u0135\3\2\2\2\u0138\u013b\3\2\2\2\u0139"+
		"\u0137\3\2\2\2\u0139\u013a\3\2\2\2\u013a\65\3\2\2\2\u013b\u0139\3\2\2"+
		"\2\u013c\u013d\58\35\2\u013d\u013e\7B\2\2\u013e\u013f\5<\37\2\u013f\67"+
		"\3\2\2\2\u0140\u0141\7E\2\2\u0141\u0146\7E\2\2\u0142\u0143\7E\2\2\u0143"+
		"\u0144\7E\2\2\u0144\u0146\7E\2\2\u0145\u0140\3\2\2\2\u0145\u0142\3\2\2"+
		"\2\u01469\3\2\2\2\u0147\u0148\7/\2\2\u0148;\3\2\2\2\u0149\u014c\5> \2"+
		"\u014a\u014c\5B\"\2\u014b\u0149\3\2\2\2\u014b\u014a\3\2\2\2\u014c=\3\2"+
		"\2\2\u014d\u014e\b \1\2\u014e\u014f\5@!\2\u014f\u0154\3\2\2\2\u0150\u0151"+
		"\f\4\2\2\u0151\u0153\5@!\2\u0152\u0150\3\2\2\2\u0153\u0156\3\2\2\2\u0154"+
		"\u0152\3\2\2\2\u0154\u0155\3\2\2\2\u0155?\3\2\2\2\u0156\u0154\3\2\2\2"+
		"\u0157\u0158\5p9\2\u0158A\3\2\2\2\u0159\u015a\b\"\1\2\u015a\u015b\5D#"+
		"\2\u015b\u0160\3\2\2\2\u015c\u015d\f\4\2\2\u015d\u015f\5D#\2\u015e\u015c"+
		"\3\2\2\2\u015f\u0162\3\2\2\2\u0160\u015e\3\2\2\2\u0160\u0161\3\2\2\2\u0161"+
		"C\3\2\2\2\u0162\u0160\3\2\2\2\u0163\u0164\7\4\2\2\u0164\u0165\5F$\2\u0165"+
		"\u0166\5\62\32\2\u0166\u0167\5(\25\2\u0167E\3\2\2\2\u0168\u0169\3\2\2"+
		"\2\u0169G\3\2\2\2\u016a\u016b\5J&\2\u016b\u016c\7B\2\2\u016c\u016d\5<"+
		"\37\2\u016dI\3\2\2\2\u016e\u0172\7E\2\2\u016f\u0170\7E\2\2\u0170\u0172"+
		"\7E\2\2\u0171\u016e\3\2\2\2\u0171\u016f\3\2\2\2\u0172K\3\2\2\2\u0173\u0176"+
		"\5N(\2\u0174\u0176\3\2\2\2\u0175\u0173\3\2\2\2\u0175\u0174\3\2\2\2\u0176"+
		"M\3\2\2\2\u0177\u0178\b(\1\2\u0178\u0179\5P)\2\u0179\u017e\3\2\2\2\u017a"+
		"\u017b\f\4\2\2\u017b\u017d\5P)\2\u017c\u017a\3\2\2\2\u017d\u0180\3\2\2"+
		"\2\u017e\u017c\3\2\2\2\u017e\u017f\3\2\2\2\u017fO\3\2\2\2\u0180\u017e"+
		"\3\2\2\2\u0181\u0182\7\27\2\2\u0182\u0183\7F\2\2\u0183Q\3\2\2\2\u0184"+
		"\u0185\7\30\2\2\u0185\u0186\7\35\2\2\u0186\u0189\7E\2\2\u0187\u0189\3"+
		"\2\2\2\u0188\u0184\3\2\2\2\u0188\u0187\3\2\2\2\u0189S\3\2\2\2\u018a\u018d"+
		"\5V,\2\u018b\u018d\3\2\2\2\u018c\u018a\3\2\2\2\u018c\u018b\3\2\2\2\u018d"+
		"U\3\2\2\2\u018e\u018f\b,\1\2\u018f\u0190\5X-\2\u0190\u0195\3\2\2\2\u0191"+
		"\u0192\f\4\2\2\u0192\u0194\5X-\2\u0193\u0191\3\2\2\2\u0194\u0197\3\2\2"+
		"\2\u0195\u0193\3\2\2\2\u0195\u0196\3\2\2\2\u0196W\3\2\2\2\u0197\u0195"+
		"\3\2\2\2\u0198\u0199\7\6\2\2\u0199\u019a\5Z.\2\u019aY\3\2\2\2\u019b\u019c"+
		"\7E\2\2\u019c\u019d\7F\2\2\u019d[\3\2\2\2\u019e\u01a1\5^\60\2\u019f\u01a1"+
		"\3\2\2\2\u01a0\u019e\3\2\2\2\u01a0\u019f\3\2\2\2\u01a1]\3\2\2\2\u01a2"+
		"\u01a3\b\60\1\2\u01a3\u01a4\5`\61\2\u01a4\u01a9\3\2\2\2\u01a5\u01a6\f"+
		"\4\2\2\u01a6\u01a8\5`\61\2\u01a7\u01a5\3\2\2\2\u01a8\u01ab\3\2\2\2\u01a9"+
		"\u01a7\3\2\2\2\u01a9\u01aa\3\2\2\2\u01aa_\3\2\2\2\u01ab\u01a9\3\2\2\2"+
		"\u01ac\u01ad\7\13\2\2\u01ad\u01ae\5\24\13\2\u01ae\u01af\7E\2\2\u01af\u01b0"+
		"\7E\2\2\u01b0\u01b1\7!\2\2\u01b1\u01b2\7F\2\2\u01b2\u01b3\5b\62\2\u01b3"+
		"\u01c0\3\2\2\2\u01b4\u01b5\7\13\2\2\u01b5\u01b6\5\24\13\2\u01b6\u01b7"+
		"\7E\2\2\u01b7\u01b8\7E\2\2\u01b8\u01b9\5b\62\2\u01b9\u01c0\3\2\2\2\u01ba"+
		"\u01bb\7\13\2\2\u01bb\u01bc\5d\63\2\u01bc\u01bd\5h\65\2\u01bd\u01be\5"+
		"f\64\2\u01be\u01c0\3\2\2\2\u01bf\u01ac\3\2\2\2\u01bf\u01b4\3\2\2\2\u01bf"+
		"\u01ba\3\2\2\2\u01c0a\3\2\2\2\u01c1\u01c2\7B\2\2\u01c2\u01c5\5n8\2\u01c3"+
		"\u01c5\3\2\2\2\u01c4\u01c1\3\2\2\2\u01c4\u01c3\3\2\2\2\u01c5c\3\2\2\2"+
		"\u01c6\u01c7\5\24\13\2\u01c7\u01c8\7E\2\2\u01c8\u01c9\7E\2\2\u01c9\u01ca"+
		"\5b\62\2\u01cae\3\2\2\2\u01cb\u01cc\7\n\2\2\u01cc\u01cd\7\33\2\2\u01cd"+
		"g\3\2\2\2\u01ce\u01d1\5j\66\2\u01cf\u01d1\3\2\2\2\u01d0\u01ce\3\2\2\2"+
		"\u01d0\u01cf\3\2\2\2\u01d1i\3\2\2\2\u01d2\u01d3\b\66\1\2\u01d3\u01d4\5"+
		"l\67\2\u01d4\u01d9\3\2\2\2\u01d5\u01d6\f\4\2\2\u01d6\u01d8\5l\67\2\u01d7"+
		"\u01d5\3\2\2\2\u01d8\u01db\3\2\2\2\u01d9\u01d7\3\2\2\2\u01d9\u01da\3\2"+
		"\2\2\u01dak\3\2\2\2\u01db\u01d9\3\2\2\2\u01dc\u01dd\7\31\2\2\u01dd\u01e8"+
		"\5\b\5\2\u01de\u01df\7\6\2\2\u01df\u01e8\5Z.\2\u01e0\u01e1\7\t\2\2\u01e1"+
		"\u01e8\5\f\7\2\u01e2\u01e3\7\4\2\2\u01e3\u01e4\5.\30\2\u01e4\u01e5\5\62"+
		"\32\2\u01e5\u01e6\5(\25\2\u01e6\u01e8\3\2\2\2\u01e7\u01dc\3\2\2\2\u01e7"+
		"\u01de\3\2\2\2\u01e7\u01e0\3\2\2\2\u01e7\u01e2\3\2\2\2\u01e8m\3\2\2\2"+
		"\u01e9\u01ed\7H\2\2\u01ea\u01ed\7I\2\2\u01eb\u01ed\7F\2\2\u01ec\u01e9"+
		"\3\2\2\2\u01ec\u01ea\3\2\2\2\u01ec\u01eb\3\2\2\2\u01edo\3\2\2\2\u01ee"+
		"\u01f1\7E\2\2\u01ef\u01f1\5n8\2\u01f0\u01ee\3\2\2\2\u01f0\u01ef\3\2\2"+
		"\2\u01f1q\3\2\2\2\u01f2\u01f5\5t;\2\u01f3\u01f5\3\2\2\2\u01f4\u01f2\3"+
		"\2\2\2\u01f4\u01f3\3\2\2\2\u01f5s\3\2\2\2\u01f6\u01f7\b;\1\2\u01f7\u01f8"+
		"\5v<\2\u01f8\u01fd\3\2\2\2\u01f9\u01fa\f\4\2\2\u01fa\u01fc\5v<\2\u01fb"+
		"\u01f9\3\2\2\2\u01fc\u01ff\3\2\2\2\u01fd\u01fb\3\2\2\2\u01fd\u01fe\3\2"+
		"\2\2\u01feu\3\2\2\2\u01ff\u01fd\3\2\2\2\u0200\u0201\7\r\2\2\u0201\u0202"+
		"\7(\2\2\u0202\u0203\5\24\13\2\u0203\u0204\5x=\2\u0204\u0205\5z>\2\u0205"+
		"\u0206\5|?\2\u0206\u020f\3\2\2\2\u0207\u0208\7\r\2\2\u0208\u0209\79\2"+
		"\2\u0209\u020a\5\24\13\2\u020a\u020b\5x=\2\u020b\u020c\5z>\2\u020c\u020d"+
		"\5|?\2\u020d\u020f\3\2\2\2\u020e\u0200\3\2\2\2\u020e\u0207\3\2\2\2\u020f"+
		"w\3\2\2\2\u0210\u0213\7E\2\2\u0211\u0213\3\2\2\2\u0212\u0210\3\2\2\2\u0212"+
		"\u0211\3\2\2\2\u0213y\3\2\2\2\u0214\u0215\7&\2\2\u0215\u0218\7E\2\2\u0216"+
		"\u0218\3\2\2\2\u0217\u0214\3\2\2\2\u0217\u0216\3\2\2\2\u0218{\3\2\2\2"+
		"\u0219\u021a\7\'\2\2\u021a\u021d\7E\2\2\u021b\u021d\3\2\2\2\u021c\u0219"+
		"\3\2\2\2\u021c\u021b\3\2\2\2\u021d}\3\2\2\2\u021e\u021f\7\21\2\2\u021f"+
		"\u0220\5\24\13\2\u0220\u0224\7E\2\2\u0221\u0223\5\u0080A\2\u0222\u0221"+
		"\3\2\2\2\u0223\u0226\3\2\2\2\u0224\u0222\3\2\2\2\u0224\u0225\3\2\2\2\u0225"+
		"\u0227\3\2\2\2\u0226\u0224\3\2\2\2\u0227\u0228\7\n\2\2\u0228\u0229\7\35"+
		"\2\2\u0229\177\3\2\2\2\u022a\u022e\5\u00a6T\2\u022b\u022e\5\u0084C\2\u022c"+
		"\u022e\5\u0082B\2\u022d\u022a\3\2\2\2\u022d\u022b\3\2\2\2\u022d\u022c"+
		"\3\2\2\2\u022e\u0081\3\2\2\2\u022f\u0230\7E\2\2\u0230\u0235\7A\2\2\u0231"+
		"\u0232\7H\2\2\u0232\u0233\7A\2\2\u0233\u0235\5\u00a6T\2\u0234\u022f\3"+
		"\2\2\2\u0234\u0231\3\2\2\2\u0235\u0083\3\2\2\2\u0236\u0237\7\26\2\2\u0237"+
		"\u0259\5\u009aN\2\u0238\u0239\7\17\2\2\u0239\u023a\7$\2\2\u023a\u0259"+
		"\7H\2\2\u023b\u023c\7\17\2\2\u023c\u023d\7\"\2\2\u023d\u0259\7H\2\2\u023e"+
		"\u023f\7\20\2\2\u023f\u0259\5\u009eP\2\u0240\u0241\7\25\2\2\u0241\u0259"+
		"\5\u00a0Q\2\u0242\u0243\7\7\2\2\u0243\u0259\5\u00a2R\2\u0244\u0245\7\22"+
		"\2\2\u0245\u0259\5\u00a4S\2\u0246\u0247\7\31\2\2\u0247\u0259\5\b\5\2\u0248"+
		"\u0249\7\6\2\2\u0249\u0259\5Z.\2\u024a\u024b\7\t\2\2\u024b\u0259\5\f\7"+
		"\2\u024c\u024d\7\4\2\2\u024d\u024e\5\60\31\2\u024e\u024f\5\62\32\2\u024f"+
		"\u0250\5*\26\2\u0250\u0259\3\2\2\2\u0251\u0252\7\4\2\2\u0252\u0253\5:"+
		"\36\2\u0253\u0254\5H%\2\u0254\u0255\5*\26\2\u0255\u0259\3\2\2\2\u0256"+
		"\u0257\7\32\2\2\u0257\u0259\5\u0086D\2\u0258\u0236\3\2\2\2\u0258\u0238"+
		"\3\2\2\2\u0258\u023b\3\2\2\2\u0258\u023e\3\2\2\2\u0258\u0240\3\2\2\2\u0258"+
		"\u0242\3\2\2\2\u0258\u0244\3\2\2\2\u0258\u0246\3\2\2\2\u0258\u0248\3\2"+
		"\2\2\u0258\u024a\3\2\2\2\u0258\u024c\3\2\2\2\u0258\u0251\3\2\2\2\u0258"+
		"\u0256\3\2\2\2\u0259\u0085\3\2\2\2\u025a\u025b\5\u008cG\2\u025b\u025c"+
		"\5\u008eH\2\u025c\u025d\5\u0098M\2\u025d\u0264\3\2\2\2\u025e\u025f\7%"+
		"\2\2\u025f\u0260\5\u0088E\2\u0260\u0261\5\u008eH\2\u0261\u0262\5\u0098"+
		"M\2\u0262\u0264\3\2\2\2\u0263\u025a\3\2\2\2\u0263\u025e\3\2\2\2\u0264"+
		"\u0087\3\2\2\2\u0265\u0266\5\u008aF\2\u0266\u0267\7$\2\2\u0267\u0089\3"+
		"\2\2\2\u0268\u026b\7H\2\2\u0269\u026b\3\2\2\2\u026a\u0268\3\2\2\2\u026a"+
		"\u0269\3\2\2\2\u026b\u008b\3\2\2\2\u026c\u026d\3\2\2\2\u026d\u008d\3\2"+
		"\2\2\u026e\u026f\5\u0090I\2\u026f\u0270\5\u0092J\2\u0270\u008f\3\2\2\2"+
		"\u0271\u0272\7#\2\2\u0272\u0277\7H\2\2\u0273\u0274\7#\2\2\u0274\u0277"+
		"\7E\2\2\u0275\u0277\3\2\2\2\u0276\u0271\3\2\2\2\u0276\u0273\3\2\2\2\u0276"+
		"\u0275\3\2\2\2\u0277\u0091\3\2\2\2\u0278\u027d\bJ\1\2\u0279\u027a\f\4"+
		"\2\2\u027a\u027c\5\u0094K\2\u027b\u0279\3\2\2\2\u027c\u027f\3\2\2\2\u027d"+
		"\u027b\3\2\2\2\u027d\u027e\3\2\2\2\u027e\u0093\3\2\2\2\u027f\u027d\3\2"+
		"\2\2\u0280\u0281\5\u0096L\2\u0281\u0095\3\2\2\2\u0282\u0283\7$\2\2\u0283"+
		"\u0293\7E\2\2\u0284\u0285\7$\2\2\u0285\u0286\7E\2\2\u0286\u0293\7E\2\2"+
		"\u0287\u0288\7$\2\2\u0288\u0289\7E\2\2\u0289\u0293\7H\2\2\u028a\u028b"+
		"\7\"\2\2\u028b\u0293\7E\2\2\u028c\u028d\7\"\2\2\u028d\u028e\7E\2\2\u028e"+
		"\u0293\7E\2\2\u028f\u0290\7\"\2\2\u0290\u0291\7E\2\2\u0291\u0293\7H\2"+
		"\2\u0292\u0282\3\2\2\2\u0292\u0284\3\2\2\2\u0292\u0287\3\2\2\2\u0292\u028a"+
		"\3\2\2\2\u0292\u028c\3\2\2\2\u0292\u028f\3\2\2\2\u0293\u0097\3\2\2\2\u0294"+
		"\u0295\7\n\2\2\u0295\u0296\7\"\2\2\u0296\u0099\3\2\2\2\u0297\u0298\7H"+
		"\2\2\u0298\u0299\7\37\2\2\u0299\u029a\7E\2\2\u029a\u029b\7E\2\2\u029b"+
		"\u029c\5\u009cO\2\u029c\u029d\7\34\2\2\u029d\u029e\7E\2\2\u029e\u029f"+
		"\7\36\2\2\u029f\u02a0\7E\2\2\u02a0\u02b1\3\2\2\2\u02a1\u02a2\7H\2\2\u02a2"+
		"\u02a3\7\37\2\2\u02a3\u02a4\7E\2\2\u02a4\u02a5\7E\2\2\u02a5\u02b1\5\u009c"+
		"O\2\u02a6\u02a7\7H\2\2\u02a7\u02a8\7\37\2\2\u02a8\u02a9\7E\2\2\u02a9\u02aa"+
		"\7E\2\2\u02aa\u02ab\5\u009cO\2\u02ab\u02ac\7\34\2\2\u02ac\u02ad\7H\2\2"+
		"\u02ad\u02ae\7\36\2\2\u02ae\u02af\7H\2\2\u02af\u02b1\3\2\2\2\u02b0\u0297"+
		"\3\2\2\2\u02b0\u02a1\3\2\2\2\u02b0\u02a6\3\2\2\2\u02b1\u009b\3\2\2\2\u02b2"+
		"\u02b3\7!\2\2\u02b3\u02b6\7F\2\2\u02b4\u02b6\3\2\2\2\u02b5\u02b2\3\2\2"+
		"\2\u02b5\u02b4\3\2\2\2\u02b6\u009d\3\2\2\2\u02b7\u02b8\7H\2\2\u02b8\u009f"+
		"\3\2\2\2\u02b9\u02ba\7E\2\2\u02ba\u00a1\3\2\2\2\u02bb\u02bc\7E\2\2\u02bc"+
		"\u02bd\7\34\2\2\u02bd\u02be\7E\2\2\u02be\u02bf\7\36\2\2\u02bf\u02c0\7"+
		"E\2\2\u02c0\u02c1\7 \2\2\u02c1\u02ca\7E\2\2\u02c2\u02c3\7E\2\2\u02c3\u02c4"+
		"\7\34\2\2\u02c4\u02c5\7H\2\2\u02c5\u02c6\7\36\2\2\u02c6\u02c7\7H\2\2\u02c7"+
		"\u02c8\7 \2\2\u02c8\u02ca\7H\2\2\u02c9\u02bb\3\2\2\2\u02c9\u02c2\3\2\2"+
		"\2\u02ca\u00a3\3\2\2\2\u02cb\u02cc\7E\2\2\u02cc\u02cd\5p9\2\u02cd\u00a5"+
		"\3\2\2\2\u02ce\u02d1\5\u00a8U\2\u02cf\u02d1\5\u00aaV\2\u02d0\u02ce\3\2"+
		"\2\2\u02d0\u02cf\3\2\2\2\u02d1\u00a7\3\2\2\2\u02d2\u02e7\7\3\2\2\u02d3"+
		"\u02d4\7\3\2\2\u02d4\u02e7\7H\2\2\u02d5\u02d6\7\3\2\2\u02d6\u02d7\7H\2"+
		"\2\u02d7\u02e7\7H\2\2\u02d8\u02d9\7\3\2\2\u02d9\u02e7\7I\2\2\u02da\u02db"+
		"\7\3\2\2\u02db\u02e7\7E\2\2\u02dc\u02dd\7\3\2\2\u02dd\u02de\7E\2\2\u02de"+
		"\u02e7\7H\2\2\u02df\u02e0\7\3\2\2\u02e0\u02e1\7E\2\2\u02e1\u02e7\7E\2"+
		"\2\u02e2\u02e3\7\3\2\2\u02e3\u02e7\7F\2\2\u02e4\u02e5\7\3\2\2\u02e5\u02e7"+
		"\7G\2\2\u02e6\u02d2\3\2\2\2\u02e6\u02d3\3\2\2\2\u02e6\u02d5\3\2\2\2\u02e6"+
		"\u02d8\3\2\2\2\u02e6\u02da\3\2\2\2\u02e6\u02dc\3\2\2\2\u02e6\u02df\3\2"+
		"\2\2\u02e6\u02e2\3\2\2\2\u02e6\u02e4\3\2\2\2\u02e7\u00a9\3\2\2\2\u02e8"+
		"\u02e9\7.\2\2\u02e9\u02ed\5\u00acW\2\u02ea\u02eb\7-\2\2\u02eb\u02ed\5"+
		"\u00b6\\\2\u02ec\u02e8\3\2\2\2\u02ec\u02ea\3\2\2\2\u02ed\u00ab\3\2\2\2"+
		"\u02ee\u02ef\5\u00aeX\2\u02ef\u02f0\5\u00b0Y\2\u02f0\u02f1\5\u00b4[\2"+
		"\u02f1\u00ad\3\2\2\2\u02f2\u02f3\3\2\2\2\u02f3\u00af\3\2\2\2\u02f4\u02f5"+
		"\bY\1\2\u02f5\u02f6\5\u00b2Z\2\u02f6\u02fb\3\2\2\2\u02f7\u02f8\f\4\2\2"+
		"\u02f8\u02fa\5\u00b2Z\2\u02f9\u02f7\3\2\2\2\u02fa\u02fd\3\2\2\2\u02fb"+
		"\u02f9\3\2\2\2\u02fb\u02fc\3\2\2\2\u02fc\u00b1\3\2\2\2\u02fd\u02fb\3\2"+
		"\2\2\u02fe\u02ff\7H\2\2\u02ff\u0300\7A\2\2\u0300\u0305\7E\2\2\u0301\u0302"+
		"\7H\2\2\u0302\u0303\7A\2\2\u0303\u0305\7H\2\2\u0304\u02fe\3\2\2\2\u0304"+
		"\u0301\3\2\2\2\u0305\u00b3\3\2\2\2\u0306\u0307\7/\2\2\u0307\u0308\7A\2"+
		"\2\u0308\u030d\7E\2\2\u0309\u030a\7/\2\2\u030a\u030b\7A\2\2\u030b\u030d"+
		"\7H\2\2\u030c\u0306\3\2\2\2\u030c\u0309\3\2\2\2\u030d\u00b5\3\2\2\2\u030e"+
		"\u030f\5\u00b8]\2\u030f\u0310\5\u00ba^\2\u0310\u0311\5\u00be`\2\u0311"+
		"\u00b7\3\2\2\2\u0312\u0316\7H\2\2\u0313\u0314\7H\2\2\u0314\u0316\7H\2"+
		"\2\u0315\u0312\3\2\2\2\u0315\u0313\3\2\2\2\u0316\u00b9\3\2\2\2\u0317\u0318"+
		"\b^\1\2\u0318\u0319\5\u00bc_\2\u0319\u031e\3\2\2\2\u031a\u031b\f\4\2\2"+
		"\u031b\u031d\5\u00bc_\2\u031c\u031a\3\2\2\2\u031d\u0320\3\2\2\2\u031e"+
		"\u031c\3\2\2\2\u031e\u031f\3\2\2\2\u031f\u00bb\3\2\2\2\u0320\u031e\3\2"+
		"\2\2\u0321\u0324\7E\2\2\u0322\u0324\7H\2\2\u0323\u0321\3\2\2\2\u0323\u0322"+
		"\3\2\2\2\u0324\u00bd\3\2\2\2\u0325\u0326\7/\2\2\u0326\u0327\7A\2\2\u0327"+
		"\u032c\7E\2\2\u0328\u0329\7/\2\2\u0329\u032a\7A\2\2\u032a\u032c\7H\2\2"+
		"\u032b\u0325\3\2\2\2\u032b\u0328\3\2\2\2\u032c\u00bf\3\2\2\2;\u00c4\u00dd"+
		"\u00e7\u00ee\u00fe\u010d\u0120\u012c\u0130\u0139\u0145\u014b\u0154\u0160"+
		"\u0171\u0175\u017e\u0188\u018c\u0195\u01a0\u01a9\u01bf\u01c4\u01d0\u01d9"+
		"\u01e7\u01ec\u01f0\u01f4\u01fd\u020e\u0212\u0217\u021c\u0224\u022d\u0234"+
		"\u0258\u0263\u026a\u0276\u027d\u0292\u02b0\u02b5\u02c9\u02d0\u02e6\u02ec"+
		"\u02fb\u0304\u030c\u0315\u031e\u0323\u032b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}