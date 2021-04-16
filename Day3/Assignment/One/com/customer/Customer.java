package com.customer;

import com.address.*;

public class Customer {
	
	private String customerName;
	private Address address;
	
	public Customer(){
		
	}

	public Customer(String customerName, Address address) {
		super();
		this.customerName = customerName;
		this.address = address;
	}


	public String getCustomerDetails() {
		String customerDetails = "Customer: " + customerName + "\n" + "Residential Address: " + address.getAddressDetails();
		return customerDetails;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	

}
