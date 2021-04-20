package com.proverbcollection;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class ProverbCollection {
	
	public static void storeProverb(String proverb) {
		
		try {
			
			FileOutputStream fos = new FileOutputStream("/Users/asif/Downloads/JAVA IBM TRAINING/"
					+ "FileHandlingAssignment3/src/com/proverbcollection/TopProverbs.txt", true);
			byte[] bytes  = proverb.getBytes();
			byte[] b = System.lineSeparator().getBytes();
			
			fos.write(bytes);
			fos.write(b);
			
			System.out.println("Written...");
			fos.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String toStop = "start";
		while(!toStop.equals("STOP")) {
			
			System.out.print("Enter proverb : ");
			String proverb = sc.nextLine();
			storeProverb(proverb);
			System.out.println("Want to continue? Press enter else type 'STOP'");
			toStop = sc.nextLine();
			
		}
		System.out.println("Done!");
		
	}

}
