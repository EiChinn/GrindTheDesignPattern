package com.eichinn.chain_of_responsibility.universal;

/**
 * Created by ei_chinn on 2017/6/1.
 */
public class Client {
    public static void main(String[] args) {
        Handler h1 = new ConcreteHandler1();
        Handler h2 = new ConcreteHandler2();

        h1.setNextHandler(h2);

        h1.handleRequest();
    }
}
