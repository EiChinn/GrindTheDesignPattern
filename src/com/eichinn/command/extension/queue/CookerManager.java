package com.eichinn.command.extension.queue;

/**
 * Created by ei_chinn on 2017/5/31.
 */
public class CookerManager {
    private static boolean runFlag = false;

    public static void runCookerManager() {
        if (!runFlag) {
            runFlag = true;

            HotCook cook1 = new HotCook("ei_chinn");
            HotCook cook2 = new HotCook("shana");
            HotCook cook3 = new HotCook("otamegane");

            Thread thread1 = new Thread(cook1);
            thread1.start();
            Thread thread2 = new Thread(cook2);
            thread2.start();
            Thread thread3 = new Thread(cook3);
            thread3.start();
        }
    }
}
