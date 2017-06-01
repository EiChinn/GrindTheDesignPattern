package com.eichinn.chain_of_responsibility.universal;

/**
 * 职责的接口，也就是处理请求的接口
 * Created by ei_chinn on 2017/6/1.
 */
public abstract class Handler {
    /**
     * 持有后继的职责对象
     */
    protected Handler nextHandler;

    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    /**
     * 处理请求的方法，视情况而定可设置传入参数
     */
    public abstract void handleRequest();
}
