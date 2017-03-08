package com.eichinn.abstract_factory.universal;

/**
 * Created by ei_chinn on 2017/3/1.
 */
public class Client {
    public static void main(String[] args) {
        AbstractFactory factory = new ConcreteFactory1();
        AbstractProductA productA = factory.createProductA();
        AbstractProductB productB = factory.createProductB();
    }
}
