package com.book;

public class Book {
	
	private String bookID;
	private String title;
	private String author;
	private String category;
	private double price;
	
	
	public String getBookID() {
		return bookID;
	}


	public void setBookID(String bookID) {
		this.bookID = bookID;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getAuthor() {
		return author;
	}


	public void setAuthor(String author) {
		this.author = author;
	}


	public String getCategory() {
		return category;
	}


	public void setCategory(String category) {
		this.category = category;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public Book(String bookID, String title, String author, String category, double price) {
		
		this.bookID = bookID;
		this.title = title;
		this.author = author;
		this.category = category;
		this.price = price;
		
	}


	public void showDetails() {
		System.out.println("Book ID: " + bookID);
		System.out.println("Book Title: " + title);
		System.out.println("Book Author: " + author);
		System.out.println("Book Category: " + category);
		System.out.println("Book Price: " + price);
	}
	
}
