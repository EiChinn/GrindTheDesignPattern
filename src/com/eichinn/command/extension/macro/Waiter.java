package com.eichinn.command.extension.macro;

/**
 * Created by ei_chinn on 2017/5/23.
 */
public class Waiter {
    private MenuCommand menuCommand = new MenuCommand();

    public void orderDish(Command command) {
        if (command instanceof CoolMeatCommand) {
            ((CoolMeatCommand) command).setCook(new CoolCook());
        } else if (command instanceof ChopCommand) {
            ((ChopCommand) command).setCook(new HotCook());
        } else if (command instanceof DuckCommand) {
            ((DuckCommand) command).setCook(new HotCook());
        }

        menuCommand.addCommand(command);
    }

    public void orderOver() {
        menuCommand.execute();
    }
}
