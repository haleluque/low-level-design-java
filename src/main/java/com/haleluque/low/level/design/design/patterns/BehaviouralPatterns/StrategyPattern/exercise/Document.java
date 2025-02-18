package com.haleluque.low.level.design.design.patterns.BehaviouralPatterns.StrategyPattern.exercise;

public class Document {

    private String content;
    private TextFormatter formatter;

    public void setContent(String content) {
        this.content = content;
    }

    public void setFormatter(TextFormatter formatter) {
        this.formatter = formatter;
    }

    public void display() {
        System.out.println(formatter.format(content));
    }
}