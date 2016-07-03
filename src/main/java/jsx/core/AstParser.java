package jsx.core;

import jsx.antlr4.Java8Lexer;
import jsx.antlr4.Java8Parser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.antlr.v4.runtime.tree.Tree;

/**
 * @author Pavel Vlasenko
 */
public class AstParser
{
    private StringBuilder builder = new StringBuilder();

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
        Java8Lexer lexer = new Java8Lexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        Java8Parser parser = new Java8Parser(tokens);

        ParserRuleContext tree = parser.compilationUnit();

        String s = generateSourceCode(tree);
        return tree;
    }


    public String generateSourceCode2(ParserRuleContext tree)
    {
        ParseTreeWalker walker = new ParseTreeWalker();
        DumpListener listener = new DumpListener();
        walker.walk(listener, tree);

        String result = listener.getSourceCode();
        return result;
    }

    public void getText(Tree tree)
    {
        if(tree.getChildCount() == 0)
        {
            if (tree instanceof ErrorNode)
            {
                throw new IllegalArgumentException("Invalid node");
            }

            //add
            builder.append(((TerminalNode)tree).getText()).append(' ');
        }
        else
        {
            for(int i = 0; i < tree.getChildCount(); ++i)
            {
                getText(tree.getChild(i));
            }
        }
    }

    public String generateSourceCode(Tree tree)
    {
        builder = new StringBuilder();
        getText(tree);
        return builder.toString();
    }
}
