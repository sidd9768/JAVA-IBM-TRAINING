package com.customer;

import com.address.Address;

public class Customer {
	
	private String customerName;
	private Address address;
	private Address officialAddress;
	
	public Customer(){
		
	}

	public Customer(String customerName, Address address) {
		super();
		this.customerName = customerName;
		this.address = address;
	}
	
	public Customer(String customerName, Address address, Address officialAddress) {
		this.customerName = customerName;
		this.address = address;
		this.officialAddress = officialAddress;
	}


	public String getCustomerDetails() {
		String customerDetails;
		
		if (officialAddress != null) {
			
			customerDetails = "Customer: " + customerName + "\n" 
					+ "Residential Address: " + address.getAddressDetails()
					+ "\nOfficial Address: " + officialAddress.getAddressDetails();
		}else {
			customerDetails = "Customer: " + customerName + "\n" 
					+ "Residential Address: " + address.getAddressDetails();
		}
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

	public Address getOfficialAddress() {
		return officialAddress;
	}

	public void setOfficialAddress(Address officialAddress) {
		this.officialAddress = officialAddress;
	}
	
	

}
