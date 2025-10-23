package com.librarySpring.library.controller;

import com.librarySpring.library.model.Book;
import com.librarySpring.library.service.BookService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/available")
    public List<Book> listAvailableBooks() {
        return bookService.listAvailableBooks();
    }

    @GetMapping("/category/{name}")
    public List<Book> findByCategory(@PathVariable String name) {
        return bookService.findByCategory(name);
    }

    @GetMapping("/author/{name}")
    public List<Book> findByAuthor(@PathVariable String name) {
        return bookService.findByAuthor(name);
    }

    @GetMapping
    public List<Book> listAll() {
        return bookService.listAll();
    }
}
