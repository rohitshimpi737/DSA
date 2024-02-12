package com.Rohit.BackTracking;

public class NQueen {
    public static void main(String[] args) {
        int n=4  ;
        char [][] board = new char [n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <n; j++) {
                    board[i][j]='.';
            }
        }
        // Important Method that finds solution
        nqueen(board,0);
    }

    private static void nqueen(char[][] board, int row) {
        int n= board.length;
        // This below is base case if all rows travers
        //  means we are at end of matrix means all queens are placed
        // successfully
        if (n == row) {
            diaplay(board);
            System.out.println();
            return;
        }
        for (int j = 0; j <n ; j++) { // work and call
            if (isSafe(board, row, j)) {
                board[row][j]='Q';// if the row,j places is safe so place the queen
                nqueen(board,row+1);
                // this recursion call will find in next that where to pace queen
                board[row][j]='.'; // backtracking
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
