package com.Rohit.arrays.twopointer;
import java.util.Arrays;

public class MaximumMinimumForm {
    public static  void minMaxPair(int []arr){
        int len=arr.length;
        int []temp= new int[len];
        int i=0,j=len-1,k=0;
        while (i<j){
            temp[k++]=arr[j--];
            temp[k++]=arr[i++];
        }
        System.out.println(Arrays.toString(temp));
    }
    static void alternateRearrange(int[] arr) {
        int n = arr.length;
        int maxIndex = n - 1;
        int minIndex = 0;
        int maxElement = arr[n - 1] + 1; // to ensure no overlap with elements in the array

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                arr[i] += (arr[maxIndex] % maxElement) * maxElement;
                maxIndex--;
            } else {
                arr[i] += (arr[minIndex] % maxElement) * maxElement;
                minIndex++;
            }
        }

        for (int i = 0; i < n; i++) {
            arr[i] /= maxElement;
        }
    }
    public static void main(String[] args) {
        int []arr={1,2,3,4,5,6};
        minMaxPair(arr);
        alternateRearrange(arr);
        System.out.println(Arrays.toString(arr));

    }
}
