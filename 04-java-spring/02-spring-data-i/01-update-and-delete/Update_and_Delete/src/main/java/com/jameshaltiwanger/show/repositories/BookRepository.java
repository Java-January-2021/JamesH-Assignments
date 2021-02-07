package com.jameshaltiwanger.show.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jameshaltiwanger.show.models.Book;

@Repository
public interface BookRepository extends CrudRepository<Book, Long>{ 
	//CRUD means Create, Read, Update, and Delete. We are giving our Book model all the methods available in the CrudRepository by making this interface.
	
    List<Book> findAll(); // this method retrieves all the books from the database
    
    List<Book> findByDescriptionContaining(String search); // this method find a book by their description
    
    Long countByTitleContaining(String search); // this method counts how many titles contain a certain string
    
    Long deleteByTitleStartingWith(String search); // this method deletes a book that starts with a specific title
}
