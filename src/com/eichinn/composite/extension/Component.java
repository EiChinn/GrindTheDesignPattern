package com.eichinn.composite.extension;

import java.util.List;

/**
 * Created by ei_chinn on 2017/5/31.
 */
public abstract class Component {
    private Component parent;

    private String componentPath = "";

    public String getComponentPath() {
        return componentPath;
    }

    public void setComponentPath(String componentPath) {
        this.componentPath = componentPath;
    }

    public abstract String getName();

    public Component getParent() {
        return parent;
    }

    public void setParent(Component parent) {
        this.parent = parent;
    }

    abstract void printStruct(String preStr);

    public void addChild(Component child) {
        throw new UnsupportedOperationException("unsupportedOperation");
    }

    public void removeChild(Component child) {
        throw new UnsupportedOperationException("unsupportedOperation");
    }

    public Component getChildren(int index) {
        throw new UnsupportedOperationException("unsupportedOperation");
    }
    public List<Component> getChildComponents() {
        throw new UnsupportedOperationException("unsupportedOperation");
    }
}
