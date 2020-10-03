package com.biz.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.biz.BookService;
import com.dao.BookMapper;
import com.entity.Book;

@Service
public class BookServiceImpl implements BookService{
	@Resource
	private BookMapper dao;
	
	@Override
	public List<Book>  findBook(String BookName, int Status) {
		System.out.println("zzxx");
		return dao.findBook(BookName, Status);
	}

	@Override
	public List<Book> findAll() {
		return dao.findAll();
	}

	@Override
	public int delectByIdBook(int Bookid) {
		return dao.delectByIdBook(Bookid);
	}

	@Override
	public int updateBook(Book book) {
		return dao.updateBook(book);
	}

	@Override
	public List<Book> fenye(int pageNo, int pageSize) {

		int PageNo=(pageNo-1)*pageSize;
		
		return dao.fenye(PageNo, pageSize);
	}

	@Override
	public int count() {
		return dao.count();
	}

	@Override
	public int pagecount(int pagesize) {
		int totalStudent = count();
		int totalpage = totalStudent%pagesize==0?totalStudent/pagesize:totalStudent/pagesize+1;
		return totalpage;
	}

	
}
