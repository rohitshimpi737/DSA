package com.Rohit.Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BST {

    private static class Node {
        private int value;
        private Node left;
        private Node right;
        private int height;

        public Node(int val) {
            this.value = val;}

        public int getValue() {
            return value;
        }
    }

    public BST() {
    }

    public int height(){
        return height(root);
    }
    private int height(Node node){
        if (node==null){
            return -1;
        }
        return node.height;
    }


    private Node root;

    public Node getRoot() {
        return root;
    }

    public int heigth(Node node){
        if (node == null) {
            return -1;
        }
        return node.height;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public void insert(int val) {
        root = insert(val, root);
    }

    private Node insert(int value, Node node){
        if (node == null) {
            node = new Node(value);
            return node;
        }
        if (value < node.value) {
            node.left = insert(value, node.left);
        }
        if (value > node.value) {
            node.right = insert(value, node.right);
        }
        node.height = Math.max(heigth(node.left), heigth(node.right)) + 1;
        return node;
    }

    public void populate(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            insert(nums[i]);
        }
    }


    public void populatedSorted(int[] nums) {
        populatedSorted(nums, 0, nums.length);
    }

    private void populatedSorted(int[] nums, int start, int end) {
        if (start >= end) {
            return;
        }

        int mid = (start + end) / 2;

        this.insert(nums[mid]);
        populatedSorted(nums, start, mid);// for left part
        populatedSorted(nums, mid + 1, end);// for right part
    }

    public boolean balanced() {
        return balanced(root);
    }

    private boolean balanced(Node node) {
        if (node == null) {
            return true;
        }
        return Math.abs(heigth(node.left) - heigth(node.right)) <= 1 && balanced(node.left) && balanced(node.right);
    }

    public void display() {
        display(this.root, "Root Node: ");
    }

    private void display(Node node, String details) {
        if (node == null) {
            return;
        }
        System.out.println(details + node.value);
        display(node.left, "Left child of " + node.value + " : ");
        display(node.right, "Right child of " + node.value + " : ");
    }

    public void levelOrder() {
       // System.out.println(root.value);
        List<List<Integer>> result = new ArrayList<>();
        Node node = root;
        if (root == null) return;
        Queue<Node> queue = new LinkedList<>();
        queue.offer(node);

        while ((!queue.isEmpty())) {
            int levelSize = queue.size();
            List<Integer> currentLevel = new ArrayList<>(levelSize);

            for (int i = 0; i < levelSize; i++) {
                Node curentNode = queue.poll();
                currentLevel.add(curentNode.value);
                if (curentNode.left != null) {
                    queue.offer(curentNode.left);
                }
                if (curentNode.right != null) {
                    queue.offer(curentNode.right);
                }
            }
            result.add(currentLevel);
        }
        for (var list : result) {
            for (var ans:list) {
                System.out.print(ans +" ");
            }
            }
        }
    }
