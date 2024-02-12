package com.Rohit.BinarySearch;

public class Search {
    public static void main(String[] args) {
        int[] nums = {2, 5, 8, 9, 11, 20};
        int target = 20;
        int ans=search(nums, target);
        System.out.println(ans);
    }
    public static int search(int nums[],int target){
        int s=0;
        int e=nums.length-1;
        while(s<=e){

            int m=s+(e-s)/2;
            if(nums[m]>target){
                e=m-1;
            }
            else if(nums[m]<target){
                s=m+1;
            }
            else {
               return m;
            }

        }
        return -1;
    }
}
