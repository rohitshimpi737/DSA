package com.Rohit.LinkedList;

public class DLLQuestions {

    public static void  displayH(Node head){
        Node temp=head;
        while( temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
    }
    public static int length(Node head,Node target){
         Node temp=head;
         int length=0;
         while(temp!=null){
             length++;
             temp=temp.next;
         }
        return length;
    }
    public static int criticalPoint(Node head){
        int max=0;
        Node temp =head.next;
        Node c1=temp;
        Node c2=temp;
        int min=Integer.MAX_VALUE;
        while(temp.next!=null){
            int len=0;
            if(temp.val> temp.prev.val && temp.val>temp.next.val){
                c1=temp;
            }
            if(temp.val< temp.prev.val && temp.val<temp.next.val){
               c2=temp;
            }
            temp=temp.next;
            int length1=length(head,c1);
            int length2=length(head,c2);
            len=(length1>length2) ? (length1-length2) :(length2-length1);
            min=(min>len)? len:min;
            c1=c2;
        }
        return min;
    }
    public static class Node {
        int val;
        Node next;
        Node prev;

        public Node(int val) {
            this.val = val;
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
        displayH(a);
        System.out.println(criticalPoint(a));

}
}
