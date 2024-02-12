package com.Rohit.Recursion.array;

import java.util.ArrayList;

public class linearSearch {
    public static void main(String[] args) {
        int []arr={6,9,1,2,9,8};
        int target=9;
        System.out.println( target + " is At "+search(arr,target)+ " Index");
        System.out.println("Is element exits in given array "+check(arr,target));
        System.out.println( target + " is At "+searchLast(arr,target)+ " Index From last");
        findAllIndex(arr,target,0);
        System.out.println(list);
       ArrayList<Integer> list1= findAllIndex1(arr,target,0,new ArrayList<>());
        System.out.println(list1);

    }

    public static boolean check(int [] arr,int target){
        return helper1(arr,target,0);
    }
    private static boolean helper1(int[] arr, int target, int index) {
        if(index== arr.length){
            return false;
        }
        return arr[index]==target || helper1(arr,target,index+1);
    }

    public static int search(int []arr,int target){
        return helper(arr,target,0);
    }
    private static int helper(int [] arr, int target,int index) {
        if (index >= arr.length) {
            return -1;
        }
        if (arr[index] == target)
        {
            return index;
        }
        else {
            return helper(arr, target, index + 1);
        }
    }
    public static int searchLast(int []arr,int target){
        return helper3(arr,target, arr.length-1);
    }
    private static int helper3(int [] arr, int target,int index) {
        if (index < 0) {
            return -1;
        }
        if (arr[index] == target)
        {
            return index;
        }
        else {
            return helper3(arr, target, index - 1);
        }
    }

    static ArrayList<Integer> list = new ArrayList<>();
    static void findAllIndex(int[] arr, int target, int index) {
        if (index == arr.length) {
            return;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        findAllIndex(arr, target, index + 1);
    }
// Returning array list throughout recursion

    static ArrayList<Integer> findAllIndex1(int[] arr, int target, int index, ArrayList<Integer> list) {
        if (index == arr.length) {
            return list;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        return findAllIndex1(arr, target, index + 1, list);
    }

    static ArrayList<Integer> findAllIndex2(int[] arr, int target, int index) {

        ArrayList<Integer> list = new ArrayList<>();

        if (index == arr.length) {
            return list;
        }

        // this will contain answer for that function call only
        if (arr[index] == target) {
            list.add(index);
        }
        ArrayList<Integer> ansFromBelowCalls = findAllIndex2(arr, target, index + 1);

        list.addAll(ansFromBelowCalls);

        return list;
    }
}
