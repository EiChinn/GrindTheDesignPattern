package com.eichinn.prototype.practical;

/**
 * Created by ei_chinn on 2017/3/12.
 */
public class PersonalOrder implements OrderApi {
    private String customerName;
    private String productId;
    private int orderProductNum = 0;


    @Override
    public int getOrderProductNum() {
        return orderProductNum;
    }

    @Override
    public int setOrderProductNum(int num) {
        return orderProductNum = num;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    @Override
    public String toString() {
        return "PersonalOrder{" +
                "customerName='" + customerName + '\'' +
                ", productId='" + productId + '\'' +
                ", orderProductNum=" + orderProductNum +
                '}';
    }

    @Override
    public OrderApi clone() {
        PersonalOrder clone = new PersonalOrder();
        clone.setProductId(productId);
        clone.setCustomerName(customerName);
        clone.setOrderProductNum(orderProductNum);
        return clone;
    }
}
