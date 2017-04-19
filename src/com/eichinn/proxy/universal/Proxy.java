package com.eichinn.proxy.universal;

/**
 * 代理对象
 * Created by ei_chinn on 2017/4/19.
 */
public class Proxy implements Subject {
    /**
     * 持有被代理的具体的目标对象
     */
    private RealSubject realSubject;

    /**
     * 构造方法，传入被代理的具体的目标对象
     * @param realSubject
     */
    public Proxy(RealSubject realSubject) {
        this.realSubject = realSubject;
    }

    @Override
    public void request() {
        //在转调具体的目标对象前，可以执行一些功能处理

        realSubject.request();

        //在转调具体的目标对象后，可以执行一些功能处理
    }
}
