package com.eichinn.singleton;

/**
 * Lazy initialization holder class
 * Created by ei_chinn on 2017/2/5.
 */
public class Singleton_v3 {
    /**
     * 类级内部类，也就是静态的成员式内部类，该内部类的实例与外部类的实例没有绑定关系，而且只有被调用到时才会装载，从而实现了延迟加载
     */
    static class SingletonHolder {
        /**
         * 静态初始化器，由JVM来保证线程安全
         */
        private static Singleton_v3 instance = new Singleton_v3();
    }

    private Singleton_v3() {

    }

    public static Singleton_v3 getInstance() {
        return SingletonHolder.instance;
    }
}
