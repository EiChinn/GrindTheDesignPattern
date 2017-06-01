package com.eichinn.flyweight.practical;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by ei_chinn on 2017/6/1.
 */
public class FlyweightFactory {
    private static FlyweightFactory factory = new FlyweightFactory();

    private FlyweightFactory() {

    }

    public static FlyweightFactory getInstance() {
        return factory;
    }

    private Map<String, Flyweight> fsMap = new HashMap<>();

    public Flyweight getFlyweight(String key) {
        Flyweight f = fsMap.get(key);
        if (f == null) {
            f = new AuthorizationFlyweight(key);
            fsMap.put(key, f);
        }
        return f;
    }
}
