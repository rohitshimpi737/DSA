package com.Rohit.codeforces;
import java.util.HashSet;
import java.util.Scanner;
public class ABoyOrGirl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        HashSet<Character> set = new HashSet<>();
        int count=0;
        for (int i = 0; i <s.length() ; i++) {
            if(set.add(s.charAt(i))){
                count++;
            }
        }
        if(count%2==0)
        {
            System.out.println("CHAT WITH HER!");
        }
        else {
            System.out.println("IGNORE HIM!");
        }
    }
}
