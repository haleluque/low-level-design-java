package com.haleluque.low.level.design.design.patterns.StructuralPatterns.DecoratorPattern.example;

/**
 * Concrete decorator
 */
public class OliveDecorator extends PizzaDecorator {

    public OliveDecorator(Pizza decoratedPizza) {
        super(decoratedPizza);
    }

    @Override
    public String getDescription() {
        return decoratedPizza.getDescription() + ", Olive";
    }

    @Override
    public double getCost() {
        return decoratedPizza.getCost() + 2.50;
    }
}