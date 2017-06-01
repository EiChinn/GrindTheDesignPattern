package com.eichinn.chain_of_responsibility.practical;

/**
 * Created by ei_chinn on 2017/6/1.
 */
public class GeneralManager extends Handler {
    @Override
    public String handleFeeRequest(String user, double fee) {
        String str = "";
        if (fee < 1000) {
            if ("xiaoli".equals(user)) {
                str = "GeneralManager agree " + user + " " + fee + " request";
            } else {
                str = "GeneralManager do not agree " + user + " " + fee + " request";
            }
        } else {
            if (nexthandler != null) {
                return nexthandler.handleFeeRequest(user, fee);
            }
        }

        return str;
    }
}
