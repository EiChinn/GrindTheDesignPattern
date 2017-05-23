package com.eichinn.command.extension.undo;

/**
 * Created by ei_chinn on 2017/5/22.
 */
public interface OperationApi {
    int getResult();

    void setResult(int result);

    void add(int num);

    void substract(int num);
}
