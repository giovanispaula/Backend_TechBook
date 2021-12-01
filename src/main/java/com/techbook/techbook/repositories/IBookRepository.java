package com.techbook.techbook.repositories;

import com.techbook.techbook.entities.Book;
import com.techbook.techbook.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IBookRepository extends JpaRepository<Book, Integer> {

    @Query("select * from books where category_id = ?1")
    List<Book> searchByCategory(Category category);
}
