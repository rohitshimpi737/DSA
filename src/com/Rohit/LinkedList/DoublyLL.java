package com.Rohit.LinkedList;

public class DoublyLL {
   public static class Node {
        int val;
        Node next;
        Node prev;

       public Node(int val) {
           this.val = val;
       }
   }
   public static Node insertionHead( Node head,int val){
       Node node =new Node(val);
       if(head==null){
           head=node;
       }
       else {
           node.next = head;
           head.prev = node;
           head = node;
       }
       return head;
   }

    public static void insertionTail( Node head,int val){
        Node node =new Node(val);
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        node.prev=temp;
        temp.next=node;
    }
    public  static Node insertAtIndx(Node head , int index, int val){
       Node node =new Node(val);
       Node temp=head;
       if(head==null){
           head=node;
           return head;
       }
       if(index==0){
           return insertionHead(head,val);
       }
        for (int i = 0; i <index-1; i++) {
            temp=temp.next;
        }
        node.next=temp.next;
        node.prev=temp;
        temp.next.prev=node;
        temp.next=node;
        return head;
    }

    public static void  display(Node node){
        Node temp=node;
        while( temp.prev!=null){
            temp=temp.prev;
        }
        displayH(temp);
    }
   public static void  displayH(Node head){
       Node temp=head;
       while( temp!=null){
           System.out.print(temp.val+" ");
           temp=temp.next;
       }
   }
    public static void  displayT(Node tail){
        Node temp=tail;
        while( temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.prev;
        }
    }

    public static void main(String[] args) {
        // 4 10 2 99 13
        Node a= new Node(4);
        Node b= new Node(10);
        Node c= new Node(2);
        Node d= new Node(99);
        Node e= new Node(13);
        a.prev=null;
        a.next=b;
        b.prev=a;
        b.next=c;
        c.prev=b;
        c.next=d;
        d.prev=c;
        d.next=e;
        e.prev=d;
        e.next=null;
//        displayH(a);
//        displayT(e);
        display(c);
//        Node  x=insertionHead(a,111);
//        a=x;
        System.out.println();
//        display(a);
//        insertionTail(a,55);
//        System.out.println();
//        display(a);
          a=insertAtIndx(null,2,111);
        display(a);

    }
}
