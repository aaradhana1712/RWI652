package com.string;

public class Stringsplit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "apple,banana,orange";
        String[] fruits = str.split(",");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

	}

}
