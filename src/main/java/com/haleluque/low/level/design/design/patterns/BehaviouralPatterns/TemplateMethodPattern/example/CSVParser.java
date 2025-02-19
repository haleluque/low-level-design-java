package com.haleluque.low.level.design.design.patterns.BehaviouralPatterns.TemplateMethodPattern.example;

public class CSVParser extends DataParser {
    @Override
    protected void parseData() {
        System.out.println("Parsing a CSV File"); //Add the custom implementation
    }
}
