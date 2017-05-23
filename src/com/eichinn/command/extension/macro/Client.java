package com.eichinn.command.extension.macro;

/**
 * Created by ei_chinn on 2017/5/23.
 */
public class Client {
    public static void main(String[] args) {
        Waiter waiter = new Waiter();

        ChopCommand chopCommand = new ChopCommand();
        DuckCommand duckCommand = new DuckCommand();
        CoolMeatCommand coolMeatCommand = new CoolMeatCommand();

        waiter.orderDish(chopCommand);
        waiter.orderDish(duckCommand);
        waiter.orderDish(coolMeatCommand);

        waiter.orderOver();

    }
}
