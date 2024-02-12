package com.Rohit.BackTracking;

import java.util.ArrayList;

public class Permutation {
    public static void main(String[] args) {
        print("","abc");
        System.out.println();
        System.out.println(printf("","abc"));
    }

    private static void print(String p, String up) {
        if(up.isEmpty()){
            System.out.print(p+" ");
            return;
        }
        for (int i = 0; i < up.length(); i++) {
                char ch = up.charAt(i);
                String f= up.substring(0,i);
                String s=up.substring(i+1,up.length());
                print(p+ch,f+s);
        }
    }

    private static ArrayList<String> printf(String p, String up) {
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();
        for (int i = 0; i < up.length(); i++) {
            char ch = up.charAt(i);
            String f= up.substring(0,i);
            String s=up.substring(i+1,up.length());
            ans.addAll(printf(p+ch,f+s));
        }
        return ans;
    }
}
