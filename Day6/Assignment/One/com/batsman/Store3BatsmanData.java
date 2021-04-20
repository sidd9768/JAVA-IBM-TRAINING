package com.batsman;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Store3BatsmanData {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		
		writeBatsman();
		
		System.out.println("\nBATSMAN DETAILS : \n");
		Batsman[] batsmans = readBatsman();
		System.out.println("Batsman 1 : \n");
		System.out.println(batsmans[0]);
		System.out.println("\nBatsman 2 : \n");
		System.out.println(batsmans[1]);
		System.out.println("\nBatsman 3 : \n");
		System.out.println(batsmans[2]);

	}

	public static Batsman[] readBatsman() throws FileNotFoundException, IOException, ClassNotFoundException {
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("record3Batsman.dat"));
		Batsman[] batsmans = (Batsman[]) ois.readObject();
		return batsmans;
	}
	
	public static void writeBatsman() throws FileNotFoundException, IOException {
		Batsman batsman1 = new Batsman(10, "AB de Villiers", 220, 9500);
		Batsman batsman2 = new Batsman(20, "Kane Williamson", 151, 6000);
		Batsman batsman3 = new Batsman(30, "Virat Kohli", 250, 12000);
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("record3Batsman.dat"));
		
		Batsman[] batsmans = {batsman1, batsman2, batsman3};
		oos.writeObject(batsmans);
		
		System.out.println("Written successfully");
		oos.close();
		
	}
}
