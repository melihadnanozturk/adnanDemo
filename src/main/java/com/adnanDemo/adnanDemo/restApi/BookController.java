package com.adnanDemo.adnanDemo.restApi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.adnanDemo.adnanDemo.Business.IHumanService;
import com.adnanDemo.adnanDemo.Entities.Book;

import lombok.Getter;

@RestController
@RequestMapping("/adnan")
public class BookController {

	public IHumanService humanService;
	
	
	@Autowired
	public BookController(IHumanService humanService) {
		
		this.humanService = humanService;
	}



	@GetMapping("getall")
	public List<Book> getall() {
		return humanService.getall();
	}
	
	@PostMapping("/save")
	public void save(@RequestBody Book book) {
		humanService.save(book);
	}
	
	@PostMapping("/delete/{id}")
	public void delete(@PathVariable int id) {
		humanService.delete(id);
	}
	
	
}
	
	
	
	

