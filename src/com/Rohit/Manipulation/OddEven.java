package com.Rohit.Manipulation;

public class OddEven {
    public static void main(String[] args) {
        // Program To Check The  Given Number Is Even Or Odd.
        int n=16;
        System.out.println(isOdd(n));
    }
    public static  boolean isOdd(int n){
        return (n&1)==1;
    }
}
