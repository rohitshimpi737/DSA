package com.Rohit.arrays.twopointer;

import java.util.Arrays;

public class MoveEvenOdd {
    public static void main(String[] args) {
        int []arr= {1,2,3,4,5,6,7,8,10};
        System.out.println(Arrays.toString(arr));
        fun(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void fun( int []arr) {
        int start=0;
        int end=arr.length-1;
        while (start<end){
            if(!isCheck(arr[start])&& isCheck(arr[end])){
                swap(arr,start,end);
                start++;
                end--;
            }
            if (isCheck(arr[start])) {
                start++;
            }
            if (!isCheck(arr[end])) {
                end--;
            }
        }

    }
    public  static boolean isCheck(int num){
        return  num%2==0;
    }
    public  static void swap(int [] arr,int start, int end){
        arr[start]=arr[start]+arr[end];
        arr[end]=arr[start]-arr[end];
        arr[start]=arr[start]-arr[end];
    }
}
