package com.exception;

import java.util.Scanner;

public class Exception3{

	public static void main(String[] args) throws ArithmeticException{
		
		try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter number: ");
            String userInput = sc.nextLine();

            try {
                int number = Integer.parseInt(userInput);
                int result = 100 / number;
                System.out.println("Result: " + result);
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid integer.");
            } catch (ArithmeticException e) {
                System.out.println("Division by zero is not allowed.");
            }
        }
	}

}
  