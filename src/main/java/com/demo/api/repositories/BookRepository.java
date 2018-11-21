package com.demo.api.repositories;

import com.demo.api.model.Book;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface BookRepository extends MongoRepository<Book, Long> {
}
