package com.nishanth.designpattern.creational.singleton;

public class Client {
    public static void main(String[] args) {
        ConfigManager configManager = new ConfigManager();
        configManager.addSetting("name", "Something");


        // Assume, in some other place
        ConfigManager configManager1 = new ConfigManager();
        configManager1.addSetting("name", "IDK");

        // This will have no meaning dude... Because we need only one config manager for whole application. That should be accessible for all place.
    }
}
