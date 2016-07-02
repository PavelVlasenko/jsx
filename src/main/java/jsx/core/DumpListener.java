package jsx.core;

import jsx.antlr4.Java8ParserParser;
import jsx.antlr4.Java8ParserBaseListener;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.misc.NotNull;

public class DumpListener extends Java8ParserBaseListener
{
    private String sourceCode = "";

    @Override
    public void enterPackageDeclaration(@NotNull Java8ParserParser.PackageDeclarationContext ctx) {
        getText(ctx);
    }

    @Override
    public void enterVariableDeclarator(@NotNull Java8ParserParser.VariableDeclaratorContext ctx) {
        ctx.getText();
    }

    @Override
    public void enterConstructorDeclarator(@NotNull Java8ParserParser.ConstructorDeclaratorContext ctx) {
        ctx.getText();
    }

    @Override
    public void enterWhileStatement(@NotNull Java8ParserParser.WhileStatementContext ctx) {
        super.enterWhileStatement(ctx);
    }

    @Override
    public void enterMethodDeclarator(@NotNull Java8ParserParser.MethodDeclaratorContext ctx) {
        ctx.getText();
    }

    @Override
    public void enterMethodBody(@NotNull Java8ParserParser.MethodBodyContext ctx) {
        super.enterMethodBody(ctx);
    }

    @Override
    public void enterJsxElement(@NotNull Java8ParserParser.JsxElementContext ctx) {
        super.enterJsxElement(ctx);
    }

    @Override
    public void enterJsxAttribute(@NotNull Java8ParserParser.JsxAttributeContext ctx) {
        super.enterJsxAttribute(ctx);
    }

    @Override
    public void enterJsxAttributeName(@NotNull Java8ParserParser.JsxAttributeNameContext ctx) {
        super.enterJsxAttributeName(ctx);
    }

    @Override
    public void enterJsxSimpleAttributeValue(@NotNull Java8ParserParser.JsxSimpleAttributeValueContext ctx) {
        super.enterJsxSimpleAttributeValue(ctx);
    }

    @Override
    public void enterJsxBlockAttributeValue(@NotNull Java8ParserParser.JsxBlockAttributeValueContext ctx) {
        super.enterJsxBlockAttributeValue(ctx);
    }

    @Override
    public void enterJsxBlockExpression(@NotNull Java8ParserParser.JsxBlockExpressionContext ctx) {
        super.enterJsxBlockExpression(ctx);
    }

    @Override
    public void enterJsxBlock(@NotNull Java8ParserParser.JsxBlockContext ctx) {
        super.enterJsxBlock(ctx);
    }

    @Override
    public void enterMethodInvocation(@NotNull Java8ParserParser.MethodInvocationContext ctx) {
        super.enterMethodInvocation(ctx);
    }

    public String getSourceCode() {
        return sourceCode;
    }

    private String getText(ParserRuleContext ctx)
    {
        if(ctx.getChildCount() == 0) {
            return "";
        } else {
            StringBuilder builder = new StringBuilder();

            for(int i = 0; i < ctx.getChildCount(); ++i) {
                builder.append(ctx.getChild(i).getText()).append(" ");
            }

            return builder.toString();
        }
    }
}
