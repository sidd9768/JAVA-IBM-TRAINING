package com.ibm;

public class DistanceUtil {
	
	public DistanceUtil() {}
	
	public double kmsToMiles(double kms) {
		return kms * 0.62;
	}
	
	public double milesToKms(double miles) {
		return miles * 1.61 ;
	}
	
	public String equalDistance(double kms, double miles) {
		if (kms*0.62 == miles) {
			return "equal";
		}else if(kms*0.62 < miles) {
			return "kms less than miles";
		}else {
			return "kms greater than miles";
		}
	}

}
