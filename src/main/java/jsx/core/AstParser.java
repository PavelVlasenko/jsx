package jsx.core;

import jsx.antlr4.Java8Lexer;
import jsx.antlr4.Java8Parser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.antlr.v4.runtime.tree.Tree;

public class AstParser implements JavaParser
{
    private StringBuilder builder = new StringBuilder();
    private String [] addNothingTextArray = {"<", ">", ".", "/>"};

    /**
     * Generates AST tree
     *
     * @param source Source code
     * @return
     */
    @Override
    public ParserRuleContext generateAst(String source)
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

        ANTLRInputStream input = new ANTLRInputStream(source);
        Java8Lexer lexer = new Java8Lexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        Java8Parser parser = new Java8Parser(tokens);

        ParserRuleContext tree = parser.compilationUnit();

        String s = generateSourceCode(tree);
        return tree;
    }

    /**
     * Generates the source code of AST tree
     *
     * @param tree
     * @return
     */
    @Override
    public String generateSourceCode(Tree tree)
    {
        builder = new StringBuilder();
        getText(tree);
        return builder.toString();
    }

    private void getText(Tree tree)
    {
        if(tree.getChildCount() == 0)
        {
            if (tree instanceof ErrorNode)
            {
                throw new IllegalArgumentException("Invalid node");
            }

            String text = ((TerminalNode)tree).getText();
            //add nothing
            for(String addNothingText : addNothingTextArray)
            {
                if (addNothingText.equals(text))
                {
                    builder.append(text);
                    return;
                }
            }

            //add newline before
            if(text.equals("{"))
            {
                builder.append("\r\n").append(text);
            }
            //add newline after
            else if(text.equals("}"))
            {
                builder.append(text).append("\r\n");
            }
            //add ws
            else {
                builder.append(text).append(' ');
            }
        }
        else
        {
            for(int i = 0; i < tree.getChildCount(); ++i)
            {
                getText(tree.getChild(i));
            }
        }
    }

}
