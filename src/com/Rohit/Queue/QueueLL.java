package com.Rohit.Queue;

public class QueueLL {
    Node head;
    Node tail ;
    int size;
    QueueLL(){
        head=null;
        tail=null;
        size=0;
    }

public class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
        next = null;
    }

    Node(int val, Node head) {
        this.val = val;
        this.next = head;
    }

}

    public void  add(int val) {
      Node newNode =new Node(val);
      if(head==null){
          head=newNode;
          tail=head;
      }
      else {
          tail.next=newNode;
          tail=tail.next;
      }
      size++;
    }
    public int peek(){
        if(size==0){
            System.out.println("Queue is full");
            return -1;
        }
        int x= head.val;
        return x;
    }
    public int remove(){
        if(size==0){
            System.out.println("Queue is empty");
            return  -1;
        }
        int x= head.val;
        head=head.next;
        return x;
    }
    public void dispaly(){
        if (size==0)
        {
            System.out.println("Queue is Empty");
            return;
        }
        Node temp= head;
        while (temp!=null){
            System.out.println(temp.val);
            temp=temp.next;
        }
    }

    public static void main(String[] args) {
   QueueLL q=new QueueLL();
      q.add(2);
      q.add(3);
      q.add(4);
      q.dispaly();
        System.out.println();
      q.remove();
        System.out.println(q.peek());
        q.dispaly();
    }
}
