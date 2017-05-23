package com.eichinn.command.practical;

/**
 * Created by ei_chinn on 2017/5/9.
 */
public class Client {
    public static void main(String[] args) {
        MainBoardApi msiMainBoard = new MsiMainBoard();
        Command openCommand = new OpenCommand(msiMainBoard);
        Box box = new Box();
        box.setOpenCommand(openCommand);
        box.openBtnPress();

        MainBoardApi gigaMainBoard = new GigaMainBoard();
        Command resetCommand = new ResetCommand(gigaMainBoard);
        box.setResetCommad(resetCommand);
        box.resetBtnPress();

    }

}
