package com.Rohit.Recursion.EasyQue;

public class Nto1 {
    public static void main(String[] args) {
        funBoth(5);
    }
    public  static void fun(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        fun(n-1);
    }
    public  static void funRev(int n){
        if(n==0){
            return;
        }
        funRev(n-1);
        System.out.println(n);
    }

    public  static void funBoth(int n){
        if(n==0){
            return;
        }
        System.out.print(n+" ");
        funBoth(n-1);
        System.out.print(n+" ");
    }

}
