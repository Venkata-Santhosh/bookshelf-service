package com.cox.entities;

import java.util.List;

/**
 * BookShelf 
 * @author vpiduri1
 *
 */
public class BookShelf {

	private Long id;
	private String name;
	private Address address;
	private List<Book> books;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public List<Book> getBooks() {
		return books;
	}
	public void setBooks(List<Book> books) {
		this.books = books;
	}	
	
	
}
