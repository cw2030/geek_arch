package form;

public class TextBox extends Componet {
    public TextBox(String name) {
        setName(name);
    }

    @Override
    void draw(UIContext context) {

        System.out.println("print TextBox:(" + getName()+")");
    }
}
