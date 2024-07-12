package com.Rohit.arrays;

import java.util.Stack;

public class ReverseParentheses {
    public static void main(String[] args) {
        String s="(ed(et(oc))el)";
        System.out.println(reverseParentheses(s));
    }
    public static String reverseParentheses(String s) {
        int n=s.length();
        Stack<Integer> st=  new Stack<>();
        StringBuilder stringBuilder= new StringBuilder();

        for (char current:s.toCharArray()) {
            if(current=='('){
                st.push(stringBuilder.length());
            }
            else if (current==')') {
                int start =st.pop();
                reverse(stringBuilder,start,stringBuilder.length()-1);
            }
            else {
                stringBuilder.append(current);
            }
        }
        return  stringBuilder.toString();
    }
    public static void reverse( StringBuilder stringBuilder,int start,int end){
        while (start<end){
            char ch=stringBuilder.charAt(start);
            stringBuilder.setCharAt(start,stringBuilder.charAt(end));
            stringBuilder.setCharAt(end,ch);
            start++;
            end--;
        }
    }

}
