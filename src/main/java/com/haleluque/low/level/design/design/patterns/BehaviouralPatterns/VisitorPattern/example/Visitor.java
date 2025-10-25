package com.haleluque.low.level.design.design.patterns.BehaviouralPatterns.VisitorPattern.example;

//Visitor Interface: declaring visit methods for each type of element
public interface Visitor {
    void visit(Book book);
    void visit(Fruit fruit);
}
