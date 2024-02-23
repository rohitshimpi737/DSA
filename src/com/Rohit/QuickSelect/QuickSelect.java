package com.Rohit.QuickSelect;

public class QuickSelect {
    public  static int partition(int low, int high , int []arr){
        int pivot=arr[high];
        int localPivot=low;
        for (int j = low; j < high ; j++) {
            if(arr[j]<pivot) {
                if (localPivot != j) {
                    int temp = arr[j];
                    arr[j] = arr[localPivot];
                    arr[localPivot] = temp;
                }
                localPivot++;
            }
        }

        int temp=arr[high];
        arr[high]=arr[localPivot];
        arr[localPivot]=temp;
        return localPivot;
    }
    public static  int findKthSmallestEle(int []arr, int low,int high,int k){
        int partion=partition(low,high,arr);
        if(partion==k-1){
            return arr[partion];
        }
        else  if(partion<k-1){
             return findKthSmallestEle(arr, partion + 1, high, k);
        }
            return findKthSmallestEle(arr, low, partion - 1, k);
    }
    public static void main(String[] args) {
        int []arr= {1,5,8,2,4};
        System.out.println(findKthSmallestEle(arr,0, arr.length-1 ,3));

    }
}
