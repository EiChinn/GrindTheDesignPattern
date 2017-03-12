package com.eichinn.prototype.practical;

/**
 * Created by ei_chinn on 2017/3/12.
 */
public class Client {
    public static void main(String[] args) {
        PersonalOrder op = new PersonalOrder();
        op.setOrderProductNum(2925);
        op.setProductId("001");
        op.setCustomerName("ei_chinn");

        OrderBussiness ob = new OrderBussiness();
        ob.saveOrder(op);
    }
}
