package com.customer;

public class Customer {

	private String custNo;
	private String custName;
	private String category;
	
	public Customer(String custNo, String custName, String category) {
		try {
			if(!(custNo.toLowerCase().startsWith("c")))
			{
				throw new InvalidInputException("Customer Number must start with 'C' or 'c'.");
			}else {
				this.custNo = custNo;
			}
			if(custName.length() < 4) {
				throw new InvalidInputException("Name must be of atleast 4 characters.");
			}else {
				this.custName = custName;
			}
			if((category.equals("Platinum") || category.equals("Gold") || category.equals("Silver"))){
				this.category = category;
			}else {
				throw new InvalidInputException("Category must be either 'Platinum', 'Gold', or 'Silver'.");
			}
		}catch(InvalidInputException iie) {
			System.out.println(iie.getMessage());
		}
	}
	public String getCustNo() {
		return custNo;
	}
	public void setCustNo(String custNo) {
		this.custNo = custNo;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	
	@Override
	public String toString() {
		return "Customer No : " + custNo + "\nCustomer Name : " + custName + "\nCategory : " + category;
	}
	
}
