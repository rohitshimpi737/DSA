package com.Rohit.HashSet;
import java.util.HashSet;
public class MaxTable {
    public static void main(String[] args) {
        int []num={1,1};
       int max= maxNumOnTable(num);
        System.out.println(max);
    }

    public static int maxNumOnTable(int[] num) {
        HashSet<Integer> st=new HashSet<>();
        int max=0;
        for (int i=0;i<num.length;i++){
            if(st.contains(num[i])){
                st.remove(num[i]);

            }
            else {
                st.add(num[i]);
                max=Math.max(max,st.size());
            }
        }
        return max;
    }
}
