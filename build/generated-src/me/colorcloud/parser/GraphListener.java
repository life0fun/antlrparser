// Generated from /Users/haijinyan/dev/antlrparser/src/main/antlr/Graph.g4 by ANTLR 4.2.2
package me.colorcloud.parser;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GraphParser}.
 */
public interface GraphListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GraphParser#edge}.
	 * @param ctx the parse tree
	 */
	void enterEdge(@NotNull GraphParser.EdgeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphParser#edge}.
	 * @param ctx the parse tree
	 */
	void exitEdge(@NotNull GraphParser.EdgeContext ctx);

	/**
	 * Enter a parse tree produced by {@link GraphParser#vertex}.
	 * @param ctx the parse tree
	 */
	void enterVertex(@NotNull GraphParser.VertexContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphParser#vertex}.
	 * @param ctx the parse tree
	 */
	void exitVertex(@NotNull GraphParser.VertexContext ctx);

	/**
	 * Enter a parse tree produced by {@link GraphParser#graph}.
	 * @param ctx the parse tree
	 */
	void enterGraph(@NotNull GraphParser.GraphContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphParser#graph}.
	 * @param ctx the parse tree
	 */
	void exitGraph(@NotNull GraphParser.GraphContext ctx);
}