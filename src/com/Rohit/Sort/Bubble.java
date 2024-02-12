package com.Rohit.Sort;
import java.util.Arrays;

import static com.Rohit.arrays.Swap.swap;

public class Bubble {
    public static void main(String[] args) {
     int []arr={5,4,3,2,1};
     bubble(Arrays.copyOf(arr,2));
        System.out.println(Arrays.toString(arr));
    }
    public static void bubble(int []arr){

        int len= arr.length;
        for (int i = 0; i <len ; i++) {

            for (int j = 0; j < len-i-1; j++) {
                if (arr[j]<arr[j+1]) {
                    swap(arr,j,j+1);
                }
            }
        }
    }
}
