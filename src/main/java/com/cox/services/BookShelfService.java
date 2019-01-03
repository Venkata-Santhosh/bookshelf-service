package com.cox.services;

import java.util.List;

import com.cox.entities.BookShelf;

public interface BookShelfService {
	BookShelf findByName(String id);
	List<BookShelf> findAll();
}
