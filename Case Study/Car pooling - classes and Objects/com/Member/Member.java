package com.Member;

import java.util.Date;

public class Member{
	
	private long id;
	private String firstName;
	private String lastName;
	private String email;
	private String contactNumber;
	private String licenseNumber;
	private Date licenseStartDate; 
	private Date licenseExpiryDate;
	
	public Member() {
		
	}
	
	
	public Member(long id, String firstName, String lastName, String email, String contactNumber, String licenseNumber,
			Date licenseStartDate, Date licenseExpiryDate) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.contactNumber = contactNumber;
		this.licenseNumber = licenseNumber;
		this.licenseStartDate = licenseStartDate;
		this.licenseExpiryDate = licenseExpiryDate;
	}



	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getLicenseNumber() {
		return licenseNumber;
	}
	public void setLicenseNumber(String licenseNumber) {
		this.licenseNumber = licenseNumber;
	}
	public Date getLicenseStartDate() {
		return licenseStartDate;
	}
	public void setLicenseStartDate(Date licenseStartDate) {
		this.licenseStartDate = licenseStartDate;
	}
	public Date getLicenseExpiryDate() {
		return licenseExpiryDate;
	}
	public void setLicenseExpiryDate(Date licenseExpiryDate) {
		this.licenseExpiryDate = licenseExpiryDate;
	}
	
	@Override
	public String toString() {
		String toReturn = "Member: " + firstName + ", " + lastName + 
				"\nMember contact details: " + contactNumber + ", " + email +"\n"+licenseExpiryDate; 
		return toReturn;
		
	}
	
}
