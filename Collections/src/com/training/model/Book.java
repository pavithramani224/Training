package com.training.model;

public class Book implements Comparable<Book> {
	private int bookNumber;
	private String bookName;
	private String author;
	private double price;
	
	@Override
	public String toString() {
		return " bookNumber=" + bookNumber + ", bookName=" + bookName + ", author=" + author + ", price=" + price
				;
	}
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Book(int bookNumber, String string, String author, double price) {
		super();
		this.bookNumber = bookNumber;
		this.bookName = string;
		this.author = author;
		this.price = price;
	}
	public int getBookNumber() {
		return bookNumber;
	}
	public void setBookNumber(int bookNumber) {
		this.bookNumber = bookNumber;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName( String bookName) {
		this.bookName = bookName;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public int compareTo(Book otherObj) {
		// TODO Auto-generated method stub
//		if(otherObj.bookNumber<this.bookNumber) return-1 ;
		if(otherObj.bookNumber<this.bookNumber) 
		return 1;
//			
//		return otherObj.bookName.compareTo(this.bookName);
		return bookNumber;
		
	}
	

}
