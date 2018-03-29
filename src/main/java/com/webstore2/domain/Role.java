package com.webstore2.domain;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigInteger;

@Document
@Data
@Builder
public class Role {

    private BigInteger id;
    private String name;
    private Boolean enabled;
}
