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

        categoryRepository.save(new Category("TECNOLOGIA", "Tecnologia"));
        categoryRepository.save(new Category("DIREITO", "Direito"));
        categoryRepository.save(new Category("FICCAO", "Ficção"));
        categoryRepository.save(new Category("MEDICINA", "Medicina"));
        categoryRepository.save(new Category("LITERATURABRASILEIRA", "Literatura Brasileira"));
        categoryRepository.save(new Category("ROMANCE", "Romance"));
        categoryRepository.save(new Category("INFANTIL", "Infantil"));
        categoryRepository.save(new Category("POESIA", "Poesia"));
        categoryRepository.save(new Category("SUSPENSE", "Suspense"));
        categoryRepository.save(new Category("FANTASIA", "Fantasia"));
        categoryRepository.save(new Category("ARTES", "Artes"));
        categoryRepository.save(new Category("FILOSOFIA", "Filosofia"));
        categoryRepository.save(new Category("IDIOMAS", "Idiomas"));
        categoryRepository.save(new Category("CINEMA", "Cinema"));
        categoryRepository.save(new Category("PEDAGOGIA", "Pedagogia"));
        categoryRepository.save(new Category("SAUDE", "Saúde"));
        categoryRepository.save(new Category("PSICOLOGIA", "Psicologia"));
        categoryRepository.save(new Category("POLITICA", "Política"));
        categoryRepository.save(new Category("MODA", "Moda"));
        categoryRepository.save(new Category("TURISMO", "Turismo"));
        categoryRepository.save(new Category("SOCIOLOGIA", "Sociologia"));
        categoryRepository.save(new Category("ENCICLOPEDIAS", "Enciclopédias"));
        categoryRepository.save(new Category("ECONOMIA", "Economia"));
        categoryRepository.save(new Category("BIOLOGIA", "Biologia"));
        categoryRepository.save(new Category("ASTRONOMIA", "Astronomia"));
        categoryRepository.save(new Category("BOTANICA", "Botânica"));
        categoryRepository.save(new Category("ARQUEOLOGIA", "Arqueologia"));
        categoryRepository.save(new Category("CULINARIA", "Culinária"));

        // - Tecnologia (01)
        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(1)));

        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(1)));

        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(1)));

        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(1)));

        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(1)));

        // - Direito (02)
        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(2)));

        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(2)));

        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(2)));

        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(2)));

        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(2)));

        // - Ficção (03)
        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(3)));

        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(3)));

        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(3)));

        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(3)));

        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(3)));

        // - Medicina (04)
        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(4)));

        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(4)));

        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(4)));

        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(4)));

        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(4)));

        // - Literatura Brasileira (05)
        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(5)));

        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(5)));

        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(5)));

        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(5)));

        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(5)));

        // - Romance (06)
        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(6)));

        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(6)));

        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(6)));

        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(6)));

        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(6)));

        // - Infantil (07)
        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(7)));

        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(7)));

        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(7)));

        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(7)));

        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(7)));

        // - Poesia (08)
        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(8)));

        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(8)));

        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(8)));

        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(8)));

        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(8)));

        // - Suspense (09)
        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(9)));

        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(9)));

        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(9)));

        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(9)));

        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(9)));

        // - Fantasia (10)
        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(10)));

        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(10)));

        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(10)));

        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(10)));

        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(10)));

        // - Artes (11)
        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(11)));

        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(11)));

        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(11)));

        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(11)));

        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(11)));

        // - Filosofia (12)
        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(12)));

        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(12)));

        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(12)));

        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(12)));

        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(12)));

        // - Idiomas (13)
        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(13)));

        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(13)));

        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(13)));

        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(13)));

        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(13)));

        // - Cinema (14)
        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(14)));

        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(14)));

        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(14)));

        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(14)));

        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(14)));

        // - Pedagogia (15)
        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(15)));

        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(15)));

        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(15)));

        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(15)));

        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(15)));

        // - Saúde (16)
        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(16)));

        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(16)));

        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(16)));

        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(16)));

        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(16)));

        // - Psicologia (17)
        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(17)));

        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(17)));

        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(17)));

        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(17)));

        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(17)));

        // - Política (18)
        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(18)));

        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(18)));

        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(18)));

        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(18)));

        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(18)));

        // - Moda (19)
        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(19)));

        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(19)));

        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(19)));

        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(19)));

        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(19)));

        // - Turismo (20)
        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(20)));

        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(20)));

        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(20)));

        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(20)));

        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(20)));

        // - Sociologia (21)
        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(21)));

        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(21)));

        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(21)));

        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(21)));

        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(21)));

        // - Enciclopédias (22)
        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(22)));

        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(22)));

        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(22)));

        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(22)));

        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(22)));

        // - Economia (23)
        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(23)));

        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(23)));

        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(23)));

        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(23)));

        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(23)));

        // - Biologia (24)
        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(24)));

        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(24)));

        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(24)));

        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(24)));

        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(24)));

        // - Astronomia (25)
        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(25)));

        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(25)));

        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(25)));

        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(25)));

        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(25)));

        // - Botânica (26)
        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(26)));

        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(26)));

        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(26)));

        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(26)));

        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(26)));

        // - Arqueologia (27)
        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(27)));

        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(27)));

        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(27)));

        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(27)));

        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(27)));

        // - Culinária (28)
        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(28)));

        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(28)));

        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(28)));

        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(28)));

        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(28)));
    }

}