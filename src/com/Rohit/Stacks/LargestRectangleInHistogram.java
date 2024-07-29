package com.Rohit.Stacks;
import java.util.Stack;
public class LargestRectangleInHistogram {
    public static int largestRectangleArea(int[] heights) {
        int n = heights.length;
        Stack<Integer> st = new Stack<>();
        int[] nse = new int[n];
        int[] pse = new int[n];
        //calculate nse
        st.push(n - 1);
        nse[n - 1] = n;
        for (int i = n - 2; i >= 0; i--) {
            while (st.size() > 0 && heights[st.peek()] >= heights[i]) {
                st.pop();
            }
            if (st.size() == 0) nse[i] = n;
            else nse[i] = st.peek();
            st.push(i);
        }
        // emptying stack
        while (st.size() > 0) st.pop();
        //calculate
        st.push(0);
        pse[0] = -1;
        for (int i = 1; i < n; i++) {
            while (st.size() > 0 && heights[st.peek()] >= heights[i]) {
                st.pop();
            }
            if (st.size() == 0) pse[i] = -1;
            else pse[i] = st.peek();
            st.push(i);
        }

        //maxarea of rectangle
        int max = -1;
        for (int i = 0; i < n; i++) {
            int area = heights[i] * (nse[i] - pse[i] - 1);
            System.out.println(area);
            max = Math.max(max, area);
        }
        return max;
    }
    public static void main(String[] args) {
        int[] heights = {5,2,4,6,3,5};
        int ans = largestRectangleArea(heights);
        System.out.println(ans);
    }
}
