package com.eichinn.simple_factory;

/**
 * Created by ei_chinn on 2017/1/5.
 */
public class Factory {
    private Factory() {//防止创建Factory的实例，因为没有必要
    }

    /**
     * 注意这个方法有一个缺点：由于是从客户端在调用工厂的时候传入选择的参数，这就说明客户端必须知道每个参数的含义，也需要理解每个参数对应的功能处理。
     * 这就要求必须在一定程度上，向客户端暴露一定的内部实现细节。
     * @param type
     * @return
     */
    public static Api createApi(int type) {
        Api api;
        switch (type) {
            case 2:
                api = new Impl2();
                break;
            case 1:
            default:
                api = new Impl();
            break;
        }
        return api;
    }
}
