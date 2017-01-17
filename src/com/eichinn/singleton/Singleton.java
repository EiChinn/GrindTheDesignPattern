package com.eichinn.singleton;

/**
 * Singleton 懒汉模式:等到真正需要使用Singleton对象时才去创建Singleton对象，
 * 缺点是同步（synchronized）会影响性能，并且事实上只有第一次执行getInstance()方法时才需要同步，
 * 一旦创建好了Singleton对象后，就不需要同步getInstance()方法了。之后每次调用getInstance()方法，同步都是一种累赘。
 * Created by ei_chinn on 2017/1/17.
 */
public class Singleton {
    private static Singleton instance = null;

    /**
     * private 构造方法
     */
    private Singleton() {

    }

    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
