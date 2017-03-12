package com.eichinn.prototype.universal;

/**
 * Created by ei_chinn on 2017/3/12.
 */
public class ConcretePrototype1 implements Prototype {

    @Override
    public Prototype clone() {
        return new ConcretePrototype1();
    }
}
