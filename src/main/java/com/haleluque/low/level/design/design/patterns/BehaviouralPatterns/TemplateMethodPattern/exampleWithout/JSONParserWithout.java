package com.haleluque.low.level.design.design.patterns.BehaviouralPatterns.TemplateMethodPattern.exampleWithout;

public class JSONParserWithout {
    public void parse() {
        openFile();
        //CSV Specific Parsing Logic
        System.out.println("Parsing a JSON File");
        closeFile();
    }

    private void openFile() {
        System.out.println("Opening File");
    }

    private void closeFile() {
        System.out.println("Closing File");
    }

}
