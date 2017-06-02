package com.eichinn.bridge.universal;

/**
 * 扩充由Abstraction定义的接口功能
 * Created by ei_chinn on 2017/6/2.
 */
public class RefinedAbstraction extends Abstraction {
    public RefinedAbstraction(Implementor impl) {
        super(impl);
    }

    public void otherOperation() {
        //实现一定的功能，可能会使用具体实现部分的实现方法
        //但更大但可能是使用Abstraction中定义但方法
        //通过组合使用Abstraction中定义但方法来完成更多的功能
    }
}
