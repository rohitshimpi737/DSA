package com.Rohit.Manipulation;

public class FindUnique {
    public static void main(String[] args) {
        int[] arr = {2, 3, 3, 4, 2, 6, 4};
        System.out.println(findUnique(arr));
    }
    private static int findUnique(int[] arr){
        int r=0;
        for (int i = 0; i < arr.length; i++) {
            r=r^arr[i];
        }
        return r;
    }
}
