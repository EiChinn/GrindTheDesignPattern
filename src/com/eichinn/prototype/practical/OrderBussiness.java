package com.eichinn.prototype.practical;

/**
 * Created by ei_chinn on 2017/3/12.
 */
public class OrderBussiness {
    /**
     * 创建订单的方法
     * @param orderApi 订单的接口对象
     */
    public void saveOrder(OrderApi orderApi) {
        while (orderApi.getOrderProductNum() > 1000) {
            OrderApi newOrderApi = orderApi.clone();
            newOrderApi.setOrderProductNum(1000);
            orderApi.setOrderProductNum(orderApi.getOrderProductNum() - 1000);
            System.out.println("拆分订单： " + newOrderApi);
        }

        System.out.println("订单： " + orderApi);

    }
}
