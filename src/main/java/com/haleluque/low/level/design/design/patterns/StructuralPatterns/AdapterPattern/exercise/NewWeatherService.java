package com.haleluque.low.level.design.design.patterns.StructuralPatterns.AdapterPattern.exercise;

public class NewWeatherService {

    private final String temperature;
    private final String condition;

    public NewWeatherService(String temperature, String condition) {
        this.temperature = temperature;
        this.condition = condition;
    }

    public String fetchWeather() {
        return "{\"temperature\": " + temperature + ", \"condition\": \"" + condition + "\"}";
    }
}