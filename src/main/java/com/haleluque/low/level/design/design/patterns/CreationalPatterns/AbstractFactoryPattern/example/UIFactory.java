package com.haleluque.low.level.design.design.patterns.CreationalPatterns.AbstractFactoryPattern.example;

/**
 * Abstract factory interface
 */
public interface UIFactory {
    Button createButton();
    ScrollBar createScrollBar();
}
