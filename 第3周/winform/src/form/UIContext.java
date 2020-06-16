package form;

public class UIContext {
    private Componet componet;
    private UIContext parentContext;

    public static UIContext withContext(UIContext context, Componet componet) {
        UIContext ctx = new UIContext();
        ctx.componet = componet;
        ctx.parentContext = context;
        return ctx;
    }

    public Componet getParent() {
        return componet;
    }
}
