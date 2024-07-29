package com.Rohit.LinkedLIst1;

public class Basic {
    public  static  class  Node {
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
        Node(int data,Node node){
            this.data=data;
            this.next=node;
        }
    }
    public  static  void  display(Node head){
        Node temp=head;
        while (temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    public static void main(String[] args) {
        Node a= new Node(5);
        Node b= new Node(6);
        Node c= new Node(7);
        Node d= new Node(8);
        Node e= new Node(9);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        display(a);
    }
}
