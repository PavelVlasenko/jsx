package jsx.core;

import jsx.antlr4.Java8BaseListener;
import jsx.antlr4.Java8Lexer;
import jsx.antlr4.Java8Parser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

/**
 * @author Pavel Vlasenko
 */
public class AstParser
{
    public ParserRuleContext generateAst()
    {
        String row = "package jsx.example;\n" +
                "\n" +
                "public class MyTest\n" +
                "{\n" +
                "    public void trivial()\n" +
                "    {\n" +
                "        <div />\n" +
                "    }\n" +
                "}\n";

        ANTLRInputStream input = new ANTLRInputStream(row);
        Java8Lexer lexer = new Java8Lexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        Java8Parser parser = new Java8Parser(tokens);

        ParserRuleContext tree = parser.compilationUnit();

//        ParseTreeWalker walker = new ParseTreeWalker();
//        Java8BaseListener listener = new Java8BaseListener();
//        walker.walk(listener, tree);

        return tree;
    }

    public String generateSourceCode(ParserRuleContext tree)
    {
        ParseTreeWalker walker = new ParseTreeWalker();
        DumpListener listener = new DumpListener();
        walker.walk(listener, tree);

        String result = listener.getSourceCode();
        return result;
    }
}
