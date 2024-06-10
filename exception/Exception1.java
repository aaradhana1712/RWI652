package com.exception;

public class Exception1 extends Exception {
   public static void main(String[] args ) {
	   int a[] = new int[5];
	   try {
	   a[0] = 2;
	   a[1] = 3;
	   a[2] = 4;
	   a[3] = 5;
	   a[4] = 6;
	   a[5] = 7;
	   a[6] = 8;
	   }catch(Exception e) {
		   e.printStackTrace();
	   }
	   for(int i=0; i<a.length;i++) {
		   System.out.println(a[i]);
	   }
   }
}
