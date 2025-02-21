package com.haleluque.low.level.design.design.patterns.StructuralPatterns.AdapterPattern.exercise;

public class LegacyWeatherService implements WeatherService {

    private final String temperature;
    private final String condition;

    public LegacyWeatherService(String temperature, String condition) {
        this.temperature = temperature;
        this.condition = condition;
    }

    @Override
    public String getWeatherData() {
        return "<weather><temperature>" + temperature + "</temperature><condition>" + condition + "</condition></weather>";
    }
}