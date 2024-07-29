package com.Rohit.Recursion.array;

public class sorted {
    public static void main(String[] args) {
        int []arr={1,4,6,20};
        System.out.println(check(arr));
    }
    public static  boolean check(int []arr){
     return check(arr,0);
    }

    private static boolean check(int[] arr, int index) {
        if(index== arr.length-1){
            return true;
        }
        return arr[index]<arr[index+1] && check(arr,index+1);
    }

}
