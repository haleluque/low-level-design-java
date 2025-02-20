package com.haleluque.low.level.design.design.patterns.CreationalPatterns.BuilderPattern.example;

/**
 * The Builder Pattern is a creational design pattern that allows for the step-by-step construction of complex objects.
 * It provides a way to construct an object one step at a time and separate the construction process from the representation.
 * <p>
 * This pattern is particularly useful when you need to create objects with multiple optional parameters or
 * when you want to avoid having a large constructor with many parameters.
 */
public class Main {
    public static void main(String[] args) {
        House house = new House.HouseBuilder("Concrete", "Wooden", "Tile")
                .setGarden(true)
                .setSwimmingPool(true)
                .setGarage(false)
                .build();

        System.out.println(house);
    }
}
