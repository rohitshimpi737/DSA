package com.Rohit.Recursion.array;

public class RoratedSeach {
    public static void main(String[] args) {
        int[] arr = {5, 6, 7, 8, 9, 1, 2, 3};
        System.out.println(search(arr, 9, 0, arr.length - 1));

    }
    public static int search( int [] arr, int target ,int s, int e){
        if(s>e){
            return -1;
        }
        int mid = s+(e-s)/2;
        if(arr[mid]==target){
            return  mid ;
        }
        if(arr[s]<=arr[mid]){
            if(target>=arr[s] && target<=arr[mid]){
                 return search(arr,target,s,mid-1);
            }
            else {
               return search(arr,target,mid+1,e);
            }
        }
        if(arr[mid]<=target && target<=arr[e]){
            search(arr,target,mid+1,e);
        }

           return search(arr,target,s,mid-1);
    }
}
