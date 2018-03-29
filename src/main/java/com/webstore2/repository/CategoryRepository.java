package com.webstore2.repository;

import com.webstore2.domain.Category;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;
import java.util.List;

@Repository
public interface CategoryRepository extends MongoRepository<Category, BigInteger> {
    List<Category> getCategoriesByTop(Boolean top);
}
