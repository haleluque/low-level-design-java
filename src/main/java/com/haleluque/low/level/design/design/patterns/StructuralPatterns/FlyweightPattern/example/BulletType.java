package com.haleluque.low.level.design.design.patterns.StructuralPatterns.FlyweightPattern.example;

/**
 * FlyWeight class
 */
public class BulletType {
    private String color; //Intrinsic prop

    public BulletType(String color) {
        this.color = color;
    }

    public String getColor() { return color; }
}
