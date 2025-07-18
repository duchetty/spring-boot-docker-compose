package com.docker.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.docker.entity.Book;

public interface BookRepository extends JpaRepository<Book, Integer>{

}
