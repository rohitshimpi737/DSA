package com.Rohit.String;

public class LongestPalindromicSubstrings {
    static String ans="";
    public static String findAllPalindromicSubstrings(String str) {
        int n = str.length();
        for (int i = 0; i < n; i++) {
            // Odd-length palindromes with center at i
            expandPalindrome(str,  i, i);
            // Even-length palindromes with center between i and i+1
            expandPalindrome(str,  i, i + 1);
        }

        return ans;
    }

    private static void expandPalindrome(String str, int left, int right) {
        while (left >= 0 && right < str.length() && str.charAt(left) == str.charAt(right)) {
            String curr=str.substring(left, right + 1);
            if(ans.length()<curr.length()) ans=curr;
            left--;
            right++;
        }
    }
    public static void main(String[] args) {
        String s="babad";
        System.out.println(findAllPalindromicSubstrings(s));
        System.out.println();
    }
}

 class Solution {
   static int max=Integer.MIN_VALUE;
    public static String longestPalindrome(String s) {
        int n = s.length();
        int []arr=new int[2];
        for (int i = 0; i < n; i++) {
            // Odd-length palindromes with center at i
            expandPalindrome(s,  i, i,arr);

            // Even-length palindromes with center between i and i+1
            expandPalindrome(s,  i, i + 1,arr);
        }

        return s.substring(arr[0],arr[1]+1);
    }
    private static void expandPalindrome(String str, int left, int right,int []arr) {
        while (left >= 0 && right < str.length() && str.charAt(left) == str.charAt(right)) {
            int dist=right-left;
            if(dist>max){
                arr[0]=left;
                arr[1]=right;
                max = dist;
            }
            left--;
            right++;
        }
    }
}

