package com.cox.repositories.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.cox.entities.Address;
import com.cox.entities.Book;
import com.cox.entities.BookShelf;
import com.cox.exceptions.BookShelfNotFoundException;
import com.cox.repositories.BookShelfRepository;

@Repository
public class BookShelfRepositoryImpl implements BookShelfRepository {

	static Map<String, BookShelf> bookShelfRepo;
	static {
		Address address = new Address();
		address.setCity("Dallas");
		address.setState("Texas");
		address.setStreetName("Southern Blvd");
		address.setDoorNumber("APT 220");
		address.setCountry("United States");
		address.setId(123L);

		Book book = new Book();
		book.setAuthor("Santhosh");
		book.setIsbn("782-322-1234-231");
		book.setTitle("Java in Action");
		book.setId(142L);

		BookShelf bookShelf = new BookShelf();
		bookShelf.setAddress(address);
		bookShelf.setName("Santhosh's BookShelf");
		bookShelf.setBooks(Arrays.asList(book));
		bookShelf.setId(1L);

		bookShelfRepo = new HashMap<>();
		bookShelfRepo.put("Santhosh", bookShelf);

	}

	@Override
	public BookShelf findByName(String id) {
		BookShelf bookShelf = bookShelfRepo.get(id);
		if (bookShelf == null) {
			throw new BookShelfNotFoundException();
		}
		return bookShelf;
	}

	@Override
	public List<BookShelf> findAll() {
		return new ArrayList<>(bookShelfRepo.values());
	}

}
