package com.Rohit.Recursion.Basic;

public class BS {
    public static void main(String[] args) {
        int target=2;
        int [] arr= {1,3,5,9,22};
        int ans =binarySearch(arr,0,arr.length-1 ,target);
        System.out.println(ans);
    }
    public  static int binarySearch(int [] arr, int start , int end ,int target){

        if(start>end){
            return -1;
        }
        int mid = start+(end-start)/2;
        if (arr[mid]==target){
            return mid;
        }
        if (arr[mid]>target) {
             return binarySearch(arr,start ,mid-1,target);
        }
            return binarySearch(arr,mid+1,end,target);

    }
}
