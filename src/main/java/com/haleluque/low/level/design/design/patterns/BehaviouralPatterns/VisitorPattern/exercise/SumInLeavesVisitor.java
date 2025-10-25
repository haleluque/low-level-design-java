package com.haleluque.low.level.design.design.patterns.BehaviouralPatterns.VisitorPattern.exercise;

//Concrete Visitors
public class SumInLeavesVisitor extends TreeVis {
    private int sumOfLeavesValues = 0;
    public int getResult() {
        return sumOfLeavesValues;
    }

    public void visitNode(TreeNode node) {
    }

    public void visitLeaf(TreeLeaf leaf) {
        sumOfLeavesValues += leaf.getValue();
    }
}

