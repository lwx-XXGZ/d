package com.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.biz.impl.BookServiceImpl;
import com.entity.Book;


@Controller
public class BookController {
	@Resource
	private BookServiceImpl bookService;
	
	@RequestMapping("/show")
	@ResponseBody
	public Object show(int pageNo, int pageSize) {
		return fenye(1, 3);
	}
	
	@RequestMapping("/findBook")
	@ResponseBody
	public Object findBook(String BookName, int Status) {
		List<Book> bs=bookService.findBook(BookName, Status);
		System.out.println(bs.size());
		return bs;
		
	}
	
	
	@RequestMapping("/delectByIdBook")
	@ResponseBody
	public Object delectByIdBook(int Bookid) {
		return bookService.delectByIdBook(Bookid);
	}
	
	@RequestMapping("/updateBook")
	@ResponseBody
	public Object updateBook(Book book) {
		return bookService.updateBook(book);
	}
	
	@RequestMapping("/fenye")
	@ResponseBody
	public Object fenye(int pageNo, int pageSize) {
		List<Book> bs=bookService.fenye(pageNo, pageSize);
		return bs;
	}
	
	@RequestMapping("/count")
	@ResponseBody
	public Object count() {
		int num=bookService.pagecount(3);
		return num;
	}
	
	
	
}
