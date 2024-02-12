package com.Rohit.Manipulation;

public class PositionRightMostSetBit {
    public static void main(String[] args) {
        int n=8;
        int ans =(int)((Math.log10(n & -n)) / Math.log10(2)) + 1;
        System.out.println(ans);
        System.out.println(PositionRightmostSetbit(n));
    }
  public   static int PositionRightmostSetbit(int n)
    {
        int position = 1;
        int m = 1;

        while ((n & m) == 0) {
            m = m << 1;
            position++;
        }
        return position;
    }
}
