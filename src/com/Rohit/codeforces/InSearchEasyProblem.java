package com.Rohit.codeforces;

import java.util.Scanner;

public class InSearchEasyProblem {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
            int []arr= new int [n];

            boolean flag =true;
        for (int i = 0; i <n ; i++) {
            arr[i]=sc.nextInt();
            if(arr[i]==1) flag =false;
        }
        if(flag) System.out.println("EASY");
        else System.out.println("HARD");
    }
}
