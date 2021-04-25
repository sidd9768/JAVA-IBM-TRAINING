package com.ibm;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DistanceUtilTest {
	
	private DistanceUtil distanceUtil;
	
	@BeforeAll
	public static void beforeAll() {
		System.out.println("Starting test...\n");
	}
	
	@BeforeEach
	public void setup() {
		distanceUtil = new DistanceUtil();
	}
	
	@Test
	public void testKmsToMiles() {
		System.out.print("Testing testKmsToMiles method...");
		double kms = 10;
		double expectedResult = 6.2;
		double actualResult = distanceUtil.kmsToMiles(kms);
		
		Assertions.assertEquals(expectedResult, actualResult);
		System.out.println("\t Done!");
	}
	
	@Test
	public void testMilesToKms() {
		System.out.print("Testing testMilesToKms method...");
		double miles = 10;
		double expectedResult = 16.1;
		double actualResult = distanceUtil.milesToKms(miles);
		
		Assertions.assertEquals(expectedResult, actualResult);
		System.out.println("\t Done!");
	}
	
	@Test
	public void testEquals() {
		System.out.print("Testing testEqualsinEquals method...");
		double kms = 10;
		String expectedResult = "equal";
		String actualResult = distanceUtil.equalDistance(kms, 6.2);
		
		Assertions.assertEquals(expectedResult, actualResult);
		System.out.println("\t Done!");
	}
	
	@Test
	public void testLessThan() {
		System.out.print("Testing testLessThanInEquals method...");
		double kms = 10;
		String expectedResult = "kms less than miles";
		String actualResult = distanceUtil.equalDistance(kms, 7.2);
		
		Assertions.assertEquals(expectedResult, actualResult);
		System.out.println("\t Done!");
	}
	
	@Test
	public void testGreaterThan() {
		System.out.print("Testing testGreaterThan method...");
		double kms = 10;
		String expectedResult = "kms greater than miles";
		String actualResult = distanceUtil.equalDistance(kms, 5.2);
		
		Assertions.assertEquals(expectedResult, actualResult);
		System.out.println("\t Done!");
	}
	
	@AfterAll
	public static void afterAll() {
		System.out.println("\nDone...");
	}

}
