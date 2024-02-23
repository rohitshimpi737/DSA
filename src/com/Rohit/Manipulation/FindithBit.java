package com.Rohit.Manipulation;

public class FindithBit {
    public static void main(String[] args) {
        int num=0;
        int i=3;
        System.out.println(getIthBit(num,i));
    }
    private static int getIthBit(int num, int i) {

        return ((num & (1<<(i-1)) >> (i-1)));
    }
}
