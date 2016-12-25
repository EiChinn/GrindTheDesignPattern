package com.eichinn.simple_factory;

/**
 * Created by ei_chinn on 2016/12/25.
 */
public class Client {
    public static void main(String[] args) {
        Api api = new Impl();
        api.test("Impl");
    }
}
