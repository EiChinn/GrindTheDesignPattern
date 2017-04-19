package com.eichinn.proxy.universal;

/**
 * 具体的目标对象，是真正的被代理对象
 * Created by ei_chinn on 2017/4/19.
 */
public class RealSubject implements Subject {
    @Override
    public void request() {
        //执行具体的功能处理
    }
}
