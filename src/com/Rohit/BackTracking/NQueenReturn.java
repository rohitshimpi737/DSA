package com.Rohit.BackTracking;
import java.util.ArrayList;
import java.util.List;

public class NQueenReturn {
    public static void main(String[] args) {
        int n=4  ;
        char [][] board = new char [n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <n; j++) {
                board[i][j]='X';
            }
        }
        // Important Method that finds solution
        List<List<String>> ans = new ArrayList<>();
        nqueen(board,0,ans);
        for (var e:ans) {
            for (var p:e) {
                System.out.println(p);
            }
            System.out.println();
        }
    }

    private static void nqueen(char[][] board, int row ,List<List<String>> ans) {
        int n= board.length;
        if (n == row) {
            List<String> list = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                String st="";
                for (int j = 0; j <n ; j++) {
                    st+=board[i][j];
                }
                list.add(st);
            }
            ans.add(list);
            return;
        }
        for (int j = 0; j <n ; j++) { // work and call
            if (isSafe(board, row, j)) {
                board[row][j]='Q';// if the row,j places is safe so place the queen
                nqueen(board,row+1,ans);
                // this recursion call will find in next that where to pace queen
                board[row][j]='X'; // backtracking
            }
        }
    }
    private static boolean isSafe(char[][] board, int row, int col) {

        int n= board.length;
        // chech the row -> col
        for (int j = 0; j <n ; j++) {
            if(board[row][j]=='Q') return  false;
        }
        // Check col -> row
        for (int i = 0; i <n ; i++) {
            if(board[i][col]=='Q') return  false;
        }
        int i= row;
        int j= col;
        // North East
        while (i >=0 && j<n){
            if(board[i][j]=='Q') return  false;
            i--;
            j++;
        }
        i= row;
        j= col;
        // South East
        while (i <n && j<n){
            if(board[i][j]=='Q') return  false;
            i++;
            j++;
        }
        i= row;
        j= col;
        // South West
        while (i <n  && j>=0){
            if(board[i][j]=='Q') return  false;
            i++;
            j--;
        }
        i= row;
        j= col;
        // North West
        while (i >=0 && j>=0){
            if(board[i][j]=='Q') return  false;
            i--;
            j--;
        }

        return  true;
    }

    private  static  void diaplay (char [][] board){
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print( board[i][j] +" ");
            }
            System.out.println();
        }
    }

}
