package com.Rohit.LinkedList;

public class DoublyLinkedDataStructure {
    private Node head;
    private Node tail;
    private int  size;
    DoublyLinkedDataStructure(){ this.size=0;}
    public void displayByH(){
        Node temp=head;
        while( temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
    }
    public void displayByT(){
        Node temp=tail;
        while( temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.prev;
        }
    }
    public void insertHead(int val){
        Node node =new Node(val);
        node.next = head;
        if(head==null){
            head=node;
            tail=head;
        }
        else {
            head.prev = node;
            head=node;
        }
        size++;
    }
    public void insertTail(int val){
        Node node =new Node(val);
        if(tail==null){
           insertHead(val);
           return;
        }
        else {
            tail.next=node;
            node.prev = tail;
            tail=node;
        }
        size++;
    }
    public  void insertAtIndx(int index, int val){
        Node node =new Node(val);
        Node temp=head;
        if(index==0){
             insertHead(val);
             return;
        }
        else if(index==size){
            insertTail(val);
            return;
        }
        else if((index>size) ||( index <0)) {
            System.out.println("Invalid index");
            return;
        }
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            Node r = temp.next;
            temp.next = node;
            node.prev = temp;
            node.next = r;
            r.prev = node;
            size++;
    }
    public int  deleteFirst(){
        int val =head.val;
        head=head.next;
        head.prev=null;
        if (head == null) {
            tail=null;
        }
        size--;
        return val ;
    }
    public int  deleteLast(){
        if(size<=1){
            return deleteFirst();
        }
        Node secondLast=get(size-2);
        int val =tail.val;
        tail = secondLast;
        secondLast.next = null;
        size--;
        return val;
    }
    public int size(){
        return size;
    }
    public int deleteIndex(int index){
        if(index==0){
          return deleteFirst();
        }
        else if (index==size-1) {
            return deleteLast();
        }
        else if((index>size) ||( index <0)) {
            System.out.println("Invalid index");
            return -1;
        }
        Node temp=get(index);

        Node r=temp.next.next;
        temp.next=r;
        r.prev=temp;

        int val=temp.val;
        return val;
    }
    public Node get(int index){
        Node temp=head;
        for (int i = 0; i <index-1; i++) {
            temp = temp.next;
        }
        return temp;
    }
    public int getElement(int index){
        Node temp=head;
        if((index>size) ||( index <0)) {
            System.out.println("Invalid index");
            return -1;
        }
        for (int i = 0; i <index; i++) {
            temp = temp.next;
        }
        return temp.val;
    }
    public Node find(int val){
        Node temp=head;
        while(temp!=null){
            if(temp.val==val){
                return temp;
            }
            temp=temp.next;
        }
        return null ;
    }
     private class Node{
         private int val;
         private Node next;
         private Node prev;
         public Node(int val) {
             this.val = val;
         }
         public Node(int val, Node next, Node prev) {
             this.val = val;
             this.next = next;
             this.prev = prev;
         }
     }
}
