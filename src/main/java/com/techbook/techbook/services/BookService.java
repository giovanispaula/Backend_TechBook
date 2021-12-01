package com.techbook.techbook.services;

import com.techbook.techbook.entities.Book;
import com.techbook.techbook.entities.Category;
import com.techbook.techbook.repositories.IBookRepository;
import com.techbook.techbook.repositories.ICategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
public class BookService {

    @Autowired
    private IBookRepository bookRepository;

    @Autowired
    private ICategoryRepository categoryRepository;

    public List<Book> searchAll(){
        return bookRepository.findAll();
    }

    public Optional<Book> searchById(Integer id){
        return bookRepository.findById(id);
    }

    public List<Book> searchByCategory(Category category){
        try{
            return bookRepository.searchByCategory(category);
        }
        catch (RuntimeException e){
            throw new RuntimeException("Categoria não existe");
        }
    }
}
