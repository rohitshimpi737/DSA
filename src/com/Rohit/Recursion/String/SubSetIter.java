package com.Rohit.Recursion.String;

import java.util.ArrayList;
import java.util.List;

public class SubSetIter {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        List<List<Integer>> list = subSet(arr);
        for (var e : list) {
                System.out.print(e+" ");
        }
    }

    public static List<List<Integer>> subSet(int[] arr) {
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        for (int num : arr) {
            int n = outer.size();
            for (int i = 0; i < n; i++) {
                List<Integer> inner = new ArrayList<>(outer.get(i));
                inner.add(num);
                outer.add(inner);
            }
        }
        return outer;
    }
}
