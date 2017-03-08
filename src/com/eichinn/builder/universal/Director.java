package com.eichinn.builder.universal;

/**
 * 指导者，指导使用生成器的接口来构建产品的对象
 * Created by ei_chinn on 2017/3/8.
 */
public class Director {

    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    /**
     * 指导生成器构建最终的产品对象
     */
    public void construct() {
        //通过使用生成器接口来构建最终的产品对象
        builder.buildPart();
    }
}
