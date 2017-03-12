package com.eichinn.prototype.universal;

/**
 * 声明一个克隆自身的接口
 * Created by ei_chinn on 2017/3/12.
 */
public interface Prototype {
    /**
     * 克隆自身的方法
     * @return 一个从自身克隆出来的对象
     */
    Prototype clone();
}
