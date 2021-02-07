package com.jameshaltiwanger.show.services;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.stereotype.Service;

import com.jameshaltiwanger.show.models.Book;
import com.jameshaltiwanger.show.repositories.BookRepository;

@Service
public class BookService {
    
	// adding the book repository as a dependency
	   private final BookRepository bookRepository;
	    
	    public BookService(BookRepository bookRepository) {
	        this.bookRepository = bookRepository;
	    }
	    // returns all the books
	    public List<Book> allBooks() {
	        return bookRepository.findAll();
	    }
	    // creates a book
	    public Book createBook(Book b) {
	        return bookRepository.save(b);
	    }
	    // retrieves a book
	    public Book findBook(Long id) {
	        Optional<Book> optionalBook = bookRepository.findById(id);
	        if(optionalBook.isPresent()) {
	            return optionalBook.get();
	        } else {
	            return null;
	        }
	    }
	    // updates a book
	    public void updateBook(Long id, Book book) {
	            bookRepository.save(book);
	    }
	    // deletes a book
	    public void destroyBook(Long id) {
	        bookRepository.deleteById(id);
	    }
	    // for api???
		public Book updateBook(Long id, String title, String desc, String lang, Integer numOfPages) {
			
			return null;
		}
}