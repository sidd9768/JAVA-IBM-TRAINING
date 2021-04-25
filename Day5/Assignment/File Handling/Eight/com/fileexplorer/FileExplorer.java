package com.fileexplorer;

import java.io.File;

public class FileExplorer {
	
	public void listAll(String path) {
		File file = new File(path);
		if(file.exists()) {
			File[] files =  file.listFiles();
			for (File f:files) {
				if(f.isFile()) {
					System.out.println("File : " + f.getName());
					System.out.println("Absolute File Path : " + f.getAbsolutePath());
					System.out.println("Folder path : " + f.getParent());
					System.out.println("\n======================\n");
				}
				else {
//					System.out.println("DIRECTORIES : \n" );
//					System.out.println("Directory : " + f.getName());
//					System.out.println("Path : " + f.getParent());
//					System.out.println("\n======================\n");
					System.out.println("SUB FOLDER : \n");
					File[] subFiles = f.listFiles();
					for(File subFile: subFiles) {
						if(subFile.isFile()) {
							System.out.println("File : " + subFile.getName());
							System.out.println("Absolute File Path : " + subFile.getAbsolutePath());
							System.out.println("Folder path : " + subFile.getParent());
							System.out.println("\n======================\n");
						}else {
							System.out.println("DIRECTORIES : \n" );
							System.out.println("Directory : " + subFile.getName());
							System.out.println("Path : " + subFile.getParent());
							System.out.println("\n======================\n");
						}
					}
				}
			}
		}else {
			System.out.println("No folder exists with the given name.");
		}
		
	}

}
