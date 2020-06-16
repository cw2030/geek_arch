package form;

public class PasswordBox extends Componet {
    public PasswordBox(String name) {
        setName(name);
    }

    @Override
    void draw(UIContext context) {

        System.out.println("print PasswordBox(" + getName()+")");
    }
}
