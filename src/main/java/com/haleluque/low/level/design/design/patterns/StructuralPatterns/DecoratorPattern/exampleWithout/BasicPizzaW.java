package com.haleluque.low.level.design.design.patterns.StructuralPatterns.DecoratorPattern.exampleWithout;

public class BasicPizzaW implements PizzaW {
    @Override
    public String getDescription() {
        return "Basic Pizza";

    }

    @Override
    public double getCost() {
        return 5.00; //base cost
    }
}