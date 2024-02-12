package com.Rohit.LinkedList;

public class CircularBasics {
    public static class Node {
        int val;
        Node next;
        public Node(int val) {
            this.val = val;
        }
    }
    public static void  displayH(Node head){
        Node temp=head.next;
        System.out.print(head.val+" ");
        while( temp!=head){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
    }
    public  static Node deleteFirst(Node head){
        Node temp=head.next;
        while( temp.next!=head){
            temp=temp.next;
        }
        temp.next=temp.next.next;
        head=temp.next;
        return head;
    }

    public static void main(String[] args) {
        Node a= new Node(4);
        Node b= new Node(10);
        Node c= new Node(2);
        Node d= new Node(99);
        Node e= new Node(13);

        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=a;
        displayH(a);
        a=deleteFirst(a);
        System.out.println();
        displayH(a);
    }
}
