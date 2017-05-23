package com.eichinn.command.practical;

/**
 * Created by ei_chinn on 2017/5/9.
 */
public class Box {
    private Command openCommand;

    public void setOpenCommand(Command openCommand) {
        this.openCommand = openCommand;
    }

    public void openBtnPress() {
        openCommand.execute();
    }

    private Command resetCommad;

    public void setResetCommad(Command resetCommad) {
        this.resetCommad = resetCommad;
    }

    public void resetBtnPress() {
        resetCommad.execute();
    }
}
