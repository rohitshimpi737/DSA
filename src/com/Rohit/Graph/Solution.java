package com.Rohit.Graph;

import java.util.*;

class Solution {
    public List<Integer> findMinHeightTrees(int n, int[][] edges) {
        List<Integer> result = new ArrayList<>();

        if (n == 1) {
            result.add(0);
            return result;
        }

        List<Set<Integer>> adj = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            adj.add(new HashSet<>());
        }

        for (int[] e : edges) {
            adj.get(e[0]).add(e[1]);
            adj.get(e[1]).add(e[0]);
        }

        Queue<Integer> q = new LinkedList<>();

        for (int i = 0; i < adj.size(); i++) {
            if (adj.get(i).size() == 1) q.offer(i);
        }

        while (n > 2) {
            int len = q.size();
            n -= len;
            for (int i = 0; i < len; i++) {
                int node = q.poll();
                for (int a : adj.get(node)) {
                    adj.get(a).remove(Integer.valueOf(node));
                    if (adj.get(a).size() == 1) {
                        q.offer(a);
                    }
                }
            }
        }

        while (!q.isEmpty()) {
            result.add(q.poll());
        }

        return result;
    }

    public static void main(String[] args) {
        // Example usage:
        Solution solution = new Solution();
        int n = 6;
        int[][] edges = {{0, 3}, {1, 3}, {2, 3}, {4, 3}, {5, 4}};
        List<Integer> minHeightTrees = solution.findMinHeightTrees(n, edges);
        System.out.println("Minimum height trees: " + minHeightTrees);
    }
}

