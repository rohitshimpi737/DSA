package com.Rohit.Recursion.EasyQue;

public class DigitSum {
    public static void main(String[] args) {
        System.out.println(digProd(193));
    }
    public static int digSum(int n) {
        if (n <= 0) {
            return 0;
        }

        return digSum(n/10) +n%10;
    }
    public static int digProd(int n) {
        if (n%10 ==n) {
            return n;
        }

        return  (n%10)* digProd(n/10) ;
    }
    }

