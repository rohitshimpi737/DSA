package com.Rohit.BackTracking;

public class RatInDeadMaze4Ways {
    public static void main(String[] args) {
        int rows=3;
        int cols=4;
        int [][] maze={ { 1,0,1,1},
                        { 1,1,1,1},
                        { 1,1,0,1} };
        boolean [][] isVisited= new boolean[rows][cols];
        maze4Ways(0,0,rows-1,cols-1,"",maze,isVisited);
    }

    private static void maze4Ways(int sr, int sc, int er, int ec, String s, int[][] maze,boolean[][] isVisited) {
        if(sr<0 || sc < 0) return;
        if(sr>er || sc>ec) return;
        if(isVisited[sr][sc]) return;
        if(sr==er && sc==ec){
            System.out.println(s);
            return;
        }
        if (maze[sr][sc]==0) return;
        isVisited[sr][sc]=true;
        // Right
        maze4Ways(sr, sc+1, er, ec, s+'R', maze, isVisited);
        // Down
        maze4Ways(sr+1, sc, er, ec, s+'D', maze,isVisited);
        // Left
        maze4Ways(sr, sc-1, er, ec, s+'L',maze, isVisited);
        // Up
        maze4Ways(sr-1, sc, er, ec, s+'U',maze, isVisited);
        isVisited[sr][sc]=false;
    }
}
