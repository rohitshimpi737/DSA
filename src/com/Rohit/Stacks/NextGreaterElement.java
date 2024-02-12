package com.Rohit.Stacks;

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElement {
    //THIS METHOD IS NOT SUFFICIENT FOR TIME COMPLEXITY
    //T.C=O(N^2)  S.C=O(1)
    //INPUT ARR    1   3   2   1   8   6   3   4
    // OUTPUT ARR  3   8   8   8  -1  -1   4  -1
//    public static int[] prevGreat(int[] arr) {
        //GFG question
//        Stack<Integer> st = new Stack<>();
//        int n = arr.length;
//        int[] res = new int[n];
//        res[0] = -1;
//        st.push(0);
//        for (int i = 1; i < n; i++) {
//            while (st.size() > 0 && arr[st.peek()] < arr[i]) {
//                st.pop();
//            }
//            if (st.size() == 0) res[i] = i;
//            else res[i] = i - st.peek();
//            st.push(i);
//        }
//        return res;
//    }

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


    public static int[] nextGreat(int[] arr) {
        Stack<Integer> st = new Stack<>();
        int n = arr.length;
        int[] res = new int[n];
        res[n - 1] = -1;
        st.push(arr[n - 1]);
        for (int i = n - 2; i >= 0; i--) {
            while (st.size() > 0 && st.peek() < arr[i]) {
                st.pop();
            }
            if (st.size() == 0) res[i] = -1;
            else res[i] = st.peek();
            st.push(arr[i]);
        }
        return res;
    }

        public static int[] nextGreatForward(int[] arr) {
        Stack<Integer> st = new Stack<>();
        int n= arr.length;
        int [] result =new int [n];

            for (int i = 0; i <n ; i++) {
                while (st.size()>0 && arr[st.peek()]<arr[i]){
                    int index=st.pop();
                    result[index]=arr[i];
                }
                st.push(i);
            }
            while (st.size()>0){
                int index=st.pop();
                result[index]=-1;
            }
            return result;
        }

public  static int[] previousGreaterReverse(int [] arr){
        int n= arr.length;
        int [] result =new int [n];
        Stack<Integer> st= new Stack<>();
    for (int i = n-1; i >=0 ; i--) {
        while( st.size()>0 && arr[i]> arr[st.peek()]){
            int index=st.pop();
            result[index]=arr[i];
        }
        st.push(i);
    }
    while (st.size()>0){
        int index=st.pop();
        result[index]=-1;
    }
    return result;
}

        public static void main(String[] args) {
//            int[] arr = {100, 80, 60, 70, 60, 75, 85};
            int[] arr = {1,5,3,2,1,6,3,4};
//        int []ans=new int[arr.length];
//        for (int i = 0; i < arr.length ; i++) {
//            ans[i]=-1;
//            for (int j = i+1; j < ans.length; j++) {
//                if (arr[i] < arr[j]){
//                    ans[i]=arr[j];
//                    break;
//                }
//            }
//        }
//        System.out.println(Arrays.toString(arr));
//        System.out.println(Arrays.toString(ans));
//            System.out.println(Arrays.toString(nextGreat(arr)));
        System.out.println(Arrays.toString(prevGreaterElem(arr)));
            System.out.println(Arrays.toString(previousGreaterReverse(arr)));
//            System.out.println(Arrays.toString(nextGreatForward(arr)));
        }
    }
