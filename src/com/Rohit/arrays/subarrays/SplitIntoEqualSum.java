package com.Rohit.arrays.subarrays;

import java.util.ArrayList;
import java.util.List;

public class SplitIntoEqualSum {
    public static List<List<Integer>> split(int[] nums) {
        int s = 0;
        int e = nums.length - 1;
        int s1 = nums[s];
        int s2 = nums[e];
        s++;
        e--;
        List<List<Integer>> list = new ArrayList<>();
        list.add(new ArrayList<>());
        list.add(new ArrayList<>());
        list.get(0).add(nums[0]);
        list.get(1).add(nums[nums.length - 1]);
        while (s <= e) {
            if (s1 < s2) {
                s1 += nums[s];
                list.get(0).add(nums[s]);
                s++;
            } else {
                s2 += nums[e];
                list.get(1).add(0, nums[e]); // Add element to the beginning of the list to maintain order
                e--;
            }
        }
        if (s1 == s2) {
            return list;
        } else {
            return null;
        }
    }

    public  static List<List<Integer>> split2(int[] nums){
        int totalSum=0;
        int index=-1;
        for (int num : nums) {
            totalSum += num;
        }
        int prefixSum=0;
        for (int i = 0; i <nums.length ; i++) {
            prefixSum+=nums[i];
            int suffixSum=totalSum-prefixSum;
            if (prefixSum==suffixSum){
                index=i;
                break;
            }
        }
        List<List<Integer>> list = new ArrayList<>();
        if (index != -1) {
            List<Integer> subarray1 = new ArrayList<>();
            List<Integer> subarray2 = new ArrayList<>();
            for (int i = 0; i <= index; i++) {
                subarray1.add(nums[i]);
            }
            for (int i = index + 1; i < nums.length; i++) {
                subarray2.add(nums[i]);
            }
            list.add(subarray1);
            list.add(subarray2);
        }
        return list;
    }
    public static void main(String[] args) {
        int[] nums = {1 , 2 , 3 , 4 , 5 , 5 };
        List<List<Integer>> result = split2(nums);
        System.out.println(result);
    }
}
