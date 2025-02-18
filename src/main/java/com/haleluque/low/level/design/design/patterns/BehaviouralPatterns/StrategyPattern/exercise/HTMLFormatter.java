package com.haleluque.low.level.design.design.patterns.BehaviouralPatterns.StrategyPattern.exercise;

public class HTMLFormatter implements TextFormatter {
    @Override
    public String format(String text) {
        return "<html><body>"+text+"</body></html>";
    }
}