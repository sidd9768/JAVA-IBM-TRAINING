package com.proverreader;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ProverbReader {

	public static void main(String[] args) {
		
		try {
			
			File file = new File("/Users/asif/Downloads/JAVA IBM TRAINING/"
					+ "FileHandlingAssignment3/src/com/proverbcollection/TopProverbs.txt");
			FileInputStream fis = new FileInputStream("/Users/asif/Downloads/JAVA IBM TRAINING/"
					+ "FileHandlingAssignment3/src/com/proverbcollection/TopProverbs.txt");
			
			byte[] b = new byte[(int) file.length()];;
			fis.read(b);
			fis.close();
			
			String data = new String(b, "UTF-8");
			System.out.println(data);

			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
