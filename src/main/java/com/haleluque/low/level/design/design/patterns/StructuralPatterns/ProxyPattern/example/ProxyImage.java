package com.haleluque.low.level.design.design.patterns.StructuralPatterns.ProxyPattern.example;

/**
 * Proxy
 */
public class ProxyImage implements Image {
    private final String fileName;

    private RealImage realImage; //Proxy reference to real subject class

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if (realImage==null)
            realImage = new RealImage(fileName); //Image is loaded and cached
        realImage.display();
    }
}
