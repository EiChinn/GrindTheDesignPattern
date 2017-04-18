package com.eichinn.mediator.practical;

/**
 * Created by ei_chinn on 2017/4/10.
 */
public abstract class Colleague {
    private Mediator mediator;

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }

    public Mediator getMediator() {
        return mediator;
    }
}
