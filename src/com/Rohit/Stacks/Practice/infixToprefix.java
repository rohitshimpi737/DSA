package com.Rohit.Stacks.Practice;

import java.util.Stack;

public class infixToprefix {
    public  static String infixToPrefix(String infix){
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
                    val.push(opr+val1+val2);
                }
                op.pop();
            }
            else {
                if(ch=='+'||ch=='-'){
                    String  val2=val.pop();
                    String val1=val.pop();
                    String opr=op.pop()+"";
                    val.push(opr+val1+val2);
                    op.push(ch);
                } else if (ch=='*'||ch=='/') {
                    if(op.peek()=='*'||op.peek()=='/'){
                        String  val2=val.pop();
                        String val1=val.pop();
                        String opr=op.pop()+"";
                        val.push(opr+val1+val2);
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
            val.push(opr+val1+val2);
        }
        return val.peek();
    }
    public static void main(String[] args) {
        String s = "9-(5+3)*4/6";
        System.out.println(infixToPrefix(s));
    }
}
