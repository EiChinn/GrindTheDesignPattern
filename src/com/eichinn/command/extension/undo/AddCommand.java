package com.eichinn.command.extension.undo;

/**
 * Created by ei_chinn on 2017/5/22.
 */
public class AddCommand implements Command {
    private OperationApi operation;
    private int opeNum;

    public AddCommand(OperationApi operation, int opeNum) {
        this.operation = operation;
        this.opeNum = opeNum;
    }

    @Override
    public void execute() {
        operation.add(opeNum);
    }

    @Override
    public void undo() {
        operation.substract(opeNum);
    }
}
