package com.Rohit.Recursion.EasyQue;

public class Fact {
    public static void main(String[] args) {
        System.out.println(sum(5));
    }
    public static int  fact(int n){
        if(n==1){
            return 1;
        }
        return n* fact(n-1);
    }

    public static int  sum(int n){
        if(n==0){
            return 0;
        }
        return n+ sum(n-1);
    }
}
