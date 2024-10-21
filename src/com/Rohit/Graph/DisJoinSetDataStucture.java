package com.Rohit.Graph;

import java.util.ArrayList;
import java.util.List;

class DisJoinSet{
    List<Integer> rank = new ArrayList<>();
    List<Integer> size = new ArrayList<>();
    List<Integer> parent = new ArrayList<>() ;
    public  DisJoinSet(int n){
        for (int i = 0; i <=n ; i++) {
            rank.add(0);
            size.add(1);
            parent.add(i);
        }
    }
    public int findUParent(int node){
        if(node == parent.get(node)){
            return node;
        }
        int  up = findUParent(parent.get(node));
        parent.set(node,up);
        return up;
    }

    public  void unionByRank(int u ,int v){
        int pu =findUParent(u);
        int pv =findUParent(v);
        if (pu==pv) return;
        int  uRank = rank.get(pu);
        int  vRank = rank.get(pv);

        if (vRank <uRank){
            parent.set(pv ,pu);
        }
        else if(vRank >uRank){
            parent.set(pu ,pv);
        }
        else{
            parent.set(pv ,pu);
            int rankU =rank.get(pu);
            rank.set(pu,rankU+1);
        }
    }
    public  void unionBySize(int u ,int v){
        int pu =findUParent(u);
        int pv =findUParent(v);
        if (pu==pv) return;
        int  uSize = size.get(pu);
        int  vSize = size.get(pv);

        if (vSize <uSize){
            parent.set(pv ,pu);
            int sizeU =size.get(pu);
            int sizeV =size.get(pv);
            size.set(pu,sizeU+sizeV);
        }
        else{
            parent.set(pu ,pv);
            int sizeU =size.get(pu);
            int sizeV =size.get(pv);
            size.set(pv,sizeU+sizeV);
        }

    }
}

public class DisJoinSetDataStucture {
    public static void main(String[] args) {
//            DisJoinSet disJoinSet = new DisJoinSet(7);
//            disJoinSet.unionByRank(1,2);
//            disJoinSet.unionByRank(2,3);
//            disJoinSet.unionByRank(4,5);
//            disJoinSet.unionByRank(6,7);
//            disJoinSet.unionByRank(5,6);

            DisJoinSet disJoinSet1 = new DisJoinSet(7);
        disJoinSet1.unionBySize(1,2);
        disJoinSet1.unionBySize(2,3);
        disJoinSet1.unionBySize(4,5);
        disJoinSet1.unionBySize(6,7);
        disJoinSet1.unionBySize(5,6);

            // 3 and 7 same or not
            if (disJoinSet1.findUParent(3) == disJoinSet1.findUParent(7)){
                System.out.println("Same");
            }
            else {
                System.out.println("Not Same");
            }
        disJoinSet1.unionBySize(3,7);
        if (disJoinSet1.findUParent(3) == disJoinSet1.findUParent(7)){
            System.out.println("Same");
        }
        else {
            System.out.println("Not Same");
        }
    }
}
