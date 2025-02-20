package com.haleluque.low.level.design.design.patterns.CreationalPatterns.AbstractFactoryPattern.example;

public class MacOSScrollBar implements ScrollBar{
    @Override
    public void scroll() {
        System.out.println("Rendering mac scrollbar");
    }
}
