package com.bookdetails;

import java.util.Scanner;
import com.book.*;
import com.engineeringBook.*;
public class BookDetails {
	
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.print("Enter book Id No: ");
		int bookId = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("Enter book Title: ");
		String bookTitle = sc.nextLine();
		
		System.out.print("Enter book price: ");
		float bookPrice = sc.nextFloat();
		
		
		EngineeringBook eBook = new EngineeringBook();
		eBook.setBookNo(bookId);
		eBook.setPrice(bookPrice);
		eBook.setTitle(bookTitle);
		
		System.out.println("\n\nThe Output will come here --------- \n");
		System.out.println("Book Number   :   " + eBook.getBookNo());
		System.out.println("Book Title    :   " + eBook.getTitle());
		System.out.println("Book Price    :   " + eBook.getPrice());
		System.out.println("Book Category :   " +  eBook.getCategory());

	}

}
