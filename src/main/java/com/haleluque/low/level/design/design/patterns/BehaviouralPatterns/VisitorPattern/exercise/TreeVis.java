package com.haleluque.low.level.design.design.patterns.BehaviouralPatterns.VisitorPattern.exercise;

//Visitor Interface/Base Class
public abstract class TreeVis {
    public abstract int getResult();
    public abstract void visitNode(TreeNode node);
    public abstract void visitLeaf(TreeLeaf leaf);
}

