package com.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.entity.Book;


public interface BookMapper {
	public List<Book>  findBook(@Param("bookName")String bookName,@Param("status")Integer status);
	public List<Book> findAll();
	public int delectByIdBook(int Bookid);
	public int updateBook(Book book);
	public List<Book> fenye(@Param("pageNo")int pageNo,@Param("pageSize") int pageSize);
	public int count();
}
