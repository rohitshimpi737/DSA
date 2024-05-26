package com.Rohit.Tree;

import java.util.Scanner;

public class BinaryTree {
    public BinaryTree(){}


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
        public void populate(Scanner scanner){
            System.out.println("Enter the Root Node Value");
           int val= scanner.nextInt();
            root= new Node(val);
            populate(scanner,root);
        }

        private void populate(Scanner scanner, Node node) {
            System.out.println("Do you want Enter left Node for "+ node.value);
            boolean left =scanner.nextBoolean();
            if(left){
                System.out.println("Enter the value for left Node ");
                int val= scanner.nextInt();
                node.left=new Node(val);
                populate(scanner,node.left);
            }

            System.out.println("Do you want Enter right Node for "+ node.value);
            boolean right =scanner.nextBoolean();
            if(right){
                System.out.println("Enter the value for right Node ");
                int val= scanner.nextInt();
                node.right=new Node(val);
                populate(scanner,node.right);
            }
        }
        public void display() {
            display(this.root, "");
        }

        private void display(Node node, String indent) {
            if (node == null) {
                return;
            }
            System.out.println(indent + node.value);
            display(node.left, indent + "\t");
            display(node.right, indent + "\t");
        }
    public void prettyDisplay() {
        prettyDisplay(root, 0);
    }

    private void prettyDisplay(Node node, int level) {
        if (node == null) {
            return;
        }

        prettyDisplay(node.right, level + 1);

        if (level != 0) {
            for (int i = 0; i < level - 1; i++) {
                System.out.print("|\t\t");
            }
            System.out.println("|------->" + node.value);
        } else {
            System.out.println(node.value);
        }
        prettyDisplay(node.left, level + 1);
    }
    public void preOrder() {
        preOrder(root);
    }

    private void preOrder(Node node) {
        if (node == null) {
            return;
        }
        System.out.print(node.value + " ");
        preOrder(node.left);
        preOrder(node.right);
    }

    public void inOrder() {
        preOrder(root);
    }

    private void inOrder(Node node) {
        if (node == null) {
            return;
        }
        inOrder(node.left);
        System.out.print(node.value + " ");
        inOrder(node.right);
    }

    public void postOrder() {
        preOrder(root);
    }

    private void postOrder(Node node) {
        if (node == null) {
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.value + " ");
    }
}
