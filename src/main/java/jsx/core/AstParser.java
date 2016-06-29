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
    public void generateAst()
    {
        String row = "package jsx.example;\n" +
                "\n" +
                "/**\n" +
                " * Created by SBT-Vlasenko-PV on 29.06.2016.\n" +
                " */\n" +
                "public class MyTest2 {\n" +
                "    \n" +
                "    private String s = \"ewerwer\";\n" +
                "\n" +
                "    public MyTest2(String s) {\n" +
                "        this.s = s;\n" +
                "    }\n" +
                "\n" +
                "    public void dlj(String args)\n" +
                "    {\n" +
                "        Integer i = new Integer (5);\n" +
                "        String s = new String(\"313423423\");\n" +
                "    }\n" +
                "    \n" +
                "}";

        ANTLRInputStream input = new ANTLRInputStream(row);
        Java8Lexer lexer = new Java8Lexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        Java8Parser parser = new Java8Parser(tokens);

        ParserRuleContext tree = parser.compilationUnit();

        ParseTreeWalker walker = new ParseTreeWalker();
        Java8BaseListener listener = new Java8BaseListener();
        walker.walk(listener, tree);
    }
}
