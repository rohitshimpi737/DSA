package com.Rohit.LinkedList;
public class LinkedList {
     Node head;
    private Node tail=null;
     int size;
    public LinkedList() {
        this.size = 0;
    }
    public void insertFirst(int val){
        Node node= new Node(val);
        node.next=head;
        head=node;
        if(tail== null){
            tail=head;
        }
        size++;
    }
    public void insertEnd(int val){
        if(head== null) {
            insertFirst(val);
            return ;
        }
        else {
            Node node= new Node(val);
            tail.next = node;
            tail = node;
        }
        size++;
    }
    // HERE IN INSERT AT ANY INDEX TWO CONDITION MAKE PROBLEM
//     1ST INSERT AT 0 INDEX --> SO FOR THIS WE WILL CHECK IF INDEX == 0
//     THEN WE DIRECTLY CALL INSERT FIRST(VALUE) FUNCTION

//     2ND INSERT AT SIZE OR LAST+1  INDEX --> SO FOR THIS WE WILL CHECK IF INDEX == SIZE
//     THEN WE DIRECTLY CALL INSERT END(VALUE) FUNCTION

    public void insertAt(int val,int index){
        Node node= new Node(val);
        Node temp=head;
          if(index==size){
            insertEnd(val);
            return;
        }

        else  if(index==0){
            insertFirst(val);
            return;
        }
        else if((index>size) ||( index <0)) {
              System.out.println("Invalid index");
              return;
          }

        for (int i = 0; i <index-1; i++) {
            temp = temp.next;
        }
            node.next = temp.next;
            temp.next = node;
        size++;
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
       return temp.value;
    }
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.value+" ->");
            temp=temp.next;
        }
        System.out.println("END");
    }
    public int  deleteFirst(){
        int val =head.value;
        head=head.next;
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
        int val =tail.value;
        tail = secondLast;
        secondLast.next = null;
        size--;
        return val;
    }
    public Node get(int index){
        Node temp=head;
        for (int i = 0; i <index-1; i++) {
            temp = temp.next;
        }
        return temp;
    }
    public void delete(int index){
        if(index==0) {
            head = head.next;
            size--;
            return;
        }
    else {
            Node temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
            tail = temp;
            size--;
        }
    }
    public int size(){
        return size;
    }
    public Node find(int val){
        Node temp=head;
        while(temp!=null){
            if(temp.value==val){
                return temp;
            }
            temp=temp.next;
        }
        return null ;
    }
    class Node {
        private int value ;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}
