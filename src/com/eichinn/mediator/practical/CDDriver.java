package com.eichinn.mediator.practical;

/**
 * Created by ei_chinn on 2017/4/10.
 */
public class CDDriver extends Colleague {
    public CDDriver(Mediator mediator) {
        super(mediator);
    }

    /**
     * 光驱读取出来的数据
     */
    private String data = "";

    public String getData() {
        return data;
    }

    /**
     * 读取光盘
     */
    public void readCD() {
        //逗号前是视频显示的数据，逗号后是声音
        this.data = "设计模式，值得好好研究";
        //通知主板，自己的状态发生了改变
        this.getMediator().changed(this);
    }
}
