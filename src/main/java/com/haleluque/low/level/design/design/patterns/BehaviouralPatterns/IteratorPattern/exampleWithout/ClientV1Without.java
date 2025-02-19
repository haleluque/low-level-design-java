package com.haleluque.low.level.design.design.patterns.BehaviouralPatterns.IteratorPattern.exampleWithout;

public class ClientV1Without {
    public static void main(String[] args) {
        BookCollectionWithout bookCollectionWithout = new BookCollectionWithout();
        bookCollectionWithout.addBook(new BookWithout("book1"));
        bookCollectionWithout.addBook(new BookWithout("book2"));
        bookCollectionWithout.addBook(new BookWithout("book3"));
        //Iterate over the list, tightly coupled, wont be able to easily change the collection type
        bookCollectionWithout.getBooks().forEach(System.out::println);
    }
}
