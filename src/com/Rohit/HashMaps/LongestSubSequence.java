package com.Rohit.HashMaps;

import java.util.HashMap;

public class LongestSubSequence {
    public static void main(String[] args) {
        int arr[] = {1, 0, 0, 1, 0, 0, 1};
        int size = arr.length;
        System.out.println(findMaxLength(arr));
    }
// longest consecutive 1 , 0  The length of the longest sub array
    private static int findMaxLength(int[] arr) {
        int sum=0;
        int maxLen=0;
        HashMap<Integer,Integer> mp= new HashMap<>();
        mp.put(0,-1);

        for (int i = 0; i < arr.length; i++) {
                if(arr[i]==0) {
                    sum +=-1;
                }
                else {
                    sum+= 1;
                }

             if(mp.containsKey(sum)){
                int idx= mp.get(sum);
                int length= i-idx;
                maxLen=Math.max(length,maxLen);
             }
            else {
                mp.put(sum,i);
             }
            System.out.println(mp);

        }
        return  maxLen;
    }
}