package com.Rohit;

import java.util.LinkedList;
import java.util.Queue;

public class Temp {
    public  static class Queue{
        private final int[] arr;
        int front=-1;
        int rear=-1;
        int size;
        int totalSize;
        Queue(int totalSize){
            this.totalSize=totalSize;
            arr = new int[totalSize];
            this.size=0;
        }
        public void add(int data){
            if (rear==totalSize-1){
                System.out.println("Queue is Full");
                return;
            }
            if (rear==-1){
                front=rear=0;
                arr[rear]=data;
            }
           else{
                arr[++rear]=data;
            }
            size++;
        }
        public int remove(){
            if (size==0){
                System.out.println("Queue is Empty");
                return -1;
            }
            size--;
            return arr[front++];
        }
        public int peek(){
            if (size==0){
                System.out.println("Queue is Empty");
                return -1;
            }
            return arr[front];
        }
        public boolean isEmpty(){
            return size==0;
        }
        public void display(){
            for (int i = front; i <=rear ; i++) {
                System.out.print(arr[i] +" ");
            }
        }
    }
    public static void main(String[] args) {
        Queue queue= new Queue(5);
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        queue.remove();
        queue.add(0);

        queue.display();
    }
}
