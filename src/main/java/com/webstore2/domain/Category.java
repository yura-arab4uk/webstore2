package com.webstore2.domain;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigInteger;
import java.util.List;

@Document
@Data
@Builder
public class Category {

    private BigInteger id;
    private String name;
    private Integer order;
    private Boolean top;
    private Boolean enabled;
    @DBRef
    private List<Category> childCategories;
}
