package com.cox.repositories;

import java.util.List;

import com.cox.entities.BookShelf;

public interface BookShelfRepository {
	BookShelf findByName(String id);
	List<BookShelf> findAll();
}
