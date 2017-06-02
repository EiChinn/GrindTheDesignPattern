package com.eichinn.bridge.practical;

/**
 * Created by ei_chinn on 2017/6/2.
 */
public class MsgSms implements MsgImplementor {
    @Override
    public void send(String msg, String toUser) {
        System.out.println("Use SMS send message: " + msg + " to " + toUser);
    }
}
