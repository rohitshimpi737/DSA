package com.Rohit.Recursion;

import java.util.ArrayList;

public class PhonePad {
    public static void main(String[] args) {
        String s="12";
      //  pad("",s);
        ArrayList<String> ans= padReturn("",s);
        System.out.println(ans);
        System.out.println(padCount("",s));
    }

    public static void pad(String p,String up) {
        if (up.isEmpty()){
            System.out.print(p+" ");
            return;
        }
        char ch=up.charAt(0);
        int digit=(int)ch-'0';
        int range=(digit-1)*3;

        for (int i = range; i < digit*3; i++) {
            char ans= (char) (i+'a');
            pad(p+ans,up.substring(1));
        }
    }

    public static ArrayList<String> padReturn(String p,String up) {
        if (up.isEmpty()){
            ArrayList<String> ans = new ArrayList<>();
            ans.add(p);
            return ans;
        }
        char ch=up.charAt(0);
        int digit=(int)ch-'0';
        int range=(digit-1)*3;
        ArrayList<String> list = new ArrayList<>();
        for (int i = range; i < digit*3; i++) {
            char ans= (char) (i+'a');
            list.addAll(padReturn(p+ans,up.substring(1)));
        }
        return list;
    }

    public static int padCount(String p,String up) {
        if (up.isEmpty()){
            return 1;
        }
        char ch=up.charAt(0);
        int digit=(int)ch-'0';
        int range=(digit-1)*3;
        int count=0;
        for (int i = range; i < digit*3; i++) {
            char ans= (char) (i+'a');
            count = count + padCount(p + ans, up.substring(1));
        }
        return  count;
    }
}
