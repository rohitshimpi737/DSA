package com.Rohit.Recursion.array;

import java.util.*;

public class Subset {
    public static List<List<Integer>> subset(int[] arr) {
        List<List<Integer>> ans = new ArrayList<>();
        getSubset(0, arr, new ArrayList<>(), ans);
        return ans;
    }

    private static void getSubset(int index, int[] arr, ArrayList<Integer> curr, List<List<Integer>> ans) {
        int len = arr.length;
        if (arr.length == index) {
            ans.add(new ArrayList<>(curr));
            return;
        }
        curr.add(arr[index]);
        getSubset(index + 1, arr, curr, ans);

        curr.remove(curr.size() - 1);
        getSubset(index + 1, arr, curr, ans);
    }
    public static void getUniqueSubset(int []arr){
        Arrays.sort(arr);
        Set<List<Integer>> mySet= new HashSet<>();
        getUniqueSubset(0,arr,new ArrayList<>(),mySet);
    }
    private static void getUniqueSubset(int index, int[] arr, ArrayList<Integer> curr, Set<List<Integer>> ans) {
            ans.add(new ArrayList<>(curr));
        curr.add(arr[index]);
        getUniqueSubset(index + 1, arr, curr, ans);

        curr.remove(curr.size() - 1);
        getUniqueSubset(index + 1, arr, curr, ans);

        // this laso another method to do so
//        for(int i=index;i<nums.length;i++){
//            curr.add(nums[i]);
//            getUniqueSubset(i+1,nums,curr,mySet);
//            curr.remove(curr.size()-1);
//        }
    }

    public static List<Integer> largestDivisibleSub(List<List<Integer>> ans) {
        List<Integer> largestSub = new ArrayList<>();
        int maxSize = -1;
        for (List<Integer> arr : ans) {
            boolean flag = true;
            for (int i = 1; i < arr.size(); i++) {
                if (arr.get(i) % arr.get(i - 1) != 0) {
                    flag = false;
                    break;
                }
            }
            if (flag && arr.size() > maxSize) {
                largestSub = arr;
                maxSize = arr.size();
            }
        }
        return largestSub;
    }

    public static void main(String[] args) {
//        int[] arr = {3, 4, 16, 8};
//        Arrays.sort(arr);
//        List<List<Integer>> ans = subset(arr);
//        System.out.println(ans);
//        System.out.println(largestDivisibleSub(ans));
        System.out.println( Math.addExact(2,3));
    }
}
