package com.Rohit.arrays;


import java.util.Arrays;

public class AllPossiblePairs {
    public static void main(String[] args) {
    int []arr={10,20,30,40,50};
        System.out.println(smallestDistancePair(arr,6));
    }
        public static int smallestDistancePair(int[] arr, int k) {
            Arrays.sort(arr);
            int n = arr.length;

            int left = 0, right = arr[n-1] - arr[0];

            while (left < right) {
                int mid = left + (right - left) / 2;
                if (countPairs(arr, mid) < k) {
                    left = mid + 1;
                } else {
                    right = mid;
                }
            }

            return left;
        }

        private static int countPairs(int[] arr, int mid) {
            int count = 0;
            int n = arr.length;
            int j = 0;

            for (int i = 0; i < n; i++) {
                while (j < n && arr[j] - arr[i] <= mid) {
                    j++;
                }
                count += (j - i - 1);
            }

            return count;
        }
    }
