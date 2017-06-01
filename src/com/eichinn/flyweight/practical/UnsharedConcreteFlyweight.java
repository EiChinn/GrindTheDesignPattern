package com.eichinn.flyweight.practical;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ei_chinn on 2017/6/1.
 */
public class UnsharedConcreteFlyweight implements Flyweight {
    private List<Flyweight> list = new ArrayList<>();
    @Override
    public boolean match(String securityEntity, String permit) {
        for (Flyweight flyweight : list) {
            if (flyweight.match(securityEntity, permit)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void add(Flyweight flyweight) {
        list.add(flyweight);
    }
}
