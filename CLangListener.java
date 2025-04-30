// Generated from CLang.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CLangParser}.
 */
public interface CLangListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CLangParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(CLangParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link CLangParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(CLangParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assignStat}
	 * labeled alternative in {@link CLangParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterAssignStat(CLangParser.AssignStatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignStat}
	 * labeled alternative in {@link CLangParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitAssignStat(CLangParser.AssignStatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code reassignStat}
	 * labeled alternative in {@link CLangParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterReassignStat(CLangParser.ReassignStatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code reassignStat}
	 * labeled alternative in {@link CLangParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitReassignStat(CLangParser.ReassignStatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprStat}
	 * labeled alternative in {@link CLangParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterExprStat(CLangParser.ExprStatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprStat}
	 * labeled alternative in {@link CLangParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitExprStat(CLangParser.ExprStatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code condStat}
	 * labeled alternative in {@link CLangParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterCondStat(CLangParser.CondStatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code condStat}
	 * labeled alternative in {@link CLangParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitCondStat(CLangParser.CondStatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cycleStat}
	 * labeled alternative in {@link CLangParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterCycleStat(CLangParser.CycleStatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cycleStat}
	 * labeled alternative in {@link CLangParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitCycleStat(CLangParser.CycleStatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code printStat}
	 * labeled alternative in {@link CLangParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterPrintStat(CLangParser.PrintStatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code printStat}
	 * labeled alternative in {@link CLangParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitPrintStat(CLangParser.PrintStatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code intExpr}
	 * labeled alternative in {@link CLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterIntExpr(CLangParser.IntExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code intExpr}
	 * labeled alternative in {@link CLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitIntExpr(CLangParser.IntExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link CLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMulDiv(CLangParser.MulDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link CLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMulDiv(CLangParser.MulDivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link CLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAddSub(CLangParser.AddSubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link CLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAddSub(CLangParser.AddSubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Compare}
	 * labeled alternative in {@link CLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterCompare(CLangParser.CompareContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Compare}
	 * labeled alternative in {@link CLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitCompare(CLangParser.CompareContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parensExpr}
	 * labeled alternative in {@link CLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParensExpr(CLangParser.ParensExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parensExpr}
	 * labeled alternative in {@link CLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParensExpr(CLangParser.ParensExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code idExpr}
	 * labeled alternative in {@link CLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterIdExpr(CLangParser.IdExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code idExpr}
	 * labeled alternative in {@link CLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitIdExpr(CLangParser.IdExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link CLangParser#blockOrStat}.
	 * @param ctx the parse tree
	 */
	void enterBlockOrStat(CLangParser.BlockOrStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link CLangParser#blockOrStat}.
	 * @param ctx the parse tree
	 */
	void exitBlockOrStat(CLangParser.BlockOrStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link CLangParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(CLangParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CLangParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(CLangParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CLangParser#cycle}.
	 * @param ctx the parse tree
	 */
	void enterCycle(CLangParser.CycleContext ctx);
	/**
	 * Exit a parse tree produced by {@link CLangParser#cycle}.
	 * @param ctx the parse tree
	 */
	void exitCycle(CLangParser.CycleContext ctx);
}