package com.haleluque.low.level.design.design.patterns.StructuralPatterns.AdapterPattern.exercise;

import java.util.Scanner;

public class MainExercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String legacyTemperature = sc.nextLine();
        String legacyCondition = sc.nextLine();

        // Using the legacy weather service with user input
        WeatherService legacyService = new LegacyWeatherService(legacyTemperature, legacyCondition);
        System.out.println("Legacy Weather Service Data:");

        System.out.println(legacyService.getWeatherData());

        String temperature = sc.nextLine();
        String condition = sc.nextLine();

        WeatherService adaptedService = new NewWeatherServiceAdapter(new NewWeatherService(temperature, condition));
        System.out.println("New Weather Service Data:");

        System.out.println(adaptedService.getWeatherData());


        sc.close();
    }
}
