package com.Rohit.BackTracking;

public class Maze {
    public static void main(String[] args) {
        int rows=3;
        int cols=3;
        int count =  maze(1,1,rows,cols);
        System.out.println(count);
        mazePrint(1,1,rows,cols,"");
    }

    private static int maze(int sr, int sc, int er, int ec) {
        if(sr>er || sc>ec) return 0;
        if(sr==er && sc==ec) return 1;
        int downWays=maze(sr+1,sc,er,ec);
        int rightWats=maze(sr,sc+1,er,ec);
        int totalWays=downWays+rightWats;
        return totalWays;
    }

    private static void mazePrint(int sr, int sc, int er, int ec, String s) {
        if(sr>er || sc>ec) return ;

        if(sr==er && sc==ec) {
            System.out.println(s);
            return ;
        }
        mazePrint(sr+1,sc,er,ec ,s+'R');
        mazePrint(sr,sc+1,er,ec, s+'D');

    }
}
