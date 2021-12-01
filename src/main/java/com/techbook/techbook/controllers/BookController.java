package com.techbook.techbook.controllers;


import Backend.entities.Books;
import Backend.entities.NameCategory;
import Backend.services.BooksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.awt.print.Book;
import java.util.List;

@RestController
@RequestMapping("/products")
public class BooksController {

    private final BooksService booksService;

    @Autowired
    public BooksController(BooksService booksService) {
        this.booksService = booksService;
    }

    //exibe todos os livros
    @GetMapping
    public ResponseEntity<List<Books>> listBooks() {
        return ResponseEntity.ok(booksService.listBooks());
    }

    //exibe livro por ID
    @GetMapping("/{id}")
    public ResponseEntity<Books> listId(@PathVariable Integer id) {
        Books books = booksService.listId(id).orElse(null);
        return ResponseEntity.ok(books);
    }

    //exibe livros por categoria
    @GetMapping("/categories/{nameCategory}")
    public List<Books> listByCategory(@PathVariable("nameCategory") String nameCategory) {
        NameCategory stringParaEnum = NameCategory.valueOf(nameCategory.toUpperCase());
        return booksService.listByCategory(stringParaEnum);
    }

}