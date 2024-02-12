package com.Rohit.arrays.twopointer;

import java.util.Arrays;

public class RearrangeBySign {
    public static int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        int pi=0,ni=1;
        int [] ans=new int[n];
        for (int j = 0; j < n; j++) {
            if(nums[j]>0){
                ans[pi]=nums[j];
                pi+=2;
            }
            else {
                ans[ni]=nums[j];
                ni+=2;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {3,1,-2,-5,2,-4};
        System.out.println(Arrays.toString(rearrangeArray(nums)));
    }
}
