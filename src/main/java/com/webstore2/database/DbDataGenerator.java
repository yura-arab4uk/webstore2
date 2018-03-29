package com.webstore2.database;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DbDataGenerator {

    @Autowired
    private CategoryGenerator categoryGenerator;

    public void generateData() {
        categoryGenerator.generateCategories();
    }
}
