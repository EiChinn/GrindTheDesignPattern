package com.eichinn.facade;

/**
 * Created by ei_chinn on 2017/1/8.
 */
public class ConfigManager {
    private static ConfigManager configManager;
    private static ConfigModel configModel;

    private ConfigManager() {
    }

    public static ConfigManager getInstance() {
        if (configManager == null) {
            configManager = new ConfigManager();
            configModel = new ConfigModel();
        }
        return configManager;
    }

    public ConfigModel getConfigData() {
        return configModel;
    }
}
