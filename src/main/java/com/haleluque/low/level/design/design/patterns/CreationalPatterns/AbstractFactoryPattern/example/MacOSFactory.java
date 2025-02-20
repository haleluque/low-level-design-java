package com.haleluque.low.level.design.design.patterns.CreationalPatterns.AbstractFactoryPattern.example;

/**
 * Concrete Factory class
 */
public class MacOSFactory implements UIFactory{
    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public ScrollBar createScrollBar() {
        return new MacOSScrollBar();
    }
}
