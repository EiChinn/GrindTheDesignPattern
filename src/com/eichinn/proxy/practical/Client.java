package com.eichinn.proxy.practical;

/**
 * Created by ei_chinn on 2017/4/29.
 */
public class Client {
    public static void main(String[] args) {
        OrderApi order = new OrderProxy(new Order("aaa", "bbb", 111));

        order.setOrderNum(123, "ccc");

        order.setOrderNum(123, "bbb");

    }
}
