package com.eichinn.simple_factory;

/**
 * Created by ei_chinn on 2016/12/25.
 */
public class Impl implements Api{
    @Override
    public void test(String s) {
        System.out.println(s);
    }
}
