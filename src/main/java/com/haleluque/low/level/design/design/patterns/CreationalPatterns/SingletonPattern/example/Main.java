package com.haleluque.low.level.design.design.patterns.CreationalPatterns.SingletonPattern.example;

/**
 * The singleton pattern is used when exactly one instance of a class is required to coordinate actions across the
 * system
 * <p>
 * When to use:
 * - Global resource management e.g database connections
 * - Configuration Settings
 * <p>
 * In a multithreading environment, the Singleton pattern often uses synchronized methods to ensure that only
 * one instance is created, even if multiple threads attempt to create an instance at the same time.
 * <p>
 * To ensure that a Singleton object cannot be cloned, you should override the clone()
 * method and throw CloneNotSupportedException to prevent the creation of multiple instances.
 */
public class Main {
    public static void main(String[] args) {
        AppSettings appSettings = AppSettings.getInstance();
        AppSettings appSettingsCopy = AppSettings.getInstance();

        System.out.println(appSettingsCopy.getApiKey());
        System.out.println(appSettings.getApiKey());

        //More memory
        System.out.println(appSettings==appSettingsCopy);
    }
}
