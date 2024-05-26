package com.Rohit.Heap;

public class Main {
    private final int capacity;
    private int size;
    private final int []heap;

    Main(int capacity){
        this.capacity=capacity;
        this.size=0;
        heap = new int[capacity];
    }

    private int parent(int i) {
        return (i-1)/2;
    }
    private int  leftChild(int i){
        return 2*i+1;
    }
    private int  rightChild(int i){
        return 2*i+2;
    }
    private void swap(int i, int j) {
        int temp=heap[i];
        heap[i]=heap[j];
        heap[j]=temp;
    }
    public void insert(int data ){
        if(size>=capacity){
            System.out.println("Heap is Full");
            return;
        }
        heap[size++]=data;
        heapifyUp(size-1);
    }

    private void heapifyUp(int i) {
        while (i>0 && heap[i]>heap[parent(i)]){
            swap(i,parent(i));
            i=parent(i);
        }
    }

    private void heapifyDown(int i){
        int maxIndex=i;
        int left=leftChild(i);
        int right=rightChild(i);

        if(left<size && heap[left]>heap[maxIndex]){

            maxIndex=left;

        }

        if(right<size && heap[right]>heap[maxIndex]){

            maxIndex=right;

        }
        if(i!=maxIndex){

            swap(maxIndex,i);
            heapifyDown(maxIndex);

        }
    }

    private int extractMax(){
        if(size==0){
            System.out.println("Heap is Empty ");
            return -1;
        }
        int max=heap[0];
        heap[0]=heap[--size];
        heapifyDown(0);
        return max;
    }

    public void printHeap() {
        for (int i = 0; i < size; i++) {
            System.out.print(heap[i] + " ");
        }
        System.out.println();
    }

    private  void heapSort(){
        int originalsize=size;
        for (int i=originalsize-1;i>0;i--) {
            swap(0,i);
            size--;
            heapifyDown(0);
        }
        size=originalsize;
    }

    public static void main(String[] args) {
        Main obj= new Main(10);

        Main maxHeap = new Main(10);
        maxHeap.insert(2);
        maxHeap.insert(20);
        maxHeap.insert(5);
        maxHeap.insert(3);
        maxHeap.insert(8);
        maxHeap.insert(10);
        maxHeap.insert(1);
        maxHeap.insert(100);
        maxHeap.printHeap();
        int ans=maxHeap.extractMax();
        System.out.println(ans);
        maxHeap.heapSort();
        maxHeap.printHeap();

    }
}
