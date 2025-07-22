package com.docker.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.docker.entity.Book;
import com.docker.repo.BookRepository;

@RestController
@RequestMapping("/book")
public class BookController {
	
	@Autowired
	private BookRepository repo;
	
	private int count;
	
	@GetMapping("/message")
	public String getMessage()
	{
		count++;
		return "Welcome to Docker Compose "+ count + "times";
	}
	
	
	@PostMapping("/save")
	public String saveBook(@RequestBody Book book)
	{
		Book saveBook=new Book(book.getId(),book.getName(),book.getPrice());
		repo.save(saveBook);
		return "Book saved successfully";
		
	}

}
