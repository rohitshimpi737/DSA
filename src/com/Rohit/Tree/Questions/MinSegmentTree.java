package com.Rohit.Tree.Questions;

public class MinSegmentTree {
    class Node {
        int min = Integer.MAX_VALUE;
        Node left;
        Node right;
        int startIndex;
        int endIndex;

        public Node(int startIndex, int endIndex) {
            this.startIndex = startIndex;
            this.endIndex = endIndex;
        }
    }

    private Node root;

    public MinSegmentTree(int[] arr) {
        this.root = conStructTree(arr, 0, arr.length - 1);
    }

    private Node conStructTree(int[] arr, int s, int e) {
        if (s >e) {
            return null;
        }
        if (s == e) {
            Node node = new Node(s, e);
            node.min = arr[s];
            return node;
        }
        else {
            Node node = new Node(s, e);
            int mid = s + (e - s) / 2;
            node.left = conStructTree(arr, s, mid);
            node.right = conStructTree(arr, mid + 1, e);
            node.min = Math.min(node.left.min, node.right.min);
            return node;
        }
    }

    public int query(int qsi, int qei) {
        if (qsi > qei) {
            return Integer.MAX_VALUE; // Invalid query range
        }
        return this.query(this.root,qsi,qei);
    }
    private int query(Node node,int qsi,int qei){

        if(node.startIndex>=qsi && node.endIndex<=qei){
            return node.min;
        }
         if( node == null|| node.startIndex>qei || node.endIndex<qsi){
            return Integer.MAX_VALUE;
        }
            return Math.min(this.query(node.left,qsi,qei),this.query(node.right,qsi,qei));
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 7, 9, 11};
        MinSegmentTree segmentTree = new MinSegmentTree(arr);
        System.out.println(segmentTree.query(0, 3));
    }
}