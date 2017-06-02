package com.eichinn.bridge.practical;

/**
 * Created by ei_chinn on 2017/6/2.
 */
public class MsgEmail implements MsgImplementor {
    @Override
    public void send(String msg, String toUser) {
        System.out.println("Use email send message: " + msg + " to " + toUser);
    }
}
