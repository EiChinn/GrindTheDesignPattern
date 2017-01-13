package com.eichinn.adpter;

/**
 *
 * Created by ei_chinn on 2017/1/13.
 */
public class Client {
    public static void main(String[] args) {
        //创建需要被适配的对象
        Adaptee adaptee = new Adaptee();
        //创建Client需要被调用的接口对象
        Target adapter = new Adapter(adaptee);
        //请求处理
        adapter.request();
    }
}
