package com.eichinn.flyweight.practical;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by ei_chinn on 2017/6/1.
 */
public class TestDB {
    public static Collection<String> colDB = new ArrayList<>();
    public static Map<String, String[]> mapDB = new HashMap<>();

    static {
        colDB.add("张三,人员列表,查看,1");
        colDB.add("李四,人员列表,查看,1");
        colDB.add("李四,操作薪资数据,,2");

        mapDB.put("操作薪资数据", new String[]{"薪资数据,查看", "薪资数据,修改"});

        for (int i = 0; i < 3; i++) {
            colDB.add("张三" + i + ",人员列表,查看,1");
        }
    }
}
