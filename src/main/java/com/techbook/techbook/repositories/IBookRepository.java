package com.techbook.techbook.repositories;

import com.techbook.techbook.entities.Book;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IBookRepository extends JpaRepository<Book, Integer> {

//    @Query("select * from book b, category c where b.category_id = c.id and c.name = ?1")
//    List<Book> findAllByCategory(String category);

    @Query
    public List<Book> findByCategoryId(Integer id);
    
}
