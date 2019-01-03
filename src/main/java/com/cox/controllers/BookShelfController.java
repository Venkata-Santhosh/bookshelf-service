package com.cox.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cox.entities.BookShelf;
import com.cox.services.BookShelfService;

@RestController
@RequestMapping("/mybookshelf")
public class BookShelfController {

	private BookShelfService bookShelfService;

	public BookShelfController(BookShelfService bookShelfService) {
		this.bookShelfService = bookShelfService;
	}

	@GetMapping("/bookshelves/{id}")
	public BookShelf findByName(@PathVariable String id) {
		return bookShelfService.findByName(id);
	}

	@GetMapping("/bookshelves")
	public List<BookShelf> findAll() {
		return bookShelfService.findAll();
	}
}
