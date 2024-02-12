package com.Rohit.Queue;

import java.util.Arrays;
import java.util.Queue;

public class CQueue {
    int r=-1;
    int f=-1;
    int []data=new int [4];
    int size=0;

    public void  add(int val){
        if(size==0){
            f=r=0;
            data[r]=val;
        }
        else if(size== data.length) {
            System.out.println("Queue is Full");
            return;
        }
        else if(r== data.length-1){
            r=0;
            data[r]=val;
        }
        else {
            data[++r]=val;
        }
        size++;
    }
    public int remove(){
        if(size==0){
            System.out.println("Queue is Empty");
            return -1;
        }
        else if(f== data.length-1){
            int x=data[f];
            f=0;
            size--;
            return x;
        }
        else {
            int x=data[f];
            f++;
            size--;
            return x;
        }
    }
    public int peek(){
        if(size==0){
            System.out.println("Queue is Empty");
            return -1;
        }
        return data[f];
    }

    public void display(){
        if (f<=r) {
            for (int i = f; i <= r; i++) {
                System.out.print(data[i] + " ");
            }
        }
        if (r<f){
            for (int i = f; i < data.length; i++) {
                System.out.print(data[i] + " ");
            }
            for (int i = 0; i <=r; i++) {
                System.out.print(data[i] + " ");
            }
        }
    }
    public static void main(String[] args) {

            CQueue q= new CQueue();
            q.add(1);
            q.add(2);
            q.remove();
            q.add(3);
            q.add(4);
            q.remove();
            q.remove();
            q.add(5);
            q.add(6);
            q.add(7);
        System.out.println(Arrays.toString(q.data));
            q.display();
            q.remove();
        System.out.println();
            q.display();
        System.out.println("\n"+q.peek());
    }
}
