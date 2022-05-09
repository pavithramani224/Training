package com.training.model.mavenproject1;

public class BookName {
	private int bookNo;
	private String bookName;
	public BookName() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BookName(int bookNo, String bookName) {
		super();
		this.bookNo = bookNo;
		this.bookName = bookName;
	}
	public int getBookNo() {
		return bookNo;
	}
	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	@Override
	public String toString() {
		return "BookName [bookNo=" + bookNo + ", bookName=" + bookName + "]";
	}
	

}
