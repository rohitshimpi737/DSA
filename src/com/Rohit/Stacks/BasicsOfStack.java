package com.Rohit.Stacks;

import java.util.ArrayList;
import java.util.Stack;

public class BasicsOfStack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        System.out.println(st.isEmpty());
        st.push(12);
        st.push(1);
        st.push(9);
        st.push(0);
        st.push(56);
        st.pop();
        System.out.println(st.peek());
        System.out.println(st);
    }
}