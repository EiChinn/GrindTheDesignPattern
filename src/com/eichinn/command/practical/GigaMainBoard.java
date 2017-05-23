package com.eichinn.command.practical;

/**
 * Created by ei_chinn on 2017/5/9.
 */
public class GigaMainBoard implements MainBoardApi {
    @Override
    public void open() {
        System.out.println("GigaMainBoard open");
    }

    @Override
    public void reset() {
        System.out.println("GigaMainBoard reset");
    }
}
