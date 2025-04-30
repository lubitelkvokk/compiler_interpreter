import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.FileInputStream;
import java.io.InputStream;

public class Main {
    public static void main(String[] args) throws Exception {
        String inputFile = null;
        if (args.length > 0) inputFile = args[0];
        InputStream is = System.in;
        if (inputFile != null) is = new FileInputStream(inputFile);
        CharStream input = CharStreams.fromStream(is);
        CLangLexer lexer = new CLangLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        CLangParser parser = new CLangParser(tokens);
        ParseTree tree = parser.prog(); // parse; start at prog
        EvalVisitor eval = new EvalVisitor();
        Integer result = eval.visit(tree);
        System.out.println(tree.toStringTree(parser)); // print tree as text
    }
}