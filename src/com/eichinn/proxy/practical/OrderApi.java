package com.eichinn.proxy.practical;

/**
 * Created by ei_chinn on 2017/4/29.
 */
public interface OrderApi {
    String getProductName();

    void setProductName(String productName, String user);

    int getOrderNum();

    void setOrderNum(int orderNum, String user);

    String getOrderUser();

    void setOrderUser(String orderUser, String user);
}
