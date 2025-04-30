import java.util.HashMap;
import java.util.Map;

public class EvalVisitor extends CLangBaseVisitor<Integer> {
    /**
     * "memory" for our calculator; variable/value pairs go here
     */
    Map<String, Integer> memory = new HashMap<String, Integer>();

    @Override
    public Integer visitProg(CLangParser.ProgContext ctx) {
        Integer last = null;
        for (CLangParser.StatContext stat : ctx.stat()) {
            last = visit(stat);
        }
        return last;
    }

    /**
     * ID '=' expr NEWLINE
     */
    @Override
    public Integer visitAssignStat(CLangParser.AssignStatContext ctx) {
        String id = ctx.ID().getText(); // id is left-hand side of '='
        Integer value = visit(ctx.expr()); // compute value of expression on right
        memory.put(id, value); // store it in our memory
        return value;
    }

    @Override
    public Integer visitReassignStat(CLangParser.ReassignStatContext ctx) {
        String id = ctx.ID().getText(); // id is left-hand side of '='
        if (memory.containsKey(id)) {
            int value = visit(ctx.expr()); // compute value of expression on right
            memory.put(id, value);
            return value;
        }
        throw new RuntimeException("Not initialized variable");
    }

    /**
     * if condition
     */
    @Override
    public Integer visitCondStat(CLangParser.CondStatContext ctx) {
        CLangParser.ConditionContext cond = ctx.condition();
        Integer condResult = visit(cond.cond);

        if (condResult != 0) {
            visit(cond.thenBlock);
        } else if (cond.elseBlock != null) {
            visit(cond.elseBlock);
        }
        return condResult;
    }

    @Override
    public Integer visitCycleStat(CLangParser.CycleStatContext ctx) {
        CLangParser.CycleContext cycle = ctx.cycle();
        Integer condResult = visit(cycle.cond);
        while (condResult != 0) {
            visit(cycle.thenBlock);
            condResult = visit(cycle.cond);
        }
        return condResult;
    }

    @Override
    public Integer visitPrintStat(CLangParser.PrintStatContext ctx) {
        int result = visit(ctx.expr());
        System.out.println(result);
        return visitChildren(ctx);
    }

    /**
     * expr NEWLINE
     */
    @Override
    public Integer visitExprStat(CLangParser.ExprStatContext ctx) {
        return visit(ctx.expr());
    }

    /**
     * INT
     */
    @Override
    public Integer visitIntExpr(CLangParser.IntExprContext ctx) {
        return Integer.valueOf(ctx.INT().getText());
    }

    /**
     * ID
     */
    @Override
    public Integer visitIdExpr(CLangParser.IdExprContext ctx) {
        String id = ctx.ID().getText();
        if (memory.containsKey(id)) return memory.get(id);
        else throw new RuntimeException("Not initialized variable");
    }

    @Override
    public Integer visitCompare(CLangParser.CompareContext ctx) {
        int left = visit(ctx.expr(0));
        int right = visit(ctx.expr(1));
        if (ctx.op.getType() == CLangParser.LT) return left < right ? 1 : 0;
        else if (ctx.op.getType() == CLangParser.LEQ) return left <= right ? 1 : 0;
        else if (ctx.op.getType() == CLangParser.GT) return left > right ? 1 : 0;
        else if (ctx.op.getType() == CLangParser.GEQ) return left >= right ? 1 : 0;
        else if (ctx.op.getType() == CLangParser.EQ) return left == right ? 1 : 0;
        else if (ctx.op.getType() == CLangParser.NEQ) return left != right ? 1 : 0;
        return visitChildren(ctx);
    }

    /**
     * expr op=('*'|'/') expr
     */
    @Override
    public Integer visitMulDiv(CLangParser.MulDivContext ctx) {
        int left = visit(ctx.expr(0)); // get value of left subexpression
        int right = visit(ctx.expr(1)); // get value of right subexpression
        if (ctx.op.getType() == CLangParser.MUL) return left * right;
        return left / right; // must be DIV
    }

    /**
     * expr op=('+'|'-') expr
     */
    @Override
    public Integer visitAddSub(CLangParser.AddSubContext ctx) {
        int left = visit(ctx.expr(0)); // get value of left subexpression
        int right = visit(ctx.expr(1)); // get value of right subexpression
        if (ctx.op.getType() == CLangParser.ADD) return left + right;
        return left - right; // must be SUB
    }

    /**
     * '(' expr ')'
     */
    @Override
    public Integer visitParensExpr(CLangParser.ParensExprContext ctx) {
        return visit(ctx.expr()); // return child expr's value
    }
}