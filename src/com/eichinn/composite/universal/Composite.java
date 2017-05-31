package com.eichinn.composite.universal;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ei_chinn on 2017/5/31.
 */
public class Composite extends Component {
    private List<Component> childComponents = null;

    @Override
    public void someOperation() {
        if (childComponents != null) {
            for (Component childComponent : childComponents) {
                childComponent.someOperation();
            }
        }
    }

    @Override
    public void addChild(Component child) {
        if (childComponents == null) {
            childComponents = new ArrayList<>();
        }
        childComponents.add(child);
    }

    @Override
    public void removeChild(Component child) {
        if (childComponents != null) {
            childComponents.remove(child);
        }
    }

    @Override
    public Component getChildren(int index) {
        if (childComponents != null && index >= 0 && index < childComponents.size()) {
            return childComponents.get(index);
        }
        return null;
    }
}
