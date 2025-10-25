package com.haleluque.low.level.design.design.patterns.BehaviouralPatterns.VisitorPattern.exercise;

//Concrete Visitors
public class FancyVisitor extends TreeVis {
    private int sumOfValuesNonLeafNodesAtEvenDepth = 0;
    private int sumOfValuesInGreenLeafsNodes= 0;

    public int getResult() {
        return Math.abs(sumOfValuesNonLeafNodesAtEvenDepth - sumOfValuesInGreenLeafsNodes);
    }

    public void visitNode(TreeNode node) {
        if(node.getDepth() % 2 == 0) {
            sumOfValuesNonLeafNodesAtEvenDepth += node.getValue();
        }
    }

    public void visitLeaf(TreeLeaf leaf) {
        if(leaf.getColor().equals(Color.GREEN)) {
            sumOfValuesInGreenLeafsNodes += leaf.getValue();
        }
    }
}
