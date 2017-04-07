package com.eichinn.mediator.universal;

/**
 * 具体的中介者实现
 * Created by ei_chinn on 2017/4/7.
 */
public class ConcreateMediator implements Mediator {

    /**
     * 持有并维护同事A
     */
    private ConcreteColleagueA concreteColleagueA;
    /**
     * 持有并维护同事B
     */
    private ConcreteColleagueB concreteColleagueB;

    /**
     * 设置中介者需要了解并维护的同事A对象
     * @param concreteColleagueA 同事A对象
     */
    public void setConcreteColleagueA(ConcreteColleagueA concreteColleagueA) {
        this.concreteColleagueA = concreteColleagueA;
    }

    /**
     * 设置中介者需要了解并维护的同事B对象
     * @param concreteColleagueB 同事B对象
     */
    public void setConcreteColleagueB(ConcreteColleagueB concreteColleagueB) {
        this.concreteColleagueB = concreteColleagueB;
    }

    @Override
    public void changed(Colleague colleague) {
        //某个同事类发生了变化，通常需要与其他同事交互
        //具体协助相应的同事对象来实现协作行为
    }
}
