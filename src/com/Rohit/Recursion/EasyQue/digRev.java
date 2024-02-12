package com.Rohit.Recursion.EasyQue;

public class digRev {
    public static void main(String[] args) {

        int arg = (int) (Math.log10(123)+1);
        int ans=rev2(123,arg);
        System.out.println(ans);
    }
     static int  sum=0;
    public static void  revDig(int n){
        if(n<=0){
            return ;
        }
        int rem=n%10;
        sum=sum*10+rem;
        revDig(n/10);
    }
    public static int rev2(int n,int arg){
        if(n<=0){
            return 0;
        }
        return (int) (n%10* Math.pow(10,arg-1)+rev2(n/10,arg-1));
    }
}
