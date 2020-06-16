package form;

public class Frame extends Container {

    public Frame(String name) {
        setName(name);
    }

    @Override
    public void draw(UIContext context) {

        System.out.println("print Frame(" + getName()+")");
        super.draw(context);
    }
}
