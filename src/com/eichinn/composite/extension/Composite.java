package com.eichinn.composite.extension;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ei_chinn on 2017/5/31.
 */
public class Composite extends Component {
    private String name;

    private List<Component> childComponents = null;

    public Composite(String name) {
        this.name = name;
    }

    @Override
    public void addChild(Component child) {
        if (childComponents == null) {
            childComponents = new ArrayList<>();
        }
        child.setParent(this);

        childComponents.add(child);
    }

    @Override
    public void removeChild(Component child) {
        if (childComponents != null) {
            int childIndex = childComponents.indexOf(child);
            if (childIndex != -1) {
                for (Component c : child.getChildComponents()) {
                    c.setParent(this);
                    childComponents.add(c);
                }
            }
            childComponents.remove(child);
        }
    }

    @Override
    public List<Component> getChildComponents() {
        return childComponents;
    }

    @Override
    public Component getChildren(int index) {
        if (childComponents != null && index >= 0 && index < childComponents.size()) {
            return childComponents.get(index);
        }
        return null;
    }

    @Override
    void printStruct(String preStr) {
        System.out.println(preStr + "+" + name);
        if (childComponents != null) {
            preStr += " ";
            for (Component childComponent : childComponents) {
                childComponent.printStruct(preStr);
            }
        }
    }
}
