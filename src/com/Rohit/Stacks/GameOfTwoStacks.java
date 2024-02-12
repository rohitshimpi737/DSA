package com.Rohit.Stacks;
import java.util.Arrays;
import java.util.Scanner;

public class GameOfTwoStacks {
public static int twoStacks(int maxSum,int a[] ,int b[]){
        return twoStacks(maxSum,a,b,0,0)-1;
}
private static  int twoStacks(int maxSum,int a[],int b[],int sum,int c){

    if(sum>maxSum) return c;
    if(a.length==0|| b.length==0) return c;
        int s1=twoStacks(maxSum,Arrays.copyOfRange(a,1,a.length), b , sum+a[0], c+1);

        int s2=twoStacks(maxSum,a,Arrays.copyOfRange(b,1,b.length), sum+b[0], c+1);

    return Math.max(s1,s2);
}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int t =sc.nextInt();
        for (int i = 1; i <=t; i++) {
            int n = sc.nextInt();
            int  m = sc.nextInt();
            int  maxSum = sc.nextInt();
            int[] a = new int[n];
            int[] b = new int[m];
            for (int j = 0; j < n; j++) {
                a[j] = sc.nextInt();
            }
            for (int j = 0; j < m; j++) {
                b[j] = sc.nextInt();
            }
            System.out.println(twoStacks(maxSum, a, b));
        }
    }
}
