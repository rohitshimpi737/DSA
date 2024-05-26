package com.Rohit.Graph;

import java.util.Iterator;
import java.util.LinkedList;

public class MaxGraph {
    public int V;
    public LinkedList<Integer> adj[];
    MaxGraph(int v){
        V=v;
        adj=new LinkedList[v];
        for(int i=0;i<v;i++){
            adj[i]= new LinkedList();
        }
    }
    void addEdge(int v,int u){
        adj[v].add(u);
    }
    public int maxDepth(int source){
        boolean []visited= new boolean[V];
        int depth=dfs(source,visited,0);
        return depth;
    }

    private int dfs(int v, boolean[] visited, int depth) {
    visited[v]=true;
    int maxDepth=depth;

        Iterator<Integer> it= adj[v].iterator();
        while (it.hasNext()) {
            int n = it.next();
            if (!visited[n]) {
                int childDepth = dfs(n, visited, depth + 1);
                maxDepth = Math.max(maxDepth, childDepth);
            }
        }
        return maxDepth;
    }
}