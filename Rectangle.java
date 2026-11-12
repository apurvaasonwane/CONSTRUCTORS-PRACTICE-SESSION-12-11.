package com.tka;

//Create a Rectangle class with length and breadth.

//Requirements:
//- Initialize values using a parameterized constructor.
//- Create an area() method to calculate the area.
//- Create a perimeter() method to calculate the perimeter.
//- Display both results.

public class Rectangle {
	
	int length;
    int breadth;

    // Parameterized Constructor
    Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    // Method to calculate area
    void area() {
        int a = length * breadth;
        System.out.println("Area of Rectangle: " + a);
    }

    // Method to calculate perimeter
    void perimeter() {
        int p = 2 * (length + breadth);
        System.out.println("Perimeter of Rectangle: " + p);
    }

    public static void main(String[] args) {

        // Creating object
    	Rectangle r1 = new Rectangle(20, 10);

        // Display results
        r1.area();
        r1.perimeter();
    }
}


