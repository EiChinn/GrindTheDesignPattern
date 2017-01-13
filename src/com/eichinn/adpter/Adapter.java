package com.eichinn.adpter;

/**
 * 适配器
 * Created by ei_chinn on 2017/1/13.
 */
public class Adapter implements Target {//实现Client要使用的接口Target

    //持用需要被适配的接口对象
    private Adaptee adaptee;

    /**
     * 构造方法，传入需要被适配的对象
     * @param adaptee 需要被适配的对象
     */
    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void request() {
        //可能转调已经实现了的方法，进行适配
        adaptee.specificRequest();
    }
}
