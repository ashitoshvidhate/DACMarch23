package com.org.library_management;

import java.util.Scanner;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
class Book {
	@Getter
	@Setter
	String title;
	@Getter
	@Setter
	String author;
	@Getter
	@Setter
	String publisher;
	@Getter
	@Setter
	double price;
	@Getter
	@Setter
	int numofPages;

	// public double finalprice;

	public void calculatePrice() {
		this.price = this.price * this.numofPages;

	}

	public void printBookInfo() {
		System.out.println(
				this.title + " " + this.author + " " + this.publisher + " " + this.price + " " + this.numofPages);
	}
}

@NoArgsConstructor

class RefereceBook extends Book {
	@Getter
	@Setter
	private int edition;

	public RefereceBook(String title, String author, String publisher, double price, int numofPages, int edition) {
		super(title, author, publisher, price, numofPages);
		this.edition = edition;
	}

	public void calculatePrice() {
		if (this.edition < 5) {
			double discount = (0.2) * this.price * this.numofPages;
			this.price = this.price * this.numofPages - discount;
		} else {
			this.price = this.price * this.numofPages;
		}

	}
}

@NoArgsConstructor
class FictionBook extends Book {
	@Getter
	@Setter
	private String genre;

	public FictionBook(String title, String author, String publisher, double price, int numofPages, String genre) {
		super(title, author, publisher, price, numofPages);
		this.genre = genre;
	}

	public void calculatePrice() {
		if (this.genre.equals("romance novel")) {
			double discount = (0.1) * this.price * this.numofPages;
			this.price = this.price * this.numofPages - discount;
		} else {
			this.price = this.price * this.numofPages;
		}
	}
}

@NoArgsConstructor
class NonFictionBook extends Book {
	@Getter
	@Setter
	private String subject;

	public NonFictionBook(String title, String author, String publisher, double price, int numofPages, String subject) {
		super(title, author, publisher, price, numofPages);
		this.subject = subject;
	}

	public void calculatePrice() {
		if (this.subject.equals("history")) {
			double discount = (0.15) * this.price * this.numofPages;
			this.price = this.price * this.numofPages - discount;
		} else {
			this.price = this.price * this.numofPages;
		}
	}
}

class BookTest {
	private Book[] arr = new Book[3];

	private static Scanner sc = new Scanner(System.in);

	public BookTest() {
		arr[0] = new RefereceBook();
		arr[1] = new FictionBook();
		arr[2] = new NonFictionBook();
	}

	public static int MenuList() {
		System.out.println("0.Exit");
		System.out.println("1.Accept Record");
		System.out.println("2.Print Record");
		System.out.println("Enter choice");
		return sc.nextInt();
	}

	public void printRecord() {
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Book Price of "+arr[i].getClass().getSimpleName()+" =" + arr[i].getPrice());
		}
	}

	public void acceptRecord() {
		if (arr != null) {
			for (int index = 0; index < arr.length; index++) {
				if (arr[index] instanceof RefereceBook) {
					RefereceBook rbook = (RefereceBook) arr[index];
					System.out.println("Enter title of RefereceBookook :");
					sc.nextLine();
					rbook.setTitle(sc.nextLine());
					System.out.println("Enter author of RefereceBook :");
					rbook.setAuthor(sc.nextLine());
					System.out.println("Enter publisher of RefereceBook :");
					rbook.setPublisher(sc.nextLine());
					System.out.println("Enter price of RefereceBook :");
					rbook.setPrice(sc.nextDouble());
					System.out.println("Enter number of pages of RefereceBook :");
					rbook.setNumofPages(sc.nextInt());
					System.out.println("Enter edition of RefereceBook :");
					rbook.setEdition(sc.nextInt());
				} else if (arr[index] instanceof FictionBook) {
					FictionBook fb = (FictionBook) arr[index];
					System.out.println("Enter title of FictionBook :");
					sc.nextLine();
					fb.setTitle(sc.nextLine());
					System.out.println("Enter author of FictionBook :");
					fb.setAuthor(sc.nextLine());
					System.out.println("Enter publisher of FictionBook :");
					fb.setPublisher(sc.nextLine());
					System.out.println("Enter price of FictionBook :");
					fb.setPrice(sc.nextDouble());
					System.out.println("Enter number of pages of FictionBook :");
					fb.setNumofPages(sc.nextInt());
					System.out.println("Enter gener of FictionBook :");
					sc.nextLine();
					fb.setGenre(sc.nextLine());
				} else {
					NonFictionBook nb = (NonFictionBook) arr[index];
					System.out.println("Enter title of NonFictionBook :");
					nb.setTitle(sc.nextLine());
					System.out.println("Enter author of NonFictionBook :");
					nb.setAuthor(sc.nextLine());
					System.out.println("Enter publisher of NonFictionBook :");
					nb.setPublisher(sc.nextLine());
					System.out.println("Enter price of NonFictionBook :");
					nb.setPrice(sc.nextDouble());
					System.out.println("Enter number of pages of NonFictionBook :");
					nb.setNumofPages(sc.nextInt());
					System.out.println("Enter subject of NonFictionBook :");
					sc.nextLine();
					nb.setSubject(sc.nextLine());

				}
				arr[index].calculatePrice();
				arr[index].printBookInfo();
			}
		}
	}

}

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice;
		BookTest bk = new BookTest();
		while ((choice = bk.MenuList()) != 0) {
			switch (choice) {
			case 1:
				bk.acceptRecord();

				break;
			case 2:
				bk.printRecord();
				break;

			}
		}

	}

}
