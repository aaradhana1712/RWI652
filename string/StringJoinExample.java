package com.string;

import java.util.StringJoiner;

public class StringJoinExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  StringJoiner joiner = new StringJoiner(", ");
	        joiner.add("apple");
	        joiner.add("banana");
	        joiner.add("orange");
	        String result = joiner.toString();
	        System.out.println(result);

	}

}
