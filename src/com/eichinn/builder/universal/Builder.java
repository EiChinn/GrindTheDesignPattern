package com.eichinn.builder.universal;

/**
 * 生成器接口，定义创建一个产品对象所需的各个部件的操作
 * Created by ei_chinn on 2017/3/8.
 */
public interface Builder {
    /**
     * 构建某个部件
     */
    void buildPart();
}
