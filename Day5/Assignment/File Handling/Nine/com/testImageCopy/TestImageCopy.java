package com.testImageCopy;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import com.imageCopy.ImageCopy;

public class TestImageCopy {

	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter file name/path : ");
		String filename = sc.nextLine();
		
		File file = new File(filename);
		
		if(file.exists()) {
			if(file.getName().endsWith(".jpg")) {
				
				try {
					
					ImageCopy.copyImage(file);
					
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				finally {
					sc.close();
				}
				
			}else {
				System.out.println("File format not supported...");
			}
		}else {
			System.out.println("File not found...");
		}
	
		

	}

}
