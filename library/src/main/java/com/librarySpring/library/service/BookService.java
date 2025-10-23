package com.librarySpring.library.service;

import com.librarySpring.library.model.Book;
import com.librarySpring.library.repository.BookRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class BookService {

    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public List<Book> listAvailableBooks() {
        return bookRepository.findByAvailableQuantityGreaterThanOrderByTitle(0);
    }

    public List<Book> findByCategory(String categoryName) {
        return bookRepository.findByCategoryName(categoryName);
    }

    public List<Book> findByAuthor(String authorName) {
        return bookRepository.findByAuthorName(authorName);
    }

    public List<Book> listAll() {
        return bookRepository.findAll();
    }
}
