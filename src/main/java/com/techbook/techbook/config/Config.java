package com.techbook.techbook.config;

import com.techbook.techbook.entities.*;
import com.techbook.techbook.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;


@Component
@Configuration
public class Config implements CommandLineRunner {

    @Autowired
    private IBookRepository bookRepository;

    @Autowired
    private ICategoryRepository categoryRepository;

    @Override
    public void run(String...args) throws Exception {

        categoryRepository.save(new Category("INFORMATICA"));
        categoryRepository.save(new Category("DIREITO"));
        categoryRepository.save(new Category("FICCAO"));
        categoryRepository.save(new Category("INFANTIL"));

        bookRepository.save(new Book("Tecnologia Alienígena", 105.99, "Livro de tecnologia", "http://imagem.com", categoryRepository.getById(1)));
        bookRepository.save(new Book("DIREITO", 105.99, "Livro de tecnologia", "http://imagem.com", categoryRepository.getById(2)));
        bookRepository.save(new Book("Ficção", 105.99, "Livro de tecnologia", "http://imagem.com", categoryRepository.getById(3)));
        bookRepository.save(new Book("Pedro e o Coelho", 105.99, "Livro de tecnologia", "http://imagem.com", categoryRepository.getById(4)));
        bookRepository.save(new Book("O pequeno principe da tecnologia", 105.99, "Livro de tecnologia", "http://imagem.com", categoryRepository.getById(3)));

    }

}