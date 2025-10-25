package com.haleluque.low.level.design.design.patterns.BehaviouralPatterns.VisitorPattern.example;

// Element interface
public interface Item {
    void accept(Visitor visitor);
}
