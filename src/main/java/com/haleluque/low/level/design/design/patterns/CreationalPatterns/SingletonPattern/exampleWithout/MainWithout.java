package com.haleluque.low.level.design.design.patterns.CreationalPatterns.SingletonPattern.exampleWithout;

public class MainWithout {
    public static void main(String[] args) {
        AppSettingsWithout appSettings = new AppSettingsWithout();
        AppSettingsWithout appSettingsCopy = new AppSettingsWithout();

        System.out.println(appSettingsCopy.getApiKey());
        System.out.println(appSettings.getApiKey());

        //More memory
        System.out.println(appSettings==appSettingsCopy);
    }
}
