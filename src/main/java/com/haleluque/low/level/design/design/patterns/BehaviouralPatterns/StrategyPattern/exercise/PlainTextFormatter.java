package com.haleluque.low.level.design.design.patterns.BehaviouralPatterns.StrategyPattern.exercise;

public class PlainTextFormatter implements TextFormatter {
    @Override
    public String format(String text) {
        return text;
    }
}
