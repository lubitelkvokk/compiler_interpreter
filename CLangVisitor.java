// Generated from CLang.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CLangParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CLangVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CLangParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(CLangParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assignStat}
	 * labeled alternative in {@link CLangParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignStat(CLangParser.AssignStatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code reassignStat}
	 * labeled alternative in {@link CLangParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReassignStat(CLangParser.ReassignStatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprStat}
	 * labeled alternative in {@link CLangParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprStat(CLangParser.ExprStatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code condStat}
	 * labeled alternative in {@link CLangParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondStat(CLangParser.CondStatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cycleStat}
	 * labeled alternative in {@link CLangParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCycleStat(CLangParser.CycleStatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code printStat}
	 * labeled alternative in {@link CLangParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintStat(CLangParser.PrintStatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code intExpr}
	 * labeled alternative in {@link CLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntExpr(CLangParser.IntExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link CLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulDiv(CLangParser.MulDivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link CLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddSub(CLangParser.AddSubContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Compare}
	 * labeled alternative in {@link CLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompare(CLangParser.CompareContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parensExpr}
	 * labeled alternative in {@link CLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParensExpr(CLangParser.ParensExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code idExpr}
	 * labeled alternative in {@link CLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdExpr(CLangParser.IdExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link CLangParser#blockOrStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockOrStat(CLangParser.BlockOrStatContext ctx);
	/**
	 * Visit a parse tree produced by {@link CLangParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(CLangParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CLangParser#cycle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCycle(CLangParser.CycleContext ctx);
}