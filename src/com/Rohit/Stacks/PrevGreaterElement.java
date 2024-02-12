package com.Rohit.Stacks;

import java.util.Arrays;
import java.util.Stack;

public class PrevGreaterElement {
    public  static int[] prevGreaterElem(int []arr){
        Stack<Integer> st =new Stack<>();
        int [] res=new int[arr.length];
        res[0]=-1;
        st.push(arr[0]);
        for (int i = 1; i < arr.length ; i++) {
            while (st.size()>0 &&st.peek()<arr[i]){
                st.pop();
            }
            if(st.isEmpty()) res[i]=-1;
            else res[i]=st.peek();

            st.push(arr[i]);
        }
        return res;
    }
    public static void main(String[] args) {
        int arr[] = {10, 4, 2, 20, 40, 12, 30};
        System.out.println(Arrays.toString(prevGreaterElem(arr)));
    }
}
