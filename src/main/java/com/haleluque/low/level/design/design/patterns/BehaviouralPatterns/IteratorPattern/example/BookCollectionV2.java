package com.haleluque.low.level.design.design.patterns.BehaviouralPatterns.IteratorPattern.example;

import java.util.*;

@SuppressWarnings("NullableProblems")
public class BookCollectionV2 implements Iterable<Book> {
    private final Set<Book> books = new TreeSet<>();

    public void addBook(Book book){
        this.books.add(book);
    }

    /**
     * Creates the iterator nested class
     * overriding the Iterable interface instead of using a regular method
     */
    @Override
    public Iterator<Book> iterator() {
        return books.iterator(); //iterator already implemented in the treeSet class
    }
}
