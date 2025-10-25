package com.haleluque.low.level.design.design.patterns.BehaviouralPatterns.VisitorPattern.example;

//Concrete Element: Implements accept and calls back the visitor’s method
public class Book implements Item {
    private double price;
    public Book(double price) { this.price = price; }
    public double getPrice() { return price; }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
