package com.haleluque.low.level.design.design.patterns.BehaviouralPatterns.IteratorPattern.exampleWithout;

public record BookWithout(String title) {
    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                '}';
    }
}
