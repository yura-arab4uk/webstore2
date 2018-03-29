package com.webstore2.controller;

import com.webstore2.domain.Category;
import com.webstore2.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/categories")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @GetMapping(value = "/get")
    public List<Category> getTopCategories() {
        return categoryService.getTopCategories();
    }
}
