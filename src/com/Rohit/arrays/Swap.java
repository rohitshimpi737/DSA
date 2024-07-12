package com.Rohit.arrays;

import java.util.Arrays;

public class Swap {
    public static void rev(int []num,int start,int end){
        if(start<end) {
            swap(num ,start,end);
            rev(num, start + 1, end - 1);
        }
    }
    public static void swap(int []num,int start,int end){
        int temp=num[start];
        num[start]=num[end];
        num[end]=temp;
    }
    public static void reverse(int []arr){
        int start=0;
        int end=arr.length-1;
        while(start<end){
            swap(arr,start,end);
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int []arr={1,2,3,4,5,6,7};
        System.out.println(Arrays.toString(arr));
        reverse(arr);
        System.out.println(Arrays.toString(arr));
        rev(arr,0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
