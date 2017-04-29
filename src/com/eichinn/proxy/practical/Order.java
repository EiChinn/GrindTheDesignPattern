package com.eichinn.proxy.practical;


/**
 * Created by ei_chinn on 2017/4/29.
 */
public class Order implements OrderApi {
    private String productName;
    private String orderUser;
    private int orderNum;

    public Order(String productName, String orderUser, int orderNum) {
        this.productName = productName;
        this.orderUser = orderUser;
        this.orderNum = orderNum;
    }

    @Override
    public String getProductName() {
        return productName;
    }

    @Override
    public void setProductName(String productName, String user) {
        this.productName = productName;
    }

    @Override
    public int getOrderNum() {
        return orderNum;
    }

    @Override
    public void setOrderNum(int orderNum, String user) {
        this.orderNum = orderNum;
    }

    @Override
    public String getOrderUser() {
        return orderUser;
    }

    @Override
    public void setOrderUser(String orderUser, String user) {
        this.orderUser = orderUser;
    }
}
