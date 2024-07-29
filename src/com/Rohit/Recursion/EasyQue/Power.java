package com.Rohit.Recursion.EasyQue;

public class Power {
    public static void main(String[] args) {
        System.out.println(power(4,5));
    }

    public static int power(int p,int q) {
        if(q==0){
            return 1;
        }
        return  p*power(p,q-1);
    }
}
