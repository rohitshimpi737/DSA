package com.Rohit.LinkedLIst1;

public class SIngleLinkedList {
    Node head;
    Node tail;
    int size;
    SIngleLinkedList(){
        this.head=null;
        this.tail=null;
        this.size=0;
    }
    // Insert
    public  void insertIndex(int index,int data){
        if (index<0 || index>size()){
            System.out.println("Invalid Index");
            return;
        }
        if (index==0) {
            insertStart(data);
            return;
        }
        if (index==size()){
            insertEndUsingHead(data);
            return;
        }

        Node temp=head;
        Node node = new Node(data);
        for (int i=0; i<index-1; i++){
            temp=temp.next;
        }
        node.next=temp.next;
        temp.next=node;
        size++;
    }
    public void insertStart(int data){
        Node node=new Node(data);
        if (tail==null){
            tail=node;
        }
        node.next=head;
        head=node;
        size++;
    }
    public void insertEndUsingTail(int data){
        Node node=new Node(data);
        size++;
        if (head==null){
            head=node;
            tail=head;
            return;
        }
        tail.next=node;
        tail=node;
    }
    public void insertEndUsingHead(int data){
        Node node=new Node(data);
        size++;
        if (head==null){
            head=node;
            tail=node;
            return;
        }
        Node temp=head;
        while (temp.next!=null){
            temp=temp.next;
        }
        temp.next=node;
        tail=node;
    }

    // Display
    public void display(){
        Node temp=head;
        while (temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    public void displayRec(){
        displayRec(head);
    }
    public void displayRec(Node node){
        if (node==null){
            return;
        }
        System.out.print(node.data+" ");
        displayRec(node.next);
    }
    public void displayReverse(){
        displayReverse(head);
    }
    public void displayReverse(Node node){
        if (node==null){
            return;
        }
        displayReverse(node.next);
        System.out.print(node.data+" ");
    }

    // Delete
    public void deleteStart(){
        if (head==null){
            System.out.println("List is Empty");
            return;
        }
        head=head.next;
        if (head==null){
            tail=null;
        }
        size--;
    }
    public void deleteEnd() {
        if (head == null) {
            System.out.println("List is Empty");
            return;
        }
        if (head.next==null){
            head=null;
            tail=null;
            return;
        }
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next=null;
        tail=temp;
    }
    public  void deleteIndex(int index){
        if (index<0 || index>=size()){
            System.out.println("Invalid Index");
            return;
        }
        if (index==0) {
            deleteStart();
            return;
        }
        if (index==size()-1){
            System.out.println("THIS");
            deleteEnd();
            return;
        }
        Node temp=head;
        for (int i=0; i<index-1; i++){
            temp=temp.next;
        }
        temp.next=temp.next.next;
    }

    public  int getAt(int index){
        if (index<0 || index>size()){
            System.out.println("Invalid Index");
            return -1;
        }
        if (index==0) {
            return head.data;
        }
        Node temp=head;
        for (int i=0; i<index; i++){
            temp=temp.next;
        }
       return temp.data;
    }

    public  int size(){
        Node temp=head;
        int size=0;
        while (temp!=null){
            temp=temp.next;
            size++;
        }
        return  size;
    }

    static  class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
        }
        Node(int data, Node next){
            this.data=data;
            this.next=next;
        }
    }

    public static void main(String[] args) {
        SIngleLinkedList list= new SIngleLinkedList();
        list.insertStart(4);
        list.insertStart(3);
        list.insertStart(2);
        list.insertStart(1);
        list.insertStart(0);

        list.display();
        System.out.println();

        for (int i = 0; i < list.size() ; i++) {
            System.out.print(list.getAt(i)+" ");
        }
        System.out.println("\n"+list.size());
        System.out.println("\n-----------------");
        System.out.print("Tail = "+list.tail.data);
        System.out.println("\n-----------------");
        System.out.println("Head = "+list.head.data);
    }
}
