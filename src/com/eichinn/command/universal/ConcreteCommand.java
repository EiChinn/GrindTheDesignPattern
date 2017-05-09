package com.eichinn.command.universal;

/**
 * Created by ei_chinn on 2017/5/9.
 */
public class ConcreteCommand implements Command {
    private Receiver receiver;
    /**
     * 命令对象可以有自己的状态
     */
    private String state;

    public ConcreteCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.action();//通常会转调接收者对象相应的方法，让接收者来真正执行功能
    }
}
