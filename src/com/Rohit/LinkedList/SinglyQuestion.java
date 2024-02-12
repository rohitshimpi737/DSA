package com.Rohit.LinkedList;
public class SinglyQuestion {
    public  static class Node {
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
        }
    }
    public static Node nthNodeLastOneTraverse(Node head,int n) {
        Node slow=head;
        Node fast=head;
        for (int i = 1; i <=n-1 ; i++) {
            fast=fast.next;
        }
        while(fast.next!=null){
            slow=slow.next;
            fast=fast.next;
        }
        return slow;
    }

    public static Node nthNodeLast(Node head,int n) {
        int size=0;
        Node temp=head;
        while(temp!=null) {
            size++;
            temp = temp.next;
        }
        temp=head;
        int last=size-n+1;
        for (int i = 1; i < last; i++) {
            temp=temp.next;
        }
        return temp;
    }
    public static void display(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data +" ");
            temp = temp.next;
        }
    }
    public static Node RemoventhNodeLast(Node head,int n) {
        int size=0;
        Node temp=head;
        while(temp!=null) {
            size++;
            temp = temp.next;
        }
        if(n==size){
            head=head.next;
            return head;
        }
        temp=head;
        int last=size-n+1;
        for (int i = 1; i < last-1; i++) {
            temp=temp.next;
        }
        temp.next=temp.next.next;
        return head;
    }
    public static Node RemoventhNodeLastOneTraverse(Node head,int n) {
        Node slow=head;
        Node fast=head;
        for (int i = 1; i <=n-1 ; i++) {
            fast=fast.next;
        }
        if(fast==null){
            head=head.next;
            return head;
        }
        while(fast.next!=null){
            slow=slow.next;
            fast=fast.next;
        }
        return slow;
    }

    public static void main(String[] args) {
      Node a= new Node(5);
       Node b= new Node(6);
        Node c= new Node(9);
        Node d= new Node(8);
        Node e= new Node(19);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
//        Node ans1=nthNodeLast(a,5);
//        Node ans= nthNodeLastOneTraverse(a,5);
//        System.out.println(ans.data);
//        display(a);
//
//        a = RemoventhNodeLast(a, 5);
//        System.out.println();

        display(a);
        a= nthNodeLastOneTraverse(a,4);
        System.out.println();

        display(a);

    }
}

