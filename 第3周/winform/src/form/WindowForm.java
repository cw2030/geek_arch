package form;

public class WindowForm extends Container{
    public WindowForm(String name) {
        setName(name);
    }

    @Override
    public void draw(UIContext context) {

        System.out.println("print WinForm(" + getName()+")");

        super.draw(context);
    }
}

