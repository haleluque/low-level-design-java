package com.haleluque.low.level.design.design.patterns.BehaviouralPatterns.TemplateMethodPattern.example;


public class JSONParser extends DataParser {
    @Override
    protected void parseData() {
        System.out.println("Parsing a JSON File");
    }
}
