package com.eichinn.mediator.universal;

/**
 * 具体的同事类A
 * Created by ei_chinn on 2017/4/7.
 */
public class ConcreteColleagueA extends Colleague {
    /**
     * 构造方法，传入中介者对象
     *
     * @param mediator 中介者对象
     */
    public ConcreteColleagueA(Mediator mediator) {
        super(mediator);
    }

    /**
     * 执行某些业务功能
     */
    public void someOperation() {
        //在需要跟其他同事通信的时候通知中介者对象
        getMediator().changed(this);
    }
}
