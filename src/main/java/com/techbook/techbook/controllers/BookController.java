package com.techbook.techbook.controllers;

import com.techbook.techbook.entities.Book;
import com.techbook.techbook.entities.NameCategory;
import com.techbook.techbook.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class BookController {

    private final BookService bookService;

    @Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    //exibe todos os livros
    @GetMapping
    public ResponseEntity<List<Book>> listBooks() {
        return ResponseEntity.ok(bookService.listBooks());
    }

    //exibe livro por ID
    @GetMapping("/{id}")
    public ResponseEntity<Book> listId(@PathVariable Integer id) {
        Book books = bookService.listId(id).orElse(null);
        return ResponseEntity.ok(books);
    }

    //exibe livros por categoria


}