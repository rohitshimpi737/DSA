package com.Rohit.Manipulation;

public class SetIThBit {
    public static void main(String[] args) {
        int n=24;
        int i=4;
        System.out.println("Set i th bit to 1");
        System.out.println(setIThBit1(n,i));
        System.out.println("Set i th bit to 0");
        System.out.println(setIThBit0(n,i));
        System.out.println("Total no of set bit ");
        System.out.println(countSetBit(15));

        System.out.println("Total no of set bit  Using Recursion ");
        System.out.println(countSBitRecur(15,0));
        System.out.println(Integer.bitCount(4));

    }
    private static int setIThBit1(int n, int i) {
        return  n| (1<<(i-1));
    }
    private static int setIThBit0(int n, int i) {
        return  n& ~((1<<(i-1)));
    }
    private static int countSetBit(int n){
        int count =0;
        while(n>0){
            count=count+ (n&1);
            n=n>>1;
        }
        return count;
    }
    private static  int countSBitRecur(int n ,int count){
        if (n<=0) return count;
        count+=n&1;
       return countSBitRecur(n>>1,count);
    }
    private  static int countSetBits(int n) {
        int count = 0;
        while (n > 0) {
            n &= (n - 1);
            count++;
        }
        return count;
    }
}
