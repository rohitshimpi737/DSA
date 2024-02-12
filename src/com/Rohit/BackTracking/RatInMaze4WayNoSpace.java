package com.Rohit.BackTracking;

public class RatInMaze4WayNoSpace {
    public static void main(String[] args) {
        int rows=3;
        int cols=4;
        int [][] maze={ { 1,0,1,1},
                { 1,1,1,1},
                { 1,1,0,1} };
        maze4Ways(0,0,rows-1,cols-1,"",maze);
    }

    private static void maze4Ways(int sr, int sc, int er, int ec, String s, int[][] maze) {
        if(sr<0 || sc < 0) return;
        if(sr>er || sc>ec) return;
        if(maze[sr][sc]==-1) return;
        if(sr==er && sc==ec){
            System.out.println(s);
            return;
        }
        if (maze[sr][sc]==0) return;
        maze[sr][sc]=-1;
        // Right
        maze4Ways(sr, sc+1, er, ec, s+'R', maze);
        // Down
        maze4Ways(sr+1, sc, er, ec, s+'D', maze);
        // Left
        maze4Ways(sr, sc-1, er, ec, s+'L',maze);
        // Up
        maze4Ways(sr-1, sc, er, ec, s+'U',maze);

        maze[sr][sc]=1;
    }
}
