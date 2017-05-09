package com.eichinn.command.universal;

/**
 * Created by ei_chinn on 2017/5/9.
 */
public class Client {
    public void assemble() {

        Receiver receiver = new Receiver();
        Command command = new ConcreteCommand(receiver);
        Invoker invoker = new Invoker();
        invoker.setCommand(command);
        invoker.runCommand();
    }
}
