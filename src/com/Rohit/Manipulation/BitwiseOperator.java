package com.Rohit.Manipulation;

public class BitwiseOperator {
    public static void main(String[] args) {
        int a=1;
        int b=6;
        System.out.println(a&b);
        System.out.println(a|b);
        System.out.println(a^b);
        System.out.println(~a);

        System.out.println("Left Shift");
        System.out.println(a<<2);
        System.out.println("Right Shift");
        System.out.println(b>>2);

    }
}
