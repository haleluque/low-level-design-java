package com.haleluque.low.level.design.design.patterns.StructuralPatterns.DecoratorPattern.exercise;

/**
 * Concrete decorator
 */
public class WhippedCream extends CoffeeDecorator {

    public WhippedCream(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + ", Whipped Cream";
    }

    @Override
    public double getCost() {
        return coffee.getCost() + 0.70;
    }
}
