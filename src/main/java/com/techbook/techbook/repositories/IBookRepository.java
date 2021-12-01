package com.techbook.techbook.repositories;

import Backend.entities.Books;
import Backend.entities.Categories;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BooksRepository extends JpaRepository<Books, Integer> {

    @Query
    List<Books> findAllByCategories(Categories categories);

}
