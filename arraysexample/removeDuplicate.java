package com.arraysexample;

import java.util.Arrays;

public class removeDuplicate {
	public static int removeDuplicates(int[] arr) {
        if (arr == null || arr.length == 0) {
            return 0;
        }

        int j = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[j]) {
                j++;
                arr[j] = arr[i];
            }
        }
        return j + 1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 3, 3};
        int length = removeDuplicates(arr);
        int[] newArr = Arrays.copyOf(arr, length);
        System.out.println(Arrays.toString(newArr));
    }

}
