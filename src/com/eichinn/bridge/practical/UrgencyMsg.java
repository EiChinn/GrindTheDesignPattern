package com.eichinn.bridge.practical;

import java.util.Objects;

/**
 * Created by ei_chinn on 2017/6/2.
 */
public class UrgencyMsg extends AbstractionMsg {
    public UrgencyMsg(MsgImplementor impl) {
        super(impl);
    }

    @Override
    public void sendMsg(String msg, String toUser) {
        msg = "urgency: " + msg;
        super.sendMsg(msg, toUser);
    }

    /**
     * 扩展自己的新功能
     * @param msgId
     * @return
     */
    public Objects watch(String msgId) {
        return null;
    }
}
