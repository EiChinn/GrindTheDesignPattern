package com.eichinn.proxy.practical;

/**
 * Created by ei_chinn on 2017/4/29.
 */
public class Client {
    public static void main(String[] args) {
//        OrderApi order = new OrderProxy(new Order("aaa", "bbb", 111));
//
//        order.setOrderNum(123, "ccc");
//
//        order.setOrderNum(123, "bbb");


        Order order = new Order("aaa", "bbb", 111);
        DynamicProxy dynamicProxy = new DynamicProxy();
        OrderApi orderApi = dynamicProxy.getProxyInterface(order);

        orderApi.setOrderNum(123, "ccc");
        System.out.println(orderApi);

        orderApi.setOrderNum(123, "bbb");
        System.out.println(orderApi);

    }
}
