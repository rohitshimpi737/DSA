package com.Rohit.Recursion.array;
import  java.util.ArrayList;
import java.util.Arrays;

public class SubsetWithDuplicate {

    public static void main(String[] args) {
        int[] arr = {1,2,3};
        ArrayList<ArrayList<Integer>> ans = subsetItr(arr);
        for (var a : ans) {
            System.out.print(a+" ");
        }
    }

    public static ArrayList<ArrayList<Integer>> subsetItr(int[] arr) {
        Arrays.sort(arr);
        ArrayList<ArrayList<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            int size = outer.size();
            int j=0;
            if(i>0 && arr[i]==arr[i-1]){
                j=size/2;
            }
            for (;j < size; j++) {
                ArrayList<Integer> inner = new ArrayList<>(outer.get(j));
                inner.add(arr[i]);
                sum+=arr[i];
                outer.add(inner);
            }
        }
        System.out.println(sum);
        return outer;
    }

}
