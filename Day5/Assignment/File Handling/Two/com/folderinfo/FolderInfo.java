package com.folderinfo;

import java.io.File;

public class FolderInfo {
	
	public static void printDirectory(String path) {
		
		File file = new File(path);
		if(file.exists()) {
			File[] files =  file.listFiles();
			for (File f:files) {
				if(f.isFile()) {
					System.out.println("FILES : \n" );
					System.out.println("File : " + f.getName());
					System.out.println("Absolute File Path : " + f.getAbsolutePath());
					System.out.println("Folder path : " + f.getParent());
					System.out.println("\n======================\n");
				}
				else {
					System.out.println("DIRECTORIES : \n" );
					System.out.println("Directory : " + f.getName());
					System.out.println("Path : " + f.getParent());
					System.out.println("\n======================\n");
				}
			}
		}else {
			System.out.println("No folder exists with the given name.");
		}
		
	}

	public static void main(String[] args) {
		
		printDirectory("/Users/asif/downloads/Badminton");
		
	}
}
