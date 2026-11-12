package com.tka;

public class ElectricityBill {
	

	    // Method to calculate electricity bill
	    void calculateBill(int units) {

	        double bill;

	        if (units <= 100) {
	            bill = units * 2;
	        }
	        else if (units <= 200) {
	            bill = units * 3;
	        }
	        else {
	            bill = units * 5;
	        }

	        System.out.println("Units Consumed: " + units);
	        System.out.println("Electricity Bill: Rs. " + bill);
	    }

	    public static void main(String[] args) {

	        // Creating object
	        ElectricityBill obj = new ElectricityBill();

	        // Calling method
	        obj.calculateBill(150);
	    }
	}


