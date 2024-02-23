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

    public static void main(String[] args) {
        int[] nums = {1,2,2,1};
        List<List<Integer>> result = split(nums);
        System.out.println(result);
    }
}
