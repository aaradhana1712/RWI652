package com.arr;
import java.util.*;

public class ArrayExample1 {
 
 
 public static void main(String[] args) {
  // TODO Auto-generated method stub
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] a = new int[n];
    for(int i = 0; i<n; i++) {
    	a[i] = sc.nextInt();
    	
    }
    for(int i=0;i<n;i++) {
    	System.out.println(a[i]);    }
 }
}

