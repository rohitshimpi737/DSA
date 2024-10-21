package com.Rohit.Stacks.Practice;

import java.util.Stack;

public class PostToPrefix {
    public static String postToPrefix(String postfix) {
        Stack<String> val= new Stack<>();
        for (char ch:postfix.toCharArray()) {
            if((int)ch >=48 && (int)ch <=57) val.push(ch+"");
            else {
                String val1=val.pop();
                String val2=val.pop();
                String t=ch+val2+val1;
                val.push(t);
            }
        }
        return val.peek();
    }
    public static void main(String[] args) {
        String s = "953+4*6/-";
        System.out.println(postToPrefix(s));
    }
}
