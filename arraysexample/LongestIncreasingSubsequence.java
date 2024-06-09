package com.arraysexample;
import java.util.Arrays;

public class LongestIncreasingSubsequence {
    public static int lengthOfLIS(int[] arr) {
        if (arr == null || arr.length == 0) {
            return 0;
        }

        // dp[i] represents the length of the longest increasing subsequence that ends with arr[i]
        int[] dp = new int[arr.length];
        Arrays.fill(dp, 1);  // Every element is an increasing subsequence of length 1 by itself

        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[i] > arr[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
        }

        // The length of the LIS is the maximum value in the dp array
        int maxLength = 0;
        for (int length : dp) {
            maxLength = Math.max(maxLength, length);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        int[] arr = {10, 9, 2, 5, 3, 7, 101, 18};
        System.out.println("Length of the Longest Increasing Subsequence is: " + lengthOfLIS(arr));
    }
}
