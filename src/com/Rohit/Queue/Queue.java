package com.Rohit.Queue;

public class Queue {
    private final int[] data;
    int f=-1;
    int r=-1;
    int size;
    int totalSize;
    Queue(int totalSize){
        this.totalSize=totalSize;
        data = new int[totalSize];
        this.size=0;
    }

    public void  add(int val){
        if(r== data.length-1) {
            System.out.println("Queue id Full");
        }
        if(f==-1){
            f=r=0;
            data[r]=val;
        }
        else {
            data[++r]=val;
        }
        size++;
    }
    public  int  peek(){
        if(size==0)
        {
            System.out.println("Queue is Empty");
            return -1;
        }

        return data[f];
    }
    public int pop(){
        if(size==0){
            System.out.println("Queue is Empty");
        }
        f++;
        size--;
        return data[f-1];
    }
public void display(){
        if (size>0) {
            for (int i = f; i <= r; i++) {
                System.out.print(data[i] + " ");
            }
        }
}
public boolean isEmpty(){
    return size == 0;
}
    public static void main(String[] args) {
        Queue q=new Queue(5);
//        q.add(3);
//        q.add(4);
//        q.add(5);
//        q.add(6);
        q.display();
        System.out.println( q.isEmpty());
    }

}
