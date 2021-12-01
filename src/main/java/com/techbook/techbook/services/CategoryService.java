package com.techbook.techbook.services;

import com.techbook.techbook.entities.Category;
import com.techbook.techbook.repositories.ICategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    @Autowired
    private ICategoryRepository categoryRepository;

    public List<Category> searchAll(){
        return categoryRepository.findAll();
    }
}
