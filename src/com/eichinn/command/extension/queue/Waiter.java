package com.eichinn.command.extension.queue;

/**
 * Created by ei_chinn on 2017/5/31.
 */
public class Waiter {
    private MenuCommand menuCommand = new MenuCommand();

    public void orderDish(Command cmd) {
        menuCommand.addCmd(cmd);
    }

    public void orderOver() {
        menuCommand.execute();
    }
}
