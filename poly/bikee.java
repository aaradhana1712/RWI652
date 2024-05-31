package com.poly;

public class bikee {
	void run() {
		System.out.println("running");
	}
}
   class Splendor extends bikee{
	   void run() {
	   System.out.println("running sfely");
   
   }
   
	public static void main(String[] args) {
		bikee b = new Splendor();
		b.run();
		
		}
   }




