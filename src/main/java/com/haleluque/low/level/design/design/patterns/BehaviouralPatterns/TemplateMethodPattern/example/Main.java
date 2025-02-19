package com.haleluque.low.level.design.design.patterns.BehaviouralPatterns.TemplateMethodPattern.example;

/**
 * The Template Method Pattern defines the skeleton of an algorithm in a method, deferring some steps to subclasses.
 * This pattern lets subclasses redefine certain steps of an algorithm without changing its structure.
 * <p>
 * - Abstract class: Defines the algorithm skeleton/template
 * - Hook: Is a method in the base class with a default or empty implementation that subclasses can override to extend or modify behaviour.
 * - Concrete Subclass: Overrides specific steps of the algorithm
 * <p>
 * This pattern is useful when you have a consistent sequence of steps for multiple subclasses but the
 * implementation of some steps may vary. By using the Template Method Pattern, you can define the invariant parts of
 * the algorithm in the base class and defer the variable parts to the subclasses.
 */
public class Main {
    public static void main(String[] args) {
        DataParser csvParser = new CSVParser();
        csvParser.parse();
        DataParser jsonParser = new JSONParser();
        jsonParser.parse();
    }
}
