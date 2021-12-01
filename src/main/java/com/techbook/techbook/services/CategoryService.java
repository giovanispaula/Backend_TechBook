package com.techbook.techbook.services;

import Backend.entities.Books;
import Backend.entities.Categories;
import Backend.repositories.BooksRepository;
import Backend.repositories.CategoriesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CategoriesService {

    @Autowired
    private CategoriesRepository categoriesRepository;

    private BooksRepository booksRepository;

    public List<Categories> listCategories() {
        return categoriesRepository.findAll();
    }

    public void LoadData() {

//        categoriesRepository.save(new Categories("INFORMÁTICA"));
//        categoriesRepository.save(new Categories("DIREITO"));
//        categoriesRepository.save(new Categories("FICÇÃO"));
//        categoriesRepository.save(new Categories("INFANTIL"));
//
//        booksRepository.save(new Books("Tech Mundo", 105.99, "Livro de Tecnologia", "URL", categoriesRepository.getById(2)));
//        booksRepository.save(new Books("Mil maneiras de fazer justiça", 105.99, "Livro de Tecnologia", "URL", categoriesRepository.getById(1)));
//        booksRepository.save(new Books("Tech Mundo", 105.99, "Livro de Tecnologia", "URL", categoriesRepository.getById(3)));
//        booksRepository.save(new Books("Mil maneiras de fazer justiça", 105.99, "Livro de Tecnologia", "URL", categoriesRepository.getById(3)));
//        booksRepository.save(new Books("Tech Mundo", 105.99, "Livro de Tecnologia", "URL", categoriesRepository.getById(4)));
//        booksRepository.save(new Books("Mil maneiras de fazer justiça", 105.99, "Livro de Tecnologia", "URL", categoriesRepository.getById(1)));

    }

}
