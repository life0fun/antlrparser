package me.colorcloud.graphdsl;

import me.colorcloud.graphdsl.GraphDslListener;

import java.io.IOException;
import java.io.InputStream;

import me.colorcloud.parser.GraphLexer;
import me.colorcloud.parser.GraphParser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;

public class GraphDslExample {

  public static void main(String[] args) throws IOException {
    //Reading the DSL script
    InputStream is = ClassLoader.getSystemResourceAsStream("graph.gr");
    
    //Loading the DSL script into the ANTLR stream.
    CharStream cs = new ANTLRInputStream(is);
    
    // generate lexer from input stream from dsl statements.
    GraphLexer lexer = new GraphLexer(cs);
    CommonTokenStream tokens = new CommonTokenStream(lexer);
    
    // generate parser tree from lexer tokens stream.
    GraphParser parser = new GraphParser(tokens);
    
    //Semantic model to be populated
    Graph g = new Graph();
    GraphDslListener dslRuleListener = new GraphDslListener(g, parser);
    
    //Adding the listener to facilitate walking through parse tree. 
    parser.addParseListener(dslRuleListener);
    
    //invoking the parser. 
    parser.graph();
    
    Graph.printGraph(g);
  }
}
