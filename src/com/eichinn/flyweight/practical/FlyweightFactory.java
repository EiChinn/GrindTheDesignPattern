package com.eichinn.flyweight.practical;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by ei_chinn on 2017/6/1.
 */
public class FlyweightFactory {
    private static FlyweightFactory factory = new FlyweightFactory();

    private FlyweightFactory() {
        Thread t = new ClearCache();
        t.start();
    }

    public static FlyweightFactory getInstance() {
        return factory;
    }



    private Map<String, Flyweight> fsMap = new HashMap<>();
    private Map<String, CacheConfModel> cacheConfModelHashMap = new HashMap<>();
    private Map<String, Integer> countMap = new HashMap<>();
    private final long DURABLE_TIME = 6 * 1000L;

    public synchronized int getUseTimes(String key) {
        Integer count = countMap.get(key);
        if (count == null) {
            count = 0;
        }
        return count;

    }

    public synchronized Flyweight getFlyweight(String key) {
        Flyweight f = fsMap.get(key);
        if (f == null) {
            f = new AuthorizationFlyweight(key);
            fsMap.put(key, f);

            countMap.put(key, 1);

            CacheConfModel cacheConfModel = new CacheConfModel();
            cacheConfModel.setBeginTime(System.currentTimeMillis());
            cacheConfModel.setDurableTime(DURABLE_TIME);
            cacheConfModel.setForever(false);
            cacheConfModelHashMap.put(key, cacheConfModel);
        } else {
            CacheConfModel cacheConfModel = cacheConfModelHashMap.get(key);
            cacheConfModel.setBeginTime(System.currentTimeMillis());
            cacheConfModelHashMap.put(key, cacheConfModel);

            int count = countMap.get(key) + 1;
            countMap.put(key, count);
        }
        return f;
    }

    private synchronized void removeFlyweight(String key) {
        fsMap.remove(key);
        cacheConfModelHashMap.remove(key);
        countMap.remove(key);
    }

    private class ClearCache extends Thread {
        @Override
        public void run() {
            while (true) {
                Set<String> tempSet = new HashSet<>();
                Set<String> set = cacheConfModelHashMap.keySet();
                for (String s : set) {
                    CacheConfModel cacheConfModel = cacheConfModelHashMap.get(s);
                    if (System.currentTimeMillis() - cacheConfModel.getBeginTime() >= cacheConfModel.getDurableTime()) {
                        tempSet.add(s);
                    }
                }

                for (String s : tempSet) {
                    FlyweightFactory.getInstance().removeFlyweight(s);
                }

                System.out.println("now thread = " + fsMap.size() + ", fsMap = " + fsMap.keySet());

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
