package com.eichinn.bridge.practical;

/**
 * Created by ei_chinn on 2017/6/2.
 */
public class SpecialUrgencyMsg extends AbstractionMsg {
    public SpecialUrgencyMsg(MsgImplementor impl) {
        super(impl);
    }

    public void hurry(String msgId) {

    }

    @Override
    public void sendMsg(String msg, String toUser) {
        msg = "special urgency: " + msg;
        super.sendMsg(msg, toUser);
    }
}
