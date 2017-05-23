package com.eichinn.command.extension.undo;

/**
 * Created by ei_chinn on 2017/5/22.
 */
public class Client {
    public static void main(String[] args) {
        OperationApi operation = new Operation();
        AddCommand addCommand = new AddCommand(operation, 5);
        SubstractCommand substractCommand = new SubstractCommand(operation, 3);

        Calculator calculator = new Calculator();
        calculator.setAddCommand(addCommand);
        calculator.setSubstractCommand(substractCommand);

        calculator.addPressed();
        System.out.println("after add command the result is : " + operation.getResult());

        calculator.substractPressed();
        System.out.println("after substract command the result is : " + operation.getResult());

        calculator.undoPressed();
        System.out.println("after undo command the result is : " + operation.getResult());
        calculator.undoPressed();
        System.out.println("after undo command the result is : " + operation.getResult());
        calculator.undoPressed();
        System.out.println("after undo command the result is : " + operation.getResult());

        calculator.redoPressed();
        System.out.println("after redo command the result is : " + operation.getResult());
        calculator.redoPressed();
        System.out.println("after redo command the result is : " + operation.getResult());
        calculator.redoPressed();
        System.out.println("after redo command the result is : " + operation.getResult());


    }
}
