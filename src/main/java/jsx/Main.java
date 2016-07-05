package jsx;

import jsx.core.AstParser;
import org.antlr.v4.runtime.ParserRuleContext;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Collectors;

/**
 * @author Pavel Vlasenko
 */
public class Main
{
    public static void main(String ... args) throws Exception
    {
        Path path = Paths.get(ClassLoader.getSystemResource("MyTest.java").toURI());
        String source = Files.lines(path).collect(Collectors.joining());

        AstParser parser = new AstParser();
        ParserRuleContext tree = parser.generateAst(source);
        String sourceCode = parser.generateSourceCode(tree);
        System.out.println(sourceCode);
    }
}
