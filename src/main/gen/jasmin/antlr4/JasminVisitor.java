// Generated from C:/Users/stefa/IdeaProjects/jasmin/src/main/java/jasmin/antlr4\Jasmin.g4 by ANTLR 4.7
package jasmin.antlr4;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link JasminParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface JasminVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link JasminParser#compilation_unit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompilation_unit(JasminParser.Compilation_unitContext ctx);
	/**
	 * Visit a parse tree produced by {@link JasminParser#jasmin_header}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJasmin_header(JasminParser.Jasmin_headerContext ctx);
	/**
	 * Visit a parse tree produced by {@link JasminParser#signature_spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSignature_spec(JasminParser.Signature_specContext ctx);
	/**
	 * Visit a parse tree produced by {@link JasminParser#signature_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSignature_expr(JasminParser.Signature_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link JasminParser#deprecated_spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeprecated_spec(JasminParser.Deprecated_specContext ctx);
	/**
	 * Visit a parse tree produced by {@link JasminParser#deprecated_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeprecated_expr(JasminParser.Deprecated_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link JasminParser#bytecode_spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBytecode_spec(JasminParser.Bytecode_specContext ctx);
	/**
	 * Visit a parse tree produced by {@link JasminParser#source_spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSource_spec(JasminParser.Source_specContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ClassDeclaration}
	 * labeled alternative in {@link JasminParser#class_spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclaration(JasminParser.ClassDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code InterfaceDeclaration}
	 * labeled alternative in {@link JasminParser#class_spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceDeclaration(JasminParser.InterfaceDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JasminParser#access}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccess(JasminParser.AccessContext ctx);
	/**
	 * Visit a parse tree produced by {@link JasminParser#access_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccess_list(JasminParser.Access_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link JasminParser#access_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccess_item(JasminParser.Access_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link JasminParser#super_spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuper_spec(JasminParser.Super_specContext ctx);
	/**
	 * Visit a parse tree produced by {@link JasminParser#impls}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImpls(JasminParser.ImplsContext ctx);
	/**
	 * Visit a parse tree produced by {@link JasminParser#implements_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImplements_list(JasminParser.Implements_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link JasminParser#implements_spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImplements_spec(JasminParser.Implements_specContext ctx);
	/**
	 * Visit a parse tree produced by {@link JasminParser#annotations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotations(JasminParser.AnnotationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link JasminParser#ann_cls_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnn_cls_list(JasminParser.Ann_cls_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link JasminParser#ann_cls_spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnn_cls_spec(JasminParser.Ann_cls_specContext ctx);
	/**
	 * Visit a parse tree produced by {@link JasminParser#endannotationsep}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEndannotationsep(JasminParser.EndannotationsepContext ctx);
	/**
	 * Visit a parse tree produced by {@link JasminParser#endannotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEndannotation(JasminParser.EndannotationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JasminParser#ann_cls_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnn_cls_expr(JasminParser.Ann_cls_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link JasminParser#ann_clf_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnn_clf_expr(JasminParser.Ann_clf_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link JasminParser#ann_met_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnn_met_expr(JasminParser.Ann_met_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link JasminParser#ann_arglist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnn_arglist(JasminParser.Ann_arglistContext ctx);
	/**
	 * Visit a parse tree produced by {@link JasminParser#ann_arg_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnn_arg_list(JasminParser.Ann_arg_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link JasminParser#ann_arg_spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnn_arg_spec(JasminParser.Ann_arg_specContext ctx);
	/**
	 * Visit a parse tree produced by {@link JasminParser#ann_arg_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnn_arg_expr(JasminParser.Ann_arg_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link JasminParser#ann_def_spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnn_def_spec(JasminParser.Ann_def_specContext ctx);
	/**
	 * Visit a parse tree produced by {@link JasminParser#ann_value_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnn_value_list(JasminParser.Ann_value_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link JasminParser#ann_value_items}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnn_value_items(JasminParser.Ann_value_itemsContext ctx);
	/**
	 * Visit a parse tree produced by {@link JasminParser#ann_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnn_value(JasminParser.Ann_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link JasminParser#ann_ann_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnn_ann_list(JasminParser.Ann_ann_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link JasminParser#ann_ann_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnn_ann_value(JasminParser.Ann_ann_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link JasminParser#ann_nest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnn_nest(JasminParser.Ann_nestContext ctx);
	/**
	 * Visit a parse tree produced by {@link JasminParser#ann_def_val}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnn_def_val(JasminParser.Ann_def_valContext ctx);
	/**
	 * Visit a parse tree produced by {@link JasminParser#ann_def_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnn_def_expr(JasminParser.Ann_def_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link JasminParser#debug_extension}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDebug_extension(JasminParser.Debug_extensionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JasminParser#debug_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDebug_list(JasminParser.Debug_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link JasminParser#debug_spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDebug_spec(JasminParser.Debug_specContext ctx);
	/**
	 * Visit a parse tree produced by {@link JasminParser#enclosing_spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnclosing_spec(JasminParser.Enclosing_specContext ctx);
	/**
	 * Visit a parse tree produced by {@link JasminParser#generic_attributes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGeneric_attributes(JasminParser.Generic_attributesContext ctx);
	/**
	 * Visit a parse tree produced by {@link JasminParser#generic_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGeneric_list(JasminParser.Generic_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link JasminParser#generic_spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGeneric_spec(JasminParser.Generic_specContext ctx);
	/**
	 * Visit a parse tree produced by {@link JasminParser#generic_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGeneric_expr(JasminParser.Generic_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link JasminParser#fields}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFields(JasminParser.FieldsContext ctx);
	/**
	 * Visit a parse tree produced by {@link JasminParser#field_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitField_list(JasminParser.Field_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link JasminParser#field_spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitField_spec(JasminParser.Field_specContext ctx);
	/**
	 * Visit a parse tree produced by {@link JasminParser#optional_default}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptional_default(JasminParser.Optional_defaultContext ctx);
	/**
	 * Visit a parse tree produced by {@link JasminParser#field_start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitField_start(JasminParser.Field_startContext ctx);
	/**
	 * Visit a parse tree produced by {@link JasminParser#endfield}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEndfield(JasminParser.EndfieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link JasminParser#field_exts}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitField_exts(JasminParser.Field_extsContext ctx);
	/**
	 * Visit a parse tree produced by {@link JasminParser#field_ext_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitField_ext_list(JasminParser.Field_ext_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link JasminParser#field_ext_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitField_ext_expr(JasminParser.Field_ext_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link JasminParser#item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitItem(JasminParser.ItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link JasminParser#any_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAny_item(JasminParser.Any_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link JasminParser#inners}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInners(JasminParser.InnersContext ctx);
	/**
	 * Visit a parse tree produced by {@link JasminParser#inner_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInner_list(JasminParser.Inner_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link JasminParser#inner_spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInner_spec(JasminParser.Inner_specContext ctx);
	/**
	 * Visit a parse tree produced by {@link JasminParser#inner_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInner_name(JasminParser.Inner_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link JasminParser#inner_inner}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInner_inner(JasminParser.Inner_innerContext ctx);
	/**
	 * Visit a parse tree produced by {@link JasminParser#inner_outer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInner_outer(JasminParser.Inner_outerContext ctx);
	/**
	 * Visit a parse tree produced by {@link JasminParser#method_spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod_spec(JasminParser.Method_specContext ctx);
	/**
	 * Visit a parse tree produced by the {@code InstructionStatement}
	 * labeled alternative in {@link JasminParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstructionStatement(JasminParser.InstructionStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DirectiveStatement}
	 * labeled alternative in {@link JasminParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDirectiveStatement(JasminParser.DirectiveStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LabelStatement}
	 * labeled alternative in {@link JasminParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabelStatement(JasminParser.LabelStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JasminParser#label}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabel(JasminParser.LabelContext ctx);
	/**
	 * Visit a parse tree produced by {@link JasminParser#directive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDirective(JasminParser.DirectiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link JasminParser#stackmap}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStackmap(JasminParser.StackmapContext ctx);
	/**
	 * Visit a parse tree produced by {@link JasminParser#defstack_same}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefstack_same(JasminParser.Defstack_sameContext ctx);
	/**
	 * Visit a parse tree produced by {@link JasminParser#defstack_same_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefstack_same_expr(JasminParser.Defstack_same_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link JasminParser#defstack}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefstack(JasminParser.DefstackContext ctx);
	/**
	 * Visit a parse tree produced by {@link JasminParser#stack_map_frame_desc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStack_map_frame_desc(JasminParser.Stack_map_frame_descContext ctx);
	/**
	 * Visit a parse tree produced by {@link JasminParser#stack_offset_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStack_offset_def(JasminParser.Stack_offset_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link JasminParser#stack_items}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStack_items(JasminParser.Stack_itemsContext ctx);
	/**
	 * Visit a parse tree produced by {@link JasminParser#stack_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStack_item(JasminParser.Stack_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link JasminParser#stack_item_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStack_item_expr(JasminParser.Stack_item_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link JasminParser#endstack}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEndstack(JasminParser.EndstackContext ctx);
	/**
	 * Visit a parse tree produced by {@link JasminParser#var_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_expr(JasminParser.Var_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link JasminParser#optional_signature}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptional_signature(JasminParser.Optional_signatureContext ctx);
	/**
	 * Visit a parse tree produced by {@link JasminParser#line_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLine_expr(JasminParser.Line_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link JasminParser#throws_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThrows_expr(JasminParser.Throws_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link JasminParser#catch_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatch_expr(JasminParser.Catch_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link JasminParser#set_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet_expr(JasminParser.Set_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link JasminParser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruction(JasminParser.InstructionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Opcode}
	 * labeled alternative in {@link JasminParser#simple_instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpcode(JasminParser.OpcodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OpcodeInt}
	 * labeled alternative in {@link JasminParser#simple_instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpcodeInt(JasminParser.OpcodeIntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OpcodeIntInt}
	 * labeled alternative in {@link JasminParser#simple_instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpcodeIntInt(JasminParser.OpcodeIntIntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OpcodeFloat}
	 * labeled alternative in {@link JasminParser#simple_instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpcodeFloat(JasminParser.OpcodeFloatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OpcodeWord}
	 * labeled alternative in {@link JasminParser#simple_instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpcodeWord(JasminParser.OpcodeWordContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OpcodeWordInt}
	 * labeled alternative in {@link JasminParser#simple_instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpcodeWordInt(JasminParser.OpcodeWordIntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OpcodeWordWord}
	 * labeled alternative in {@link JasminParser#simple_instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpcodeWordWord(JasminParser.OpcodeWordWordContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OpcodeString}
	 * labeled alternative in {@link JasminParser#simple_instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpcodeString(JasminParser.OpcodeStringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OpcodeRelative}
	 * labeled alternative in {@link JasminParser#simple_instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpcodeRelative(JasminParser.OpcodeRelativeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JasminParser#complex_instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComplex_instruction(JasminParser.Complex_instructionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JasminParser#lookup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLookup(JasminParser.LookupContext ctx);
	/**
	 * Visit a parse tree produced by {@link JasminParser#lookup_args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLookup_args(JasminParser.Lookup_argsContext ctx);
	/**
	 * Visit a parse tree produced by {@link JasminParser#lookup_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLookup_list(JasminParser.Lookup_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link JasminParser#lookup_entry}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLookup_entry(JasminParser.Lookup_entryContext ctx);
	/**
	 * Visit a parse tree produced by {@link JasminParser#lookup_default}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLookup_default(JasminParser.Lookup_defaultContext ctx);
	/**
	 * Visit a parse tree produced by {@link JasminParser#table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable(JasminParser.TableContext ctx);
	/**
	 * Visit a parse tree produced by {@link JasminParser#table_args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_args(JasminParser.Table_argsContext ctx);
	/**
	 * Visit a parse tree produced by {@link JasminParser#table_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_list(JasminParser.Table_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link JasminParser#table_entry}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_entry(JasminParser.Table_entryContext ctx);
	/**
	 * Visit a parse tree produced by {@link JasminParser#table_default}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_default(JasminParser.Table_defaultContext ctx);
}