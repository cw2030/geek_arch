package form;

import java.util.ArrayList;
import java.util.List;

public class Container extends Componet {
    private final List<Componet> componetList = new ArrayList<Componet>();

    public void draw(UIContext context) {
        UIContext uc = UIContext.withContext(context, this);
        for (Componet c : componetList) {
            c.draw(uc);
        }
    }

    public void addChild(Componet componet) {
        if (null != componet) {
            componet.setDeep(this.getDeep() + 1);
            componetList.add(componet);
        }
    }
}
