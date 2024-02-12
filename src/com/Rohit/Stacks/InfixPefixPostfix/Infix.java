package com.Rohit.Stacks.InfixPefixPostfix;
import java.util.*;
public class Infix {

    public static void main(String[] args) {
      String s = "9-5+3*4/6";
        Stack <Integer> val= new Stack<>();
        Stack <Character> op= new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch= s.charAt(i);
            int ascii=(int)ch;
            if(ascii>=48 &&ascii<=57) val.push(ascii-48);
            else if (op.size()==0) op.push(ch);

            else{

               if(ch=='+'||ch=='-'){
                   int val2=val.pop();
                   int val1=val.pop();
                   if(op.peek()=='+') val.push(val1+val2);
                   if(op.peek()=='-') val.push(val1-val2);
                   if(op.peek()=='*') val.push(val1*val2);
                   if(op.peek()=='/') val.push(val1/val2);
                   op.pop();
                   op.push(ch);
               }
               else  if(ch=='*'||ch=='/') {
                     if (op.peek() == '*' || op.peek() == '/') {
                        int val2 = val.pop();
                        int val1 = val.pop();
                        if(op.peek()=='*') val.push(val1*val2);
                        if(op.peek()=='/') val.push(val1/val2);
                        op.pop();
                        op.push(ch);
                    }
                    else op.push(ch);
                }
            }
//            System.out.println(val);
        }

        while(val.size()>1){
            int val2 = val.pop();
            int val1 = val.pop();
            if(op.peek()=='+') val.push(val1+val2);
            if(op.peek()=='-') val.push(val1-val2);
            if(op.peek()=='*') val.push(val1*val2);
            if(op.peek()=='/') val.push(val1/val2);
            op.pop();
        }
        System.out.println(val.peek());
    }
}
