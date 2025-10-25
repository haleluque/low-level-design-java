package com.haleluque.low.level.design.design.patterns.BehaviouralPatterns.VisitorPattern.exercise;

//Concrete Element
public class TreeLeaf extends Tree {

    public TreeLeaf(int value, Color color, int depth) {
        super(value, color, depth);
    }

    public void accept(TreeVis visitor) {
        visitor.visitLeaf(this);
    }
}
