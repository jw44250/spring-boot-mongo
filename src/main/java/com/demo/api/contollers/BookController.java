package com.demo.api.contollers;

import com.demo.api.model.Book;
import com.demo.api.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import javax.validation.Valid;

@RestController
@RequestMapping("/api/v1")
public class BookController {

    @Autowired
    private BookRepository bookRepository;

    @GetMapping("/test")
    public String home(){

        return "Welcome to Book Page";
    }


    @PostMapping("/addbook")
    public Book addBook(@Valid @RequestBody Book book) {

        Book bookData = new Book();
        bookData.setId(book.getId());
        bookData.setTitle(book.getTitle());
        bookData.setAuthor(book.getAuthor());

        bookRepository.save(book);
        return bookData;

    }



}
