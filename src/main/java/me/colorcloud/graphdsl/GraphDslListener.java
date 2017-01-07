package me.colorcloud.graphdsl;

import me.colorcloud.graphdsl.Edge;
import me.colorcloud.graphdsl.Graph;

import me.colorcloud.graphdsl.Vertex;

// parser rule context classes are gened from ANTLR.
import me.colorcloud.parser.GraphParser;
import me.colorcloud.parser.GraphBaseListener;
import me.colorcloud.parser.GraphParser.EdgeContext;
import org.antlr.v4.runtime.TokenStream;

/**
 * Listener used for walking through the parse tree.
 */
class GraphDslListener extends GraphBaseListener {

  Graph g;
  GraphParser parser;

  public GraphDslListener(Graph g, GraphParser parser) {
      this.g = g;
      this.parser = parser;
  }

  @Override
  public void enterEdge(EdgeContext ctx) {
      TokenStream tokens = this.parser.getTokenStream();
      // to get context of node in the parser tree.
      // parser.graph().edge();
  }

  @Override
  public void exitEdge(EdgeContext ctx) {
      //Once the edge rule is exited the data required for the edge i.e
      //vertices and the weight would be available in the EdgeContext
      Vertex fromVertex = new Vertex(ctx.vertex(0).ID().getText());
      Vertex toVertex = new Vertex(ctx.vertex(1).ID().getText());
      double weight = Double.parseDouble(ctx.NUM().getText());
      Edge e = new Edge(fromVertex, toVertex, weight);
      g.addEdge(e);
  }
}
