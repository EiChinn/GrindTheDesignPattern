package com.eichinn.abstract_factory.universal;

/**
 * Created by ei_chinn on 2017/3/1.
 */
public class ConcreteFactory2 implements AbstractFactory {
    @Override
    public AbstractProductA createProductA() {
        return new ProductA2();
    }

    @Override
    public AbstractProductB createProductB() {
        return new ProductB2();
    }
}
