package com.Rohit.Recursion.EasyQue;

public class CountStep {
    public static void main(String[] args) {
        System.out.println(countStep(41));
    }

    public static int countStep ( int n) {
        return helper(n,0);
    }

    private static int helper(int n, int c) {
        if(n==0){
            return c;
        }
        if(n%2==0){
            return helper(n/2,c+1);
         }
        return helper(n-1,c+1);
        }
}
