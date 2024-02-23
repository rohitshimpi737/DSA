package com.Rohit.codeforces;

import java.util.Scanner;

public class TrickyTemplate {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0){
            t--;
            int n=sc.nextInt();
            String a= sc.next();
            String b= sc.next();
            String c= sc.next();
            int f=0;
            for (int i = 0; i < n; i++) {

                if(c.charAt(i)==b.charAt(i)|| c.charAt(i)==a.charAt(i)){
                   f++;
                }
            }
                if(f== n)System.out.println("NO");
                else System.out.println("YES");
        }
    }
}
