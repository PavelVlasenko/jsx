package jsx.core;

import jsx.antlr4.Java8BaseListener;
import jsx.antlr4.Java8Parser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.misc.NotNull;

public class DumpListener extends Java8BaseListener
{
    private String sourceCode = "";

    @Override
    public void enterPackageDeclaration(@NotNull Java8Parser.PackageDeclarationContext ctx) {
        getText(ctx);
    }

    @Override
    public void enterVariableDeclarator(@NotNull Java8Parser.VariableDeclaratorContext ctx) {
        ctx.getText();
    }

    @Override
    public void enterConstructorDeclarator(@NotNull Java8Parser.ConstructorDeclaratorContext ctx) {
        ctx.getText();
    }

    @Override
    public void enterWhileStatement(@NotNull Java8Parser.WhileStatementContext ctx) {
        super.enterWhileStatement(ctx);
    }

    @Override
    public void enterMethodDeclarator(@NotNull Java8Parser.MethodDeclaratorContext ctx) {
        ctx.getText();
    }

    @Override
    public void enterMethodBody(@NotNull Java8Parser.MethodBodyContext ctx) {
        super.enterMethodBody(ctx);
    }

    @Override
    public void enterJsxElement(@NotNull Java8Parser.JsxElementContext ctx) {
        super.enterJsxElement(ctx);
    }

    @Override
    public void enterJsxAttribute(@NotNull Java8Parser.JsxAttributeContext ctx) {
        super.enterJsxAttribute(ctx);
    }

    @Override
    public void enterJsxAttributeName(@NotNull Java8Parser.JsxAttributeNameContext ctx) {
        super.enterJsxAttributeName(ctx);
    }

    @Override
    public void enterJsxDoubleStringAttributeValue(@NotNull Java8Parser.JsxDoubleStringAttributeValueContext ctx) {
        super.enterJsxDoubleStringAttributeValue(ctx);
    }

    @Override
    public void enterJsxSingleStringAttributeValue(@NotNull Java8Parser.JsxSingleStringAttributeValueContext ctx) {
        super.enterJsxSingleStringAttributeValue(ctx);
    }

    @Override
    public void enterJsxBlockAttributeValue(@NotNull Java8Parser.JsxBlockAttributeValueContext ctx) {
        super.enterJsxBlockAttributeValue(ctx);
    }

    @Override
    public void enterAssigmentExpression(@NotNull Java8Parser.AssigmentExpressionContext ctx) {
        super.enterAssigmentExpression(ctx);
    }

    @Override
    public void enterJsxBlock(@NotNull Java8Parser.JsxBlockContext ctx) {
        super.enterJsxBlock(ctx);
    }

    @Override
    public void enterMethodInvocation(@NotNull Java8Parser.MethodInvocationContext ctx) {
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
