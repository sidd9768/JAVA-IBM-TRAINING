package com.testAgeCalculator1;

import java.text.ParseException;
import com.AgeCalculator1.*;

public class TestAgeCalculater1 {

	public static void main(String[] args) {
		
		AgeCalculator1 age = new AgeCalculator1();
		String dob = "20-12/1998";
	    
		try {
			System.out.println(age.calculateAge(dob));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			System.out.println("Date of brith should be of format dd/mm/yyyy.");
		}

	}

}
