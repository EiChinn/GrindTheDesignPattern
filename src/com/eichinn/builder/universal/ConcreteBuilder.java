package com.eichinn.builder.universal;

/**
 * 具体的生成器实现对象
 * Created by ei_chinn on 2017/3/8.
 */
public class ConcreteBuilder implements Builder{
    /**
     * 生成器最终构建的产品对象
     */
    private Product resultProduct;


    @Override
    public void buildPart() {
        //构建某个部件的功能处理
    }

    /**
     *
     * @return
     */
    public Product getResultProduct() {
        return resultProduct;
    }
}
