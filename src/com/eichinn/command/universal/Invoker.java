package com.eichinn.command.universal;

/**
 * Created by ei_chinn on 2017/5/9.
 */
public class Invoker {
    private Command command;

    public Command getCommand() {
        return command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void runCommand() {
        command.execute();//调用命令对象的执行方法
    }
}
