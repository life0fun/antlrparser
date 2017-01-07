// Generated from /Users/haijinyan/dev/antlrparser/src/main/antlr/Calculator.g4 by ANTLR 4.2.2
package me.colorcloud.parser;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CalculatorParser}.
 */
public interface CalculatorListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#ToMultOrDiv}.
	 * @param ctx the parse tree
	 */
	void enterToMultOrDiv(@NotNull CalculatorParser.ToMultOrDivContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#ToMultOrDiv}.
	 * @param ctx the parse tree
	 */
	void exitToMultOrDiv(@NotNull CalculatorParser.ToMultOrDivContext ctx);

	/**
	 * Enter a parse tree produced by {@link CalculatorParser#Multiplication}.
	 * @param ctx the parse tree
	 */
	void enterMultiplication(@NotNull CalculatorParser.MultiplicationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#Multiplication}.
	 * @param ctx the parse tree
	 */
	void exitMultiplication(@NotNull CalculatorParser.MultiplicationContext ctx);

	/**
	 * Enter a parse tree produced by {@link CalculatorParser#Variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(@NotNull CalculatorParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#Variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(@NotNull CalculatorParser.VariableContext ctx);

	/**
	 * Enter a parse tree produced by {@link CalculatorParser#ConstantE}.
	 * @param ctx the parse tree
	 */
	void enterConstantE(@NotNull CalculatorParser.ConstantEContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#ConstantE}.
	 * @param ctx the parse tree
	 */
	void exitConstantE(@NotNull CalculatorParser.ConstantEContext ctx);

	/**
	 * Enter a parse tree produced by {@link CalculatorParser#Calculate}.
	 * @param ctx the parse tree
	 */
	void enterCalculate(@NotNull CalculatorParser.CalculateContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#Calculate}.
	 * @param ctx the parse tree
	 */
	void exitCalculate(@NotNull CalculatorParser.CalculateContext ctx);

	/**
	 * Enter a parse tree produced by {@link CalculatorParser#Double}.
	 * @param ctx the parse tree
	 */
	void enterDouble(@NotNull CalculatorParser.DoubleContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#Double}.
	 * @param ctx the parse tree
	 */
	void exitDouble(@NotNull CalculatorParser.DoubleContext ctx);

	/**
	 * Enter a parse tree produced by {@link CalculatorParser#ToPow}.
	 * @param ctx the parse tree
	 */
	void enterToPow(@NotNull CalculatorParser.ToPowContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#ToPow}.
	 * @param ctx the parse tree
	 */
	void exitToPow(@NotNull CalculatorParser.ToPowContext ctx);

	/**
	 * Enter a parse tree produced by {@link CalculatorParser#Int}.
	 * @param ctx the parse tree
	 */
	void enterInt(@NotNull CalculatorParser.IntContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#Int}.
	 * @param ctx the parse tree
	 */
	void exitInt(@NotNull CalculatorParser.IntContext ctx);

	/**
	 * Enter a parse tree produced by {@link CalculatorParser#ConstantPI}.
	 * @param ctx the parse tree
	 */
	void enterConstantPI(@NotNull CalculatorParser.ConstantPIContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#ConstantPI}.
	 * @param ctx the parse tree
	 */
	void exitConstantPI(@NotNull CalculatorParser.ConstantPIContext ctx);

	/**
	 * Enter a parse tree produced by {@link CalculatorParser#ChangeSign}.
	 * @param ctx the parse tree
	 */
	void enterChangeSign(@NotNull CalculatorParser.ChangeSignContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#ChangeSign}.
	 * @param ctx the parse tree
	 */
	void exitChangeSign(@NotNull CalculatorParser.ChangeSignContext ctx);

	/**
	 * Enter a parse tree produced by {@link CalculatorParser#Braces}.
	 * @param ctx the parse tree
	 */
	void enterBraces(@NotNull CalculatorParser.BracesContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#Braces}.
	 * @param ctx the parse tree
	 */
	void exitBraces(@NotNull CalculatorParser.BracesContext ctx);

	/**
	 * Enter a parse tree produced by {@link CalculatorParser#Division}.
	 * @param ctx the parse tree
	 */
	void enterDivision(@NotNull CalculatorParser.DivisionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#Division}.
	 * @param ctx the parse tree
	 */
	void exitDivision(@NotNull CalculatorParser.DivisionContext ctx);

	/**
	 * Enter a parse tree produced by {@link CalculatorParser#Plus}.
	 * @param ctx the parse tree
	 */
	void enterPlus(@NotNull CalculatorParser.PlusContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#Plus}.
	 * @param ctx the parse tree
	 */
	void exitPlus(@NotNull CalculatorParser.PlusContext ctx);

	/**
	 * Enter a parse tree produced by {@link CalculatorParser#ToSetVar}.
	 * @param ctx the parse tree
	 */
	void enterToSetVar(@NotNull CalculatorParser.ToSetVarContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#ToSetVar}.
	 * @param ctx the parse tree
	 */
	void exitToSetVar(@NotNull CalculatorParser.ToSetVarContext ctx);

	/**
	 * Enter a parse tree produced by {@link CalculatorParser#Minus}.
	 * @param ctx the parse tree
	 */
	void enterMinus(@NotNull CalculatorParser.MinusContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#Minus}.
	 * @param ctx the parse tree
	 */
	void exitMinus(@NotNull CalculatorParser.MinusContext ctx);

	/**
	 * Enter a parse tree produced by {@link CalculatorParser#Power}.
	 * @param ctx the parse tree
	 */
	void enterPower(@NotNull CalculatorParser.PowerContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#Power}.
	 * @param ctx the parse tree
	 */
	void exitPower(@NotNull CalculatorParser.PowerContext ctx);

	/**
	 * Enter a parse tree produced by {@link CalculatorParser#ToAtom}.
	 * @param ctx the parse tree
	 */
	void enterToAtom(@NotNull CalculatorParser.ToAtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#ToAtom}.
	 * @param ctx the parse tree
	 */
	void exitToAtom(@NotNull CalculatorParser.ToAtomContext ctx);

	/**
	 * Enter a parse tree produced by {@link CalculatorParser#SetVariable}.
	 * @param ctx the parse tree
	 */
	void enterSetVariable(@NotNull CalculatorParser.SetVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#SetVariable}.
	 * @param ctx the parse tree
	 */
	void exitSetVariable(@NotNull CalculatorParser.SetVariableContext ctx);
}