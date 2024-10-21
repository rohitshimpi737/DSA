package com.Rohit.Stacks.Practice;

import java.util.Stack;

public class PostfixEval {
    public  static  int prefixEval(String postfix){
        Stack<Integer> val = new Stack<>();

        for (char ch:postfix.toCharArray()) {
            int ascii=(int)ch;
            if (ascii>=48 && ascii<= 57){
                val.push(ch-48);
            }else {
                int val2=val.pop();
                int val1=val.pop();
                if(ch=='+')val.push(val1+val2);
                if(ch=='-')val.push(val1-val2);
                if(ch=='*')val.push(val1*val2);
                if(ch=='/')val.push(val1/val2);
            }
        }
        return val.peek();
    }
    public static void main(String[] args) {
        String s = "953+4*6/-";
        System.out.println(prefixEval(s));
    }
}
