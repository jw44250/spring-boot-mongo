package com.demo.api.model;


import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "Book")
public class Book {

    private long id;
    private String title;
    private String author;
}
