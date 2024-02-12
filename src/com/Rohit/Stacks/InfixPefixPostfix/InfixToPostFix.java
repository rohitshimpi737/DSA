package com.Rohit.Stacks.InfixPefixPostfix;

import java.util.Stack;

public class InfixToPostFix {
    public static void main(String[] args) {
//
//        String s = "9-(5+3)*4/6";
        String s = "(1-2)*(3+4-5*6)/7";
//        String s="5+6*(2-9)/5";
        Stack<String> val = new Stack<>();
        Stack<Character> op = new Stack<>();
        System.out.println(s);
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int ascii = (int) ch;
            if (ascii >= 48 && ascii <= 57)
            {
                String t=""+ch;
                val.push(t);
            }
            else if (op.size() == 0 || ch == '(' || op.peek()=='(') {
                op.push(ch);
            } else if (ch == ')') {
                while (op.peek() != '(') {
                    String v2 = val.pop();
                    String v1 = val.pop();
                    String o= ""+op.pop();
                    String t=v1+v2+o;
                    val.push(t);
                }
                op.pop();
            }
            else {
                if (ch == '+' || ch == '-') {
                    String v2 = val.pop();
                    String v1 = val.pop();
                    String o= String.valueOf(op.pop());
                    String t=v1+v2+o;
                    val.push(t);
                    op.push(ch);
                }
                else if (ch == '*' || ch == '/') {
                    if (op.peek() == '*' || op.peek() == '/') {
                        String v2 = val.pop();
                        String v1 = val.pop();
                        String o= String.valueOf(op.pop());
                        String t=v1+v2+o;
                        val.push(t);
                        op.push(ch);
                    }
                    else op.push(ch);
                }
            }
        }

        while (val.size() > 1) {
            String v2 = val.pop();
            String v1 = val.pop();
            String o= String.valueOf(op.pop());
            String t=v1+v2+o;
            val.push(t);
        }
        String prefix=val.peek();
        System.out.println(prefix);
    }
}
