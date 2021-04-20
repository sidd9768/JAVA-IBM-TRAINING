package com.testfile;

import java.io.File;
import java.io.IOException;

public class TestFile {

	public static void main(String[] args) {
		
		//Create badminton dir
		File badminton = new File("/Users/asif/downloads/Badminton");
		badminton.mkdir();
		
		//Create singles.txt
		File singles = new File("/Users/asif/downloads/Badminton", "singles.txt");
		
		//Create dubbles.txt
		File dubbles = new File("/Users/asif/downloads/Badminton", "dubbles.txt");
		
		//Create courts dir
		File courts = new File("/Users/asif/downloads/Badminton", "Courts");
		courts.mkdir();
		
		//Create smash.dat
		File smash = new File("/Users/asif/downloads/Badminton/Courts", "Smash.dat");
		
		try {
			singles.createNewFile();
			dubbles.createNewFile();
			smash.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Rename dubbles.txt to doubles.txt
		File doubles = new File("/Users/asif/downloads/Badminton", "doubles.txt");
		dubbles.renameTo(doubles);
		
		//Delete singles.txt
		singles.delete();
		
		

	}

}
