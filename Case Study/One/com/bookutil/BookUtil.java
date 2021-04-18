package com.bookutil;

import com.book.*;
public class BookUtil {

	public static void main(String[] args) {
		
		Book book1 = new Book("B101", "Hands On Java", "Rosling", "Technology", 599.99);
		Book book2 = new Book("B102", "The Alchemist", "Paulo Coelho", "Fiction", 259.99);
		Book book3 = new Book("B103", "Artificial Intelligence", "Peter Norvig", "Technology", 1449.99);
		
		BookStore bookStore = new BookStore();
		
		Book[] books = {book1, book2, book3};
		
		bookStore.addBook(books);
		
		bookStore.searchTitle("the alchemist");
		bookStore.searchTitle("head first java");
		System.out.println("\n\n");
		bookStore.searchAuthor("Rosling");
		bookStore.searchAuthor("Tim ferris");
		System.out.println("\n\n");
		
		bookStore.dispayAll();
		
	}

}
