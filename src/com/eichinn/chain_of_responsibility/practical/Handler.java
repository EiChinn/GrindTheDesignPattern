package com.eichinn.chain_of_responsibility.practical;

/**
 * Created by ei_chinn on 2017/6/1.
 */
public abstract class Handler {
    protected Handler nexthandler;

    public void setNexthandler(Handler nexthandler) {
        this.nexthandler = nexthandler;
    }

    public abstract String handleFeeRequest(String user, double fee);
}
