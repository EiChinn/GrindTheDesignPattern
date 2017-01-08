package com.eichinn.facade;

/**
 * Created by ei_chinn on 2017/1/8.
 */
public class DAO {
    public void generate() {
        ConfigModel configModel = ConfigManager.getInstance().getConfigData();
        if (configModel.isNeedGenDAO()) {
            System.out.println("need generate DAO");
        }
    }
}
