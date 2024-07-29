package com.Rohit.LinkedList;
public class SplitList {

    public  static class Node {
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
        }
    }

    public static void display(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data +" ");
            temp = temp.next;
        }
    }
    public static Node[] splitList(Node head){
        if (head==null) return new Node[]{null,null};
        Node temp=head;
        //  find and create even node
        Node even=new Node(-1);
        Node odd=new Node(-1);
        Node Etemp=even;
        Node Otemp=odd;

        while (temp!=null){
            if (temp.data%2==0){
                // even
                Etemp.next=temp;
                Etemp=Etemp.next;
                temp=temp.next;
                Etemp.next=null;
            }
            else {
                // odd
                Otemp.next=temp;
                Otemp=Otemp.next;
                temp=temp.next;
                Otemp.next=null;
            }
        }

        return new Node[]{even.next,odd.next};
    }
    public  static Node removeDuplicate(Node head){
        Node temp=head;
        while (temp!=null && temp.next!=null){
            if (temp.data==temp.next.data)  temp.next=temp.next.next;
            if(temp.next==null) return head;
            if (temp.data!=temp.next.data)  temp=temp.next;
        }
        return  head;
    }

    public static void main(String[] args) {
        int []arr={1,1,1,2,2,3,3,3,4,4,4,6,7};
        Node head=new Node(arr[0]);
        Node temp=head;
        for (int num:arr) {
            temp.next= new Node(num);
            temp=temp.next;
        }
        head=head.next;
//        display(head);

//        Node[] ans=splitList(head);
//        display(ans[0]);
//        System.out.println();
//        display(ans[1]);
//        Node newHead =removeDuplicate(head);
         Node newHead= removeDuplicate(head);
        display(newHead);

    }
}
