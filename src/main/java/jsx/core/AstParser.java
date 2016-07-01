package jsx.core;

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
        String row = "package jsx.core;\n" +
                "\n" +
                "import jsx.antlr4.Java8;\n" +
                "import jsx.antlr4.Java8Lexer;\n" +
                "import jsx.antlr4.Java8Parser;\n" +
                "import org.antlr.v4.runtime.ANTLRInputStream;\n" +
                "import org.antlr.v4.runtime.CommonTokenStream;\n" +
                "import org.antlr.v4.runtime.ParserRuleContext;\n" +
                "import org.antlr.v4.runtime.tree.ParseTreeWalker;\n" +
                "\n" +
                "/**\n" +
                " * @author Pavel Vlasenko\n" +
                " */\n" +
                "public class AstParser\n" +
                "{\n" +
                "    public ParserRuleContext generateAst()\n" +
                "    {\n" +
                "        String row = \"\";\n" +
                "\n" +
                "        ANTLRInputStream input = new ANTLRInputStream(row);\n" +
                "        Java8Lexer lexer = new Java8Lexer(input);\n" +
                "        CommonTokenStream tokens = new CommonTokenStream(lexer);\n" +
                "        Java8 parser = new Java8(tokens);\n" +
                "\n" +
                "        ParserRuleContext tree = parser.compilationUnit();\n" +
                "\n" +
                "//        ParseTreeWalker walker = new ParseTreeWalker();\n" +
                "//        Java8BaseListener listener = new Java8BaseListener();\n" +
                "//        walker.walk(listener, tree);\n" +
                "\n" +
                "        return tree;\n" +
                "    }\n" +
                "\n" +
                "\n" +
                "    public String generateSourceCode(ParserRuleContext tree)\n" +
                "    {\n" +
                "        ParseTreeWalker walker = new ParseTreeWalker();\n" +
                "        DumpListener listener = new DumpListener();\n" +
                "        walker.walk(listener, tree);\n" +
                "\n" +
                "        String result = listener.getSourceCode();\n" +
                "        return result;\n" +
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
