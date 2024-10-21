package com.Rohit.Stacks.Practice;

import java.util.Stack;

public class InfixToPostfix {
    public  static String infixToPostfix(String infix){
        Stack<String> val= new Stack<>();
        Stack <Character> op= new Stack<>();
        for (char ch:infix.toCharArray()) {
            if((int)ch >=48 && (int)ch <=57) val.push(ch+"");
            else if (op.isEmpty() || ch=='(' || op.peek()=='(') {
                op.push(ch);
            }
            else if(ch==')') {
                while (op.peek()!='('){
                    String  val2=val.pop();
                    String val1=val.pop();
                    String opr=op.pop()+"";
                    val.push(val1+val2+opr);
                }
                op.pop();
            }
            else {
                if(ch=='+'||ch=='-'){
                    String  val2=val.pop();
                    String val1=val.pop();
                    String opr=op.pop()+"";
                    val.push(val1+val2+opr);
                    op.push(ch);
                } else if (ch=='*'||ch=='/') {
                        if(op.peek()=='*'||op.peek()=='/'){
                        String  val2=val.pop();
                        String val1=val.pop();
                        String opr=op.pop()+"";
                        val.push(val1+val2+opr);
                        op.push(ch);
                    }
                    else {
                        op.push(ch);
                    }
                }
            }
        }
        while (!op.isEmpty()){
            String  val2=val.pop();
            String val1=val.pop();
            String opr=op.pop()+"";
            val.push(val1+val2+opr);
        }
        return val.peek();
    }
    public static void main(String[] args) {
        String s = "9-(5+3)*4/6";
        System.out.println(infixToPostfix(s));
    }
}
