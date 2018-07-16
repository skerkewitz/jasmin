// Generated from C:/Users/stefa/IdeaProjects/jasmin/src/main/java/jasmin/antlr4\Jasmin.g4 by ANTLR 4.7
package jasmin.antlr4;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link JasminParser}.
 */
public interface JasminListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link JasminParser#compilation_unit}.
	 * @param ctx the parse tree
	 */
	void enterCompilation_unit(JasminParser.Compilation_unitContext ctx);
	/**
	 * Exit a parse tree produced by {@link JasminParser#compilation_unit}.
	 * @param ctx the parse tree
	 */
	void exitCompilation_unit(JasminParser.Compilation_unitContext ctx);
	/**
	 * Enter a parse tree produced by {@link JasminParser#jasmin_header}.
	 * @param ctx the parse tree
	 */
	void enterJasmin_header(JasminParser.Jasmin_headerContext ctx);
	/**
	 * Exit a parse tree produced by {@link JasminParser#jasmin_header}.
	 * @param ctx the parse tree
	 */
	void exitJasmin_header(JasminParser.Jasmin_headerContext ctx);
	/**
	 * Enter a parse tree produced by {@link JasminParser#signature_spec}.
	 * @param ctx the parse tree
	 */
	void enterSignature_spec(JasminParser.Signature_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link JasminParser#signature_spec}.
	 * @param ctx the parse tree
	 */
	void exitSignature_spec(JasminParser.Signature_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link JasminParser#signature_expr}.
	 * @param ctx the parse tree
	 */
	void enterSignature_expr(JasminParser.Signature_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link JasminParser#signature_expr}.
	 * @param ctx the parse tree
	 */
	void exitSignature_expr(JasminParser.Signature_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link JasminParser#deprecated_spec}.
	 * @param ctx the parse tree
	 */
	void enterDeprecated_spec(JasminParser.Deprecated_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link JasminParser#deprecated_spec}.
	 * @param ctx the parse tree
	 */
	void exitDeprecated_spec(JasminParser.Deprecated_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link JasminParser#deprecated_expr}.
	 * @param ctx the parse tree
	 */
	void enterDeprecated_expr(JasminParser.Deprecated_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link JasminParser#deprecated_expr}.
	 * @param ctx the parse tree
	 */
	void exitDeprecated_expr(JasminParser.Deprecated_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link JasminParser#bytecode_spec}.
	 * @param ctx the parse tree
	 */
	void enterBytecode_spec(JasminParser.Bytecode_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link JasminParser#bytecode_spec}.
	 * @param ctx the parse tree
	 */
	void exitBytecode_spec(JasminParser.Bytecode_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link JasminParser#source_spec}.
	 * @param ctx the parse tree
	 */
	void enterSource_spec(JasminParser.Source_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link JasminParser#source_spec}.
	 * @param ctx the parse tree
	 */
	void exitSource_spec(JasminParser.Source_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link JasminParser#class_spec}.
	 * @param ctx the parse tree
	 */
	void enterClass_spec(JasminParser.Class_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link JasminParser#class_spec}.
	 * @param ctx the parse tree
	 */
	void exitClass_spec(JasminParser.Class_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link JasminParser#classname}.
	 * @param ctx the parse tree
	 */
	void enterClassname(JasminParser.ClassnameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JasminParser#classname}.
	 * @param ctx the parse tree
	 */
	void exitClassname(JasminParser.ClassnameContext ctx);
	/**
	 * Enter a parse tree produced by {@link JasminParser#access}.
	 * @param ctx the parse tree
	 */
	void enterAccess(JasminParser.AccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link JasminParser#access}.
	 * @param ctx the parse tree
	 */
	void exitAccess(JasminParser.AccessContext ctx);
	/**
	 * Enter a parse tree produced by {@link JasminParser#access_list}.
	 * @param ctx the parse tree
	 */
	void enterAccess_list(JasminParser.Access_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link JasminParser#access_list}.
	 * @param ctx the parse tree
	 */
	void exitAccess_list(JasminParser.Access_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link JasminParser#access_item}.
	 * @param ctx the parse tree
	 */
	void enterAccess_item(JasminParser.Access_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link JasminParser#access_item}.
	 * @param ctx the parse tree
	 */
	void exitAccess_item(JasminParser.Access_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link JasminParser#super_spec}.
	 * @param ctx the parse tree
	 */
	void enterSuper_spec(JasminParser.Super_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link JasminParser#super_spec}.
	 * @param ctx the parse tree
	 */
	void exitSuper_spec(JasminParser.Super_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link JasminParser#impls}.
	 * @param ctx the parse tree
	 */
	void enterImpls(JasminParser.ImplsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JasminParser#impls}.
	 * @param ctx the parse tree
	 */
	void exitImpls(JasminParser.ImplsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JasminParser#implements_list}.
	 * @param ctx the parse tree
	 */
	void enterImplements_list(JasminParser.Implements_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link JasminParser#implements_list}.
	 * @param ctx the parse tree
	 */
	void exitImplements_list(JasminParser.Implements_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link JasminParser#implements_spec}.
	 * @param ctx the parse tree
	 */
	void enterImplements_spec(JasminParser.Implements_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link JasminParser#implements_spec}.
	 * @param ctx the parse tree
	 */
	void exitImplements_spec(JasminParser.Implements_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link JasminParser#annotations}.
	 * @param ctx the parse tree
	 */
	void enterAnnotations(JasminParser.AnnotationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JasminParser#annotations}.
	 * @param ctx the parse tree
	 */
	void exitAnnotations(JasminParser.AnnotationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JasminParser#ann_cls_list}.
	 * @param ctx the parse tree
	 */
	void enterAnn_cls_list(JasminParser.Ann_cls_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link JasminParser#ann_cls_list}.
	 * @param ctx the parse tree
	 */
	void exitAnn_cls_list(JasminParser.Ann_cls_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link JasminParser#ann_cls_spec}.
	 * @param ctx the parse tree
	 */
	void enterAnn_cls_spec(JasminParser.Ann_cls_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link JasminParser#ann_cls_spec}.
	 * @param ctx the parse tree
	 */
	void exitAnn_cls_spec(JasminParser.Ann_cls_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link JasminParser#endannotationsep}.
	 * @param ctx the parse tree
	 */
	void enterEndannotationsep(JasminParser.EndannotationsepContext ctx);
	/**
	 * Exit a parse tree produced by {@link JasminParser#endannotationsep}.
	 * @param ctx the parse tree
	 */
	void exitEndannotationsep(JasminParser.EndannotationsepContext ctx);
	/**
	 * Enter a parse tree produced by {@link JasminParser#endannotation}.
	 * @param ctx the parse tree
	 */
	void enterEndannotation(JasminParser.EndannotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JasminParser#endannotation}.
	 * @param ctx the parse tree
	 */
	void exitEndannotation(JasminParser.EndannotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JasminParser#ann_cls_expr}.
	 * @param ctx the parse tree
	 */
	void enterAnn_cls_expr(JasminParser.Ann_cls_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link JasminParser#ann_cls_expr}.
	 * @param ctx the parse tree
	 */
	void exitAnn_cls_expr(JasminParser.Ann_cls_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link JasminParser#ann_clf_expr}.
	 * @param ctx the parse tree
	 */
	void enterAnn_clf_expr(JasminParser.Ann_clf_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link JasminParser#ann_clf_expr}.
	 * @param ctx the parse tree
	 */
	void exitAnn_clf_expr(JasminParser.Ann_clf_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link JasminParser#ann_met_expr}.
	 * @param ctx the parse tree
	 */
	void enterAnn_met_expr(JasminParser.Ann_met_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link JasminParser#ann_met_expr}.
	 * @param ctx the parse tree
	 */
	void exitAnn_met_expr(JasminParser.Ann_met_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link JasminParser#ann_arglist}.
	 * @param ctx the parse tree
	 */
	void enterAnn_arglist(JasminParser.Ann_arglistContext ctx);
	/**
	 * Exit a parse tree produced by {@link JasminParser#ann_arglist}.
	 * @param ctx the parse tree
	 */
	void exitAnn_arglist(JasminParser.Ann_arglistContext ctx);
	/**
	 * Enter a parse tree produced by {@link JasminParser#ann_arg_list}.
	 * @param ctx the parse tree
	 */
	void enterAnn_arg_list(JasminParser.Ann_arg_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link JasminParser#ann_arg_list}.
	 * @param ctx the parse tree
	 */
	void exitAnn_arg_list(JasminParser.Ann_arg_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link JasminParser#ann_arg_spec}.
	 * @param ctx the parse tree
	 */
	void enterAnn_arg_spec(JasminParser.Ann_arg_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link JasminParser#ann_arg_spec}.
	 * @param ctx the parse tree
	 */
	void exitAnn_arg_spec(JasminParser.Ann_arg_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link JasminParser#ann_arg_expr}.
	 * @param ctx the parse tree
	 */
	void enterAnn_arg_expr(JasminParser.Ann_arg_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link JasminParser#ann_arg_expr}.
	 * @param ctx the parse tree
	 */
	void exitAnn_arg_expr(JasminParser.Ann_arg_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link JasminParser#ann_def_spec}.
	 * @param ctx the parse tree
	 */
	void enterAnn_def_spec(JasminParser.Ann_def_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link JasminParser#ann_def_spec}.
	 * @param ctx the parse tree
	 */
	void exitAnn_def_spec(JasminParser.Ann_def_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link JasminParser#ann_value_list}.
	 * @param ctx the parse tree
	 */
	void enterAnn_value_list(JasminParser.Ann_value_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link JasminParser#ann_value_list}.
	 * @param ctx the parse tree
	 */
	void exitAnn_value_list(JasminParser.Ann_value_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link JasminParser#ann_value_items}.
	 * @param ctx the parse tree
	 */
	void enterAnn_value_items(JasminParser.Ann_value_itemsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JasminParser#ann_value_items}.
	 * @param ctx the parse tree
	 */
	void exitAnn_value_items(JasminParser.Ann_value_itemsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JasminParser#ann_value}.
	 * @param ctx the parse tree
	 */
	void enterAnn_value(JasminParser.Ann_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link JasminParser#ann_value}.
	 * @param ctx the parse tree
	 */
	void exitAnn_value(JasminParser.Ann_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link JasminParser#ann_ann_list}.
	 * @param ctx the parse tree
	 */
	void enterAnn_ann_list(JasminParser.Ann_ann_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link JasminParser#ann_ann_list}.
	 * @param ctx the parse tree
	 */
	void exitAnn_ann_list(JasminParser.Ann_ann_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link JasminParser#ann_ann_value}.
	 * @param ctx the parse tree
	 */
	void enterAnn_ann_value(JasminParser.Ann_ann_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link JasminParser#ann_ann_value}.
	 * @param ctx the parse tree
	 */
	void exitAnn_ann_value(JasminParser.Ann_ann_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link JasminParser#ann_nest}.
	 * @param ctx the parse tree
	 */
	void enterAnn_nest(JasminParser.Ann_nestContext ctx);
	/**
	 * Exit a parse tree produced by {@link JasminParser#ann_nest}.
	 * @param ctx the parse tree
	 */
	void exitAnn_nest(JasminParser.Ann_nestContext ctx);
	/**
	 * Enter a parse tree produced by {@link JasminParser#ann_def_val}.
	 * @param ctx the parse tree
	 */
	void enterAnn_def_val(JasminParser.Ann_def_valContext ctx);
	/**
	 * Exit a parse tree produced by {@link JasminParser#ann_def_val}.
	 * @param ctx the parse tree
	 */
	void exitAnn_def_val(JasminParser.Ann_def_valContext ctx);
	/**
	 * Enter a parse tree produced by {@link JasminParser#ann_def_expr}.
	 * @param ctx the parse tree
	 */
	void enterAnn_def_expr(JasminParser.Ann_def_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link JasminParser#ann_def_expr}.
	 * @param ctx the parse tree
	 */
	void exitAnn_def_expr(JasminParser.Ann_def_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link JasminParser#debug_extension}.
	 * @param ctx the parse tree
	 */
	void enterDebug_extension(JasminParser.Debug_extensionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JasminParser#debug_extension}.
	 * @param ctx the parse tree
	 */
	void exitDebug_extension(JasminParser.Debug_extensionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JasminParser#debug_list}.
	 * @param ctx the parse tree
	 */
	void enterDebug_list(JasminParser.Debug_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link JasminParser#debug_list}.
	 * @param ctx the parse tree
	 */
	void exitDebug_list(JasminParser.Debug_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link JasminParser#debug_spec}.
	 * @param ctx the parse tree
	 */
	void enterDebug_spec(JasminParser.Debug_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link JasminParser#debug_spec}.
	 * @param ctx the parse tree
	 */
	void exitDebug_spec(JasminParser.Debug_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link JasminParser#enclosing_spec}.
	 * @param ctx the parse tree
	 */
	void enterEnclosing_spec(JasminParser.Enclosing_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link JasminParser#enclosing_spec}.
	 * @param ctx the parse tree
	 */
	void exitEnclosing_spec(JasminParser.Enclosing_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link JasminParser#generic_attributes}.
	 * @param ctx the parse tree
	 */
	void enterGeneric_attributes(JasminParser.Generic_attributesContext ctx);
	/**
	 * Exit a parse tree produced by {@link JasminParser#generic_attributes}.
	 * @param ctx the parse tree
	 */
	void exitGeneric_attributes(JasminParser.Generic_attributesContext ctx);
	/**
	 * Enter a parse tree produced by {@link JasminParser#generic_list}.
	 * @param ctx the parse tree
	 */
	void enterGeneric_list(JasminParser.Generic_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link JasminParser#generic_list}.
	 * @param ctx the parse tree
	 */
	void exitGeneric_list(JasminParser.Generic_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link JasminParser#generic_spec}.
	 * @param ctx the parse tree
	 */
	void enterGeneric_spec(JasminParser.Generic_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link JasminParser#generic_spec}.
	 * @param ctx the parse tree
	 */
	void exitGeneric_spec(JasminParser.Generic_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link JasminParser#generic_expr}.
	 * @param ctx the parse tree
	 */
	void enterGeneric_expr(JasminParser.Generic_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link JasminParser#generic_expr}.
	 * @param ctx the parse tree
	 */
	void exitGeneric_expr(JasminParser.Generic_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link JasminParser#fields}.
	 * @param ctx the parse tree
	 */
	void enterFields(JasminParser.FieldsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JasminParser#fields}.
	 * @param ctx the parse tree
	 */
	void exitFields(JasminParser.FieldsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JasminParser#field_list}.
	 * @param ctx the parse tree
	 */
	void enterField_list(JasminParser.Field_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link JasminParser#field_list}.
	 * @param ctx the parse tree
	 */
	void exitField_list(JasminParser.Field_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link JasminParser#field_spec}.
	 * @param ctx the parse tree
	 */
	void enterField_spec(JasminParser.Field_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link JasminParser#field_spec}.
	 * @param ctx the parse tree
	 */
	void exitField_spec(JasminParser.Field_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link JasminParser#optional_default}.
	 * @param ctx the parse tree
	 */
	void enterOptional_default(JasminParser.Optional_defaultContext ctx);
	/**
	 * Exit a parse tree produced by {@link JasminParser#optional_default}.
	 * @param ctx the parse tree
	 */
	void exitOptional_default(JasminParser.Optional_defaultContext ctx);
	/**
	 * Enter a parse tree produced by {@link JasminParser#field_start}.
	 * @param ctx the parse tree
	 */
	void enterField_start(JasminParser.Field_startContext ctx);
	/**
	 * Exit a parse tree produced by {@link JasminParser#field_start}.
	 * @param ctx the parse tree
	 */
	void exitField_start(JasminParser.Field_startContext ctx);
	/**
	 * Enter a parse tree produced by {@link JasminParser#endfield}.
	 * @param ctx the parse tree
	 */
	void enterEndfield(JasminParser.EndfieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link JasminParser#endfield}.
	 * @param ctx the parse tree
	 */
	void exitEndfield(JasminParser.EndfieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link JasminParser#field_exts}.
	 * @param ctx the parse tree
	 */
	void enterField_exts(JasminParser.Field_extsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JasminParser#field_exts}.
	 * @param ctx the parse tree
	 */
	void exitField_exts(JasminParser.Field_extsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JasminParser#field_ext_list}.
	 * @param ctx the parse tree
	 */
	void enterField_ext_list(JasminParser.Field_ext_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link JasminParser#field_ext_list}.
	 * @param ctx the parse tree
	 */
	void exitField_ext_list(JasminParser.Field_ext_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link JasminParser#field_ext_expr}.
	 * @param ctx the parse tree
	 */
	void enterField_ext_expr(JasminParser.Field_ext_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link JasminParser#field_ext_expr}.
	 * @param ctx the parse tree
	 */
	void exitField_ext_expr(JasminParser.Field_ext_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link JasminParser#item}.
	 * @param ctx the parse tree
	 */
	void enterItem(JasminParser.ItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link JasminParser#item}.
	 * @param ctx the parse tree
	 */
	void exitItem(JasminParser.ItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link JasminParser#any_item}.
	 * @param ctx the parse tree
	 */
	void enterAny_item(JasminParser.Any_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link JasminParser#any_item}.
	 * @param ctx the parse tree
	 */
	void exitAny_item(JasminParser.Any_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link JasminParser#inners}.
	 * @param ctx the parse tree
	 */
	void enterInners(JasminParser.InnersContext ctx);
	/**
	 * Exit a parse tree produced by {@link JasminParser#inners}.
	 * @param ctx the parse tree
	 */
	void exitInners(JasminParser.InnersContext ctx);
	/**
	 * Enter a parse tree produced by {@link JasminParser#inner_list}.
	 * @param ctx the parse tree
	 */
	void enterInner_list(JasminParser.Inner_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link JasminParser#inner_list}.
	 * @param ctx the parse tree
	 */
	void exitInner_list(JasminParser.Inner_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link JasminParser#inner_spec}.
	 * @param ctx the parse tree
	 */
	void enterInner_spec(JasminParser.Inner_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link JasminParser#inner_spec}.
	 * @param ctx the parse tree
	 */
	void exitInner_spec(JasminParser.Inner_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link JasminParser#inner_name}.
	 * @param ctx the parse tree
	 */
	void enterInner_name(JasminParser.Inner_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JasminParser#inner_name}.
	 * @param ctx the parse tree
	 */
	void exitInner_name(JasminParser.Inner_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link JasminParser#inner_inner}.
	 * @param ctx the parse tree
	 */
	void enterInner_inner(JasminParser.Inner_innerContext ctx);
	/**
	 * Exit a parse tree produced by {@link JasminParser#inner_inner}.
	 * @param ctx the parse tree
	 */
	void exitInner_inner(JasminParser.Inner_innerContext ctx);
	/**
	 * Enter a parse tree produced by {@link JasminParser#inner_outer}.
	 * @param ctx the parse tree
	 */
	void enterInner_outer(JasminParser.Inner_outerContext ctx);
	/**
	 * Exit a parse tree produced by {@link JasminParser#inner_outer}.
	 * @param ctx the parse tree
	 */
	void exitInner_outer(JasminParser.Inner_outerContext ctx);
	/**
	 * Enter a parse tree produced by {@link JasminParser#method_spec}.
	 * @param ctx the parse tree
	 */
	void enterMethod_spec(JasminParser.Method_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link JasminParser#method_spec}.
	 * @param ctx the parse tree
	 */
	void exitMethod_spec(JasminParser.Method_specContext ctx);
	/**
	 * Enter a parse tree produced by the {@code InstructionStatement}
	 * labeled alternative in {@link JasminParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterInstructionStatement(JasminParser.InstructionStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code InstructionStatement}
	 * labeled alternative in {@link JasminParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitInstructionStatement(JasminParser.InstructionStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DirectiveStatement}
	 * labeled alternative in {@link JasminParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterDirectiveStatement(JasminParser.DirectiveStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DirectiveStatement}
	 * labeled alternative in {@link JasminParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitDirectiveStatement(JasminParser.DirectiveStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LabelStatement}
	 * labeled alternative in {@link JasminParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterLabelStatement(JasminParser.LabelStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LabelStatement}
	 * labeled alternative in {@link JasminParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitLabelStatement(JasminParser.LabelStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JasminParser#label}.
	 * @param ctx the parse tree
	 */
	void enterLabel(JasminParser.LabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link JasminParser#label}.
	 * @param ctx the parse tree
	 */
	void exitLabel(JasminParser.LabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link JasminParser#directive}.
	 * @param ctx the parse tree
	 */
	void enterDirective(JasminParser.DirectiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link JasminParser#directive}.
	 * @param ctx the parse tree
	 */
	void exitDirective(JasminParser.DirectiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link JasminParser#stackmap}.
	 * @param ctx the parse tree
	 */
	void enterStackmap(JasminParser.StackmapContext ctx);
	/**
	 * Exit a parse tree produced by {@link JasminParser#stackmap}.
	 * @param ctx the parse tree
	 */
	void exitStackmap(JasminParser.StackmapContext ctx);
	/**
	 * Enter a parse tree produced by {@link JasminParser#defstack_same}.
	 * @param ctx the parse tree
	 */
	void enterDefstack_same(JasminParser.Defstack_sameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JasminParser#defstack_same}.
	 * @param ctx the parse tree
	 */
	void exitDefstack_same(JasminParser.Defstack_sameContext ctx);
	/**
	 * Enter a parse tree produced by {@link JasminParser#defstack_same_expr}.
	 * @param ctx the parse tree
	 */
	void enterDefstack_same_expr(JasminParser.Defstack_same_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link JasminParser#defstack_same_expr}.
	 * @param ctx the parse tree
	 */
	void exitDefstack_same_expr(JasminParser.Defstack_same_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link JasminParser#defstack}.
	 * @param ctx the parse tree
	 */
	void enterDefstack(JasminParser.DefstackContext ctx);
	/**
	 * Exit a parse tree produced by {@link JasminParser#defstack}.
	 * @param ctx the parse tree
	 */
	void exitDefstack(JasminParser.DefstackContext ctx);
	/**
	 * Enter a parse tree produced by {@link JasminParser#stack_map_frame_desc}.
	 * @param ctx the parse tree
	 */
	void enterStack_map_frame_desc(JasminParser.Stack_map_frame_descContext ctx);
	/**
	 * Exit a parse tree produced by {@link JasminParser#stack_map_frame_desc}.
	 * @param ctx the parse tree
	 */
	void exitStack_map_frame_desc(JasminParser.Stack_map_frame_descContext ctx);
	/**
	 * Enter a parse tree produced by {@link JasminParser#stack_offset_def}.
	 * @param ctx the parse tree
	 */
	void enterStack_offset_def(JasminParser.Stack_offset_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link JasminParser#stack_offset_def}.
	 * @param ctx the parse tree
	 */
	void exitStack_offset_def(JasminParser.Stack_offset_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link JasminParser#stack_items}.
	 * @param ctx the parse tree
	 */
	void enterStack_items(JasminParser.Stack_itemsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JasminParser#stack_items}.
	 * @param ctx the parse tree
	 */
	void exitStack_items(JasminParser.Stack_itemsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JasminParser#stack_item}.
	 * @param ctx the parse tree
	 */
	void enterStack_item(JasminParser.Stack_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link JasminParser#stack_item}.
	 * @param ctx the parse tree
	 */
	void exitStack_item(JasminParser.Stack_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link JasminParser#stack_item_expr}.
	 * @param ctx the parse tree
	 */
	void enterStack_item_expr(JasminParser.Stack_item_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link JasminParser#stack_item_expr}.
	 * @param ctx the parse tree
	 */
	void exitStack_item_expr(JasminParser.Stack_item_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link JasminParser#endstack}.
	 * @param ctx the parse tree
	 */
	void enterEndstack(JasminParser.EndstackContext ctx);
	/**
	 * Exit a parse tree produced by {@link JasminParser#endstack}.
	 * @param ctx the parse tree
	 */
	void exitEndstack(JasminParser.EndstackContext ctx);
	/**
	 * Enter a parse tree produced by {@link JasminParser#var_expr}.
	 * @param ctx the parse tree
	 */
	void enterVar_expr(JasminParser.Var_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link JasminParser#var_expr}.
	 * @param ctx the parse tree
	 */
	void exitVar_expr(JasminParser.Var_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link JasminParser#optional_signature}.
	 * @param ctx the parse tree
	 */
	void enterOptional_signature(JasminParser.Optional_signatureContext ctx);
	/**
	 * Exit a parse tree produced by {@link JasminParser#optional_signature}.
	 * @param ctx the parse tree
	 */
	void exitOptional_signature(JasminParser.Optional_signatureContext ctx);
	/**
	 * Enter a parse tree produced by {@link JasminParser#line_expr}.
	 * @param ctx the parse tree
	 */
	void enterLine_expr(JasminParser.Line_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link JasminParser#line_expr}.
	 * @param ctx the parse tree
	 */
	void exitLine_expr(JasminParser.Line_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link JasminParser#throws_expr}.
	 * @param ctx the parse tree
	 */
	void enterThrows_expr(JasminParser.Throws_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link JasminParser#throws_expr}.
	 * @param ctx the parse tree
	 */
	void exitThrows_expr(JasminParser.Throws_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link JasminParser#catch_expr}.
	 * @param ctx the parse tree
	 */
	void enterCatch_expr(JasminParser.Catch_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link JasminParser#catch_expr}.
	 * @param ctx the parse tree
	 */
	void exitCatch_expr(JasminParser.Catch_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link JasminParser#set_expr}.
	 * @param ctx the parse tree
	 */
	void enterSet_expr(JasminParser.Set_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link JasminParser#set_expr}.
	 * @param ctx the parse tree
	 */
	void exitSet_expr(JasminParser.Set_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link JasminParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterInstruction(JasminParser.InstructionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JasminParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitInstruction(JasminParser.InstructionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Opcode}
	 * labeled alternative in {@link JasminParser#simple_instruction}.
	 * @param ctx the parse tree
	 */
	void enterOpcode(JasminParser.OpcodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Opcode}
	 * labeled alternative in {@link JasminParser#simple_instruction}.
	 * @param ctx the parse tree
	 */
	void exitOpcode(JasminParser.OpcodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OpcodeInt}
	 * labeled alternative in {@link JasminParser#simple_instruction}.
	 * @param ctx the parse tree
	 */
	void enterOpcodeInt(JasminParser.OpcodeIntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OpcodeInt}
	 * labeled alternative in {@link JasminParser#simple_instruction}.
	 * @param ctx the parse tree
	 */
	void exitOpcodeInt(JasminParser.OpcodeIntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OpcodeIntInt}
	 * labeled alternative in {@link JasminParser#simple_instruction}.
	 * @param ctx the parse tree
	 */
	void enterOpcodeIntInt(JasminParser.OpcodeIntIntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OpcodeIntInt}
	 * labeled alternative in {@link JasminParser#simple_instruction}.
	 * @param ctx the parse tree
	 */
	void exitOpcodeIntInt(JasminParser.OpcodeIntIntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OpcodeFloat}
	 * labeled alternative in {@link JasminParser#simple_instruction}.
	 * @param ctx the parse tree
	 */
	void enterOpcodeFloat(JasminParser.OpcodeFloatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OpcodeFloat}
	 * labeled alternative in {@link JasminParser#simple_instruction}.
	 * @param ctx the parse tree
	 */
	void exitOpcodeFloat(JasminParser.OpcodeFloatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OpcodeWord}
	 * labeled alternative in {@link JasminParser#simple_instruction}.
	 * @param ctx the parse tree
	 */
	void enterOpcodeWord(JasminParser.OpcodeWordContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OpcodeWord}
	 * labeled alternative in {@link JasminParser#simple_instruction}.
	 * @param ctx the parse tree
	 */
	void exitOpcodeWord(JasminParser.OpcodeWordContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OpcodeWordInt}
	 * labeled alternative in {@link JasminParser#simple_instruction}.
	 * @param ctx the parse tree
	 */
	void enterOpcodeWordInt(JasminParser.OpcodeWordIntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OpcodeWordInt}
	 * labeled alternative in {@link JasminParser#simple_instruction}.
	 * @param ctx the parse tree
	 */
	void exitOpcodeWordInt(JasminParser.OpcodeWordIntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OpcodeWordWord}
	 * labeled alternative in {@link JasminParser#simple_instruction}.
	 * @param ctx the parse tree
	 */
	void enterOpcodeWordWord(JasminParser.OpcodeWordWordContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OpcodeWordWord}
	 * labeled alternative in {@link JasminParser#simple_instruction}.
	 * @param ctx the parse tree
	 */
	void exitOpcodeWordWord(JasminParser.OpcodeWordWordContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OpcodeString}
	 * labeled alternative in {@link JasminParser#simple_instruction}.
	 * @param ctx the parse tree
	 */
	void enterOpcodeString(JasminParser.OpcodeStringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OpcodeString}
	 * labeled alternative in {@link JasminParser#simple_instruction}.
	 * @param ctx the parse tree
	 */
	void exitOpcodeString(JasminParser.OpcodeStringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OpcodeRelative}
	 * labeled alternative in {@link JasminParser#simple_instruction}.
	 * @param ctx the parse tree
	 */
	void enterOpcodeRelative(JasminParser.OpcodeRelativeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OpcodeRelative}
	 * labeled alternative in {@link JasminParser#simple_instruction}.
	 * @param ctx the parse tree
	 */
	void exitOpcodeRelative(JasminParser.OpcodeRelativeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JasminParser#complex_instruction}.
	 * @param ctx the parse tree
	 */
	void enterComplex_instruction(JasminParser.Complex_instructionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JasminParser#complex_instruction}.
	 * @param ctx the parse tree
	 */
	void exitComplex_instruction(JasminParser.Complex_instructionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JasminParser#lookup}.
	 * @param ctx the parse tree
	 */
	void enterLookup(JasminParser.LookupContext ctx);
	/**
	 * Exit a parse tree produced by {@link JasminParser#lookup}.
	 * @param ctx the parse tree
	 */
	void exitLookup(JasminParser.LookupContext ctx);
	/**
	 * Enter a parse tree produced by {@link JasminParser#lookup_args}.
	 * @param ctx the parse tree
	 */
	void enterLookup_args(JasminParser.Lookup_argsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JasminParser#lookup_args}.
	 * @param ctx the parse tree
	 */
	void exitLookup_args(JasminParser.Lookup_argsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JasminParser#lookup_list}.
	 * @param ctx the parse tree
	 */
	void enterLookup_list(JasminParser.Lookup_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link JasminParser#lookup_list}.
	 * @param ctx the parse tree
	 */
	void exitLookup_list(JasminParser.Lookup_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link JasminParser#lookup_entry}.
	 * @param ctx the parse tree
	 */
	void enterLookup_entry(JasminParser.Lookup_entryContext ctx);
	/**
	 * Exit a parse tree produced by {@link JasminParser#lookup_entry}.
	 * @param ctx the parse tree
	 */
	void exitLookup_entry(JasminParser.Lookup_entryContext ctx);
	/**
	 * Enter a parse tree produced by {@link JasminParser#lookup_default}.
	 * @param ctx the parse tree
	 */
	void enterLookup_default(JasminParser.Lookup_defaultContext ctx);
	/**
	 * Exit a parse tree produced by {@link JasminParser#lookup_default}.
	 * @param ctx the parse tree
	 */
	void exitLookup_default(JasminParser.Lookup_defaultContext ctx);
	/**
	 * Enter a parse tree produced by {@link JasminParser#table}.
	 * @param ctx the parse tree
	 */
	void enterTable(JasminParser.TableContext ctx);
	/**
	 * Exit a parse tree produced by {@link JasminParser#table}.
	 * @param ctx the parse tree
	 */
	void exitTable(JasminParser.TableContext ctx);
	/**
	 * Enter a parse tree produced by {@link JasminParser#table_args}.
	 * @param ctx the parse tree
	 */
	void enterTable_args(JasminParser.Table_argsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JasminParser#table_args}.
	 * @param ctx the parse tree
	 */
	void exitTable_args(JasminParser.Table_argsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JasminParser#table_list}.
	 * @param ctx the parse tree
	 */
	void enterTable_list(JasminParser.Table_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link JasminParser#table_list}.
	 * @param ctx the parse tree
	 */
	void exitTable_list(JasminParser.Table_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link JasminParser#table_entry}.
	 * @param ctx the parse tree
	 */
	void enterTable_entry(JasminParser.Table_entryContext ctx);
	/**
	 * Exit a parse tree produced by {@link JasminParser#table_entry}.
	 * @param ctx the parse tree
	 */
	void exitTable_entry(JasminParser.Table_entryContext ctx);
	/**
	 * Enter a parse tree produced by {@link JasminParser#table_default}.
	 * @param ctx the parse tree
	 */
	void enterTable_default(JasminParser.Table_defaultContext ctx);
	/**
	 * Exit a parse tree produced by {@link JasminParser#table_default}.
	 * @param ctx the parse tree
	 */
	void exitTable_default(JasminParser.Table_defaultContext ctx);
}