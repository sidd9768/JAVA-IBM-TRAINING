package com.book;

public class BookStore {
	
	Book[] books = new Book[3];

	public void addBook(Book[] b) {
		for (int i=0; i<3; i++) {
			books[i] = b[i];
		}
	}
	
	public void searchTitle(String title) {
		boolean foundBook=false;
		int foundBookNumber = 0;
		for (int i=0; i<books.length; i++) {
			if(title.toLowerCase().equals(books[i].getTitle().toLowerCase())){
				foundBook = true;
				foundBookNumber = i;
				break;
			}
		}
		if(foundBook) {
			System.out.println("=========== Found =========\n");
			books[foundBookNumber].showDetails();
		}else {
			System.out.println("\n=========== NOT Found =========\n");
			System.out.println("The title " + title.toUpperCase() +  " is not found!!!");
		}
	}
	
	public void searchAuthor(String author) {
		boolean foundAuthor=false;
		int foundAuthorNumber = 0;
		for (int i=0; i<books.length; i++) {
			if(author.toLowerCase().equals(books[i].getAuthor().toLowerCase())){
				foundAuthor = true;
				foundAuthorNumber = i;
				break;
			}
		}
		if(foundAuthor) {
			System.out.println("=========== Found =========\n");
			books[foundAuthorNumber].showDetails();
		}else {
			System.out.println("\n=========== NOT Found =========\n");
			System.out.println("The author " + author + " is not found!!!");
		}
	}
	
	public void dispayAll() {
		System.out.println("======== ALL BOOKS ========");
		for (int i=0; i<books.length; i++) {
			books[i].showDetails();
			System.out.println("");
		}
	}
}
