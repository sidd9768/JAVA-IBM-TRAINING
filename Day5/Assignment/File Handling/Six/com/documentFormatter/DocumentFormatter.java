package com.documentFormatter;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class DocumentFormatter {

	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter file name/path : ");
		String fileName = sc.nextLine();
		
		BufferedReader br = new BufferedReader(new FileReader(fileName));
		PrintWriter pr = new PrintWriter("formattedFile.txt");
		
		String line = null;
		while((line = br.readLine()) != null) {
			pr.write(line.strip() + System.lineSeparator());
		}
		System.out.println("Done...");
		pr.close();
		br.close();
		sc.close();

	}

}
