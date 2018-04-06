// Generated from sqlParser.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link sqlParserParser}.
 */
public interface sqlParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link sqlParserParser#var1}.
	 * @param ctx the parse tree
	 */
	void enterVar1(sqlParserParser.Var1Context ctx);
	/**
	 * Exit a parse tree produced by {@link sqlParserParser#var1}.
	 * @param ctx the parse tree
	 */
	void exitVar1(sqlParserParser.Var1Context ctx);
	/**
	 * Enter a parse tree produced by {@link sqlParserParser#var2}.
	 * @param ctx the parse tree
	 */
	void enterVar2(sqlParserParser.Var2Context ctx);
	/**
	 * Exit a parse tree produced by {@link sqlParserParser#var2}.
	 * @param ctx the parse tree
	 */
	void exitVar2(sqlParserParser.Var2Context ctx);
	/**
	 * Enter a parse tree produced by {@link sqlParserParser#var3}.
	 * @param ctx the parse tree
	 */
	void enterVar3(sqlParserParser.Var3Context ctx);
	/**
	 * Exit a parse tree produced by {@link sqlParserParser#var3}.
	 * @param ctx the parse tree
	 */
	void exitVar3(sqlParserParser.Var3Context ctx);
	/**
	 * Enter a parse tree produced by {@link sqlParserParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(sqlParserParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqlParserParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(sqlParserParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link sqlParserParser#number_literal}.
	 * @param ctx the parse tree
	 */
	void enterNumber_literal(sqlParserParser.Number_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqlParserParser#number_literal}.
	 * @param ctx the parse tree
	 */
	void exitNumber_literal(sqlParserParser.Number_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link sqlParserParser#sqlQuery}.
	 * @param ctx the parse tree
	 */
	void enterSqlQuery(sqlParserParser.SqlQueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqlParserParser#sqlQuery}.
	 * @param ctx the parse tree
	 */
	void exitSqlQuery(sqlParserParser.SqlQueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link sqlParserParser#sql_statement}.
	 * @param ctx the parse tree
	 */
	void enterSql_statement(sqlParserParser.Sql_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqlParserParser#sql_statement}.
	 * @param ctx the parse tree
	 */
	void exitSql_statement(sqlParserParser.Sql_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link sqlParserParser#select_statement}.
	 * @param ctx the parse tree
	 */
	void enterSelect_statement(sqlParserParser.Select_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqlParserParser#select_statement}.
	 * @param ctx the parse tree
	 */
	void exitSelect_statement(sqlParserParser.Select_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link sqlParserParser#select_expression}.
	 * @param ctx the parse tree
	 */
	void enterSelect_expression(sqlParserParser.Select_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqlParserParser#select_expression}.
	 * @param ctx the parse tree
	 */
	void exitSelect_expression(sqlParserParser.Select_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link sqlParserParser#select_list1}.
	 * @param ctx the parse tree
	 */
	void enterSelect_list1(sqlParserParser.Select_list1Context ctx);
	/**
	 * Exit a parse tree produced by {@link sqlParserParser#select_list1}.
	 * @param ctx the parse tree
	 */
	void exitSelect_list1(sqlParserParser.Select_list1Context ctx);
	/**
	 * Enter a parse tree produced by {@link sqlParserParser#from_clause1}.
	 * @param ctx the parse tree
	 */
	void enterFrom_clause1(sqlParserParser.From_clause1Context ctx);
	/**
	 * Exit a parse tree produced by {@link sqlParserParser#from_clause1}.
	 * @param ctx the parse tree
	 */
	void exitFrom_clause1(sqlParserParser.From_clause1Context ctx);
	/**
	 * Enter a parse tree produced by {@link sqlParserParser#where_clause}.
	 * @param ctx the parse tree
	 */
	void enterWhere_clause(sqlParserParser.Where_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqlParserParser#where_clause}.
	 * @param ctx the parse tree
	 */
	void exitWhere_clause(sqlParserParser.Where_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link sqlParserParser#groupby_clause}.
	 * @param ctx the parse tree
	 */
	void enterGroupby_clause(sqlParserParser.Groupby_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqlParserParser#groupby_clause}.
	 * @param ctx the parse tree
	 */
	void exitGroupby_clause(sqlParserParser.Groupby_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link sqlParserParser#groupby_item}.
	 * @param ctx the parse tree
	 */
	void enterGroupby_item(sqlParserParser.Groupby_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqlParserParser#groupby_item}.
	 * @param ctx the parse tree
	 */
	void exitGroupby_item(sqlParserParser.Groupby_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link sqlParserParser#having_clause}.
	 * @param ctx the parse tree
	 */
	void enterHaving_clause(sqlParserParser.Having_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqlParserParser#having_clause}.
	 * @param ctx the parse tree
	 */
	void exitHaving_clause(sqlParserParser.Having_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link sqlParserParser#orderby_clause}.
	 * @param ctx the parse tree
	 */
	void enterOrderby_clause(sqlParserParser.Orderby_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqlParserParser#orderby_clause}.
	 * @param ctx the parse tree
	 */
	void exitOrderby_clause(sqlParserParser.Orderby_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link sqlParserParser#orderby_item}.
	 * @param ctx the parse tree
	 */
	void enterOrderby_item(sqlParserParser.Orderby_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqlParserParser#orderby_item}.
	 * @param ctx the parse tree
	 */
	void exitOrderby_item(sqlParserParser.Orderby_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link sqlParserParser#limit_clause}.
	 * @param ctx the parse tree
	 */
	void enterLimit_clause(sqlParserParser.Limit_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqlParserParser#limit_clause}.
	 * @param ctx the parse tree
	 */
	void exitLimit_clause(sqlParserParser.Limit_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link sqlParserParser#offset}.
	 * @param ctx the parse tree
	 */
	void enterOffset(sqlParserParser.OffsetContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqlParserParser#offset}.
	 * @param ctx the parse tree
	 */
	void exitOffset(sqlParserParser.OffsetContext ctx);
	/**
	 * Enter a parse tree produced by {@link sqlParserParser#row_count}.
	 * @param ctx the parse tree
	 */
	void enterRow_count(sqlParserParser.Row_countContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqlParserParser#row_count}.
	 * @param ctx the parse tree
	 */
	void exitRow_count(sqlParserParser.Row_countContext ctx);
	/**
	 * Enter a parse tree produced by {@link sqlParserParser#select_list}.
	 * @param ctx the parse tree
	 */
	void enterSelect_list(sqlParserParser.Select_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqlParserParser#select_list}.
	 * @param ctx the parse tree
	 */
	void exitSelect_list(sqlParserParser.Select_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link sqlParserParser#displayed_column}.
	 * @param ctx the parse tree
	 */
	void enterDisplayed_column(sqlParserParser.Displayed_columnContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqlParserParser#displayed_column}.
	 * @param ctx the parse tree
	 */
	void exitDisplayed_column(sqlParserParser.Displayed_columnContext ctx);
	/**
	 * Enter a parse tree produced by {@link sqlParserParser#table_spec}.
	 * @param ctx the parse tree
	 */
	void enterTable_spec(sqlParserParser.Table_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqlParserParser#table_spec}.
	 * @param ctx the parse tree
	 */
	void exitTable_spec(sqlParserParser.Table_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link sqlParserParser#column_spec}.
	 * @param ctx the parse tree
	 */
	void enterColumn_spec(sqlParserParser.Column_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqlParserParser#column_spec}.
	 * @param ctx the parse tree
	 */
	void exitColumn_spec(sqlParserParser.Column_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link sqlParserParser#alias}.
	 * @param ctx the parse tree
	 */
	void enterAlias(sqlParserParser.AliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqlParserParser#alias}.
	 * @param ctx the parse tree
	 */
	void exitAlias(sqlParserParser.AliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link sqlParserParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(sqlParserParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqlParserParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(sqlParserParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link sqlParserParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(sqlParserParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqlParserParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(sqlParserParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link sqlParserParser#boolean_primary}.
	 * @param ctx the parse tree
	 */
	void enterBoolean_primary(sqlParserParser.Boolean_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqlParserParser#boolean_primary}.
	 * @param ctx the parse tree
	 */
	void exitBoolean_primary(sqlParserParser.Boolean_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link sqlParserParser#comparison_operator}.
	 * @param ctx the parse tree
	 */
	void enterComparison_operator(sqlParserParser.Comparison_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqlParserParser#comparison_operator}.
	 * @param ctx the parse tree
	 */
	void exitComparison_operator(sqlParserParser.Comparison_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link sqlParserParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterPredicate(sqlParserParser.PredicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqlParserParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitPredicate(sqlParserParser.PredicateContext ctx);
	/**
	 * Enter a parse tree produced by {@link sqlParserParser#bit_expr}.
	 * @param ctx the parse tree
	 */
	void enterBit_expr(sqlParserParser.Bit_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqlParserParser#bit_expr}.
	 * @param ctx the parse tree
	 */
	void exitBit_expr(sqlParserParser.Bit_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link sqlParserParser#simple_expr}.
	 * @param ctx the parse tree
	 */
	void enterSimple_expr(sqlParserParser.Simple_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqlParserParser#simple_expr}.
	 * @param ctx the parse tree
	 */
	void exitSimple_expr(sqlParserParser.Simple_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link sqlParserParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(sqlParserParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqlParserParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(sqlParserParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link sqlParserParser#delete_statement}.
	 * @param ctx the parse tree
	 */
	void enterDelete_statement(sqlParserParser.Delete_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqlParserParser#delete_statement}.
	 * @param ctx the parse tree
	 */
	void exitDelete_statement(sqlParserParser.Delete_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link sqlParserParser#delete_expression}.
	 * @param ctx the parse tree
	 */
	void enterDelete_expression(sqlParserParser.Delete_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqlParserParser#delete_expression}.
	 * @param ctx the parse tree
	 */
	void exitDelete_expression(sqlParserParser.Delete_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link sqlParserParser#delete_list1}.
	 * @param ctx the parse tree
	 */
	void enterDelete_list1(sqlParserParser.Delete_list1Context ctx);
	/**
	 * Exit a parse tree produced by {@link sqlParserParser#delete_list1}.
	 * @param ctx the parse tree
	 */
	void exitDelete_list1(sqlParserParser.Delete_list1Context ctx);
	/**
	 * Enter a parse tree produced by {@link sqlParserParser#table_name}.
	 * @param ctx the parse tree
	 */
	void enterTable_name(sqlParserParser.Table_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqlParserParser#table_name}.
	 * @param ctx the parse tree
	 */
	void exitTable_name(sqlParserParser.Table_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link sqlParserParser#update_statement}.
	 * @param ctx the parse tree
	 */
	void enterUpdate_statement(sqlParserParser.Update_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqlParserParser#update_statement}.
	 * @param ctx the parse tree
	 */
	void exitUpdate_statement(sqlParserParser.Update_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link sqlParserParser#update_expression}.
	 * @param ctx the parse tree
	 */
	void enterUpdate_expression(sqlParserParser.Update_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqlParserParser#update_expression}.
	 * @param ctx the parse tree
	 */
	void exitUpdate_expression(sqlParserParser.Update_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link sqlParserParser#update_list1}.
	 * @param ctx the parse tree
	 */
	void enterUpdate_list1(sqlParserParser.Update_list1Context ctx);
	/**
	 * Exit a parse tree produced by {@link sqlParserParser#update_list1}.
	 * @param ctx the parse tree
	 */
	void exitUpdate_list1(sqlParserParser.Update_list1Context ctx);
	/**
	 * Enter a parse tree produced by {@link sqlParserParser#set_clause}.
	 * @param ctx the parse tree
	 */
	void enterSet_clause(sqlParserParser.Set_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqlParserParser#set_clause}.
	 * @param ctx the parse tree
	 */
	void exitSet_clause(sqlParserParser.Set_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link sqlParserParser#assignment_list}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_list(sqlParserParser.Assignment_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqlParserParser#assignment_list}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_list(sqlParserParser.Assignment_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link sqlParserParser#col_name}.
	 * @param ctx the parse tree
	 */
	void enterCol_name(sqlParserParser.Col_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqlParserParser#col_name}.
	 * @param ctx the parse tree
	 */
	void exitCol_name(sqlParserParser.Col_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link sqlParserParser#insert_statement}.
	 * @param ctx the parse tree
	 */
	void enterInsert_statement(sqlParserParser.Insert_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqlParserParser#insert_statement}.
	 * @param ctx the parse tree
	 */
	void exitInsert_statement(sqlParserParser.Insert_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link sqlParserParser#insert_expression}.
	 * @param ctx the parse tree
	 */
	void enterInsert_expression(sqlParserParser.Insert_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqlParserParser#insert_expression}.
	 * @param ctx the parse tree
	 */
	void exitInsert_expression(sqlParserParser.Insert_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link sqlParserParser#insert_list1}.
	 * @param ctx the parse tree
	 */
	void enterInsert_list1(sqlParserParser.Insert_list1Context ctx);
	/**
	 * Exit a parse tree produced by {@link sqlParserParser#insert_list1}.
	 * @param ctx the parse tree
	 */
	void exitInsert_list1(sqlParserParser.Insert_list1Context ctx);
	/**
	 * Enter a parse tree produced by {@link sqlParserParser#column_name_list}.
	 * @param ctx the parse tree
	 */
	void enterColumn_name_list(sqlParserParser.Column_name_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqlParserParser#column_name_list}.
	 * @param ctx the parse tree
	 */
	void exitColumn_name_list(sqlParserParser.Column_name_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link sqlParserParser#value_list}.
	 * @param ctx the parse tree
	 */
	void enterValue_list(sqlParserParser.Value_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqlParserParser#value_list}.
	 * @param ctx the parse tree
	 */
	void exitValue_list(sqlParserParser.Value_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link sqlParserParser#value_list1}.
	 * @param ctx the parse tree
	 */
	void enterValue_list1(sqlParserParser.Value_list1Context ctx);
	/**
	 * Exit a parse tree produced by {@link sqlParserParser#value_list1}.
	 * @param ctx the parse tree
	 */
	void exitValue_list1(sqlParserParser.Value_list1Context ctx);
	/**
	 * Enter a parse tree produced by {@link sqlParserParser#value_list_A}.
	 * @param ctx the parse tree
	 */
	void enterValue_list_A(sqlParserParser.Value_list_AContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqlParserParser#value_list_A}.
	 * @param ctx the parse tree
	 */
	void exitValue_list_A(sqlParserParser.Value_list_AContext ctx);
	/**
	 * Enter a parse tree produced by {@link sqlParserParser#column_list_B}.
	 * @param ctx the parse tree
	 */
	void enterColumn_list_B(sqlParserParser.Column_list_BContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqlParserParser#column_list_B}.
	 * @param ctx the parse tree
	 */
	void exitColumn_list_B(sqlParserParser.Column_list_BContext ctx);
	/**
	 * Enter a parse tree produced by {@link sqlParserParser#table_references}.
	 * @param ctx the parse tree
	 */
	void enterTable_references(sqlParserParser.Table_referencesContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqlParserParser#table_references}.
	 * @param ctx the parse tree
	 */
	void exitTable_references(sqlParserParser.Table_referencesContext ctx);
	/**
	 * Enter a parse tree produced by {@link sqlParserParser#table_reference}.
	 * @param ctx the parse tree
	 */
	void enterTable_reference(sqlParserParser.Table_referenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqlParserParser#table_reference}.
	 * @param ctx the parse tree
	 */
	void exitTable_reference(sqlParserParser.Table_referenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link sqlParserParser#table_factor}.
	 * @param ctx the parse tree
	 */
	void enterTable_factor(sqlParserParser.Table_factorContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqlParserParser#table_factor}.
	 * @param ctx the parse tree
	 */
	void exitTable_factor(sqlParserParser.Table_factorContext ctx);
	/**
	 * Enter a parse tree produced by {@link sqlParserParser#table_subquery}.
	 * @param ctx the parse tree
	 */
	void enterTable_subquery(sqlParserParser.Table_subqueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqlParserParser#table_subquery}.
	 * @param ctx the parse tree
	 */
	void exitTable_subquery(sqlParserParser.Table_subqueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link sqlParserParser#join_table}.
	 * @param ctx the parse tree
	 */
	void enterJoin_table(sqlParserParser.Join_tableContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqlParserParser#join_table}.
	 * @param ctx the parse tree
	 */
	void exitJoin_table(sqlParserParser.Join_tableContext ctx);
	/**
	 * Enter a parse tree produced by {@link sqlParserParser#join_table_factor}.
	 * @param ctx the parse tree
	 */
	void enterJoin_table_factor(sqlParserParser.Join_table_factorContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqlParserParser#join_table_factor}.
	 * @param ctx the parse tree
	 */
	void exitJoin_table_factor(sqlParserParser.Join_table_factorContext ctx);
	/**
	 * Enter a parse tree produced by {@link sqlParserParser#join_condition}.
	 * @param ctx the parse tree
	 */
	void enterJoin_condition(sqlParserParser.Join_conditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqlParserParser#join_condition}.
	 * @param ctx the parse tree
	 */
	void exitJoin_condition(sqlParserParser.Join_conditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link sqlParserParser#conditional_expr}.
	 * @param ctx the parse tree
	 */
	void enterConditional_expr(sqlParserParser.Conditional_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqlParserParser#conditional_expr}.
	 * @param ctx the parse tree
	 */
	void exitConditional_expr(sqlParserParser.Conditional_exprContext ctx);
}