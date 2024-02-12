package com.Rohit.Stacks;

import java.util.Arrays;
import java.util.Stack;

public class NextSmallerElemnt {
    public static int [] nextSmaller(int [] arr){
        int n= arr.length;
        int res[]= new int[n];
        Stack<Integer> st= new Stack<>();
        st.push(arr[n-1]);
        res[n-1]=-1;
        for (int i = n-1; i >=0; i--) {
            while(st.size()>0 && arr[i]<=st.peek()){
                st.pop();
            }
            if(st.isEmpty()) res[i]=-1;
            else res[i]=st.peek();

            st.push(arr[i]);
        }
        return res;
    }
    public static void main(String[] args) {
        int [] arr={5,2,4,6,3,5};
        System.out.println(Arrays.toString(nextSmaller(arr)));

    }
}
