package com.eichinn.command.extension.macro;

/**
 * Created by ei_chinn on 2017/5/23.
 */
public class DuckCommand implements Command {
    private CookApi cook;

    public void setCook(CookApi cook) {
        this.cook = cook;
    }

    @Override
    public void execute() {
        cook.cook("duck");
    }
}
