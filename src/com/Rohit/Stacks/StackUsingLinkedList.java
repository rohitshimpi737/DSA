package com.Rohit.Stacks;

public class StackUsingLinkedList {
    private static class Node{
       private int val;
       private Node next;
       private Node(int val){
            this.val=val;
        }
    }

    public static class LLStack {
        private Node head=null;
        private int size=0;
       public void push(int x){
           Node temp=new Node(x);
           temp.next=head;
           head=temp;
           size++;
       }
       public  int pop(){
           if(head==null) {
               System.out.println("Stack is Empty");
               return -1;
           }
           int top=head.val;
            head=head.next;
            size--;
            return top;
       }
       public int peek(){
           if(head==null) {
               System.out.println("Stack is Empty");
               return -1;
           }
               int top=head.val;
               return top;
           }
           public void displayRev(){
           Node temp=head;
           while(temp!=null){
               System.out.print(temp.val+" ");
               temp=temp.next;
           }
               System.out.println();
           }

         private void displayREC(Node h){
                if(h==null) return;
                displayREC(h.next);
             System.out.print(h.val+" ");
         }
           public void display(){
                displayREC(head);
           }
           public int size(){
           return this.size;
           }
           public boolean isEmpty(){
           if(head==null) return true;
           else return false;
           }
       }

    public static void main(String[] args) {
        LLStack st=new LLStack();
        st.push(9);
        st.push(2);
        st.push(55);
        st.push(12);
        st.displayRev();
//        st.pop();
//        st.displayRev();
//        System.out.println(st.peek());
//        System.out.println(st.size());
//        System.out.println(st.isEmpty());
        st.display();
    }
}
