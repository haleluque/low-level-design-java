package com.haleluque.low.level.design.SOLIDprinciples.liskovSubstitution.badCode;


/**
 * The Liskov Substitution Principle (LSP) states that objects of a superclass
 * should be replaceable with objects of a subclass without altering the correctness of the program.
 * <p>
 * Ensures a subclass can stand in for its parent class and function correctly.
 * <p>
 * No client should be forced to depend on methods it doesn't use.
 * Split large Interfaces into smaller, more specific
 */
public class FileBadCode {
    public void read() {
        System.out.println("reading from file...");
    }

    public void write(){
        System.out.println("writing in file...");
    }
}
