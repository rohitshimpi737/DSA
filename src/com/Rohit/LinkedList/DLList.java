package com.Rohit.LinkedList;

public class DLList {
    Node head;
    Node tail;
    public DLList() {

    }

    public static class Node {
        int data;
        Node next;
        Node prev;
        public Node(int data) {
            this.data = data;
            this.next=null;
            this.prev=null;
        }
    }
    public void insertStart(int data){
        Node node = new Node(data);
        if (head==null){
            head=node;
            tail=node;
            return;
        }
        node.next=head;
        head.prev=node;
        head=node;
    }
    public void insertEnd(int data){
        Node node = new Node(data);
        if (head==null){
            head=node;
            tail=head;
            return;
        }
        Node temp=head;
        while (temp.next!=null){
            temp=temp.next;
        }
        temp.next=node;
        node.prev=temp;
        tail=node;
    }
    public  void insertIndex(int data,int index){
        if (index<0){
            System.out.println("Invalid Index");
            return;
        }
        if(index==0){
            insertStart(data);
        }
        if (index==7){
            insertEnd(data);
        }
        Node node = new Node(data);
        Node temp=head;
        for (int i = 1; i < index ; i++){
            temp=temp.next;
        }
        node.next=temp.next;
        node.next.prev=node;
        node.prev=temp;
        temp.next=node;
    }
    public void deletionHead(){
        if (head==null){
            System.out.println("Empty list");
            return;
        }
        head=head.next;
        head.prev=null;
    }
    public void deletionEnd(){
        if (head==null){
            System.out.println("Empty list");
            return;
        }
        Node temp=head;
        while (temp.next.next!=null){
            temp=temp.next;
        }
         temp.next=null;
         tail=temp;
    }
    public void deletionIndex(int index){
        if (index<0){
            System.out.println("Invalid Index");
            return;
        }
        if (index==0){
            deletionHead();
        }
        if (index==8){
            deletionEnd();
        }
        Node temp=head;
        for (int i = 1; i < index ; i++){
            temp=temp.next;
        }
        temp.next=temp.next.next;
        temp.next.prev=temp;
    }
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ->");
            temp=temp.next;
        }
        System.out.println("END");
    }
    public  void displayPrev(){
        Node temp=tail;
        while(temp!=null){
            temp=temp.prev;
        }
        display();
    }
    public  void displayRandom(){
        Node temp=head;
        while(temp.prev!=null){
            temp=temp.prev;
        }
        while(temp!=null){
            System.out.print(temp.data+" ->");
            temp=temp.next;
        }
    }

    public static void main(String[] args) {
        DLList list= new DLList();
        list.insertEnd(1);
        list.insertEnd(2);
        list.insertEnd(4);
        list.insertEnd(5);
        list.insertStart(0);
        list.insertIndex(3,3);
//        list.deletionHead();
//        list.deletionEnd();
        list.deletionIndex(3);
        list.display();
        list.displayPrev();
    }
}
