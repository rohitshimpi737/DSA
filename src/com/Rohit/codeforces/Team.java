package com.Rohit.codeforces;

import java.util.Scanner;

public class Team {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int p=sc.nextInt();
        int [][]opinion= new int[p][3];
        int count=0;
        for (int i = 0; i < p; i++) {
            int total=0;
            for (int j = 0; j <3 ; j++) {
                opinion[i][j]=sc.nextInt();
                if(opinion[i][j]==1){
                    total++;
                }
            }
            if(total>=2) count++;

        }
        System.out.println(count);

    }
}
