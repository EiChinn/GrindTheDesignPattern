package com.eichinn.prototype.practical;

/**
 * 订单接口，声明了可以克隆自身的方法
 * Created by ei_chinn on 2017/3/12.
 */
public interface OrderApi {
    int getOrderProductNum();
    int setOrderProductNum(int num);

    /**
     * 克隆方法
     * @return 订单原型的实例
     */
    OrderApi clone();
}
