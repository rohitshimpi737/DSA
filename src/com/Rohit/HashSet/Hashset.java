package com.Rohit.HashSet;
import java.util.HashSet;

public class Hashset {
    public static void main(String[] args) {
        HashSet<String > st= new HashSet<>();
        st.add("James");
        st.add("Skot");
        st.add("James");
        System.out.println(st.contains("James"));
        System.out.println(st.size());
        st.remove("James");
        st.add("Rohit");
        for (var e:st ){
            System.out.println(e);
        }

    }
}
