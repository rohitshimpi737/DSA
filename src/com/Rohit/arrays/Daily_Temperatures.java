package com.Rohit.arrays;

import java.util.Arrays;
import java.util.Stack;

public class Daily_Temperatures {
    public static int[] dailyTemperatures(int[] temperatures) {
         Stack<Integer> stack = new Stack<>();
        int [] ans = new int[temperatures.length];

        for (int i=0; i < temperatures.length; i++) {
            while (!stack.empty() && temperatures[stack.peek()] < temperatures[i]) {
                int a = stack.pop();
                ans[a] = i-a;
            }
            stack.push(i);
        }
        return ans;
    }

    public static void main(String[] args) {
            int [] temperatures={73,74,75,71,69,72,76,73};
        System.out.println(Arrays.toString(dailyTemperatures(temperatures)));
    }
}
