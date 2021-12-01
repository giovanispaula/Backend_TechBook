package com.techbook.techbook.controllers;

import Backend.entities.Categories;
import Backend.services.CategoriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/products/categories")
public class CategoriesController {

    private final CategoriesService categoriesService;

    @Autowired
    public CategoriesController(CategoriesService categoriesService) {
        this.categoriesService = categoriesService;
        loadData();
    }

    @GetMapping
    public ResponseEntity<List<Categories>> listCategories() {
        return ResponseEntity.ok(categoriesService.listCategories());
    }

    public void loadData() {
        categoriesService.LoadData();
    }

}
