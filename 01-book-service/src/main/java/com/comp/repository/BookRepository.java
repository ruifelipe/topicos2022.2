package com.comp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.comp.model.Book;

public interface BookRepository extends JpaRepository<Book, Long>{

}