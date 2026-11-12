package com.tka;

public class NumberAnalyzer {
	
	

	    // Method to check Even or Odd
	    void checkEvenOdd(int number) {
	        if (number % 2 == 0) {
	            System.out.println(number + " is Even");
	        } else {
	            System.out.println(number + " is Odd");
	        }
	    }

	    // Method to check Positive or Negative
	    void checkPositiveNegative(int number) {
	        if (number > 0) {
	            System.out.println(number + " is Positive");
	        } else if (number < 0) {
	            System.out.println(number + " is Negative");
	        } else {
	            System.out.println("Number is Zero");
	        }
	    }

	    // Method to check Divisible by 5
	    void checkDivisibleBy5(int number) {
	        if (number % 5 == 0) {
	            System.out.println(number + " is Divisible by 5");
	        } else {
	            System.out.println(number + " is Not Divisible by 5");
	        }
	    }

	    // Method to check Greater Number
	    void checkGreater(int a, int b) {
	        if (a > b) {
	            System.out.println(a + " is Greater");
	        } else if (b > a) {
	            System.out.println(b + " is Greater");
	        } else {
	            System.out.println("Both numbers are Equal");
	        }
	    }

	    public static void main(String[] args) {

	        // Creating object
	        NumberAnalyzer obj = new NumberAnalyzer();

	        // Calling all methods
	        obj.checkEvenOdd(10);
	        obj.checkPositiveNegative(-5);
	        obj.checkDivisibleBy5(25);
	        obj.checkGreater(20, 15);
	    }
	}


