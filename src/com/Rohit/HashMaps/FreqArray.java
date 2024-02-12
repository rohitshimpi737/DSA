package com.Rohit.HashMaps;

import java.util.HashMap;

public class FreqArray {
    public static void main (String []args){
        int arr[] = {1,6,2,1,4,1};

        HashMap <Integer,Integer> map =  new HashMap<>();
         for( var e:arr){
             if(map.containsKey(e)){
                 map.put(e,map.get(e)+1);
             }
             else {
                 map.put(e,1);
             }
         }
         int maxFr= Integer.MIN_VALUE;int ansKey=-1;
        System.out.println(map);
        for (var e: map.entrySet()){
            if(e.getValue()>maxFr){
                maxFr=e.getValue();
                ansKey=e.getKey();
            }
        }
        System.out.println(maxFr);
        System.out.println(ansKey);
        maxFr=0;
        ansKey=-1;
        for (var e: map.keySet()){
            if(map.get(e)>maxFr){
                maxFr=map.get(e);
                ansKey=e;
            }
        }
        System.out.println(maxFr);
        System.out.println(ansKey);
    }
}
