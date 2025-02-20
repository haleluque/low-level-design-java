package com.haleluque.low.level.design.design.patterns.CreationalPatterns.SingletonPattern.exampleWithout;

public class AppSettingsWithout {
    private final String databaseUrl;
    private final String apiKey;

    public AppSettingsWithout(){
        //Read settings from a config file
        databaseUrl = "jdbc:mysql://localhost:3306/mydatabase";
        apiKey = "12345-ABCDE";
    }

    public String getDatabaseUrl(){
        return databaseUrl;
    }
    public String getApiKey(){
        return apiKey;
    }
}
