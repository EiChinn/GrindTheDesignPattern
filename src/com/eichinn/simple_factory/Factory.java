package com.eichinn.simple_factory;

/**
 * Created by ei_chinn on 2017/1/5.
 */
public class Factory {
    public static Api createApi() {
        return new Impl();
    }
}
