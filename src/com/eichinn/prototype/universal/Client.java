package com.eichinn.prototype.universal;

/**
 * Created by ei_chinn on 2017/3/12.
 */
public class Client {
    /**
     * 持有需要使用的原型接口对象
     */
    private Prototype prototype;

    public Client(Prototype prototype) {
        this.prototype = prototype;
    }

    public void operation() {
        Prototype clone = prototype.clone();
        System.out.println(clone.getClass().getSimpleName());
    }

    public static void main(String[] args) {
        Client client = new Client(new ConcretePrototype2());
        client.operation();
    }


}
