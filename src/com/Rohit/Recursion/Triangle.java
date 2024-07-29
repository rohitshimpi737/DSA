package com.Rohit.Recursion;

import java.util.Arrays;

public class Triangle {
    public static void main(String[] args) {
        int [] arr={5,4,3,2,1};
        sortSelection(0,1,arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void t1(int r,int c) {
        if(r==0){
            return;
        }
        if(r>c){
            System.out.print("*");
            t1(r,c+1);
        }
        else {
            System.out.println();
            t1(r - 1, 0);
        }
    }

    public static void t2(int r,int c) {
        if(r==0){
            return;
        }
        if(r>c){
            t2(r,c+1);
            System.out.print("*");
        }
        else {
            t2(r - 1, 0);
            System.out.println();
        }
    }

    public static void sort(int r,int c,int []arr) {
        if(r==0){
            return;
        }
        if(r>c){
            if(arr[c]>arr[c+1]){
                arr[c]=arr[c]+ arr[c+1];
                arr[c+1]= arr[c]- arr[c+1];
                arr[c]= arr[c]- arr[c+1];
            }
            sort(r,c+1,arr);
        }
        else {
            sort(r - 1, 0,arr);
        }
    }
    public static void sortSelection(int r,int c,int []arr) {
        if (r == arr.length - 1) {
            return;
        }
        if (c < arr.length) {
            if (arr[r] > arr[c]) {
                // Swap arr[r] and arr[c]
                int temp = arr[r];
                arr[r] = arr[c];
                arr[c] = temp;
            }
            sortSelection(r, c + 1, arr);
        } else {
            sortSelection(r + 1, r + 2, arr);
        }
    }
}
