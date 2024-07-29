package com.Rohit.Sort;
import java.util.Arrays;
public class Insertion {

    public static void insertion(int[] arr) {
        for (int i = 1; i < arr.length; i++){
            int j=i;
            while (j>0 && arr[j]<arr[j-1]){
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                j--;
            }
        }
    }

    public static void main(String[] args) {
        int []arr={5,4,3,2,1};
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }
}
