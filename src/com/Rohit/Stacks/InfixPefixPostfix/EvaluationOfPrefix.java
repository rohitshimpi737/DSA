package com.Rohit.Stacks.InfixPefixPostfix;

import java.util.Stack;

public class EvaluationOfPrefix {
    public static void main(String[] args) {
        String s = "-9/*+5346";
        Stack<Integer> val = new Stack<>();
        for (int i = s.length()-1; i >= 0;i--){
            char ch= s.charAt(i);
            int ascii=(int)ch;
            if(ascii>=48&&ascii<=57){
                val.push(ascii-48);
            }
            else{
                int val1=val.pop();
                int val2=val.pop();
                if(ch=='+') val.push(val1 + val2);
                if(ch=='-') val.push(val1-val2);
                if(ch=='*') val.push(val1*val2);
                if (ch=='/') val.push(val1/val2);
            }
        }
        System.out.println(val.peek());
    }
}
