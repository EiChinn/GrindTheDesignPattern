package com.eichinn.command.extension.macro;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ei_chinn on 2017/5/23.
 */
public class MenuCommand implements Command {
    private List<Command> menu = new ArrayList<>();

    public void addCommand(Command command) {
        menu.add(command);
    }
    @Override
    public void execute() {
        for (Command command : menu) {
            command.execute();
        }
    }
}
