package jsx.core;

import org.antlr.v4.runtime.ParserRuleContext;
import org.junit.Assert;
import org.junit.Test;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Collectors;

public class AstParserTest
{
    @Test
    public void testParser() throws Exception
    {
        Path path = Paths.get(ClassLoader.getSystemResource("MyTest.java").toURI());
        String source = Files.lines(path).collect(Collectors.joining());

        AstParser parser = new AstParser();
        ParserRuleContext tree = parser.generateAst(source);

        Assert.assertNotNull(tree);
        //Check exceptions after parsing source code
        Assert.assertNull(tree.exception);

        String sourceCode = parser.generateSourceCode(tree);
        Assert.assertNotNull(sourceCode);
    }
}
