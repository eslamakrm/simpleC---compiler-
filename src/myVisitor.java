import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class myVisitor extends GramBaseVisitor<Integer>
{
    public static HashMap<String, Integer> symbolTable = new HashMap();
    @Override public Integer visitProgram(GramParser.ProgramContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Integer visitIFI(GramParser.IFIContext ctx)
    {
        int res = visit(ctx.expr());
        if(res>0)
        {
           return visit(ctx.statement());
        }
        return 0;

    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Integer visitIFELSEI(GramParser.IFELSEIContext ctx)
    {
        int res = visit(ctx.expr());
        if(res>0)
        {
            return visit(ctx.statement(0));
        }
        else
        {
            return visit(ctx.statement(1));
        }
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Integer visitWHILEI(GramParser.WHILEIContext ctx)
    {
        int x=0;
        while ((visit(ctx.expr())) == 1)
        {
            x = visit(ctx.statement());
        }
        return x;
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Integer visitDOWHILEI(GramParser.DOWHILEIContext ctx)
    {
        int x =0;
        do
        {
              x =  visit(ctx.statement());
        }
        while ( (visit(ctx.expr())) == 1);
        return x;
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Integer visitBODY(GramParser.BODYContext ctx)
    {
         int i = ctx.statement().size();
         int ret=0;
         for (int a=0 ; a<i ; a++)
         {
            ret =  visit(ctx.statement(a));
         }
        return ret;
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Integer visitEXPRII(GramParser.EXPRIIContext ctx)
    {
        return visit(ctx.expr());
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Integer visitSEMI(GramParser.SEMIContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Integer visitTESTI(GramParser.TESTIContext ctx)
    {
        return visit(ctx.test());
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Integer visitASSIGN(GramParser.ASSIGNContext ctx)
    {
        int res =  this.visit(ctx.sum());
        this.symbolTable.put(ctx.id().STRING().getText(), res);
        return res;
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Integer visitBOOL(GramParser.BOOLContext ctx)
    {
        return  visit(ctx.sum());
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Integer visitBIGGER(GramParser.BIGGERContext ctx)
    {
        int sum1 =  visit(ctx.sum(0));
        int sum2 = visit(ctx.sum(1));
        if(sum1 < sum2)
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Integer visitSMALLER(GramParser.SMALLERContext ctx)
    {
        int sum1 =  visit(ctx.sum(0));
        int sum2 = visit(ctx.sum(1));
        if(sum1 > sum2)
        {

            return 1;

        }
        else
        {
            return 0;
        }
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Integer visitEQUAL(GramParser.EQUALContext ctx)
    {
        int sum1 =  visit(ctx.sum(0));
        int sum2 = visit(ctx.sum(1));
        if(sum1 == sum2)
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Integer visitOPI(GramParser.OPIContext ctx)
    {
        int sum1 =  visit(ctx.sum(0));
        int sum2 = visit(ctx.sum(1));
        String op = ctx.op().getText();
        switch (op) {
            case "+": return sum1+sum2;
            case "-": return sum1-sum2;
            case "*": return sum1*sum2;
            case "/": return  sum1/sum2;
            default: return 0;
        }

    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Integer visitIDI(GramParser.IDIContext ctx)
    {
        return this.symbolTable.get(ctx.id().STRING().getText());
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Integer visitINTEGERI(GramParser.INTEGERIContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Integer visitOp(GramParser.OpContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Integer visitId(GramParser.IdContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Integer visitInteger(GramParser.IntegerContext ctx)
    {
        return  Integer.parseInt(ctx.INT().getText());

    }

    public static void printMap(Map mp) {
        Iterator it = mp.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry)it.next();
            System.out.println(pair.getKey() + " = " + pair.getValue());
            it.remove(); // avoids a ConcurrentModificationException
        }
    }
}
