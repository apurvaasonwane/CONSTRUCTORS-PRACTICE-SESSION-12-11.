package com.tka;
import java.util.Scanner;

public class StudentGrade {
	 public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        // Accept student marks
	        System.out.print("Enter Student Marks: ");
	        int marks = sc.nextInt();

	        // Validate marks
	        if (marks < 0 || marks > 100) {
	            System.out.println("Invalid Marks! Enter marks between 0 and 100.");
	        }
	        else if (marks >= 90) {
	            System.out.println("Grade: A+");
	        }
	        else if (marks >= 80) {
	            System.out.println("Grade: A");
	        }
	        else if (marks >= 70) {
	            System.out.println("Grade: B");
	        }
	        else if (marks >= 60) {
	            System.out.println("Grade: C");
	        }
	        else if (marks >= 40) {
	            System.out.println("Grade: D");
	        }
	        else {
	            System.out.println("Grade: Fail");
	        }

	        sc.close();
	    }
	}
	


