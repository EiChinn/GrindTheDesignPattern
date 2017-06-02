package com.eichinn.bridge.universal;

/**
 * 定义实现部分的接口，可以与抽象部分接口的方法不一样
 * Created by ei_chinn on 2017/6/2.
 */
public interface Implementor {
    /**
     * 实现抽象部分需要的某些具体功能
     */
    void operationImpl();
}
