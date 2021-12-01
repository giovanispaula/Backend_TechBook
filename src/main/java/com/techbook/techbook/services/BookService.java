package com.techbook.techbook.services;

import com.techbook.techbook.entities.Book;
import com.techbook.techbook.entities.Category;
import com.techbook.techbook.entities.NameCategory;
import com.techbook.techbook.repositories.IBookRepository;
import com.techbook.techbook.repositories.ICategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

    public List<Book> listByCategory(NameCategory nameCategory) {
        try {
            Category category = categoryRepository.findAllByNameCategory(nameCategory);
            return bookRepository.findAllByCategories(category);
        } catch (RuntimeException e) {
            throw new RuntimeException("ERRO|!");
        }
    }


