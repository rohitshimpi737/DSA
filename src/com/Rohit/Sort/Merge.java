package com.Rohit.Sort;

import java.util.Arrays;

public class Merge {
    public static void main(String[] args) {
        int []arr= {8,7,6,5,4,3,2,1};
        mergeSort(arr,0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void mergeSort(int []arr,int start ,int end) {
        if(start==end){
            return;
        }
        int mid=start+(end-start)/2;
        mergeSort(arr,start,mid);
        mergeSort(arr,mid+1,end);
        merge(arr,start,mid,end);
    }

    private static void merge(int []arr ,int start ,int mid ,int end) {
        int n1=mid-start+1,n2=end-mid;
        int []left=new int[n1];
        int []right=new int[n2];
        int i=0;
        int j=0;
        int k=start;
        int temp=start;

        while (i<n1){
            left[i]=arr[temp];
            temp++;
            i++;
        }
        temp=mid+1;
        while (j<n2){
            right[j]=arr[temp];
            temp++;
            j++;
        }
        i=0;
        j=0;
        while (i<n1 && j<n2){
            if(left[i]<right[j]){
                arr[k]=left[i];
                i++;
            }
            else {
                arr[k]=right[j];
                j++;
            }
            k++;
        }

        while (i<n1){
            arr[k]=left[i];
            i++;
            k++;
        }
        while (j<n2){
            arr[k]=right[j];
            j++;
            k++;
        }
    }
}
