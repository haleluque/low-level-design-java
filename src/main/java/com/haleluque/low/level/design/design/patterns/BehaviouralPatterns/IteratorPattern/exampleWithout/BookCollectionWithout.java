package com.haleluque.low.level.design.design.patterns.BehaviouralPatterns.IteratorPattern.exampleWithout;

import java.util.ArrayList;
import java.util.List;

public class BookCollectionWithout {
    private final List<BookWithout> bookWithout = new ArrayList<>();

    public void addBook(BookWithout bookWithout){
        this.bookWithout.add(bookWithout);
    }

    public List<BookWithout> getBooks() {
        return bookWithout;
    }
}
