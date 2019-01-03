package com.cox.services.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cox.entities.BookShelf;
import com.cox.repositories.BookShelfRepository;
import com.cox.services.BookShelfService;

@Service
public class BookShelfServiceImpl implements BookShelfService{

	private BookShelfRepository bookShelfRepository;
	
	public BookShelfServiceImpl(BookShelfRepository bookShelfRepository) {
		this.bookShelfRepository = bookShelfRepository;
	}
	
	
	@Override
	public BookShelf findByName(String id) {
		return bookShelfRepository.findByName(id);
	}

	@Override
	public List<BookShelf> findAll() {
		return bookShelfRepository.findAll();
	}

}
