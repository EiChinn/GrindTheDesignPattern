package com.eichinn.command.practical;

/**
 * Created by ei_chinn on 2017/5/10.
 */
public class ResetCommand implements Command {
    private MainBoardApi mainBoard;

    public ResetCommand(MainBoardApi mainBoard) {
        this.mainBoard = mainBoard;
    }

    @Override
    public void execute() {
        mainBoard.reset();
    }
}
