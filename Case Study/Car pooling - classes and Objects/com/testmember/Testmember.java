package com.testmember;

import java.util.Date;

import com.Member.*;
public class Testmember {

	public static void main(String[] args) {
		
		
		Member member1 = new Member(1, "Arun", "Kumar", "arun123@gmail.com", "9876787678", "MH1234", new Date(12-12-2010) ,new Date(12-12-2022));
		
		Member member2 = new Member(2, "Mohan", "Kartik", "mohan123@gmail.com", "9524439378", "MH44321", new Date(12-12-2010) ,new Date(12-12-2022));
		
		System.out.println(member1);
		System.out.println("\n==========================\n");
		System.out.println(member2);

		System.out.println("\n");
		checkDifference(member1.getContactNumber(), member2.getContactNumber(), member1.getEmail(), member2.getEmail());
		
		System.out.println("\n==========================\n");
		Member member3 = new Member(1, "Sam", "Raj", "sam123@gmail.com", "9876787678", "MH421423", new Date(12-12-2010) ,new Date(12-12-2022));
		
		Member member4 = new Member(2, "Arun", "Jack", "sam123@gmail.com", "9876787678", "MH35345", new Date(12-12-2010) ,new Date(12-12-2022));
		System.out.println(member3);
		System.out.println("\n==========================\n");
		System.out.println(member4);
		System.out.println("\n");
		checkDifference(member3.getContactNumber(), member4.getContactNumber(), member3.getEmail(), member4.getEmail());
	}
	
	
	public  static void checkDifference(String contact1, String contact2, String email1, String email2) {
		if(contact1.equals(contact2) && email1.equals(email2)) {
			System.out.println("Members have same contact details.");
		}else {
			System.out.println("Members have different contact details.");
		}
	}

}
