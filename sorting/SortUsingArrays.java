package com.sorting;

import java.util.Arrays;

public  class SortUsingArrays {
	public static void main(String[] args) {
        int arr[] = {64, 34, 25, 12, 22, 11, 90};
        System.out.println("Unsorted array:");
        System.out.println(Arrays.toString(arr));
        
        Arrays.sort(arr);
        
        System.out.println("Sorted array:");
        System.out.println(Arrays.toString(arr));
    }
}
