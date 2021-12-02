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

//    public void loadData() {
//
//        categoryRepository.save(new Category("INFORMATICA"));
//        categoryRepository.save(new Category("DIREITO"));
//        categoryRepository.save(new Category("FICCAO"));
//        categoryRepository.save(new Category("INFANTIL"));
//
//        bookRepository.save(new Book("Tech Mundo", 105.99, "Livro de Tecnologia", "URL", categoryRepository.getById(2)));
//        bookRepository.save(new Book("Mil maneiras de fazer justiça", 105.99, "Livro de Tecnologia", "URL", categoryRepository.getById(1)));
//        bookRepository.save(new Book("Tech Mundo", 105.99, "Livro de Tecnologia", "URL", categoryRepository.getById(3)));
//        bookRepository.save(new Book("Mil maneiras de fazer justiça", 105.99, "Livro de Tecnologia", "URL", categoryRepository.getById(3)));
//        bookRepository.save(new Book("Tech Mundo", 105.99, "Livro de Tecnologia", "URL", categoryRepository.getById(4)));
//        bookRepository.save(new Book("Mil maneiras de fazer justiça", 105.99, "Livro de Tecnologia", "URL", categoryRepository.getById(1)));
//
//    }


}
