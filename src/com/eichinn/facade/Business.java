package com.eichinn.facade;

/**
 * Created by ei_chinn on 2017/1/8.
 */
public class Business {
    public void generate() {
        ConfigModel configModel = ConfigManager.getInstance().getConfigData();
        if (configModel.isNeedGenBusiness()) {
            System.out.println("need generate business");
        }
    }
}
