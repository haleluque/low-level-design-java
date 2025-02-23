package com.haleluque.low.level.design.design.patterns.StructuralPatterns.CompositePattern.exercise;

/**
 * Leaf class
 */
public class MenuItem implements MenuComponent {
    private final String name;
    private final String description;
    private final double price;

    public MenuItem(String name, String description, double price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }

    @Override
    public void print() {
        System.out.printf("Item: %s\nDescription: %s\nPrice: $%.2f\n", name, description, price);
    }
}