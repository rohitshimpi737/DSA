package com.Rohit.BackTracking;
import java.util.ArrayList;
import java.util.List;
public class OptimisePermOfArray {
    public static void main(String[] args) {
//        int [] nums={'a'+0,'b'+0,'c'+0};
        int [] nums={1,2,3};
        List <List<Integer>> ans=permute(nums);
        for ( var e: ans) {
            for (int n:e) {
                System.out.print(n + ",");
            }
            System.out.println();
        }
    }
    public  static List<List<Integer>> permute(int[] nums) {
        List <List<Integer>> ans = new ArrayList<>();
        helper(nums,0,ans);
        return ans;
    }
    public static void helper(int [] nums,int idx , List <List<Integer>> ans){
        if(idx==nums.length-1){
            List <Integer> list = new ArrayList<>();
            for (int n:nums) {
                list.add(n);
            }
            ans.add(list);
            return ;
        }
        for(int i=idx;i<nums.length;i++){
                 swap(i,idx,nums);
                helper(nums,idx+1,ans);
                 swap(i,idx,nums);
            }
        }
        public static void swap( int i ,int j ,int [] nums){
                int temp = nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
        }
}
