package com.Rohit.Stacks;

import java.util.Arrays;
import java.util.Stack;

public class SlidingWindow {
    public static int [] maxSlideWindow(int[] nums,int k){
    int n= nums.length;
    int []ans=new int[n-k+1];
    int z=0;
    Stack<Integer> st=new Stack<>();
    int []nge =new int[n];
    st.push(n-1);
    nge[n-1]=8;
        for (int i = n-2; i >=0 ; i--) {
            while (st.size()>0 && nums[i]>nums[st.peek()]){
                st.pop();
            }
            if(st.size()==0) nge[i]=-1;
            else nge[i]=st.peek();
            st.push(i);
        }

        int j=0;
        for(int i = 0; i < n-k+1; i++){
            if(j>i+k) j=i;
            int max=nums[j];
            while (j<i+k){
                max=nums[j];
                j=nge[j];
            }
            ans[z++]=max;
        }
        return ans;
    }

    public static void main(String[] args) {

        int []nums={1,2,3,4,5,6,7,8};
        int k=3;
        System.out.println(Arrays.toString(maxSlideWindow(nums,k)));
    }
}
