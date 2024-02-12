package com.Rohit.LinkedList;

public class Basics {
    public static void insertAtEnd(Node head,int data) {
        Node node= new Node(data);
        Node temp=head;

        while(temp.next!=null){
            temp=temp.next;
        }
     temp.next=node;
    }
    public static void display(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data +" ");
            temp = temp.next;
        }
    }
        public static void displayRec(Node head){
            if (head==null){
                return;
            }
                System.out.println(head.data);
                displayRec(head.next);
            }
    public static void length(Node head) {
        Node temp = head;
        int size=0;
        while (temp != null) {
            size++;
            temp = temp.next;
        }
        System.out.println(size);
    }
    public static Node deepCopy(Node head) {
        Node h = new Node(-1);
        Node temp = head;
        Node temp2=h;
        while (temp!=null){
            Node a=new Node(temp.data);
            temp2.next=a;
            temp=temp.next;
            temp2=temp2.next;
        }
        h=h.next;
        return h;
    }
    public static  Node revRec(Node head){
        if(head==null ){
            return  null;
        }
        if (head.next==null){
            return head;
        }
        Node newHead=revRec(head.next);
        head.next.next=head;
        head.next=null;
        return  newHead;
    }
    public static Node IterativeRever(Node head){
        Node prev = null,agla=null;
        Node current=head;
        while (current!=null){
            agla=current.next;
            current.next=prev;
            prev=current;
            current=agla;
        }
        return prev;
    }

    public  static class Node {
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
        }


    }

    public static void main(String[] args) {
        Node a= new Node(5);
       System.out.println(a.next);
        Node b= new Node(6);
//        System.out.println(b);
        Node c= new Node(9);
        Node d= new Node(8);
        Node e= new Node(19);
        a.next=b;
        System.out.println(a.next);
        b.next=c;
        c.next=d;
        d.next=e;
//        display(a);
//        displayRec(a);
//        length(a);
//        insertAtEnd(a,6);
//        display(a);
//        System.out.println();
//        Node x=revRec(a);
//        display(x);

        display(a);
        System.out.println();
        Node x=IterativeRever(a);
        display(x);
//        System.out.println(x.next);
//        Node ans=deepCopy(a);
//        System.out.println();
//        display(ans);
//        System.out.println(a.data==ans.data);
//        System.out.println(a==ans);
    }

}
