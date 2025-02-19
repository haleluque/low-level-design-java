package com.haleluque.low.level.design.design.patterns.BehaviouralPatterns.TemplateMethodPattern.example;

abstract class DataParser {
    //Template method
    public final void parse() {
        openFile();
        parseData();
        closeFile();
    }

    /**
     * this is called a "hook": is a method in the base class with a default or empty implementation
     * that subclasses can override to extend or modify behaviour.
     **/
    protected abstract void parseData(); //accessed only by child class

    private void openFile() {
        System.out.println("Opening File");
    }

    private void closeFile() {
        System.out.println("Closing File");
    }
}
