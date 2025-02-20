package com.haleluque.low.level.design.design.patterns.CreationalPatterns.AbstractFactoryPattern.example;

/**
 * Concrete Factory class
 */
public class WindowsFactory implements UIFactory{
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public ScrollBar createScrollBar() {
        return new WindowsScrollBar();
    }
}
