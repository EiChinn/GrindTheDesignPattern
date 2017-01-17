package com.eichinn.singleton;

/**
 * Singleton 饿汉模式：在加载这个类时马上创建Singleton对象。缺点也在于此，不管后面有没有用到Singleton对象，都会在类加载时创建了一个Singleton对象
 * Created by ei_chinn on 2017/1/17.
 */
public class Singleton_v2 {
    private static Singleton_v2 instance = new Singleton_v2();

    private Singleton_v2() {

    }

    public static Singleton_v2 getInstance() {
        return instance;
    }

}
