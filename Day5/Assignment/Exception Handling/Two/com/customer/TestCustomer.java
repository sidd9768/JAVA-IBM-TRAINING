package com.customer;

public class TestCustomer {

	public static void main(String[] args) {
		
		System.out.println("Valid customer details \n");
		Customer customer1 = new Customer("c0sfa", "Asif Siddique", "Platinum");
		System.out.println(customer1);
		
		System.out.println("\n===========================\n");
		
		System.out.println("Invalid customer details \n");
		System.out.println("Checking condition 1 : ");
		Customer customer2 = new Customer("b0sfa", "Asif Siddique", "Platinum");
		
		System.out.println("\nChecking condition 2 : ");
		Customer customer3 = new Customer("c0sfa", "mil", "Platinum");
		
		System.out.println("\nChecking condition 3 : ");
		Customer customer4 = new Customer("c0sfa", "Asif Siddique", "gld");

	}

}
