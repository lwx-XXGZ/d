package com.entity;

import java.util.Date;

public class Book {

	private int bookid;
	private String bookname;
	private int status;
	private String press;
	private String username;
	private String borrowDate;
	public int getBookid() {
		return bookid;
	}
	public void setBookid(int bookid) {
		this.bookid = bookid;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getPress() {
		return press;
	}
	public void setPress(String press) {
		this.press = press;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getBorrowDate() {
		return borrowDate;
	}
	public void setBorrowDate(String borrowDate) {
		if (borrowDate!=null && borrowDate.length()>0) {
			this.borrowDate = borrowDate.substring(0,10);
			return;
		}
		this.borrowDate = null;
	}
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
