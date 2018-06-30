// Generated from F:/simple/src\Gram.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link GramParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface GramVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link GramParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(GramParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IFI}
	 * labeled alternative in {@link GramParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIFI(GramParser.IFIContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IFELSEI}
	 * labeled alternative in {@link GramParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIFELSEI(GramParser.IFELSEIContext ctx);
	/**
	 * Visit a parse tree produced by the {@code WHILEI}
	 * labeled alternative in {@link GramParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWHILEI(GramParser.WHILEIContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DOWHILEI}
	 * labeled alternative in {@link GramParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDOWHILEI(GramParser.DOWHILEIContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BODY}
	 * labeled alternative in {@link GramParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBODY(GramParser.BODYContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EXPRII}
	 * labeled alternative in {@link GramParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEXPRII(GramParser.EXPRIIContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SEMI}
	 * labeled alternative in {@link GramParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSEMI(GramParser.SEMIContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TESTI}
	 * labeled alternative in {@link GramParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTESTI(GramParser.TESTIContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ASSIGN}
	 * labeled alternative in {@link GramParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitASSIGN(GramParser.ASSIGNContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BOOL}
	 * labeled alternative in {@link GramParser#test}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBOOL(GramParser.BOOLContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BIGGER}
	 * labeled alternative in {@link GramParser#test}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBIGGER(GramParser.BIGGERContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SMALLER}
	 * labeled alternative in {@link GramParser#test}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSMALLER(GramParser.SMALLERContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EQUAL}
	 * labeled alternative in {@link GramParser#test}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEQUAL(GramParser.EQUALContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OPI}
	 * labeled alternative in {@link GramParser#sum}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOPI(GramParser.OPIContext ctx);
	/**
	 * Visit a parse tree produced by the {@code INTEGERI}
	 * labeled alternative in {@link GramParser#sum}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitINTEGERI(GramParser.INTEGERIContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IDI}
	 * labeled alternative in {@link GramParser#sum}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIDI(GramParser.IDIContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp(GramParser.OpContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(GramParser.IdContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#integer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInteger(GramParser.IntegerContext ctx);
}