package com.Rohit.Tree.Questions;

import java.util.Scanner;

class BinaryTree {
    public BinaryTree() {
    }

    private static class Node {
        int value;
        Node left;
        Node right;

        public Node(int val) {
            this.value = val;
            this.left = null;
            this.right = null;
        }
    }
    Node root;
    public void populate(){
        root = new Node(5);
        root.left = new Node(1);
        root.right = new Node(2);
        root.left.left = new Node(3);
        root.right.left = new Node(6);
        root.right.right = new Node(4);
        // Adding more nodes for a complex test case
        root.left.left.left = new Node(7);
        root.left.left.right = new Node(8);
    }
    public String ans(){
         return  getDirections(root,7,4);
    }
    public String getDirections(Node node, int startValue, int destValue) {
        Node lowestCommonAncestor = findLowestCommonAncestor(
                node,
                startValue,
                destValue);

        StringBuilder pathToStart = new StringBuilder();
        StringBuilder pathToDest = new StringBuilder();

        findPath(lowestCommonAncestor, startValue, pathToStart);
        findPath(lowestCommonAncestor, destValue, pathToDest);

        StringBuilder directions = new StringBuilder();
        directions.append("U".repeat(pathToStart.length()));
        directions.append(pathToDest);
        return directions.toString();
    }

    private boolean findPath(
            Node node,
            int targetValue,
            StringBuilder path) {
        if (node == null)
            return false;

        if (node.value == targetValue)
            return true;

        // Try left subtree
        path.append("L");
        if (findPath(node.left, targetValue, path)) {
            return true;
        }
        path.setLength(path.length() - 1); // Remove last character

        // Try right subtree
        path.append("R");
        if (findPath(node.right, targetValue, path)) {
            return true;
        }
        path.setLength(path.length() - 1); // Remove last character

        return false;
    }

    public Node findLowestCommonAncestor(Node node, int value1, int value2) {
        if (node == null)
            return null;
        if (node.value == value1 || node.value == value2) {
            return node;
        }
        Node left = findLowestCommonAncestor(node.left, value1, value2);
        Node right = findLowestCommonAncestor(node.right, value1, value2);

        if(left == null) return right;
        else if (right == null) return left;
        else return node;
    }
}

public class DirFromBTNodetoAnother {
    public static void main(String[] args) {
        BinaryTree tree= new BinaryTree();
        tree.populate();
        System.out.println(tree.ans());
    }
}
