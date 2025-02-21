package com.haleluque.low.level.design.design.patterns.StructuralPatterns.AdapterPattern.exercise;

public class NewWeatherServiceAdapter implements WeatherService {

    private final NewWeatherService newWeatherService;

    public NewWeatherServiceAdapter(NewWeatherService newWeatherService) {
        this.newWeatherService = newWeatherService;
    }

    @Override
    public String getWeatherData() {
        return newWeatherService.fetchWeather();
    }
}
