package com.address;

public class Address {
	
	private String addressLine;
	private String city;
	

	public Address(String addressLine, String city) {
		super();
		this.addressLine = addressLine;
		this.city = city;
	}

	Address(){
		
	}

	public String getAddressDetails() {
		String address = addressLine + ", " + city;
		return address;
	}

	public String getAddressLine() {
		return addressLine;
	}



	public void setAddressLine(String addressLine) {
		this.addressLine = addressLine;
	}



	public String getCity() {
		return city;
	}



	public void setCity(String city) {
		this.city = city;
	}


}
