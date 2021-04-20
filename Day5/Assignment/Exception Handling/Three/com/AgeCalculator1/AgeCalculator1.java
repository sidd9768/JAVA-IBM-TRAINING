package com.AgeCalculator1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class AgeCalculator1 {

	
	public int calculateAge (String dob) throws ParseException {
        
		SimpleDateFormat sdfrmt = new SimpleDateFormat("dd/MM/yyyy");
	    sdfrmt.setLenient(false);
	    
	    sdfrmt.parse(dob); 
	    System.out.println(dob+" is valid date format");
	    
	    long mil = new Date(dob).getTime();
	    long milT = new Date().getTime();
        
        long dyT = TimeUnit.MILLISECONDS.toDays(milT);
        final long yrT = dyT / 365;
        
        long dy = TimeUnit.MILLISECONDS.toDays(mil);
		final long yr = dy / 365;
	
		int age =  (int) (yrT-yr) -1;
	    
	    return age;
	
		
	}
	
}
