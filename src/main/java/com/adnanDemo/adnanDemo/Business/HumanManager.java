package com.adnanDemo.adnanDemo.Business;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.adnanDemo.adnanDemo.DAO.RepositoryDemo;
import com.adnanDemo.adnanDemo.Entities.Book;

import lombok.RequiredArgsConstructor;

@Service
public class HumanManager implements IHumanService{

	private RepositoryDemo repositoryDemo;
	
	@Autowired
	public HumanManager(RepositoryDemo repositoryDemo) {
		this.repositoryDemo = repositoryDemo;
	}

	@Override
	@Transactional
	public void save(Book book) {
		repositoryDemo.saveAndFlush(book);
	}

	

	@Override
	@Transactional
	public void update(Book book) {
		
	}

	@Override
	@Transactional
	public void delete(int id) {
		repositoryDemo.deleteById(id);
		
	}

	@Override
	@Transactional
	public List<Book> getall() {
		List<Book> books=repositoryDemo.findAll();
		return books;
	}

}
