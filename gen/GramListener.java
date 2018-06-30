// Generated from F:/simple/src\Gram.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GramParser}.
 */
public interface GramListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GramParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(GramParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(GramParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IFI}
	 * labeled alternative in {@link GramParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterIFI(GramParser.IFIContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IFI}
	 * labeled alternative in {@link GramParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitIFI(GramParser.IFIContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IFELSEI}
	 * labeled alternative in {@link GramParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterIFELSEI(GramParser.IFELSEIContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IFELSEI}
	 * labeled alternative in {@link GramParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitIFELSEI(GramParser.IFELSEIContext ctx);
	/**
	 * Enter a parse tree produced by the {@code WHILEI}
	 * labeled alternative in {@link GramParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterWHILEI(GramParser.WHILEIContext ctx);
	/**
	 * Exit a parse tree produced by the {@code WHILEI}
	 * labeled alternative in {@link GramParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitWHILEI(GramParser.WHILEIContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DOWHILEI}
	 * labeled alternative in {@link GramParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterDOWHILEI(GramParser.DOWHILEIContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DOWHILEI}
	 * labeled alternative in {@link GramParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitDOWHILEI(GramParser.DOWHILEIContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BODY}
	 * labeled alternative in {@link GramParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterBODY(GramParser.BODYContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BODY}
	 * labeled alternative in {@link GramParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitBODY(GramParser.BODYContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EXPRII}
	 * labeled alternative in {@link GramParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterEXPRII(GramParser.EXPRIIContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EXPRII}
	 * labeled alternative in {@link GramParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitEXPRII(GramParser.EXPRIIContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SEMI}
	 * labeled alternative in {@link GramParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterSEMI(GramParser.SEMIContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SEMI}
	 * labeled alternative in {@link GramParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitSEMI(GramParser.SEMIContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TESTI}
	 * labeled alternative in {@link GramParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterTESTI(GramParser.TESTIContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TESTI}
	 * labeled alternative in {@link GramParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitTESTI(GramParser.TESTIContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ASSIGN}
	 * labeled alternative in {@link GramParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterASSIGN(GramParser.ASSIGNContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ASSIGN}
	 * labeled alternative in {@link GramParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitASSIGN(GramParser.ASSIGNContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BOOL}
	 * labeled alternative in {@link GramParser#test}.
	 * @param ctx the parse tree
	 */
	void enterBOOL(GramParser.BOOLContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BOOL}
	 * labeled alternative in {@link GramParser#test}.
	 * @param ctx the parse tree
	 */
	void exitBOOL(GramParser.BOOLContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BIGGER}
	 * labeled alternative in {@link GramParser#test}.
	 * @param ctx the parse tree
	 */
	void enterBIGGER(GramParser.BIGGERContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BIGGER}
	 * labeled alternative in {@link GramParser#test}.
	 * @param ctx the parse tree
	 */
	void exitBIGGER(GramParser.BIGGERContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SMALLER}
	 * labeled alternative in {@link GramParser#test}.
	 * @param ctx the parse tree
	 */
	void enterSMALLER(GramParser.SMALLERContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SMALLER}
	 * labeled alternative in {@link GramParser#test}.
	 * @param ctx the parse tree
	 */
	void exitSMALLER(GramParser.SMALLERContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EQUAL}
	 * labeled alternative in {@link GramParser#test}.
	 * @param ctx the parse tree
	 */
	void enterEQUAL(GramParser.EQUALContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EQUAL}
	 * labeled alternative in {@link GramParser#test}.
	 * @param ctx the parse tree
	 */
	void exitEQUAL(GramParser.EQUALContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OPI}
	 * labeled alternative in {@link GramParser#sum}.
	 * @param ctx the parse tree
	 */
	void enterOPI(GramParser.OPIContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OPI}
	 * labeled alternative in {@link GramParser#sum}.
	 * @param ctx the parse tree
	 */
	void exitOPI(GramParser.OPIContext ctx);
	/**
	 * Enter a parse tree produced by the {@code INTEGERI}
	 * labeled alternative in {@link GramParser#sum}.
	 * @param ctx the parse tree
	 */
	void enterINTEGERI(GramParser.INTEGERIContext ctx);
	/**
	 * Exit a parse tree produced by the {@code INTEGERI}
	 * labeled alternative in {@link GramParser#sum}.
	 * @param ctx the parse tree
	 */
	void exitINTEGERI(GramParser.INTEGERIContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IDI}
	 * labeled alternative in {@link GramParser#sum}.
	 * @param ctx the parse tree
	 */
	void enterIDI(GramParser.IDIContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IDI}
	 * labeled alternative in {@link GramParser#sum}.
	 * @param ctx the parse tree
	 */
	void exitIDI(GramParser.IDIContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#op}.
	 * @param ctx the parse tree
	 */
	void enterOp(GramParser.OpContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#op}.
	 * @param ctx the parse tree
	 */
	void exitOp(GramParser.OpContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#id}.
	 * @param ctx the parse tree
	 */
	void enterId(GramParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#id}.
	 * @param ctx the parse tree
	 */
	void exitId(GramParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#integer}.
	 * @param ctx the parse tree
	 */
	void enterInteger(GramParser.IntegerContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#integer}.
	 * @param ctx the parse tree
	 */
	void exitInteger(GramParser.IntegerContext ctx);
}