package com.haleluque.low.level.design.design.patterns.BehaviouralPatterns.VisitorPattern.exercise;

import java.util.*;

public class Main {

    /**
     * Sample input
     * 5
     * 4 7 2 5 12
     * 0 1 0 0 1
     * 1 2
     * 1 3
     * 3 4
     * 3 51
     * */
    public static void main(String[] args) {
        Tree root = solve();
        SumInLeavesVisitor vis1 = new SumInLeavesVisitor();
        ProductOfRedNodesVisitor vis2 = new ProductOfRedNodesVisitor();
        FancyVisitor vis3 = new FancyVisitor();

        root.accept(vis1);
        root.accept(vis2);
        root.accept(vis3);

        int res1 = vis1.getResult();
        int res2 = vis2.getResult();
        int res3 = vis3.getResult();

        System.out.println(res1);
        System.out.println(res2);
        System.out.println(res3);
    }

    public static Tree solve() {
        //read the tree from STDIN and return its root as a return value of this function
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        String valuesLine = scan.nextLine();
        String colorsLine = scan.nextLine();

        String[] valuesStr = valuesLine.split(" ");
        int[] values = new int[n];

        for (int i = 0; i < n; i++) {
            values[i] = Integer.parseInt(valuesStr[i]);
        }

        String[] colorsStr = colorsLine.split(" ");
        byte[] colors = new byte[n];

        for (int i = 0; i < n; i++) {
            colors[i] = (byte) Integer.parseInt(colorsStr[i]);
        }

        Map<Integer, List<Integer>> adj = new HashMap<>();
        boolean[] visited = new boolean[n];

        for (int i = 0; i < n; i++) {
            adj.put(i, new ArrayList<Integer>());
        }

        while (scan.hasNextInt()) {
            int u = scan.nextInt() - 1;
            int v = scan.nextInt() - 1;
            adj.get(u).add(v);
            adj.get(v).add(u);
        }

        scan.close();

        return buildTree(0, 0, values, colors, adj, visited);
    }

    public static Tree buildTree(
            int index, int depth, int[] values, byte[] colors, Map<Integer, List<Integer>> adj, boolean[] visited
    ) {
        boolean isLeaf = true;
        visited[index] = true;

        Color color = colors[index] == 0 ? Color.RED : Color.GREEN;
        List<Integer> children = adj.get(index);
        TreeNode treeNode = new TreeNode(values[index], color, depth);

        for (int child : children) {
            if (!visited[child]) {
                isLeaf = false;
                Tree childNode = buildTree(child, depth + 1, values, colors, adj, visited);
                treeNode.addChild(childNode);
            }
        }

        if (isLeaf) {
            return new TreeLeaf(values[index], color, depth);
        } else {
            return treeNode;
        }
    }
}
