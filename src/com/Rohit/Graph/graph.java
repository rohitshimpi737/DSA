package com.Rohit.Graph;

import java.util.ArrayList;

public class graph {
    static  class Edge{
        int src;
        int dest;
        int weight;
        public Edge(int s,int d,int w){
            this.src=s;
            this.dest=d;
            this.weight=w;
        }
    }
public static void createGraph(ArrayList<Edge> gh[]){
    for (int i = 0; i < gh.length ; i++) {
        gh[i] = new ArrayList<Edge>();

    }
        gh[0].add(new Edge(0,2,4));

        gh[1].add(new Edge(1,2,2));
        gh[1].add(new Edge(1,3,9));

        gh[2].add(new Edge(2,0,8));
        gh[2].add(new Edge(2,1,0));
        gh[2].add(new Edge(2,3,1));

        gh[3].add(new Edge(3,1,8));
        gh[3].add(new Edge(3,2,2));

}
    public static void main(String[] args) {
        int V=4;
        ArrayList<Edge> []gh =new ArrayList[V];
        createGraph(gh);
        for (int i = 0; i < gh[2].size(); i++) {
            Edge e=gh[2].get(i);
            System.out.println("("+e.src+ "----" +e.dest +")" +e.weight);
        }
    }
}
