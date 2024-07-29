package com.Rohit.Stacks;

import java.util.Stack;
public class DisplayStack {
    // user to display stack in top to bottom
    public static void pushAtIndexRec(Stack<Integer> nt,int index,int num ){
        if(nt.size()==index) {
           nt.push(num);
            return;
        }

        int top=nt.pop();
        pushAtIndexRec(nt,index,num);
        nt.push(top);
    }
    public static void pushAtBottomRec(Stack<Integer> nt,int num ){
        if(nt.size()==0) {
            nt.push(num);
            return;
        }
        int top=nt.pop();
        pushAtBottomRec(nt,num);
        nt.push(top);
    }
    public static void reverseRec(Stack<Integer> gt){
        if(gt.size()==0){
            return;
        }
        int top=gt.pop();
        reverseRec(gt);
        pushAtBottomRec(gt,top);
    }

    public static void displayRecurRev(Stack<Integer> nt ){
        if(nt.size()==0) return;

        int top=nt.pop();
        System.out.print(top+ " ");
        displayRecurRev(nt);
        nt.push(top);
    }
    // user to display stack in  bottom to top
    public static void displayRecur(Stack<Integer> nt ){
        if(nt.size()==0) return;
        int top=nt.pop();
        displayRecur(nt);
        System.out.print(top+ " ");
        nt.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> st= new Stack<>();
        st.push(4);
        st.push(3);
        st.push(2);
        st.push(1);
//        displayRecurRev(st);
//        System.out.println();
//        displayRecur(st);
//        System.out.println();
//        System.out.println(st);
//        pushAtBottomRec(st,100);
//        System.out.println(st);j
        reverseRec(st);
        System.out.println(st);
//        displayRec(st);
//        Stack<Integer> rt= new Stack<>();
//        while(st.size()>0){
//            rt.push(st.pop());
//        }
//        while(rt.size()>0){
//            System.out.print(rt.peek()+" ");
//            st.push(rt.pop());
//        }
//        int n=st.size();
//        int []arr=new int[n];
//        int i=n-1;
//        while(st.size()>0){
//         arr[i]=st.pop();
//         i--;
//        }
//        i=0;
//        System.out.println(st);
//        while(i<n) {
//            st.push(arr[i]);
//            System.out.print(arr[i]+" ");
//            i++;
//        }

    }
}
