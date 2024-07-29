package com.Rohit.arrays;

import java.util.Arrays;

public class SortedMatrix {
    public static void main(String[] args) {
        int [][] arr= {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };
        System.out.println(Arrays.toString(search(arr,1)));
    }

    public  static  int [] binarySearch(int [][]arr,int row,int colS,int colE,int target){
        while(colS<colE){
            int mid= colS +(colE-colS)/2;
            if(arr[row][mid]== target){
                return new int[]{row,mid};
            }
            else if (arr[row][mid]<target){
                colS=mid+1;
            }
            else {
                colE=mid-1;
            }
        }
        return  new int[]{-1,-1};
    }

    public  static int[] search(int [][]arr,int target){
        int rows=arr.length;
        int cols=arr[0].length;

        if(rows==1){
            return binarySearch(arr,0,0,cols-1,target);
        }
        int rowS=0;
        int rowE=rows-1;
        int cMid=cols/2;

        while (rowS<rowE-1){
            int mid= rowS +(rowE-rowS)/2;

            if(arr[mid][cMid]==target){
                return new int[]{mid,cMid};
            }
            else if (arr[mid][cMid]<target){
                rowS=mid;
            }
            else {
                rowE=mid;
            }
        }

        // now we have two row
        // rowS and rowE
        if(arr[rowS][cMid]==target){
            return new int[]{rowS,cMid};
        }
        if(arr[rowE][cMid]==target){
            return new int[]{rowE,cMid};
        }

        // now 4 corners

        // 1st
        if(arr[rowS][cMid-1]>=target){
            return binarySearch(arr,rowS,0,cMid-1,target);
        }
        // 2nd
        if(arr[rowS][cMid+1]<=target && arr[rowS][cols-1]>=target){
            return binarySearch(arr, rowS,cMid+1,cols-1,target);
        }
        // 3rd
        if(arr[rowE][cMid-1]>=target){
            return binarySearch(arr, rowE,0,cMid-1,target);
        }
        // 4th
        else{
            return binarySearch(arr, rowE,cMid+1,cols-1,target);
        }
    }
}
