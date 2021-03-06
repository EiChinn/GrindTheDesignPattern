package com.eichinn.factory_method.universal;

/**
 * 具体的创建器实现对象
 * Created by ei_chinn on 2017/2/6.
 */
public class ConcreteCreator extends Creator {
    @Override
    protected Product factoryMethod() {
        //重定义工厂方法，返回一个具体的Product对象
        return new ConcreteProduct();
    }
}
