package jsx.core;

import org.antlr.v4.runtime.tree.Tree;

public interface JavaParser
{
    Tree generateAst(String source);

    String generateSourceCode(Tree tree);
}
