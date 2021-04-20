package com.proverbreverser;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ProverbReverser {
	
	public static void reverseWord(String path) {
		
		try {
			
			File file = new File(path);
			FileInputStream fis = new FileInputStream(path);
			
			byte[] data = new byte[(int) file.length()];
			
			fis.read(data);
			String ans = "";

			FileOutputStream fos = new FileOutputStream("/Users/asif/Downloads/JAVA IBM TRAINING/FileHandlingAssignment5/"
					+ "src/com/proverbreverser/ReverseProverbs.txt");
			for(int i=data.length-1; i>0; i--) {
				fos.write(data[i]);
			}
			
			fos.close();
			System.out.println(ans);
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		
		String path = "/Users/asif/Downloads/JAVA IBM TRAINING/"
				+ "FileHandlingAssignment3/src/com/proverbcollection/TopProverbs.txt";
		
		reverseWord(path);
		
	}

}
