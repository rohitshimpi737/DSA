package com.Rohit.Sort;

import java.util.*;

public class countSOrt {
    public static void main(String[] args) {
        int [] arr={8,7,4,4,4,3,2,1};
        countSortMap(arr);
    }
    public static void countSort(int []arr){
        int max = Arrays.stream(arr).max().getAsInt();
        int []freq=new int[max+1];
        for (int i = 0; i <arr.length ; i++) {
            freq[arr[i]]+=1;
        }
        System.out.println(Arrays.toString(freq));
        int j=0;
        for (int i = 0; i <freq.length ; i++) {
            while (freq[i]>0){
                arr[j]=i;
                freq[i]--;
                j++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }


    public static void countSortMap(int []arr){
        int max = Arrays.stream(arr).max().getAsInt();

        HashMap<Integer,Integer> map= new HashMap<>();

        for (int i = 0; i <arr.length ; i++) {
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }
            else{
                map.put(arr[i],1);
            }
        }

        System.out.println(map);
        int j=0;
        for (int i=0;i<=max;i++){
            if(map.containsKey(i)){
                int size=map.get(i);
                while (size>0){
                    arr[j]=i;
                    j++;
                    size--;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
