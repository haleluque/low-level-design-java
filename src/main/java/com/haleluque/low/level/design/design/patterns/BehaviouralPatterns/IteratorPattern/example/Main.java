package com.haleluque.low.level.design.design.patterns.BehaviouralPatterns.IteratorPattern.example;

import java.util.Iterator;

/**
 * The Iterator Pattern provides a way to access the elements of a collection sequentially without exposing its
 * underlying representation. It's particularly useful for traversing collections like lists, arrays, or any other aggregate object.
 * -
 * We can traverse any collection without caring about its type.
 * <p>
 * - Iterator: Interface for traversing a collection
 * - Collection: Holds the elements and provides an iterator
 */
public class Main {
    public static void main(String[] args) {
        BookCollection bookCollection = new BookCollection();
        bookCollection.addBook(new Book("C++"));
        bookCollection.addBook(new Book("Java"));
        bookCollection.addBook(new Book("Python"));

        //Iterate the bookCollection with loose coupling
        Iterator<Book> bookIterator =  bookCollection.createIterator();
        while (bookIterator.hasNext()) {
            System.out.println(bookIterator.next());
        }

        BookCollectionV2 bookCollectionV2 = new BookCollectionV2();
        bookCollectionV2.addBook(new Book("Software Architecture"));
        bookCollectionV2.addBook(new Book("Algorithms"));
        bookCollectionV2.addBook(new Book("OOP"));

        for (Book book : bookCollectionV2) {
            System.out.println(book);
        }
    }
}
