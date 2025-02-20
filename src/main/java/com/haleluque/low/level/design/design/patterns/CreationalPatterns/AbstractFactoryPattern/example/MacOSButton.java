package com.haleluque.low.level.design.design.patterns.CreationalPatterns.AbstractFactoryPattern.example;

public class MacOSButton implements Button{
    @Override
    public void render() {
        System.out.println("Rendering mac button");
    }
}
