package form;

public class Button extends Componet {

    public Button(String name) {
        setName(name);
    }
    public void draw(UIContext context) {
        System.out.println("print Button(" + getName()+")");
    }
}
