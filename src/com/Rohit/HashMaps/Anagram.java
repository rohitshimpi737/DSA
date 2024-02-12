package com.Rohit.HashMaps;

import java.util.HashMap;

public class Anagram {
    public static void main(String[] args) {
        String a="listep";
        String b= "silent";
        boolean ans =true;
        HashMap<Character,Integer> mp= new HashMap<>();
        if(a.length()!=b.length()){
            System.out.println(false);
        }
        for (int i = 0; i < a.length(); i++) {
            if (mp.containsKey(a.charAt(i))) {
                mp.put(a.charAt(i), mp.get(a.charAt(i)) + 1);
            } else {
                mp.put(a.charAt(i), 1);
            }
        }
        for (int i = 0; i < b.length(); i++) {
            if(mp.containsKey(b.charAt(i))) {
                mp.put(b.charAt(i), mp.get(b.charAt(i)) - 1);
            }
            else {
                mp.put(b.charAt(i), 1);
            }


        }
        for(var e: mp.entrySet()){
            if(e.getValue()!=0){
                ans=false;
            }
        }
        System.out.println(ans);
    }
}
