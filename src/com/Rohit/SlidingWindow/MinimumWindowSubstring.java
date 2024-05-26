package com.Rohit.SlidingWindow;

import java.util.HashMap;

public class MinimumWindowSubstring {

    public static String minimumSlidingSubstring(String s, String t){
        if (t.equals("")) return "";
        HashMap<Character,Integer> W = new HashMap<>();
        HashMap<Character,Integer> T = new HashMap<>();
        for ( char e:t.toCharArray()) {
            if (T.containsKey(e)){
                T.put(e, T.get(e)+1);
            }
            else {
                T.put(e, 1);
            }
        }
        int need=T.size();
        int have=0;
        int [] res= new int[2];
        int l=0;
        int r;
        int resLeng=Integer.MAX_VALUE;
        for ( r = 0; r <s.length(); r++) {
            char ch = s.charAt(r);
            if (W.containsKey(ch)) {
                W.put(ch, W.get(ch) + 1);
            } else {
                W.put(ch, 1);
            }
            if (W.containsKey(ch) && T.get(ch) == W.get(ch)) {
                have += 1;
            }
            while (have == need) {
                // Update Our result
                if (r - l + 1 < resLeng) {
                    res[0] = r;
                    res[1] = l;
                    resLeng = r - l + 1;
                }
                //Pop from the left of our window
                char curr = s.charAt(l);
                W.put(curr, W.get(curr) - 1);
                if (T.containsKey(curr) && W.get(curr) < T.get(curr)) {
                    have -= 1;
                }
                l++;
            }
        }
       l=res[1];
       r=res[0];
        return resLeng!=Integer.MAX_VALUE ? s.substring(l,r+1): "";
//        return  s.substring(l,r+1);
    }
    public static void main(String[] args) {
        String s="ADOBECODEBANC";
        String t="ABC";
        System.out.println(minimumSlidingSubstring(s,t));

    }
}
