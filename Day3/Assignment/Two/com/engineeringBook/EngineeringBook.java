package com.engineeringBook;

import com.book.*;

public class EngineeringBook extends Book {
	
	private String category;

	public EngineeringBook(){
		this.category = "Engineering";
	}
	
	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	} 

}
