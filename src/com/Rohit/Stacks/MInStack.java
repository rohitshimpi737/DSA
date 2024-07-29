package com.Rohit.Stacks;
import java.util.Stack;
public class MInStack {
        Stack<Integer> st = new Stack<>();
       private int min = 0;
        public void push(int val) {
            if (st.isEmpty()) {
                st.push(val);
                min = val;
            } else if (min <= val) {
                st.push(val);
            } else if (val < min) {
                st.push(2 * val - min);
                min = val;
            }
        }

        public void pop() {
            if (st.isEmpty()) return;
            else if (st.peek() > min) {
                st.pop();
            } else if (st.peek() < min) {
                min = 2 * min - st.peek();
                st.pop();
            }
        }

        public int peek() {
            if (st.isEmpty()) return -1;
            else if (st.peek() > min) {
                return st.peek();
            } else if (st.peek() <= min) {
                return min;
            }
            return -1;
        }
        public void display(){
            System.out.println(st);
        }

        public int getMin() {
            if (st.isEmpty()) return -1;
            return min;
        }
    public static void main(String[] args) {
     MInStack rt=new MInStack();
        rt.push(6);
        rt.push(5);
        rt.push(4);
        rt.push(3);
        rt.push(2);
        rt.push(1);
        rt.display();
        System.out.println(rt.getMin());
        rt.pop();
        System.out.println(rt.getMin());
        rt.pop();
        System.out.println(rt.getMin());
        rt.pop();
        System.out.println(rt.getMin());
        rt.pop();
        System.out.println(rt.getMin());
        rt.pop();
        System.out.println(rt.getMin());
    }

}
