package jsx.core;

import jsx.antlr4.Java8ParserLexer;
import jsx.antlr4.Java8ParserParser;
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
                "String s = \"asda\";        <div/>" +
                "<div attsa=\"asdasd\"/>" +
                "<div attsa={System.out.println();}/>" +
                "<div></div>" +
                "<div ></ div>" +
                "System.out.println();" +
                "<div><span/></div>" +
                "<div><p><span/><span/></p></div>" +
                "\n" +
                "System.out.println();" +
                "int i = 7;" +
                "while(5< i){}" +
                "    }\n" +
                "\n" +
                "}\n";

        ANTLRInputStream input = new ANTLRInputStream(row);
        Java8ParserLexer lexer = new Java8ParserLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        Java8ParserParser parser = new Java8ParserParser(tokens);

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
