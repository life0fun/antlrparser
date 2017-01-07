package me.colorcloud.calculator;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import me.colorcloud.parser.CalculatorLexer;
import me.colorcloud.parser.CalculatorParser;

import java.io.InputStream;

public class CalculatorMain {
     public static void main(String[] args) throws Exception {
         InputStream is = ClassLoader.getSystemResourceAsStream("math.txt"); // || System.in;
         ANTLRInputStream input = new ANTLRInputStream(is);

         CalculatorLexer lexer = new CalculatorLexer(input);
         CommonTokenStream tokens = new CommonTokenStream(lexer);
         CalculatorParser parser = new CalculatorParser(tokens);
         ParseTree tree = parser.input();

         CalculatorBaseVisitorImpl calcVisitor = new CalculatorBaseVisitorImpl();
         Double result = calcVisitor.visit(tree);
         System.out.println("Result: " + result);
     }
}
