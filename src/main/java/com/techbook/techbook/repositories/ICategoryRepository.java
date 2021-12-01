package com.techbook.techbook.repositories;

import com.techbook.techbook.entities.Category;
import com.techbook.techbook.entities.NameCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ICategoryRepository  extends JpaRepository<Category, Integer> {

}
