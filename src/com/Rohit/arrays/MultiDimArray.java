package com.Rohit.arrays;



public class MultiDimArray {
    public static void printMulArray(int [][] arr){
        int n=arr[0].length;
        for (int[] ints : arr) {
            for (int j = 0; j < n; j++) {
                System.out.print(ints[j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int [][] a= {
                {2, 3, 4},
                {4, 6, 2},
                {9, 0, 11}
        };

        int m=a.length;
        int n=a[0].length;
        for (int i = 0; i<m; i++){
             for (int j = 0; j < n; j++) {
                 System.out.print(a[i][j]+" ");
             }
            System.out.println();

         }

        printMulArray(a);
    }
}
