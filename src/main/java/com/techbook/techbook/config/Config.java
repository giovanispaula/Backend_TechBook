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

        categoryRepository.save(new Category("TECNOLOGIA"));
        categoryRepository.save(new Category("DIREITO"));
        categoryRepository.save(new Category("FICCAO"));
        categoryRepository.save(new Category("MEDICINA"));
        categoryRepository.save(new Category("LITERATURABRASILEIRA"));
        categoryRepository.save(new Category("ROMANCE"));
        categoryRepository.save(new Category("INFANTIL"));
        categoryRepository.save(new Category("POESIA"));
        categoryRepository.save(new Category("CIENCIAS"));


        bookRepository.save(new Book(
                "Tecnologia Alienígena",
                105.99, "Livro de tecnologia",
                "http://imagem.com",
                categoryRepository.getById(1)));


}