package com.Rohit.arrays.Revision;

import java.util.Arrays;

public class TargetSum {
    public static void main(String[] args) {
        int arr []= {0,1,1};
        // System.out.println(sum_2(arr,7));
        //System.out.println(sum_3(arr));
        secondMax();
    }
    public  static int sum_2(int [] arr,int target ){
        Arrays.sort(arr);
        int ans=0;
        int s=0;
        int e=arr.length-1;
        while (s<e){
            int sum=arr[s]+arr[e];
            if(sum==target){
                ans++;
                s++;
                e--;
            }
            else if(sum>target){
                e--;
            }
            else {
                s++;
            }
        }
        return  ans;
    }

    public  static int sum_3(int []arr){
        Arrays.sort(arr);
        int n=arr.length;
        int count=0;

        for(int i=0;i<n;i++){
            int j=i+1;
            int k=n-1;
            int target=0;
            while(j<k){
                int sum=arr[i]+arr[j]+arr[k];

                if(sum==target){
                    count++;
                    while(j>k && arr[j]==arr[j+1]){
                        j++;
                    }
                    while(j>k && arr[k]==arr[k-1]){
                        k--;
                    }
                    j++;
                    k--;
                }
                else if (sum>target) {
                    k--;
                }
                else{
                    j++;
                }
            }
        }
        return count;
    }

    public static  void  secondMax(){
        int []arr={5,4,1,-6,2};
        int first=Integer.MIN_VALUE;
        int second=Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>first){
                second=first;
                first=arr[i];
            }
            else if (arr[i]>second && arr[i]<first) {
                second=arr[i];
            }
        }
        System.out.println(second);
    }
}
