package com.eichinn.simple_factory;

/**
 * Created by ei_chinn on 2016/12/25.
 */
public class Client {
    public static void main(String[] args) {
        //下面做法的缺点：interface的思想是"封装隔离"，实现类Impl应该是被Api封装并与Client隔离开的，即Client根本就不应该知道具体的实现类是Impl。
        //而现在Client不但知道了Api，同时还知道了具体的实现类就是Impl，这违背了interface的"封装隔离"原则。
//        Api api = new Impl();
//        api.test("Impl");

//        Api api = Factory.createApi(1);
//        api.test("Test simple factory pattern");

        Api api = Factory.createApiUseProperties();
        api.test("Test simple factory pattern");
    }
}
