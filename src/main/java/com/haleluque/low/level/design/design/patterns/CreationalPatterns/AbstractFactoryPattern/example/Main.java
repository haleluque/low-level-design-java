package com.haleluque.low.level.design.design.patterns.CreationalPatterns.AbstractFactoryPattern.example;

/**
 * Abstract Factory pattern provides an interface for creating families of related objects without specifying their
 * concrete classes, promoting a consistent interface for object creation.
 * <p>
 * The Abstract Factory pattern is particularly useful when the system should not be tightly coupled with
 * the concrete classes of the objects it creates, enhancing flexibility and modularity.
 * <p>
 * Structure:
 * - Abstract Factory: Interface for creating abstract object
 * - Concrete Factory: Implements the abstract factory and creates concrete object
 */
public class Main {
    private final Button button;
    private final ScrollBar scrollBar;

    public Main(UIFactory factory) {
        this.button = factory.createButton();
        this.scrollBar = factory.createScrollBar();
    }

    public void renderUI() {
        button.render();
        scrollBar.scroll();
    }

    public static void main(String[] args) {
        UIFactory windowsFactory = new WindowsFactory();
        Main windowsApp = new Main(windowsFactory);
        windowsApp.renderUI();

        UIFactory macFactory = new MacOSFactory();
        Main macApp = new Main(macFactory);
        macApp.renderUI();
    }
}
