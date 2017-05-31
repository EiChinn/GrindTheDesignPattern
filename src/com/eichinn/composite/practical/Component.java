package com.eichinn.composite.practical;

/**
 * Created by ei_chinn on 2017/5/31.
 */
public abstract class Component {
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
}
