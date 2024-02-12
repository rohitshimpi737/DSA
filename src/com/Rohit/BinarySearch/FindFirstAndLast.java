package com.Rohit.BinarySearch;

import java.util.Arrays;

public class FindFirstAndLast {
    public static void main(String[] args) {
        
    int [] nums={2,3,4,4,4,4,5,7,9};
    int target =4;
        int []arr =searchRange( nums, target);
        System.out.println(Arrays.toString(arr));
    }

        public static int[] searchRange(int[] nums, int target) {
            int []ans={-1,-1};
            ans[0]=search( nums, target,true);
            if(ans[0]!=-1){
                ans[1]=search( nums, target,false);
            }
            return ans;
        }

        public static int search(int nums[],int target,boolean findStartIndex ){
            int s=0;
            int e=nums.length-1;
            int ans=-1;
            while(s<=e){

                int m=s+(e-s)/2;
                if(nums[m]>target){
                    e=m-1;
                }
                else if(nums[m]<target){
                    s=m+1;
                }
                else {
                    ans =m;
                    if(findStartIndex){
                        e=m-1;
                    }
                    else {
                        s=m+1;
                    }
                }

            }
            return ans;
        }

    
}
