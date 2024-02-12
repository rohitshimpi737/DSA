package com.Rohit.Tree;

public class SegmentTree {
    private static class Node {
         int val;
         Node left;
         Node right;
         int startInterval;
         int endInterval;
         public Node (int startInterval,int endtInterval){
             this.startInterval=startInterval;
             this.endInterval=endtInterval;
         }
    }
     Node root;
    public SegmentTree(int [] arr){
        this.root=conStructTree(arr,0,arr.length-1);
    }
// Create Segment Tree
    private Node conStructTree(int[] arr, int start, int end ) {
    // if leaf node then return and  add the value at that node of the that index
        if(start==end){
            Node leaf=new Node(start,end);
            leaf.val=arr[start];
            return leaf;
        }
        // create  initial node  insert start and end index Interval
        // find mid
        Node node =new Node(start,end);

        int mid=start+(end-start)/2;
        //  recursively construct current node left and right nodes
        node.left=conStructTree(arr,start,mid);
        node.right=conStructTree(arr,mid+1,end);
//  add value of that left + right  node in current node
        node.val=node.left.val+node.right.val;
        // return the  that current node
        return node;
    }

    public void display() {
        display(this.root);
    }
    private void display(Node node) {
        String str = "";

        if(node.left != null) {
            str = str + "Interval=[" + node.left.startInterval + "-" + node.left.endInterval + "] and data: " + node.left.val + " => ";
        } else {
            str = str + "No left child";
        }

        // for current node
        str = str + "Interval=[" + node.startInterval + "-" + node.endInterval + "] and data: " + node.val + " <= ";

        if(node.right != null) {
            str = str + "Interval=[" + node.right.startInterval + "-" + node.right.endInterval + "] and data: " + node.right.val;
        } else {
            str = str + "No right child";
        }

        System.out.println(str + '\n');

        // call recursion
        if(node.left != null) {
            display(node.left);
        }

        if(node.right != null) {
            display(node.right);
        }
    }

    public int  query( int qsi , int qei){
        return query(this.root,qsi,qei);
    }

    private int query(Node node, int qsi, int qei) {
        // node is completely lying inside query
        if(node.startInterval >= qsi && node.endInterval<= qei){
            return node.val;
        }
        else if(node.startInterval>qei || node.endInterval<qsi){
            // completely outside
            return 0;
        }
        else {
            return query(node.left,qsi,qei) +query(node.right,qsi,qei);
        }
    }
    public void update(int index ,int data ){
       this.root.val= update(this.root,index,data);
    }

    private int update(Node node, int index, int data) {
        if (index>=node.startInterval && index<= node.endInterval){
            if(index == node.startInterval && index == node.endInterval){
                node.val=data;
                return node.val;
            }
            else {
                int lefv=update(node.left,index,data);
                int rihv=update(node.right,index,data);
                node.val=lefv+rihv;
                return lefv+rihv;
            }
        }
        return node.val;
    }


}
