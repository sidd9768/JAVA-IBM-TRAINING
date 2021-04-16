package com.testcustomer;

import com.customer.Customer;
import com.address.Address;
public class TestCustomer {

	public static void main(String[] args) {

		System.out.println("USING DEFAULT PARAMETERS AND GETTERS/SETTERS \n");
		Customer customer = new Customer();
		customer.setCustomerName("Jack");
		customer.setAddress(new Address("104 Lake Palace", "Mumbai"));
	
		String customerName = customer.getCustomerName();
		String addressLine = customer.getAddress().getAddressLine();
		String city = customer.getAddress().getCity();
		
		
		System.out.println("Customer Name: " + customerName + 
				"\nResidential Address: " + addressLine +
				", " + city);
		
		System.out.println("\n==================================\n");
		System.out.println("USING PARAMETERIZED CONSTRUCTOR AND CALLING getCustomerDetails()\n");
		
		Customer customer1 = new Customer("Michael Soam", new Address("503 Atlantic Okaria", "Mumbai"));
		System.out.println(customer1.getCustomerDetails());

		
		
		System.out.println("\n==================================\n");
		System.out.println("USING 3 PARAMETERIZED CONSTRUCTOR AND CALLING getCustomerDetails()\n");
		
		Customer customer2 = new Customer("Whack Daw", new Address("201 South Street", "Mumbai"), new Address("902 Black Villa", "Mumbai"));
		System.out.println(customer2.getCustomerDetails());
		
	}

}
