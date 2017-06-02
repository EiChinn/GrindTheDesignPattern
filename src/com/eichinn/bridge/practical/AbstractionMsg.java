package com.eichinn.bridge.practical;

/**
 * Created by ei_chinn on 2017/6/2.
 */
public abstract class AbstractionMsg {
    protected MsgImplementor impl;

    public AbstractionMsg(MsgImplementor impl) {
        this.impl = impl;
    }

    public void sendMsg(String msg, String toUser) {
        impl.send(msg, toUser);
    }
}
