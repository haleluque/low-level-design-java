package com.haleluque.low.level.design.design.patterns.BehaviouralPatterns.TemplateMethodPattern.exampleWithout;

public class MainWithout {
    public static void main(String[] args) {
        CSVParserWithout csvParserWithout = new CSVParserWithout();
        csvParserWithout.parse();
        JSONParserWithout jsonParser = new JSONParserWithout();
        jsonParser.parse();
    }
}
