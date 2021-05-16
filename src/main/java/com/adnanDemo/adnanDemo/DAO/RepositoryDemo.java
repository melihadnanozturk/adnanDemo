package com.adnanDemo.adnanDemo.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.adnanDemo.adnanDemo.Entities.Book;

@Repository
public interface RepositoryDemo extends JpaRepository<Book, Integer>{

}
