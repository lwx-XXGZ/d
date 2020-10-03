package com.biz;

import java.util.List;

import com.entity.Book;



public interface BookService {
	public List<Book>  findBook(String BookName,int Status);

	public List<Book> findAll();

	public int delectByIdBook(int Bookid);

	public int updateBook(Book book);
	public List<Book> fenye(int pageNo,int pageSize);
	public int count();
	public int pagecount(int pagesize);
}
