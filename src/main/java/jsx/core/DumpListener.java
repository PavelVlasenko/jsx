package jsx.core;

import jsx.antlr4.Java8Parser;
import jsx.antlr4.Java8ParserBaseListener;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.misc.NotNull;

public class DumpListener extends Java8ParserBaseListener
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
    public void enterJsxAttributeName(@NotNull Java8Parser.JsxAttributeNameContext ctx) {
        super.enterJsxAttributeName(ctx);
    }

    @Override
    public void enterJsxAttributeValue(@NotNull Java8Parser.JsxAttributeValueContext ctx) {
        super.enterJsxAttributeValue(ctx);
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
