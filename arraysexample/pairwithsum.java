package com.arraysexample;
	import java.util.HashMap;

	public class pairwithsum{
	    public static void findPair(int[] arr, int target) {
	        HashMap<Integer, Integer> map = new HashMap<>();

	        for (int num : arr) {
	            int complement = target - num;
	            if (map.containsKey(complement)) {
	                System.out.println("Pair found: (" + complement + ", " + num + ")");
	                return;
	            }
	            map.put(num, 1);
	        }

	        System.out.println("No pair found");
	    }

	    public static void main(String[] args) {
	        int[] arr = {2, 7, 11, 15};
	        int target = 9;
	        findPair(arr, target);
	    }
	}
	