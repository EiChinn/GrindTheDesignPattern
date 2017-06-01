package com.eichinn.chain_of_responsibility.universal;

/**
 * Created by ei_chinn on 2017/6/1.
 */
public class ConcreteHandler2 extends Handler {
    @Override
    public void handleRequest() {
        //根据某些条件来判断是否属于自己处理的职责范围
        //判断条件比如：从外部传入的参数，或者这里主动去获取的外部数据，如从数据库中获取等
        boolean someCondition = true;

        if (someCondition) {
            //如果属于自己的职责范围，则在这里处理请求
            System.out.println("ConcreteHandle2 handle request");
        } else {
            //如果不属于自己的职责范围，则判断是否还有后继的职责对象，如果有则转发请求给后继的职责对象，如果没有，则什么都不做，自然结束
            if (nextHandler != null) {
                nextHandler.handleRequest();
            }
        }
    }
}
