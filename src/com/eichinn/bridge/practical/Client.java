package com.eichinn.bridge.practical;

/**
 * Created by ei_chinn on 2017/6/2.
 */
public class Client {
    public static void main(String[] args) {
        MsgImplementor impl = new MsgSms();
        AbstractionMsg m = new CommonMsg(impl);
        m.sendMsg("drink a tea", "shana");

        m = new UrgencyMsg(impl);
        m.sendMsg("drink a tea", "shana");

        m = new SpecialUrgencyMsg(impl);
        m.sendMsg("drink a tea", "shana");

        impl = new MsgMobile();
        m = new CommonMsg(impl);
        m.sendMsg("drink a tea", "shana");

        m = new UrgencyMsg(impl);
        m.sendMsg("drink a tea", "shana");

        m = new SpecialUrgencyMsg(impl);
        m.sendMsg("drink a tea", "shana");
    }
}
