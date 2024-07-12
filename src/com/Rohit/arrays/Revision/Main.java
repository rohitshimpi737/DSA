package com.Rohit.arrays.Revision;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int [][]  arr= {
                {1,2,3},
                {2,3},
                {4,5,7}
        };

        int  [][] arr2 = new int [3][3];

        for(int i=0;i<arr2.length;i++){
            for(int j=0;j<arr2[i].length;j++){
                arr2[i][j]=sc.nextInt();
            }
        }

        for (int i = 0; i < arr2.length; i++) {
            for ( int num:arr2[i]) {
                System.out.print(num+ " ");
            }
            System.out.println();
        }



    }
}
