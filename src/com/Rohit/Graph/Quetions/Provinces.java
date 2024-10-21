package com.Rohit.Graph.Quetions;

import java.util.ArrayList;

public class Provinces {

    public static int  findCircleNum(int [][]adjMatrix){
        int V= adjMatrix.length;
        ArrayList<ArrayList<Integer>> arrayList = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            arrayList.add(new ArrayList<>());
        }

        for (int i = 0; i < V; i++) {
            for (int j = 0; j < V; j++) {
                if((adjMatrix[i][j]==1) && i!=j){
                    arrayList.get(i).add(j);
                    arrayList.get(j).add(i);
                }
            }
        }
        System.out.println(arrayList);

        int []vis = new int[V];
        int cnt=0;
        for (int i = 0; i < V; i++) {
            if(vis[i]==0){
                cnt++;
                dfs(i,arrayList,vis);
            }
        }
        return  cnt;
    }

    private static void dfs(int node, ArrayList<ArrayList<Integer>> arrayList, int[] vis) {
        vis[node]=1;
        for (var num :arrayList.get(node)){
            if(vis[num]==0) {
                dfs(num, arrayList, vis);
            }
        }
    }

    public static void main(String[] args) {
        // Initialize a 2D array (n x n) with default values (0s)
        int n=3;
        int[][] adjMatrix = new int[n][n];

        // Manually populate the 2D array (adjacency matrix)
        adjMatrix[0][0] = 1; // Node 0 to Node 0
        adjMatrix[0][1] = 0; // Node 0 to Node 1
        adjMatrix[0][2] = 1; // Node 0 to Node 2

        adjMatrix[1][0] = 0; // Node 1 to Node 0
        adjMatrix[1][1] = 1; // Node 1 to Node 1
        adjMatrix[1][2] = 0; // Node 1 to Node 2

        adjMatrix[2][0] = 1; // Node 2 to Node 0
        adjMatrix[2][1] = 0; // Node 2 to Node 1
        adjMatrix[2][2] = 1; // Node 2 to Node 2

        System.out.println(findCircleNum(adjMatrix));
    }
}
