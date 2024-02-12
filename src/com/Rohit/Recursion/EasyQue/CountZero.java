package com.Rohit.Recursion.EasyQue;

public class CountZero {
    public static void main(String[] args) {
        System.out.println(countZero(1205000));
    }
    public  static int countZero(int n){
         return countZero(n ,0);

    }
    private static int  countZero(int n, int count ) {
        if(n<=0){
            return count;
        }
        int rem=n%10;
        if(rem==0) count++;
         return countZero(n/10,count);
    }
}
