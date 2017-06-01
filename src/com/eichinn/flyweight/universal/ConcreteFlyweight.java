package com.eichinn.flyweight.universal;

/**
 * Created by ei_chinn on 2017/6/1.
 */
public class ConcreteFlyweight implements Flyweight {
    private String intrinsicState;

    public ConcreteFlyweight(String intrinsicState) {
        this.intrinsicState = intrinsicState;
    }

    @Override
    public void operation(String extrinsicState) {
        //some operation, maybe use both intrinsic state and extrinsic state
    }
}
