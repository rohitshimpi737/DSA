package com.Rohit.Stacks.InfixPefixPostfix;

import java.util.Stack;

public class PrefixToInfix {
    public static void main(String[] args) {
        String s = "-9/*+5346";
        Stack<String> val =new Stack<>();
        for (int i = s.length()-1; i >=0 ; i--) {
            char ch =s.charAt(i);
            int ascii=(int)ch;
            if(ascii>=48&&ascii<=57){
                String t=""+ch;
                val.push(t);
            }
            else{
                String v1=val.pop();
                String v2=val.pop();
                String op=""+ch;
                String t="("+v1+op+v2+")";
                val.push(t);
            }
        }
        System.out.println(val.peek());
    }
}
