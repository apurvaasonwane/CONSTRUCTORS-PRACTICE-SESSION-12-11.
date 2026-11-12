package com.tka;
import java.util.Scanner;
class ShoppingDiscount {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Accept shopping amount
        System.out.print("Enter Shopping Amount: Rs. ");
        double amount = sc.nextDouble();

        double discountPercentage;
        double discountAmount;

        // Calculate discount
        if (amount < 0) {
            System.out.println("Invalid Shopping Amount!");
        }
        else if (amount < 1000) {
            discountPercentage = 0;
            discountAmount = 0;

            display(amount, discountPercentage, discountAmount);
        }
        else if (amount < 5000) {
            discountPercentage = 5;
            discountAmount = amount * 0.05;

            display(amount, discountPercentage, discountAmount);
        }
        else if (amount < 10000) {
            discountPercentage = 10;
            discountAmount = amount * 0.10;

            display(amount, discountPercentage, discountAmount);
        }
        else {
            discountPercentage = 20;
            discountAmount = amount * 0.20;

            display(amount, discountPercentage, discountAmount);
        }

        sc.close();
    }

    // Method to display final bill
    static void display(double amount, double percentage, double discount) {

        double finalAmount = amount - discount;

        System.out.println("\n----- Shopping Bill -----");
        System.out.println("Original Amount: Rs. " + amount);
        System.out.println("Discount Percentage: " + percentage + "%");
        System.out.println("Discount Amount: Rs. " + discount);
        System.out.println("Final Payable Amount: Rs. " + finalAmount);
    }
}