package com.Rohit.SlidingWindow;

public class MaxSum {
    static int maxSum(int arr[], int n, int k)
    {
       int  totalSum=0;
        for(int i=0;i<k;i++){
            totalSum+=arr[i];
        }
        int windowSum=totalSum;
        for (int j = k; j < n; j++) {
            windowSum+=arr[j]-arr[j-k];
            totalSum=Math.max(totalSum,windowSum);
        }
        return totalSum;
    }
    public static void main(String[] args) {
        int []arr={1, 4, 12, 10, 2, 3, 1, 0, 20};
        int k=3;
        System.out.println(maxSum(arr, arr.length,k));
    }
}
