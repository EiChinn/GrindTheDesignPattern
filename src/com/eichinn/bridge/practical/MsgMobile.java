package com.eichinn.bridge.practical;

/**
 * Created by ei_chinn on 2017/6/2.
 */
public class MsgMobile implements MsgImplementor {
    @Override
    public void send(String msg, String toUser) {
        System.out.println("Use mobile send message: " + msg + " to " + toUser);
    }
}
