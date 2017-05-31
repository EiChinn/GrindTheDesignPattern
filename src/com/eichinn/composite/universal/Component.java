package com.eichinn.composite.universal;

/**
 * Created by ei_chinn on 2017/5/31.
 */
public abstract class Component {
    public abstract void someOperation();

    public void addChild(Component child) {
        throw new UnsupportedOperationException("unsupported Operation");
    }

    public void removeChild(Component child) {
        throw new UnsupportedOperationException("unsupported Operation");
    }

    public Component getChildren(int index) {
        throw new UnsupportedOperationException("unsupported Operation");
    }

}
