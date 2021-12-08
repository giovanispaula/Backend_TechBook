package com.techbook.techbook.services;

import com.techbook.techbook.dto.BookDTO;
import com.techbook.techbook.entities.*;
import com.techbook.techbook.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class BookService {

    @Autowired
    private IBookRepository bookRepository;

    @Autowired
    private ICategoryRepository categoryRepository;

    public List<Book> listBooks() {
        return bookRepository.findAll();
    }

    public Optional<Book> listId(Integer id) {
        return bookRepository.findById(id);
    }

    public List<Book> getAllByType(String name) {
        List<Book> books = new ArrayList<>();
        List<Category> categories = categoryRepository.findByNameLike(name.toUpperCase());
        if (categories.isEmpty())
            return books;
        Integer idCategory = categories.get(0).getId();
        return bookRepository.findByCategoryId(idCategory);
    }


}


