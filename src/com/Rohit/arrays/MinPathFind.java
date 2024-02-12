package com.Rohit.arrays;

public class MinPathFind {
        public static  int minFallingPathSum(int[][] A) {
            if (A == null || A.length == 0 || A[0].length == 0)
                return 0;
            int m=A.length;
            int n=A[0].length;
            int [][]ans= new int[m][n];
            for(int i=0;i<n;i++){
                ans[0][i]=A[0][i];
            }

            for(int i=1;i<m;i++){
                for(int j=0;j<n;j++){
                    if(j==0){
                        ans[i][j]=Math.min(ans[i-1][j],ans[i-1][j+1]);
                    }
                    else if(j==n-1){
                        ans[i][j]=Math.min(ans[i-1][j-1],ans[i-1][j]);
                    }
                    else {
                        ans[i][j]=Math.min(ans[i-1][j],ans[i-1][j-1]);
                        ans[i][j]=Math.min(ans[i-1][j+1],ans[i][j]);
                    }

                    ans[i][j]+=A[i][j];
                }
            }
            int min=Integer.MAX_VALUE;
            for(int num:ans[m-1]){
                min=Math.min(min,num);
            }
            return min;
        }

    public static void main(String[] args) {
            int [][] arr={
                    { 2,1,3,6},
                    {6,5,4 ,3},
                    {7,8,9,2},
                    { 4,9,8,1}
            };
        System.out.println(minFallingPathSum(arr));
    }
    }
