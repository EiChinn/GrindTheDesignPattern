package com.eichinn.command.extension.undo;

/**
 * Created by ei_chinn on 2017/5/22.
 */
public interface Command {
    void execute();

    void undo();
}
