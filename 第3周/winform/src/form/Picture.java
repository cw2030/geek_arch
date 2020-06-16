package form;

public class Picture extends Componet {

    public Picture(String name) {
        setName(name);
    }

    void draw(UIContext context) {
        System.out.println("print Picture(" + getName()+")");
    }
}
