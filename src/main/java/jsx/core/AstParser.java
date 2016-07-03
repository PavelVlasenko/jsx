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

    /**
     * Generates AST tree
     *
     * @param source Source code
     * @return
     */
    @Override
    public ParserRuleContext generateAst(String source)
    {
        ANTLRInputStream input = new ANTLRInputStream(source);
        Java8Lexer lexer = new Java8Lexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        Java8Parser parser = new Java8Parser(tokens);

        return parser.compilationUnit();
    }

    /**
     * Generates the source code of AST tree
     *
     * @param tree AST tree
     * @return Source code
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

            String token = ((TerminalNode)tree).getText();
            switch (token) {
                case "{":
                    builder.append("\r\n").append(token);
                    break;
                case "}":
                case ";":
                    builder.append(token).append("\r\n");
                    break;
                case "<":
                case ">":
                case "/>":
                case "(":
                case ")":
                    builder.append(token);
                    break;
                case ".":
                case "::":
                    if(builder.lastIndexOf(" ") == (builder.length() - 1))
                    {
                        builder.setLength(builder.length() - 1);
                    }
                    builder.append(token);
                    break;
                case "<EOF>":
                    break;
                default:
                    builder.append(token).append(' ');
                    break;
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
