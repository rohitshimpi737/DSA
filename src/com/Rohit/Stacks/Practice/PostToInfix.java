package com.Rohit.Stacks.Practice;

import java.util.Stack;

public class PostToInfix {
    public static String postToInfix(String post) {
        Stack<String> val= new Stack<>();
        for (char ch:post.toCharArray()) {
            if((int)ch >=48 && (int)ch <=57) val.push(ch+"");
            else {
                String val2=val.pop();
                String val1=val.pop();
                String t="("+val1+ch+val2+")";
                val.push(t);
            }
        }
        return val.peek();
    }
    public static void main(String[] args) {
        String s = "953+4*6/-";
        System.out.println(postToInfix(s));
    }
}
