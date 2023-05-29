package com.cyber.Csj28SpringBootDemo2.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cyber.Csj28SpringBootDemo2.entity.Book;
import com.cyber.Csj28SpringBootDemo2.repository.BookRepository;
import com.cyber.Csj28SpringBootDemo2.service.BookService;

@Service
public class BookDao implements BookService {

	@Autowired
	private BookRepository respo;
	@Override
	public Book addBooking(Book book) {
		// TODO Auto-generated method stub
		return respo.save(book);	}

}
