package com.techbook.techbook.repositories;

import com.techbook.techbook.entities.Book;
import com.techbook.techbook.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICategoryRepository  extends JpaRepository<Category, Integer> {

}
