package com.eichinn.flyweight.universal;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by ei_chinn on 2017/6/1.
 */
public class FlyweightFactory {
    private Map<String, Flyweight> fsMap = new HashMap<>();

    public Flyweight getFlyWeight(String key) {
        Flyweight f = fsMap.get(key);
        if (f == null) {
            f = new ConcreteFlyweight(key);
            fsMap.put(key, f);
        }
        return f;
    }
}
