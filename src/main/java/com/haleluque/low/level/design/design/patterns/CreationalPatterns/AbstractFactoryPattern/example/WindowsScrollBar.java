package com.haleluque.low.level.design.design.patterns.CreationalPatterns.AbstractFactoryPattern.example;

public class WindowsScrollBar implements ScrollBar{
    @Override
    public void scroll() {
        System.out.println("Rendering windows scrollbar");
    }
}
