package com.haleluque.low.level.design.design.patterns.StructuralPatterns.CompositePattern.exercise;

import java.util.ArrayList;
import java.util.List;

/**
 * Composite class
 */
public class MenuSection implements MenuComponent {
    private final String sectionName;
    private final List<MenuComponent> menuComponents;

    public MenuSection(String sectionName) {
        this.sectionName = sectionName;
        this.menuComponents = new ArrayList<>();
    }

    public void add(MenuComponent menuComponent) {
        menuComponents.add(menuComponent);
    }

    @Override
    public void print() {
        System.out.println("Section: " + sectionName);
        menuComponents.forEach(MenuComponent::print);
    }
}