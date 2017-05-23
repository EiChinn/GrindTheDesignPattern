package com.eichinn.command.extension.undo;

import java.util.Stack;

/**
 * Created by ei_chinn on 2017/5/22.
 */
public class Calculator {
    private Command addCommand;
    private Command substractCommand;
    private Stack<Command> undoCmds = new Stack<>();
    private Stack<Command> redoCmds = new Stack<>();

    public void setAddCommand(Command addCommand) {
        this.addCommand = addCommand;
    }

    public void setSubstractCommand(Command substractCommand) {
        this.substractCommand = substractCommand;
    }

    public void addPressed() {
        addCommand.execute();
        undoCmds.push(addCommand);
    }

    public void substractPressed() {
        substractCommand.execute();
        undoCmds.push(substractCommand);
    }

    public void undoPressed() {
        Command undoCmd = null;

        if (!undoCmds.isEmpty() && (undoCmd = undoCmds.pop()) != null) {
            undoCmd.undo();
            redoCmds.add(undoCmd);
        } else {
            System.out.println("Sorry, there's no undo command");
        }
    }

    public void redoPressed() {
        Command redoCmd = null;
        if (!redoCmds.isEmpty() && (redoCmd = redoCmds.pop()) != null) {
            redoCmd.execute();
            undoCmds.add(redoCmd);
        } else {
            System.out.println("Sorry, there's no redo command");
        }
    }
}
