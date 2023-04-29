package com.org.library.Library;

import com.org.library.book.Book;

public class Library {
	String name;
	long contact;
	
	
	public Library() {
	}
	public Library(String name, long contact) {
		
		this.name = name;
		this.contact = contact;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getContact() {
		return contact;
	}
	public void setContact(long contact) {
		this.contact = contact;
	}
	
	private static Book[] getBook() {
		
		Book bk=new Book[10];
		bk[0]=new Book
	}
}
