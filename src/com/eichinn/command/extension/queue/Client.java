package com.eichinn.command.extension.queue;

/**
 * Created by ei_chinn on 2017/5/31.
 */
public class Client {
    public static void main(String[] args) {
        CookerManager.runCookerManager();
        for (int i = 0; i < 5; i++) {
            Waiter waiter = new Waiter();

            Command chop = new ChopCommand(i);
            Command duck = new DuckCommand(i);

            waiter.orderDish(chop);
            waiter.orderDish(duck);
            waiter.orderOver();
        }
    }
}
