package com.haleluque.low.level.design.design.patterns.BehaviouralPatterns.VisitorPattern.example;

//Concrete Element: Implements accept and calls back the visitor’s method
public class Fruit implements Item{
    private double weight;
    private double pricePerKg;
    public Fruit(double weight, double pricePerKg) {
        this.weight = weight;
        this.pricePerKg = pricePerKg;
    }
    public double getWeight() { return weight; }
    public double getPricePerKg() { return pricePerKg; }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
