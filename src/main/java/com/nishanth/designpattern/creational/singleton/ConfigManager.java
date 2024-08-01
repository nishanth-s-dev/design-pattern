package com.nishanth.designpattern.creational.singleton;

import java.util.HashMap;
import java.util.Map;

public class ConfigManager {
    private Map<String, Object> settings = new HashMap<String, Object>();

    public void addSetting(String key, Object value) {
        settings.put(key, value);
    }

    public Object getSetting(String key) {
        return settings.get(key);
    }
}
