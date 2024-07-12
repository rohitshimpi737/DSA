package com.Rohit.BinarySearch;

public class InfiniteArray {
    public static void main(String[] args) {

        int [] nums={1,2,3,4,5,6,7,8,9,10,45,77,88,99,111,112,114,220};
        int target =10;
        int num = search( nums, target);
        System.out.println(num);
    }
    public static int search(int[] nums, int target){
        int start=0;
        int end=1;

        while(nums[end]<target){
                int newStart=end+1;
                end = end +(end-start +1) *2;
                start=newStart;
            }
        return seachInfinite(nums,target ,start ,end);
    }

    private static int seachInfinite(int[] nums, int target ,int start,int end) {
        while(start<=end){
            int mid =start+(end-start)/2;
            if(nums[mid]==target){
                return mid;
            } else if (nums[mid]>target) {
                end =mid-1;
            }
            else {
                start =mid+1;
            }
        }
        return -1;
    }
}
