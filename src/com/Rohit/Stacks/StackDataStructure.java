package com.Rohit.Stacks;

public  class StackDataStructure {
    public static class Stack {
        private int[] arr = new int[100];
        private int idx;
        public Stack() {
            this.idx = 0;
        }
        public void push (int x){
            if(this.isFull()){
                System.out.println("Stack is Full");
                return;
            }
            this.arr[idx]=x;
            idx++;
        }
        public int peek (){
            if(idx==0){
                System.out.println("Stack is Empty");
                return -1;
            }
            return arr[idx-1];
        }
        public int pop(){
            if(idx==0){
                System.out.println("Stack is Empty");
                return -1;
            }
            int top=arr[idx-1];
            arr[idx-1]=0;
            idx--;
            return top;
        }
        public void display(){
            System.out.print("[");
            for (int i = 0; i <= idx-1; i++) {
                System.out.print(arr[i]);
                if(i<idx-1){
                    System.out.print(", ");
                }
            }
            System.out.println("]");
        }
        public int size () {
            return idx;
        }
        public boolean isEmpty () {
            if(idx==0){
                return true;
            }
            return false;
        }
        public boolean isFull () {
            if(idx== arr.length) return true;
            else return false;
        }
        public int capacity(){
            return arr.length;
        }
    }
    public static void main (String[]args){
     Stack st=new Stack();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.display();
        System.out.println(st.size());
        System.out.println(st.isEmpty());
//        st.pop();
//        st.display();
//        System.out.println(st.size());
//        System.out.println(st.isEmpty());
//        st.pop();
//        st.display();
//        System.out.println(st.size());
//        System.out.println(st.isEmpty());
//        st.pop();
//        st.display();
//        System.out.println(st.size());
//        System.out.println(st.isEmpty());
//        st.pop();
//        st.display();
//        System.out.println(st.size());
//        System.out.println(st.isEmpty());
//        System.out.println(st.isFull());
        st.push(6);
        st.push(22);
        st.push(33);
        st.display();
    }

}
