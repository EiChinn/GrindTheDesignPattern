package com.eichinn.command.extension.queue;

import java.io.Serializable;

/**
 * Created by ei_chinn on 2017/5/31.
 */
public class DuckCommand implements Command, Serializable {
    private CookApi cook;
    private int tableNum;

    public DuckCommand(int tableNum) {
        this.tableNum = tableNum;
    }

    @Override
    public void execute() {
        cook.cook(tableNum, "北京烤鸭");
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
