package com.tka;
import java.util.Scanner;

public class TriangleChecker {
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Accept three sides
        System.out.print("Enter first side: ");
        int a = sc.nextInt();

        System.out.print("Enter second side: ");
        int b = sc.nextInt();

        System.out.print("Enter third side: ");
        int c = sc.nextInt();

        // Check valid triangle
        if (a <= 0 || b <= 0 || c <= 0 ||
            a + b <= c || a + c <= b || b + c <= a) {

            System.out.println("Invalid Triangle!");
        }
        else if (a == b && b == c) {

            System.out.println("Equilateral Triangle");
        }
        else if (a == b || b == c || a == c) {

            System.out.println("Isosceles Triangle");
        }
        else {

            System.out.println("Scalene Triangle");
        }

        sc.close();
    }
}


