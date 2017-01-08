package com.eichinn.facade;

/**
 * Created by ei_chinn on 2017/1/8.
 */
public class Presentation {
    public void generate() {
        ConfigModel configModel = ConfigManager.getInstance().getConfigData();
        if (configModel.isNeedGenPresentation()) {
            System.out.println("need generate presentation");
        }
    }
}
