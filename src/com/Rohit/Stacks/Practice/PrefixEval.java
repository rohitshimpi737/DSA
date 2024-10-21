package com.Rohit.Stacks.Practice;

import java.util.Stack;

public class PrefixEval {
    public  static  int prefixEval(String prefix){
        Stack<Integer> val = new Stack<>();

        for (int i=prefix.length()-1;i>=0;i--) {
            char ch=prefix.charAt(i);
            int ascii=(int)ch;

            if (ascii>=48 && ascii<= 57){
                val.push(ch-48);
            }else {
                int val1=val.pop();
                int val2=val.pop();
                if(ch=='+')val.push(val1+val2);
                if(ch=='-')val.push(val1-val2);
                if(ch=='*')val.push(val1*val2);
                if(ch=='/')val.push(val1/val2);
            }
        }
        return val.peek();
    }
    public static void main(String[] args) {
        String s = "-9/*+5346";
        System.out.println(prefixEval(s));
    }

}
