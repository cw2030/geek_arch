package form;

public class LinkLabel extends Componet {
    public LinkLabel(String name) {
        setName(name);
    }

    void draw(UIContext context) {
        System.out.println("print LinkLabel(" + getName()+")");
    }
}
