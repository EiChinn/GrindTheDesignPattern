package com.eichinn.command.extension.undo;

/**
 * Created by ei_chinn on 2017/5/22.
 */
public class Operation implements OperationApi {
    private int result;
    @Override
    public int getResult() {
        return result;
    }

    @Override
    public void setResult(int result) {
        this.result = result;
    }

    @Override
    public void add(int num) {
        this.result += num;
    }

    @Override
    public void substract(int num) {
        this.result -= num;
    }
}
