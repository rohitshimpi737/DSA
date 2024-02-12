package com.Rohit.Stacks;

import java.util.Stack;
import java.util.Scanner;
public class MoveStackInOrder {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Stack<Integer> st= new Stack<>();
        st.push(10);
        st.push(2);
        st.push(3);
        st.push(11);
        System.out.println(st);
        Stack<Integer> rt= new Stack<>();
        while(st.size()>0){
            int x=st.peek();
            rt.push(x);
            st.pop();
        }
        Stack <Integer> gt=new Stack<>();
        while(rt.size()>0){
            int x=rt.peek();
            gt.push(x);
            rt.pop();
        }
        System.out.println(gt);
//        System.out.println("Enter the number of input ");
//        int n;
//        int element;
//        n = sc.nextInt();
//        while(n>0) {
//            System.out.println("Enter the element ");
//            element = sc.nextInt();
//            st.push(element);
//            n--;
//        }
//        System.out.println(st);
    }
}
