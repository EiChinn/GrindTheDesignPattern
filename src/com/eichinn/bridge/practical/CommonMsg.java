package com.eichinn.bridge.practical;

/**
 * Created by ei_chinn on 2017/6/2.
 */
public class CommonMsg extends AbstractionMsg {
    public CommonMsg(MsgImplementor impl) {
        super(impl);
    }

    @Override
    public void sendMsg(String msg, String toUser) {
        super.sendMsg(msg, toUser);
    }
}
