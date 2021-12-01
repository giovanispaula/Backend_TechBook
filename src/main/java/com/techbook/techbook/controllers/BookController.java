package com.techbook.techbook.controllers;


import com.techbook.techbook.entities.Book;
import com.techbook.techbook.entities.Category;
import com.techbook.techbook.services.BookService;
import com.techbook.techbook.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;
import java.util.Set;

@RestController
@RequestMapping("/products")
public class BookController {

    @Autowired
    private BookService bookService;

    @Autowired
    private CategoryService categoryService;

    @GetMapping
    public List<Book> searchAllBooks(){
        return bookService.searchAll();
    }

    @GetMapping("/products/{id}")
    public Optional<Book> searchById(@PathVariable Integer id) {
        return bookService.searchById(id);
    }

    @GetMapping("/products/category/{category}")
    public List<Book> searchByCategory(@PathVariable("category") Category category){
        return bookService.searchByCategory(category);
    }
}
