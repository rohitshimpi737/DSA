package com.Rohit.Sort;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {8, 7, 6, 5, 4, 3, 2, 1};
        quickSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    public static void quickSort(int[] arr, int start, int end) {
        if (start >= end) {
            return;
        }
        int pi = partition(arr, start, end);
        quickSort(arr, start, pi - 1);
        quickSort(arr, pi+1, end);
    }
    private static int partition(int[] arr, int start, int end) {
        int pivot = arr[start];
        int count = 0;
        for (int i = start+1; i <= end; i++) {
            if (arr[i] <=pivot) {
                count++;
            }
        }
        int pivotIndex = start+count;

        swap(arr, start,pivotIndex);
        int i = start;
        int j = end;

        while (i<pivotIndex && j>pivotIndex) {
            while (arr[i] <=pivot) i++;
            while (arr[j] >pivot) j--;
            if(i<pivotIndex && j>pivotIndex) {
                swap(arr, i, j);
                i++;
                j--;
            }
        }
        return pivotIndex;
    }
    public  static void swap(int []arr ,int start,int end){
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
    }
}
