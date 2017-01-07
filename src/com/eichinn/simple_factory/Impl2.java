package com.eichinn.simple_factory;

/**
 * Created by ei_chinn on 2016/12/25.
 */
public class Impl2 implements Api{
    @Override
    public void test(String s) {
        System.out.println("Now in Impl2.The input is:" + s);
    }
}
