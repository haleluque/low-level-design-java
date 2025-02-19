package com.haleluque.low.level.design.design.patterns.BehaviouralPatterns.IteratorPattern.example;

public record Book(String title) implements Comparable<Book> {
    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                '}';
    }

    /**
     * When a class is going to be sorted (using a Set), it needs to be able to be compared by
     * a prop
     */
    @Override
    public int compareTo(Book o) {
        return this.title.compareTo(o.title);
    }
}