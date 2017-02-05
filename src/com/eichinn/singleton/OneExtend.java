package com.eichinn.singleton;

import java.util.HashMap;
import java.util.Map;

/**
 * 简单演示如何扩展单例模式，控制实例数目为3个。此例子是线程不安全的，需要自行处理
 * Created by ei_chinn on 2017/2/5.
 */
public class OneExtend {
    private final static String DEFAULT_PREKEY = "Cache";
    private static Map<String, OneExtend> map = new HashMap<>();//缓存实例的容器
    private static int num = 1;//用来记录当前正在使用第几个实例，到了控制的最大数目，就返回从1开始
    private final static int NUM_MAX = 3;//控制实例的最大数目

    private OneExtend() {

    }

    public static OneExtend getInstance() {
        String key = DEFAULT_PREKEY + num;
        OneExtend oneExtend = map.get(key);
        if (oneExtend == null) {
            oneExtend = new OneExtend();
            map.put(key, oneExtend);
        }

        num++;
        if (num > NUM_MAX) {
            num = 1;
        }

        return oneExtend;
    }

    public static void main(String[] args) {
        OneExtend t1 = getInstance();
        OneExtend t2 = getInstance();
        OneExtend t3 = getInstance();
        OneExtend t4 = getInstance();
        OneExtend t5 = getInstance();
        OneExtend t6 = getInstance();

        System.out.println("t1 = " + t1);
        System.out.println("t2 = " + t2);
        System.out.println("t3 = " + t3);
        System.out.println("t4 = " + t4);
        System.out.println("t5 = " + t5);
        System.out.println("t6 = " + t6);
    }
}
