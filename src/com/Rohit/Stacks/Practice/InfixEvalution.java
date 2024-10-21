package com.Rohit.Stacks.Practice;

import java.util.Stack;

public class InfixEvalution {
    public static int infixEvaluation(String infix){
        Stack<Integer> val= new Stack<>();
        Stack<Character> op= new Stack<>();
        for (char ch: infix.toCharArray()) {
            if ((int) ch >= 48 && (int) ch <= 57) val.push((int) ch - 48);
            else if (op.isEmpty() || ch == '(' || op.peek()=='(') {
                op.push(ch);
            } else if (ch == ')') {
                while (op.peek() != '(') {
                    int val2 = val.pop();
                    int val1 = val.pop();
                    if (op.peek() == '+') val.push(val1 + val2);
                    if (op.peek() == '-') val.push(val1 - val2);
                    if (op.peek() == '*') val.push(val1 * val2);
                    if (op.peek() == '/') val.push(val1 / val2);
                    op.pop();
                }
                op.pop();
            } else {
                if (ch == '+' || ch == '-') {
                    int val2 = val.pop();
                    int val1 = val.pop();
                    if (op.peek() == '+') val.push(val1 + val2);
                    if (op.peek() == '-') val.push(val1 - val2);
                    if (op.peek() == '*') val.push(val1 * val2);
                    if (op.peek() == '/') val.push(val1 / val2);
                    op.pop();
                    op.push(ch);
                } else if (ch == '*' || ch == '/') {
                    if (op.peek() == '*' || op.peek() == '/') {
                        int val2 = val.pop();
                        int val1 = val.pop();
                        if (op.peek() == '*') val.push(val1 * val2);
                        if (op.peek() == '/') val.push(val1 / val2);
                        op.pop();
                        op.push(ch);
                    } else op.push(ch);
                }
            }
        }
        while (val.size() > 1) {
            int val2 = val.pop();
            int val1 = val.pop();
            if (op.peek() == '+') val.push(val1 + val2);
            if (op.peek() == '-') val.push(val1 - val2);
            if (op.peek() == '*') val.push(val1 * val2);
            if (op.peek() == '/') val.push(val1 / val2);
            op.pop();
        }
        return val.peek();
    }
    public static void main(String[] args) {
//        String s="9-5+3*4/6";
        String s="(9-(((5+3)*4)/6))";
        System.out.println(infixEvaluation(s));
    }
}
