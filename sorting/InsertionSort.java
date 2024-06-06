package com.sorting;

public class InsertionSort {
	void insertionSort(int arr[]) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    // Method to print the array
    void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        InsertionSort ob = new InsertionSort();
        int arr[] = {12, 11, 13, 5, 6};
        System.out.println("Unsorted array:");
        ob.printArray(arr);

        ob.insertionSort(arr);

        System.out.println("Sorted array:");
        ob.printArray(arr);
    }
}
