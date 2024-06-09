package com.arraysexample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubarraysWithGivenSum {
    public static List<int[]> findSubarrays(int[] arr, int sum) {
        List<int[]> result = new ArrayList<>();

        for (int start = 0; start < arr.length; start++) {
            int currentSum = 0;
            for (int end = start; end < arr.length; end++) {
                currentSum += arr[end];
                if (currentSum == sum) {
                    result.add(Arrays.copyOfRange(arr, start, end + 1));
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int sum = 9;
        List<int[]> subarrays = findSubarrays(arr, sum);
        for (int[] subarray : subarrays) {
            System.out.println(Arrays.toString(subarray));
        }
    }
}
