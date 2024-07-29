package com.Rohit;

import java.util.Stack;

public class Questions {
    public static boolean balanceBracket(String s){
        Stack<Character> st= new Stack<>();
        for (char ch:s.toCharArray()) {
            if (st.isEmpty() && ch==')'){
                return false;
            }
            if( ch=='('){
                st.push(ch);
            }
            else {
                st.pop();
            }
        }
        return st.isEmpty();
    }
    public static boolean balanceBracket2(String s){
        Stack<Character> st= new Stack<>();
        for (char ch:s.toCharArray()) {
            if (st.isEmpty()){
                st.push(ch);
            }
           else if(   ( st.peek()=='(' && ch==')')
                    ||( st.peek()=='{' && ch=='}')
                    ||( st.peek()=='[' && ch==']'))
            {
                st.pop();
            }
            else {
                st.push(ch);
            }
        }
        return st.isEmpty();
    }
    public static void main(String[] args) {
        String s="{()}[](][)";
        System.out.println(balanceBracket2(s));
    }
}
