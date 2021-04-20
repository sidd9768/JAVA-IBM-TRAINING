package com.batsman;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Store1BatsmanData {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		
		writeBatsman();
		
		System.out.println("\nBatsman Details : \n");
		Batsman bat1 = readBatsman();
		System.out.println(bat1);

	}
	
	public static Batsman readBatsman() throws FileNotFoundException, IOException, ClassNotFoundException {
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("record1Batsman.dat"));
		Batsman batsman = (Batsman) ois.readObject();
		return batsman;
	}
	
	public static void writeBatsman() throws FileNotFoundException, IOException {
		Batsman batsman1 = new Batsman(10, "AB de Villiers", 220, 9500);
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("record1Batsman.dat"));
		
		oos.writeObject(batsman1);
		System.out.println("Written successfully");
		
		oos.close();
		
	}

}
