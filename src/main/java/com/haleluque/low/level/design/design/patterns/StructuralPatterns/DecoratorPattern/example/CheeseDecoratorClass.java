package com.haleluque.low.level.design.design.patterns.StructuralPatterns.DecoratorPattern.example;

/**
 * Concrete decorator
 */
public class CheeseDecoratorClass extends PizzaDecorator {

    public CheeseDecoratorClass(Pizza decoratedPizza) {
        super(decoratedPizza);
    }

    @Override
    public String getDescription() {
        return decoratedPizza.getDescription() + ", Cheese";
    }

    @Override
    public double getCost() {
        return decoratedPizza.getCost() + 0.50;
    }
}
