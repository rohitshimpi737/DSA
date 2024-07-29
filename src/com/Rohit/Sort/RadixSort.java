package com.Rohit.Sort;

import java.util.Arrays;

public class RadixSort {
    public static void main(String[] args) {
        int []arr={170,45,75,90,802,24,2,66};
        radixSort(arr);
        System.out.println(Arrays.toString(arr));

    }
    public static  void radixSort(int []arr){
        int n=arr.length;
        int max= Arrays.stream(arr).max().getAsInt();

        for (int place = 1; max/place>0 ; place*=10) {
            countingSort(arr,n, place);
        }

    }

    private static void countingSort(int[] arr,int n, int place) {
        int [] output=new int[n+1];
        int [] count=new int[10];

        for (int i = 0; i < n; i++) {
            count[(arr[i]/place)%10]++;
        }

        for (int i = 1; i < 10; i++) {
            count[i]+=count[i-1];
        }
        for (int i = n - 1; i >= 0; i--) {
            int digit=(arr[i]/place)%10;
            int index=count[digit]-1;
            output[index]=arr[i];
            count[digit]--;

        }
        for (int i = 0; i < n; i++){
            arr[i] = output[i];
        }
    }
}
