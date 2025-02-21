package com.haleluque.low.level.design.design.patterns.StructuralPatterns.DecoratorPattern.exercise;

/**
 * Decorator, it implements the component interface as well as the concrete component
 */
public abstract class CoffeeDecorator implements Coffee {
    protected Coffee coffee;

    public CoffeeDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription();
    }

    @Override
    public double getCost() {
        return coffee.getCost();
    }
}
