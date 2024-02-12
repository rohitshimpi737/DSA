package com.Rohit.StringBuffer;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Constructor 1
        // having default capacity 16 character
        StringBuffer sb= new StringBuffer();

        // Constructor 2
        StringBuffer sb2= new StringBuffer("Rohit Shimpi ");

        // Constructor 2
        StringBuffer sb3= new StringBuffer(30);
        System.out.println(sb3.capacity());

        sb.append("Hello World ");
        sb.append("Welcome");

        sb.replace(0,5,"Thanks");
        sb.delete(1, 5);
        String str = sb.toString();
        System.out.println(str);

        sb.insert(1,"hank");
        String str1 = sb.toString();
        System.out.println(str1);
        sb.reverse();
        System.out.println(sb);


        String arr = "Kunal,Apoorv,Rahul,Snehal";
        String[] names = arr.split(",");
        System.out.println(Arrays.toString(names));
    }
}
