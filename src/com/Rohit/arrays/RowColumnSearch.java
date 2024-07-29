package com.Rohit.arrays;

import java.util.Arrays;

public class RowColumnSearch {
    public static void main(String[] args) {
        int [][] arr= {
                    {1,2,3,4},
                    {15,25,35,45},
                    {28,29,37,49},
                    {33,34,38,50}
                        };

        System.out.println(Arrays.toString(search(arr,3)));
    }

    public  static int[] search(int [][] arr, int target ){
        int row=0;
        int col= arr.length-1;

        while (row<arr.length && col >=0){
            if(arr[row][col]==target){
                return new int[]{row,col};
            }
            else if(arr[row][col]>target){
                col--;
            }
            else {
                row++;
            }
        }
        return new int[]{-1,-1};
    }
}
