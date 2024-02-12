package com.Rohit.Recursion.String;

import java.util.ArrayList;

public class SubSet {
    public static void main(String[] args) {
//        subset("","abc");
        ArrayList<String> l=subsetRet("","abc");
        System.out.println(l);
        System.out.println(subseqAsciiRet("","abc"));
    }

    public static void subset(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        subset(p+ch,up.substring(1));
        subset(p,up.substring(1));
    }

    public static ArrayList<String> subsetRet(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
       ArrayList<String> left= subsetRet(p+ch,up.substring(1));
       ArrayList<String > right = subsetRet(p,up.substring(1));
       left.addAll(right);
       return left;
    }

    static void subseqAscii(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        subseqAscii(p + ch, up.substring(1));
        subseqAscii(p, up.substring(1));
        subseqAscii(p + (ch+0), up.substring(1));
    }

    static ArrayList<String> subseqAsciiRet(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);
        ArrayList<String> first = subseqAsciiRet(p + ch, up.substring(1));
        ArrayList<String> second = subseqAsciiRet(p, up.substring(1));
        ArrayList<String> third = subseqAsciiRet(p + (ch+0), up.substring(1));

        first.addAll(second);
        first.addAll(third);
        return first;
    }
}
