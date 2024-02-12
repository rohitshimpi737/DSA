package com.Rohit.Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class GraphArrList {
    private ArrayList<ArrayList<Integer>> adjList;
   public GraphArrList( int vertices){
       adjList = new ArrayList<>(vertices);
       for (int i = 0; i < vertices; i++) {
           adjList.add(new ArrayList<>());
       }
    }

    public void addEdge(int src, int dest) {
        adjList.get(src).add(dest);
        adjList.get(dest).add(src); // If undirected graph
    }
    public void addVertex() {
        adjList.add(new ArrayList<>());
    }

    public void printGraph() {
        for (int i = 0; i < adjList.size(); i++) {
            System.out.print("Vertex " + i + " is connected to: ");
            for (Integer vertex : adjList.get(i)) {
                System.out.print(vertex + " ");
            }
            System.out.println();
        }
    }
    public  static  void bfs(GraphArrList graph , int V ){
        boolean [] isVisited= new boolean[V];
        Queue<Integer> qe= new LinkedList<>();
        qe.add(0);

        while (qe.size()>0){
            int curr= qe.poll();
            if(!isVisited[curr]){
                System.out.println(curr);
                isVisited[curr]=true;
                for (int i = 0; i < graph.adjList.get(curr).size() ; i++) {
                    qe.add(graph.adjList.get(curr).get(i));
                }
            }
        }
    }
    public static void main(String[] args) {
        int V = 5;
        GraphArrList graph = new GraphArrList(V);

        // Adding edges
        graph.addEdge(0, 1);
        graph.addEdge(0, 4);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 3);
        graph.addEdge(2, 4);
        // Printing the graph
//        graph.printGraph();
        bfs(graph,V);
    }

}
