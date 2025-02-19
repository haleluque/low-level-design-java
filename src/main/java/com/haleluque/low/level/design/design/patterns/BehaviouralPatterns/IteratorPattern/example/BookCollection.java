package com.haleluque.low.level.design.design.patterns.BehaviouralPatterns.IteratorPattern.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BookCollection {
    private final List<Book> books = new ArrayList<>();

    public void addBook(Book book){
        this.books.add(book);
    }

    public List<Book> getBooks() {
        return books;
    }

    /**
     * Creates the iterator nested class
     */
    public Iterator<Book> createIterator() {
        return new BookIterator(this.books);
    }

    /**
     * Depends on directly from the container class, that's why is a nested class
     */
    private static class BookIterator implements Iterator<Book> {
        private final List<Book> books;
        private int position = 0;

        public BookIterator(List<Book> books) {
            this.books = books;
        }

        @Override
        public boolean hasNext() {
            return position < books.size();
        }

        @Override
        public Book next() {
            //returns the position and the moves to the next
            return books.get(position++);
        }
    }
}
