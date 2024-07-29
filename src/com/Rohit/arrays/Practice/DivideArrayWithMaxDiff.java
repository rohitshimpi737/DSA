package com.Rohit.arrays.Practice;
import java.util.Arrays;

// 2966. Divide Array Into Arrays With Max Difference
public class DivideArrayWithMaxDiff {
    public static void main(String[] args) {
        int []nums={1,3,4,8,7,9,3,5,1};
            int k=2;
            int ans[][]=divideArray(nums,k);
        for (var e:ans) {
            System.out.print(Arrays.toString(e)+" ");
        }
    }
    public  static int[][] divideArray(int[] nums, int k) {

        int [][]ans =new int[nums.length/3][3];
        Arrays.sort(nums);
        for(int i=2;i<nums.length;i+=3){
            if((nums[i]-nums[i-2])>k){
                return new int[0][];
            }
            ans[i / 3] = new int[] {nums[i - 2], nums[i - 1], nums[i]};
        }
        return ans;
    }
}
