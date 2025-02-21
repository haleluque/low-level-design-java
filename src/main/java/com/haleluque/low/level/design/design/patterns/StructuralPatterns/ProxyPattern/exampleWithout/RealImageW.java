package com.haleluque.low.level.design.design.patterns.StructuralPatterns.ProxyPattern.exampleWithout;

public class RealImageW implements ImageW {
    private final String filename;

    public RealImageW(String filename) {
        this.filename = filename;
        loadImageFromDisk(); //Expensive Operation
    }

    private void loadImageFromDisk() {
        System.out.println("Loading image from disk " + filename);
    }

    @Override
    public void display() {
        System.out.println("Displaying: " + filename);
    }
}
