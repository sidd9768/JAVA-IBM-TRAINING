package com.imageCopy;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ImageCopy {
	
	public static boolean copyImage(File file) throws IOException {
		
		String fileName = file.getName().replaceFirst("[.][^.]+$", "");
		String fileExtension = file.getName().replaceFirst("[^.]+[.]", "");
		String newFileName = fileName + "_copy." + fileExtension;
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file));
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(newFileName));
		int val;
		
		while ((val=bis.read()) != -1) {
			bos.write(val);
		}
		bis.close();
		bos.close();
		System.out.println("Done...");
		return true;
		
	}
	
	
	

}
