package com.tka;

public class MovieTicket {
	
	

	    String movieName;
	    String customerName;
	    double ticketPrice;
	    int numberOfTickets;

	    // Parameterized Constructor
	    MovieTicket(String movieName, String customerName,
	                double ticketPrice, int numberOfTickets) {

	        this.movieName = movieName;
	        this.customerName = customerName;
	        this.ticketPrice = ticketPrice;
	        this.numberOfTickets = numberOfTickets;
	    }

	    // Method to calculate total amount
	    void calculateAmount() {

	        double total = ticketPrice * numberOfTickets;
	        double discount = 0;

	        if (total > 1000) {
	            discount = total * 0.10;
	        }

	        double finalAmount = total - discount;

	        System.out.println("Movie Name: " + movieName);
	        System.out.println("Customer Name: " + customerName);
	        System.out.println("Ticket Price: Rs. " + ticketPrice);
	        System.out.println("Number of Tickets: " + numberOfTickets);
	        System.out.println("Total Amount: Rs. " + total);
	        System.out.println("Discount: Rs. " + discount);
	        System.out.println("Final Payable Amount: Rs. " + finalAmount);
	    }

	    public static void main(String[] args) {

	        // Creating object
	        MovieTicket obj = new MovieTicket("Pushpa 2", "Apurva", 250, 5);

	        // Calling method
	        obj.calculateAmount();
	    }
	}


