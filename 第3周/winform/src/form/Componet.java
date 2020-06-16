package form;

public abstract class Componet {
    private int deep;
    private String name;

    abstract void draw(UIContext context);
    public int getDeep() {
        return deep;
    }

    public void setDeep(int deep) {
        this.deep = deep;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
