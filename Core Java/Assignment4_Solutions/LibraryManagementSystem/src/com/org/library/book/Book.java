package com.org.library.book;

public class Book {
	String title;
	String author;
	String ISBN;
	String publisher;
	int quantity;
	
	
	public Book() {
	}
	public Book(String title, String author, String iSBN, String publisher, int quantity) {
		this.title = title;
		this.author = author;
		this.ISBN = iSBN;
		this.publisher = publisher;
		this.quantity = quantity;
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
	public String getISBN() {
		return ISBN;
	}
	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
	
}
