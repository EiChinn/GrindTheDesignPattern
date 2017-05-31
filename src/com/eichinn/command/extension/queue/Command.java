package com.eichinn.command.extension.queue;

/**
 * Created by ei_chinn on 2017/5/31.
 */
public interface Command {
    void execute();

    void setCookApi(CookApi cookApi);

    int getTableNum();
}
