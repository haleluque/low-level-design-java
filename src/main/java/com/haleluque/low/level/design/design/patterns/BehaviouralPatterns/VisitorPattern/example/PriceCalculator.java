package com.haleluque.low.level.design.design.patterns.BehaviouralPatterns.VisitorPattern.example;

// Concrete Visitor: Implements operations for each element type
public class PriceCalculator implements Visitor {
    public void visit(Book book) {
        System.out.println("Book price: $" + book.getPrice());
    }

    public void visit(Fruit fruit) {
        System.out.println("Fruit price: $" + fruit.getWeight() * fruit.getPricePerKg());
    }
}
