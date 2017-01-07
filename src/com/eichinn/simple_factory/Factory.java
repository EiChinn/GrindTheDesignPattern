package com.eichinn.simple_factory;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

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

    /**
     * 根据配置文件的参数来创建接口
     * @return
     */
    public static Api createApiUseProperties() {
        Properties p = new Properties();
        InputStream is = null;
        try {
            is = Factory.class.getResourceAsStream("FactoryTest.properties");
            p.load(is);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        Api api = null;
        try {
            api = (Api)Class.forName(p.getProperty("ImplClass")).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return api;
    }
}
