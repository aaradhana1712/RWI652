package com.arraysexample;


	import java.util.ArrayList;
	import java.util.Arrays;
	import java.util.HashMap;
	import java.util.List;

	public class intersection {
	    public static int[] intersection(int[] arr1, int[] arr2) {
	        HashMap<Integer, Integer> map = new HashMap<>();
	        List<Integer> result = new ArrayList<>();

	        for (int num : arr1) {
	            map.put(num, map.getOrDefault(num, 0) + 1);
	        }

	        for (int num : arr2) {
	            if (map.containsKey(num) && map.get(num) > 0) {
	                result.add(num);
	                map.put(num, map.get(num) - 1);
	            }
	        }

	        return result.stream().mapToInt(i -> i).toArray();
	    }

	    public static void main(String[] args) {
	        int[] arr1 = {1, 2, 2, 1};
	        int[] arr2 = {2, 2};
	        int[] intersectionArray = intersection(arr1, arr2);
	        System.out.println(Arrays.toString(intersectionArray));
	    }
	}


