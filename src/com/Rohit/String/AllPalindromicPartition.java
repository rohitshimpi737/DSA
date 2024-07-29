package com.Rohit.String;

import java.util.ArrayList;

public class AllPalindromicPartition {
    public static void main(String[] args) {
        String s="madam";
        ArrayList<ArrayList<String>> ans= partition(s);
        for ( ArrayList<String> arrayList:ans) {
            System.out.println(arrayList);
        }
    }
    public static boolean isPalindrome(String str) {
        int s=0;
        int e=str.length()-1;
        while (s<e){
            if(str.charAt(s)!=str.charAt(e)){
                return false;
            }
            s++;
            e--;
        }
        return  true;
    }

    public static ArrayList<ArrayList<String>> partition(String s) {
        int n=s.length();
        int index=0;
        ArrayList<String> curr = new ArrayList<>();
        ArrayList<ArrayList<String>> res= new ArrayList<>();
        partition(s,curr,res,index);
        return  res;
    }
    public static void partition(String s, ArrayList<String> curr ,ArrayList<ArrayList<String>> res ,int index) {
        if(index==s.length()) {
            res.add(new ArrayList<>(curr));
            return;
        }
        String temp="";
        for (int i = index; i < s.length(); i++) {
            temp+=s.charAt(i);
            if (isPalindrome(temp)){
                curr.add(temp);
                partition(s,curr,res,i+1);
                curr.remove(curr.size()-1);
            }
        }
    }
}
