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

        /*if (getComponentPath() == null || getComponentPath().trim().length() == 0) {//root
            setComponentPath(getName());
        }

        if (getComponentPath().startsWith(child.getName() + ".")) {
            throw new IllegalStateException("Component " + child.getName() + " has added");
        } else {
            if (getComponentPath().indexOf(child.getName() + ".") < 0) {
                String componentPath = getComponentPath() + "." + child.getName();
                child.setComponentPath(componentPath);
            } else {
                throw new IllegalStateException("Component " + child.getName() + " has added");
            }
        }*/
        Component parent = getParent();
        while (parent != null){
            if (child == getParent()) {
                throw new IllegalStateException("Component " + child.getName() + " has added");
            }
            parent = parent.getParent();
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
    public String getName() {
        return this.name;
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
