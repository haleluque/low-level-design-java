package com.haleluque.low.level.design.design.patterns.BehaviouralPatterns.VisitorPattern.example;

public class Main {
    public static void main(String[] args) {
        Item[] items = new Item[] {
                new Book(29.99),
                new Fruit(2.5, 3.0)
        };

        Visitor priceCalculator = new PriceCalculator();
        for (Item item : items) {
            item.accept(priceCalculator);
        }
    }
}
