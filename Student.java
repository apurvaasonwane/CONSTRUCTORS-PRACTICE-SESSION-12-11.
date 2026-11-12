package com.tka;

public class Student {
	
	int rollNo;
    String name;
    double marks;

    // Parameterized Constructor
    Student(int rollNo, String name, double marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    // Method to display student details
    void display() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
        System.out.println("--------------------");
    }

    public static void main(String[] args) {

        // Creating three student objects
    	Student s1 = new Student(101, "Apurva", 85.5);
    	Student s2 = new Student(102, "Akanksha", 90.0);
    	Student s3 = new Student(103, "Priya", 78.5);

        // Displaying student details
        s1.display();
        s2.display();
        s3.display();
    }
}


