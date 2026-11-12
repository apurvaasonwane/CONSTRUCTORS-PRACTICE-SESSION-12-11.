package com.tka;

public class Employee {
	

	    // Method to calculate bonus
	    void calculateBonus(int salary, int experience) {

	        double bonus;

	        if (experience >= 5) {
	            bonus = salary * 0.20;
	        }
	        else if (experience >= 3) {
	            bonus = salary * 0.10;
	        }
	        else {
	            bonus = salary * 0.05;
	        }

	        double finalSalary = salary + bonus;

	        System.out.println("Basic Salary: Rs. " + salary);
	        System.out.println("Experience: " + experience + " years");
	        System.out.println("Bonus: Rs. " + bonus);
	        System.out.println("Final Salary: Rs. " + finalSalary);
	    }

	    public static void main(String[] args) {

	        // Creating object
	        Employee obj = new Employee();

	        // Calling method
	        obj.calculateBonus(30000, 5);
	    }
	}


