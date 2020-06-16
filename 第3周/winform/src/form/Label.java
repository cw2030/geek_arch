package form;

public class Label extends Componet {
    public Label(String name) {
        setName(name);
    }

    void draw(UIContext context) {
        System.out.println("print Label(" + getName()+")");
    }
}
