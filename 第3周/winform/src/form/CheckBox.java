package form;

public class CheckBox extends Componet {
    public CheckBox(String name) {
        setName(name);
    }

    public void draw(UIContext context) {

        System.out.println("print CheckBox(" + getName()+")");
    }
}
