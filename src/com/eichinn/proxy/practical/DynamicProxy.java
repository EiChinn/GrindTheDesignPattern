package com.eichinn.proxy.practical;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by ei_chinn on 2017/4/29.
 */
public class DynamicProxy implements InvocationHandler {
    private Order order;

    public OrderApi getProxyInterface(Order order) {
        this.order = order;

        return (OrderApi) Proxy.newProxyInstance(order.getClass().getClassLoader(), order.getClass().getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if (method.getName().startsWith("set")) {
            if (order.getOrderUser() != null && order.getOrderUser().equals(args[1])) {
                return method.invoke(order, args);
            } else {
                System.out.println("!!!");
            }
        } else {
            return method.invoke(order, args);
        }
        return null;
    }
}
