package com.techbook.techbook.services;

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


}
