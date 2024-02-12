package com.Rohit.Queue;
import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
        Queue<Integer> q1=new ArrayDeque<>();

        q1.add(2);
        q1.add(100);
        q1.remove();
        q1.add(88);
        System.out.println(q1);
    }
}
