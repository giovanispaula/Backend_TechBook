package com.techbook.techbook.repositories;

import com.techbook.techbook.entities.Book;
import com.techbook.techbook.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ICategoryRepository  extends JpaRepository<Category, Integer> {

    @Query
    public List<Category> findByNameLike(String type);

}
