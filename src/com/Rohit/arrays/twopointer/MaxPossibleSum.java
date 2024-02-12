package com.Rohit.arrays.twopointer;

import java.util.Arrays;

public class MaxPossibleSum {
    public  static int[] maxSum(int [] arr,int k){
        int n= arr.length;
        int i=0;
        int j=n-1;
        int [] ans=new int[2];
        Arrays.sort(arr);
        while (i<j){
            if(arr[i]+arr[j]<k){
                ans[0]=arr[i];
                ans[1]=arr[j];
                i++;
            }
            else{
                j--;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int []arr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int k= 95;

        System.out.println(Arrays.toString(maxSum(arr,k)));

    }
}
