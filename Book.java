package org.library;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class Book {
	@Id
	@Column(name = "Book_Id")
	@GeneratedValue	
	private int bookId;
	@Column(name = "Author_Name")
	private String author;
	@Column(name = "Book_Title")
	private String title;
	@Column(name = "Book_Price")
	private int price;
	private boolean available;
	
	public Book(int bookId, String author, String title, int price, boolean available) {
		super();
		this.bookId = bookId;
		this.author = author;
		this.title = title;
		this.price = price;
		this.available = available;
	}
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public boolean isAvailable() {
		return available;
	}
	public void setAvailable(boolean available) {
		this.available = available;
	}
	
}
