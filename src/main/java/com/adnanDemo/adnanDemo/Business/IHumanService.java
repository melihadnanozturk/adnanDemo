package com.adnanDemo.adnanDemo.Business;

import java.util.List;

import com.adnanDemo.adnanDemo.Entities.Book;

public interface IHumanService {

	void save(Book book);
	void update(Book book);
	void delete (int id);
	List<Book> getall();
}
