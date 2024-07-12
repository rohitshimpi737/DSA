package com.Rohit.arrays.twopointer;

import java.util.Arrays;

public class SortedSquare {
    public static void main(String[] args) {
        int []arr= {-10,-3,-2,1,4,5};
        System.out.println(Arrays.toString(arr));

        System.out.println(Arrays.toString(fun1(arr)));
    }

    private static int[] fun1(int[] arr) {
        int []ans= new int [arr.length];
        int start=0;
        int n=arr.length-1;
        int end=n;
        while (start<=end) {
            if(Math.abs(arr[start])>Math.abs(arr[end])){
                ans[n]=arr[start]*arr[start];
                start++;
            }
            else{
                ans[n]=arr[end]*arr[end];
                end--;
            }
            n--;
        }
        return ans;
    }
}
