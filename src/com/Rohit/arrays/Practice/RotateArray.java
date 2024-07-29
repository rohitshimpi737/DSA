package com.Rohit.arrays.Practice;

public class RotateArray {
    public static void main(String[] args) {
        int[][]arr={
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {14,15,16,17}

        };

        /// bruteforce approach
int n= arr.length;
int m= arr[0].length;
        int [][]ans= new int [n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                ans[j][n-1-i]=arr[i][j];
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < m; j++) {
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
        for (int i = 0; i < n; i++) {

            for (int j = 0; j <m/2; j++) {

                int temp=arr[i][j];
                arr[i][j]=arr[i][m-1-j];
                arr[i][m-j-1]=temp;
            }
        }

        System.out.println();
        for ( var num:arr) {
            for (int n1:num) {
                System.out.print(n1+" ");
            }
            System.out.println();
        }
    }
}
