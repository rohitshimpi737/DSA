package com.Rohit.Stacks.Practice;

import java.util.Stack;

public class PrefixTopost {
    public static String prefixToPost(String prefix) {
        Stack<String> val= new Stack<>();
        for (int i=prefix.length()-1;i>=0;i--) {
            char ch=prefix.charAt(i);
            if((int)ch >=48 && (int)ch <=57) val.push(ch+"");
            else {
                String val1=val.pop();
                String val2=val.pop();
                String t=val1+val2+ch;
                val.push(t);
            }
        }
        return val.peek();
    }
    public static void main(String[] args) {
        String s = "-9/*+5346";
        System.out.println(prefixToPost(s));
    }
}
