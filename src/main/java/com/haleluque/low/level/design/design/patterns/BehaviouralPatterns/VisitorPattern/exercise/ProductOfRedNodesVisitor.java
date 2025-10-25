package com.haleluque.low.level.design.design.patterns.BehaviouralPatterns.VisitorPattern.exercise;

//Concrete Visitors
public class ProductOfRedNodesVisitor extends TreeVis {
    private double product = 1;
    public int getResult() {
        return (int) product;
    }

    public void visitNode(TreeNode node) {
        increaseProduct(node);
    }

    public void visitLeaf(TreeLeaf leaf) {
        increaseProduct(leaf);
    }

    private void increaseProduct(Tree tree) {
        if (tree.getColor() == Color.RED) {
            product = (product * tree.getValue()) % (Math.pow(10, 9) + 7);
        }
    }
}

