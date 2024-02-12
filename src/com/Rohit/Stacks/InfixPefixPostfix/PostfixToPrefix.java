package com.Rohit.Stacks.InfixPefixPostfix;

import java.util.Stack;

public class PostfixToPrefix {
    public static void main(String[] args) {
        String s = "953+4*6/-";
        Stack<String> val =new Stack<>();
        for (int i = 0; i <s.length() ; i++) {
            char ch =s.charAt(i);
            int ascii=(int)ch;
            if(ascii>=48&&ascii<=57){
                String t=""+ch;
                val.push(t);
            }
            else{
                String v2=val.pop();
                String v1=val.pop();
                String op=""+ch;
                String t=op+v1+v2;
                val.push(t);
            }
        }
        System.out.println(val.peek());
    }
}
