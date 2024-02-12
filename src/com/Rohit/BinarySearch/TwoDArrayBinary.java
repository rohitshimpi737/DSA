package com.Rohit.BinarySearch;

import java.util.Arrays;

public class TwoDArrayBinary {
    public static void main(String[] args) {
        int [][]nums={  {1, 2, 3, 4},
                        {12,25,35,45},
                        {28,29,37,49},
                        {33,34,38,50}};
        int target=3;
         int[]ans =search(nums,target);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] search(int[][] nums, int target){

        int row= nums.length-1;
        int col=nums[0].length-1;
        int rStart=0;

        while(rStart<=row && col>=0){
           if(nums[rStart][col]==target){
               return new int[]{rStart,col};
           }
           else if (nums[rStart][col]<target) {
               rStart++;
           }
           else {
               col--;
           }
        }
        return new int[]{-1,-1};

    }
}
