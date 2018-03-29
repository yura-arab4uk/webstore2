package com.webstore2.domain;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigInteger;
import java.util.Map;

@Document
@Data
@Builder
public class Product {

    private BigInteger id;
    private String name;
    private Double price;
    private Map<String, String> properties;
    private Boolean enabled;
}
