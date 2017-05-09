package com.eichinn.command.practical;

/**
 * Created by ei_chinn on 2017/5/9.
 */
public class OpenCommand implements Command {
    private MainBoardApi mainBoard = null;

    public OpenCommand(MainBoardApi mainBoard) {
        this.mainBoard = mainBoard;
    }

    @Override
    public void execute() {
        mainBoard.open();
    }
}
