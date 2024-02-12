package com.Rohit.BinarySearch;

 public class MatrixNegativecount  {
     public static void main(String[] args) {
         int [][]M={  {4,3,2,-1},
                 {3,2,1,-1},
                 {1,1,-1,-2},
                 {-1,-1,-2,-3}};
         System.out.println(countNegative(M));
     }
     public static int countNegatives(int[][] grid) {

        int m=grid.length;
        int n=grid[0].length;
        int count=0;
         /* this used for distribute 2d array in sub 1d array */
         for (int[] ints : grid) {
             /* for each row it will check */
             int s = 0;
             int e = n - 1;
             while (s <= e) {
                 int mid = s + (e - s) / 2;
                 /* this will find first negative number index */
                 if (ints[mid] < 0) {
                     e = mid - 1;
                 } else {
                     s = mid + 1;
                 }
             }
             // here n is length of array in each row and s is calculated index of first negative element
             // ex array [1,1,-1,-2]
             //n=4 and s=2
             // so count n-s=2;
             count += n - s;
         }
        return count;
    }
     public static int countNegative(int[][] grid) {

         int m = grid.length, n = grid[0].length;
         int r = m - 1, c = 0, count = 0;
         while(r >= 0 && c < n) {
             if(grid[r][c] < 0) {
                 -- r;
                 count += n - c;
             }
             else
                 c ++;
         }
         return count;
     }
}
