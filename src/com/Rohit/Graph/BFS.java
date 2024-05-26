package com.Rohit.Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFS {
    static  class Edge {
        int src;
        int dest;

        public Edge(int s, int d) {
            this.src = s;
            this.dest = d;
        }
    }
    public static void createGraph(ArrayList<Edge> gh[]){
        for (int i = 0; i < gh.length ; i++) {
            gh[i] = new ArrayList<Edge>();

        }
        gh[0].add(new Edge(0,1));
        gh[0].add(new Edge(0,2));

        gh[1].add(new Edge(1,0));
        gh[1].add(new Edge(1,3));

        gh[2].add(new Edge(2,0));
        gh[2].add(new Edge(2,4));

        gh[3].add(new Edge(3,1));
        gh[3].add(new Edge(3,4));
        gh[3].add(new Edge(3,5));

        gh[4].add(new Edge(4,3));
        gh[4].add(new Edge(4,2));
        gh[4].add(new Edge(4,5));

        gh[5].add(new Edge(5,3));
        gh[5].add(new Edge(5,4));
        gh[5].add(new Edge(5,6));

        gh[6].add(new Edge(6,5));
        gh[6].add(new Edge(6,7));

        gh[7].add(new Edge(7,6));

    }
    public static void bfs(ArrayList<Edge> []gh,int V ,boolean [] visited,int start){
        Queue<Integer> qe= new LinkedList<>();

        qe.add(start);
        while (qe.size()>0){
            int curr=qe.remove();
            if(visited[curr] ==false){
                System.out.print(curr+" ");
                visited[curr]=true;
                for (int i = 0; i < gh[curr].size(); i++) {
                    Edge e=gh[curr].get(i);
                    qe.add(e.dest);
                }
            }
        }
    }
    public static void dsf(ArrayList<Edge> []gh ,boolean [] visited,int curr){
        System.out.print(curr+" ");
        visited[curr]=true;
            for (int i = 0; i < gh[curr].size(); i++) {
                Edge e=gh[curr].get(i);
                if(visited[e.dest]==false) {
                    dsf(gh, visited, e.dest);
                }
                }
    }

    private static void allpath(ArrayList<Edge>[] gh, boolean[] visited, int curr,int des) {
        allpath(gh,visited ,curr,des ,"");
    }
    public static void allpath(ArrayList<Edge> []gh ,boolean [] visited,int curr,int des ,String s){
         s=s+curr;
        if(curr==des){
            System.out.println(s);
            return;
        }
        visited[curr]=true;
        for (int i = 0; i < gh[curr].size(); i++) {
            Edge e=gh[curr].get(i);
            if(visited[e.dest]==false) {
                allpath(gh,visited,e.dest,des,s);
                visited[e.dest]=false;
            }
        }
    }
    public static void main(String[] args) {
        int V=8;
        ArrayList<Edge> []gh =new ArrayList[V];
        boolean [] visited= new boolean[V];
        boolean [] visited1= new boolean[V];
        createGraph(gh);
        bfs(gh,V,visited,0);
//        System.out.println();
//            allpath(gh,visited,1,7);
//
//        for (int i = 0; i < V; i++) {
//            if (visited[i]==false){
//                bfs(gh,V,visited,i);
//            }
//        }
//        System.out.println();
//        for (int i = 0; i < V; i++) {
//            if (visited1[i]==false){
//                dsf(gh,visited1,i);
//            }
//        }

//        for (int i = 0; i < gh[2].size(); i++) {
//            Edge e=gh[2].get(i);
//            System.out.println("("+e.src+ "----" +e.dest +")");
//        }

    }
}
