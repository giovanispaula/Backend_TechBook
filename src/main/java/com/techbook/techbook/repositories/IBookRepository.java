package com.techbook.techbook.repositories;

import com.techbook.techbook.dto.BookDTO;
import com.techbook.techbook.entities.Book;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IBookRepository extends JpaRepository<Book, Integer> {

    @Query
    public List<Book> findByCategoryId(Integer id);
    
}
