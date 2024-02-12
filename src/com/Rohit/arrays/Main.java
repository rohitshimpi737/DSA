package com.Rohit.arrays;
import static com.Rohit.arrays.MaxMin.*;
public class Main {

    public  static void printIntArray(int []arr){
        for (int num:arr) {
            System.out.println(num);
        }
    }
    public  static void printFloatArray(float []arr){
        for (float num:arr) {
            System.out.println(num);
        }
    }
    public  static void printCharArray(char []arr){
        for (char num:arr) {
            System.out.println(num);
        }
    }
    public static void main(String[] args) {
        int[] arr = new int[5];
//    this creates array of size 5
        int [] arr1= {1,2,5,3,74,7};
        float  [] arr2= {6f,7f,2f,34f};
        char [] arr3= {'a','b','c'};
        printIntArray(arr1);
        printFloatArray(arr2);
        printCharArray(arr3);
        maxArray(arr1);
        minArray(arr1);
    }
}
