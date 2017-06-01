package com.eichinn.flyweight.practical;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by ei_chinn on 2017/6/1.
 */
public class SecurityMgr {
    private static SecurityMgr securityMgr = new SecurityMgr();

    private SecurityMgr() {

    }

    public static SecurityMgr getInstance() {
        return securityMgr;
    }

    private Map<String, Collection<Flyweight>> map = new HashMap<>();

    public void login(String user) {
        Collection<Flyweight> col = queryByUser(user);
        map.put(user, col);
    }

    public boolean hasPermit(String user, String securityEntity, String permit) {
        Collection<Flyweight> col = map.get(user);
        if (col == null || col.size() == 0) {
            System.out.println(user + " no permit");
            return false;
        }
        for (Flyweight fm : col) {
            System.out.println("fm == " + fm);
            if (fm.match(securityEntity, permit)) {
                return true;
            }
        }

        return false;
    }

    private Collection<Flyweight> queryByUser(String user) {
        Collection<Flyweight> col = new ArrayList<>();
        for (String s : TestDB.colDB) {
            String[] ss = s.split(",");
            if (ss[0].equals(user)) {
                Flyweight fm = FlyweightFactory.getInstance().getFlyweight(ss[1] + "," + ss[2]);
                col.add(fm);
            }
        }
        return col;
    }
}
