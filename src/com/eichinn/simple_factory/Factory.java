package com.eichinn.simple_factory;

/**
 * Created by ei_chinn on 2017/1/5.
 */
public class Factory {
    private Factory() {//防止创建Factory的实例，因为没有必要
    }

    public static Api createApi() {
        return new Impl();
    }
}
