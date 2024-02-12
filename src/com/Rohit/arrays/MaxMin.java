package com.Rohit.arrays;

public class MaxMin {
    public static void maxArray(int []arr ){
        int max=arr[0];
        for (int j : arr) {
            if (j > max) {
                max = j;
            }
        }
        System.out.println(max);
    }
    public static void minArray(int []arr ){
        int min=arr[0];
        for (int j : arr) {
            if (j < min) {
                min = j;
            }
        }
        System.out.println(min);
    }
}
