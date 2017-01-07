// Generated from /Users/haijinyan/dev/antlrparser/src/main/antlr/Graph.g4 by ANTLR 4.2.2
package me.colorcloud.parser;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link GraphParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface GraphVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link GraphParser#edge}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEdge(@NotNull GraphParser.EdgeContext ctx);

	/**
	 * Visit a parse tree produced by {@link GraphParser#vertex}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVertex(@NotNull GraphParser.VertexContext ctx);

	/**
	 * Visit a parse tree produced by {@link GraphParser#graph}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGraph(@NotNull GraphParser.GraphContext ctx);
}