package com.techbook.techbook.services;

import Backend.entities.Books;
import Backend.entities.Categories;
import Backend.entities.NameCategory;
import Backend.repositories.BooksRepository;
import Backend.repositories.CategoriesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BooksService {

    @Autowired
    private BooksRepository booksRepository;

    @Autowired
    private CategoriesRepository categoriesRepository;

    public List<Books> listBooks() {
        return booksRepository.findAll();
    }

    public Optional<Books> listId(Integer id) {
        return booksRepository.findById(id);
    }

    public List<Books> listByCategory(NameCategory nameCategory) {
        try {
            Categories categories = categoriesRepository.findAllByNameCategory(nameCategory);
            return booksRepository.findAllByCategories(categories);
        } catch (RuntimeException e) {
            throw new RuntimeException("ERRO|!");
        }
    }


