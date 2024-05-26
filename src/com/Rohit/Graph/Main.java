package com.Rohit.Graph;

public class Main {
    public static void main(String args[]) {
        MaxGraph g = new MaxGraph(7);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 3);
        g.addEdge(2, 3);
        g.addEdge(3, 4);
        g.addEdge(4, 6);

        int sourceNode = 0;
        int maxDepth = g.maxDepth(sourceNode);
        System.out.println("Max depth from source node " + sourceNode + ": " + maxDepth);
    }
}