package com.Rohit.Stacks;

import java.util.Stack;

public class InsertInStack {
    public static void main(String[] args) {
        Stack<Integer> st= new Stack<>();
        st.push(10);
        st.push(2);
        st.push(3);
        st.push(11);
        System.out.println(st);
        int index=5;
        int element=7;
        Stack<Integer> rt= new Stack<>();
        while(st.size()>index){
            rt.push(st.pop());
        }
        st.push((element));
        while(rt.size()>0){
            st.push(rt.pop());
        }
        System.out.println(st);
    }
}
