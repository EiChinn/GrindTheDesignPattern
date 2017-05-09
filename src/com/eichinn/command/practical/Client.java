package com.eichinn.command.practical;

/**
 * Created by ei_chinn on 2017/5/9.
 */
public class Client {
    public static void main(String[] args) {
        MainBoardApi mainBoard = new MsiMainBoard();
//        MainBoardApi mainBoard = new GigaMainBoard();
        Command openCommand = new OpenCommand(mainBoard);
        Box box = new Box();
        box.setOpenCommand(openCommand);
        box.openBtnPress();
    }

}
