package com.Rohit.Stacks;

import javax.sound.midi.Soundbank;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Quetions {
    public static int[] removeConsecutiveSubSeq(int[]arr){
        Stack<Integer> st=new Stack<>();

        int s= arr.length;;
        for (int i = 0; i < arr.length ;i++) {

            if(st.size()==0 || st.peek()!=arr[i]){
                st.push(arr[i]);
            }
          else  if (arr[i] == st.peek()) {
                if(i==s-1||arr[i]!=arr[i+1]) {
                    st.pop();
                }
            }
        }
        System.out.println(st);
            int[] num=new int[st.size()];
            int i=st.size()-1;
            while (!st.isEmpty()){
                num[i]=st.pop();
                i--;
            }
        return num;
    }
    public static int countBalancedBracket(String S ){
        if(balancedBracket(S)) return 0;

        Stack<Character> st=new Stack<>();
        for (int i = 0; i <S.length() ; i++) {
            char ch=S.charAt(i);

            if(ch=='('){
                st.push(ch);
            }
            else {
                if(st.isEmpty() || st.peek()==')') st.push(ch);
                if(st.peek()=='(') st.pop();
            }
        }
        return st.size();
    }
    public static boolean balancedBracket(String S ){
        Stack<Character> st=new Stack<>();
        for (char ch:S.toCharArray()) {
           if(ch=='('){
               st.push(ch);
           }
           else {
               if(st.isEmpty()) return false;
               if(st.peek()=='(') st.pop();
           }
        }
        return st.isEmpty();
    }
    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter the string ");
//        String S;
//        S=sc.nextLine();
//        System.out.println(balancedBracket(S));
       // System.out.println(countBalancedBracket(S));
        int []arr={1,2,2,3,11,11,11,7,2,2,2};
        System.out.println(Arrays.toString(removeConsecutiveSubSeq(arr)));
    }
}
