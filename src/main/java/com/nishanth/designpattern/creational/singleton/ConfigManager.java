package com.nishanth.designpattern.creational.singleton;

import java.util.HashMap;
import java.util.Map;

public final class ConfigManager {
    private static volatile ConfigManager configManager;

    private ConfigManager() {}

    public static ConfigManager getInstance() {
        if (configManager == null) {
            synchronized (ConfigManager.class) {
                if (configManager == null) {
                    return new ConfigManager();
                }
            }
        }
        return configManager;
    }

    private final Map<String, Object> settings = new HashMap<String, Object>();

    public void addSetting(String key, Object value) {
        settings.put(key, value);
    }

    public Object getSetting(String key) {
        return settings.get(key);
    }
}
