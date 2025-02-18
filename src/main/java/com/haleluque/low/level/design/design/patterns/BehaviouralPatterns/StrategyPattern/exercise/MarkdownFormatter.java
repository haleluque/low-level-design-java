package com.haleluque.low.level.design.design.patterns.BehaviouralPatterns.StrategyPattern.exercise;

public class MarkdownFormatter implements TextFormatter {
    @Override
    public String format(String text) {
        return "**"+text+"**";
    }
}
