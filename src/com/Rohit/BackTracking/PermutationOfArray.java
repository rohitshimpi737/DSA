package com.Rohit.BackTracking;

import java.util.ArrayList;
import java.util.List;

public class PermutationOfArray {
    public static void main(String[] args) {
        int [] nums={1,2,3};
        List <List<Integer>> ans=permute(nums);
        for ( var e: ans) {
            System.out.print(e+" ");
        }
    }

        public  static List<List<Integer>> permute(int[] nums) {
            List <List<Integer>> ans = new ArrayList<>();
            List <Integer> ds = new ArrayList<>();
            boolean [] isVisited= new boolean[nums.length];
            helper(nums,ds,isVisited,ans);
            return ans;
        }
        public static void helper(int [] nums,  List <Integer> ds, boolean [] isVisited, List <List<Integer>> ans){
            if(ds.size()==nums.length){
                List <Integer> list = new ArrayList<>();
                list.addAll(ds);
                ans.add(list);
                return ;
            }

            for(int i=0;i<nums.length;i++){
                if(!isVisited[i]){
                    isVisited[i]=true;
                    ds.add(nums[i]);
                    helper(nums,ds,isVisited,ans);
                    ds.remove(ds.size()-1);
                    isVisited[i]=false;
                }
            }
        }
    }
