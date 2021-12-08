package com.techbook.techbook.controllers;

import com.techbook.techbook.dto.BookDTO;
import com.techbook.techbook.entities.Book;
import com.techbook.techbook.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@CrossOrigin(origins = "*", allowedHeaders = "")
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
    public ResponseEntity<List<BookDTO>> listBooks() {
        return ResponseEntity.ok(bookService.listBooks().stream().map(BookDTO::BookToDTO).collect(Collectors.toList()));
    }

    //exibe livro por ID
    @GetMapping("/{id}")
    public ResponseEntity<BookDTO> listId(@PathVariable Integer id) {
        BookDTO books = BookDTO.BookToDTO(Objects.requireNonNull(bookService.listId(id).orElse(null)));
        return ResponseEntity.ok(books);
    }

    //exibe livros por categoria
    @GetMapping("/categories/{type}")
    public ResponseEntity<List<BookDTO>> getByType(@PathVariable String type){
        System.out.println(type);
        return ResponseEntity.ok(
                bookService.getAllByType(type).stream().map(BookDTO::BookToDTO).collect(Collectors.toList())
        );
    }

}