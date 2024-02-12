package com.Rohit.String;

import java.util.ArrayList;
import  java.util.List;
public class PalindromicSubstrings {
    public static List<String> findAllPalindromicSubstrings(String str) {
        List<String> palindromes = new ArrayList<>();
        int n = str.length();

        for (int i = 0; i < n; i++) {
            // Odd-length palindromes with center at i
            expandPalindrome(str, palindromes, i, i);

            // Even-length palindromes with center between i and i+1
            expandPalindrome(str, palindromes, i, i + 1);
        }

        return palindromes;
    }

    private static void expandPalindrome(String str, List<String> palindromes, int left, int right) {
        while (left >= 0 && right < str.length() && str.charAt(left) == str.charAt(right)) {
            palindromes.add(str.substring(left, right + 1));
            left--;
            right++;
        }
    }
    public static void main(String[] args) {
        String s="111";
        System.out.println(findAllPalindromicSubstrings(s));
    }
}
