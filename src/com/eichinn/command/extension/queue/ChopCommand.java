package com.eichinn.command.extension.queue;

/**
 * Created by ei_chinn on 2017/5/31.
 */
public class ChopCommand implements Command {
    private CookApi cook;
    private int tableNum;

    public ChopCommand(int tableNum) {
        this.tableNum = tableNum;
    }

    @Override
    public void execute() {
        cook.cook(tableNum, "绿豆排骨汤");
    }

    @Override
    public void setCookApi(CookApi cookApi) {
        this.cook = cookApi;
    }

    @Override
    public int getTableNum() {
        return tableNum;
    }
}
