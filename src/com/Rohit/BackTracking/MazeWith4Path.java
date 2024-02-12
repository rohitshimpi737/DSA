package com.Rohit.BackTracking;

public class MazeWith4Path {
    public static void main(String[] args) {
        int rows=3;
        int cols=2;
     boolean [][] isVisited= new boolean[rows][cols];
        maze4Ways(0,0,rows-1,cols-1,"",isVisited);
    }
    public static void maze4Ways(int sr, int sc , int er , int ec, String s, boolean[][] isVisited){
        if(sr<0 || sc <0) return;
        if(sr>er || sc>ec) return ;
        if(isVisited[sr][sc]) return;
        if(sr==er && sc==ec) {
            System.out.println(s);
            return ;
        }

        // Current row and column is visited do mark it as true
        isVisited[sr][sc]=true;
        // Right
        maze4Ways(sr, sc+1, er, ec, s+'R', isVisited);
        // Down
        maze4Ways(sr+1, sc, er, ec, s+'D', isVisited);
        // Left
        maze4Ways(sr, sc-1, er, ec, s+'L', isVisited);
        // Up
        maze4Ways(sr-1, sc, er, ec, s+'U', isVisited);

        //Now BackTracking comes in Picture
        // Now we have got the one path
        // so while returning it make its Places unmarked  or false
        isVisited[sr][sc]=false;
    }
}
