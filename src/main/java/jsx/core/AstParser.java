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
        String row = "\n" +
                "public class MyTest\n" +
                "{\n" +
                "\tpublic void trivial()\n" +
                "\t{\n" +
                "List<String> g = new ArrayList<>();" +
                "int p = 9;" +
                "if(8<p){}\n" +
                "String h = \"akjsnjads\";\n" +
                "char m = 'a';" +
                "\t\t<div />\n" +
                "\t}\n" +
                "\t\n" +
                "\tpublic void simpleAttributes()\n" +
                "\t{\n" +
                "\t\t<div foo='noise' bar='girls' />\n" +
                "\t}\n" +
                "\t\n" +
                "\tpublic void simpleExpression()\n" +
                "\t{\n" +
                "\t\t<div foo={\"noise\".toUpperCase()} bar={5+2} />\n" +
                "\t}\n" +
                "\t\n" +
                "\tpublic void childElements()\n" +
                "\t{\n" +
                "\t\t<div><p><span /><span /><span /></p></div>\n" +
                "\t}\n" +
                "\t\n" +
                "\tpublic void childExpressions()\n" +
                "\t{\n" +
                "\t\t<div>{\"noise\".toUpperCase()}{5+2}</div>\n" +
                "\t}\n" +
                "\t\n" +
                "\tpublic void functionAttribute()\n" +
                "\t{\n" +
                "\t\t<div foo={System.out::println} />\n" +
                "\t}\n" +
                "\n" +
                "\tpublic void multiLine()\n" +
                "\t{\n" +
                "\t\t<div>\n" +
                "\t\t\t<span />\n" +
                "\t\t</div>\n" +
                "\t}\n" +
                "\n" +
                "\tpublic void interleaved()\n" +
                "\t{\n" +
                "\t\tSystem.out.println(\"start\");\n" +
                "\t\t\n" +
                "\t\t<div>\n" +
                "\t\t\t<span />\n" +
                "\t\t</div>\n" +
                "\n" +
                "\t\tSystem.out.println(\"middle\");\n" +
                "\n" +
                "\t\t<div>\n" +
                "\t\t\t<span />\n" +
                "\t\t</div>\n" +
                "\n" +
                "\t\tSystem.out.println(\"end\");\n" +
                "\t}\n" +
                "\n" +
                "\tpublic void complex()\n" +
                "\t{\n" +
                "\t\t<div>\n" +
                "\t\t\t<p foo=\"noise\">\n" +
                "\t\t\t\t<span foo={System.out::println} />\n" +
                "\t\t\t\t{\"noise\".toUpperCase()}\n" +
                "\t\t\t\t<span foo={System.out::println} />\n" +
                "\t\t\t</p>\n" +
                "\t\t</div>\n" +
                "\t}\n" +
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
