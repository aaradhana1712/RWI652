package com.arr;

public class TestArray1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 1,2,3,4,5,1,23,4,78,78,6499};
		int max1, max2;
		max1=max2=a[0];
		for(int i=0;i<a.length;i++) {
		    if(a[i]>max1) {
		    	max2=max1;
		    	max1=a[i];
		    }
		    else if(a[i]>max2 && a[i]!=max1) {
		    	max2=a[i];
		    }
		}
         System.out.println(max2);
	}

}
