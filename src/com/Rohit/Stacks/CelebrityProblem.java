package com.Rohit.Stacks;

import java.util.Stack;

public class CelebrityProblem {
    public static int cebebrity1(int M[][], int n){
        int i=0;
        int j=n-1;
        while (i<j){
            if (M[j][i]==1){ // j knows i
                j--;
            }
            else{  // j doesnt know i so i cant be celebrity
                i++;
            }
        }
        int candidate=i;

        for (i = 0; i < n; i++) {
            if(candidate!=i) {
                if (M[candidate][i] == 1 || M[i][candidate] == 0) {
                    return -1;
                }
            }
        }
        return candidate;
    }

    public static int celebrity(int M[][], int n){
        Stack<Integer> st=new Stack<>();
        for (int i = 0; i <n ; i++) {
            st.push(i);
        }
        while (st.size()>1){
            int v1=st.pop();
            int v2=st.pop();
            if(M[v1][v2]==0) st.push(v1);
            else if (M[v2][v1]==0) st.push(v2);
        }
        if(st.isEmpty()) return -1;

        int potential=st.pop();

        for (int i = 0; i < n; i++) {
            if(potential!=i) {
                if (M[potential][i] == 1 || M[i][potential] == 0) {
                    return -1;
                }
            }
        }
        return potential;
    }

    public static void main(String[] args) {
//int [][]M={
//        {0,1,0},
//        {0,0,0},
//        {0,1,0}
//};
        int [][]M={ { 0, 0, 1, 0 },
                { 0, 0, 1, 0 },
                { 0, 0, 0, 0 },
                { 0, 0, 1, 0 } };

        System.out.println(celebrity(M,M.length));
        System.out.println(cebebrity1(M,M.length));

    }
}