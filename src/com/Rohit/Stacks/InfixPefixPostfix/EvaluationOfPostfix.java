package com.Rohit.Stacks.InfixPefixPostfix;

import java.util.Stack;

public class EvaluationOfPostfix {
    public static void main(String[] args) {
        String s = "953+4*6/-";
//        String s="5629-*5/+";
        Stack<Integer> val = new Stack<>();
        for (int i = 0; i < s.length();i++){
            char ch= s.charAt(i);
            if((int)ch >=48&& (int)ch <=57){
                val.push((int)ch -48);
            }
            else{
                int val2=val.pop();
                int val1=val.pop();
                if(ch=='+') val.push(val1 + val2);
                if(ch=='-') val.push(val1-val2);
                if(ch=='*') val.push(val1*val2);
                if (ch=='/') val.push(val1/val2);
            }
        }
        System.out.println(val.peek());
    }
}