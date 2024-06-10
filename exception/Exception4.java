package com.exception;

 class Exce extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	Exce(String message){
		super(message);
		
	}

}
public class Exception4 {
	public static void main (String[] args) {
		int age = 32;
		if(age<18) {
			throw new Exce("not eligible");
		}
		else {
			System.out.println("eligible");
		}
	}
}
