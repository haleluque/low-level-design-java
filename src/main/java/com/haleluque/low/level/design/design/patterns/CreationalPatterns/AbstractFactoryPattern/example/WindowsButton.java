package com.haleluque.low.level.design.design.patterns.CreationalPatterns.AbstractFactoryPattern.example;

public class WindowsButton implements Button {
    @Override
    public void render() {
        System.out.println("Rendering windows button");
    }
}
