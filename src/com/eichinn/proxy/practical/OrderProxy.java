package com.eichinn.proxy.practical;

/**
 * Created by ei_chinn on 2017/4/29.
 */
public class OrderProxy implements OrderApi {
    private Order order;

    public OrderProxy(Order order) {
        this.order = order;
    }

    @Override
    public String getProductName() {
        return order.getProductName();
    }

    @Override
    public void setProductName(String productName, String user) {
        if (user != null && user.equals(order.getOrderUser())) {
            order.setProductName(productName, user);
        } else {
            System.out.println("!!!");
        }
    }

    @Override
    public int getOrderNum() {
        return order.getOrderNum();
    }

    @Override
    public void setOrderNum(int orderNum, String user) {
        if (user != null && user.equals(order.getOrderUser())) {
            order.setOrderNum(orderNum, user);
        } else {
            System.out.println("!!!");
        }
    }

    @Override
    public String getOrderUser() {
        return order.getOrderUser();
    }

    @Override
    public void setOrderUser(String orderUser, String user) {
        if (user != null && user.equals(order.getOrderUser())) {
            order.setOrderUser(orderUser, user);
        } else {
            System.out.println("!!!");
        }
    }
}
