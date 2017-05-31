package com.eichinn.command.extension.queue;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ei_chinn on 2017/5/31.
 */
public class MenuCommand implements Command {
    private List<Command> menu = new ArrayList<>();
    @Override
    public void execute() {
        CommandQueue.addCmd(this);
    }

    public List<Command> getMenu() {
        return menu;
    }

    public void addCmd(Command command) {
        menu.add(command);
    }

    @Override
    public void setCookApi(CookApi cookApi) {

    }

    @Override
    public int getTableNum() {
        return 0;
    }
}
