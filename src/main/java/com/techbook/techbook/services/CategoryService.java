package com.techbook.techbook.services;

import com.techbook.techbook.entities.Book;
import com.techbook.techbook.entities.Category;
import com.techbook.techbook.repositories.IBookRepository;
import com.techbook.techbook.repositories.ICategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CategoryService {

    @Autowired
    private ICategoryRepository categoryRepository;

    private IBookRepository bookRepository;

    public List<Category> listCategories() {
        return categoryRepository.findAll();
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
