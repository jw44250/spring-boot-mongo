package com.demo.api.contollers;

import com.demo.api.model.Book;
import com.demo.api.repositories.BookRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import javax.validation.Valid;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1")
public class BookController {

    private static final Logger LOGGER = LoggerFactory.getLogger(BookController.class);

    @Autowired
    private BookRepository bookRepository;

    @GetMapping("/test")
    public String home(){

        return "Welcome to Book Page";
    }


    @PostMapping("/books/addbook")
    public Book addBook(@Valid @RequestBody Book book) {

        LOGGER.debug(" Entered BookController.addBook()" );
        Book bookData = new Book();
        bookData.setId(book.getId());
        bookData.setTitle(book.getTitle());
        bookData.setAuthor(book.getAuthor());

        LOGGER.info("Saving book data into MonogDB now {}", book.getId());
        bookRepository.save(book);
        return bookData;

    }

    @GetMapping("/books/{id}")
    public ResponseEntity<?> getBook(@PathVariable("id") long id){

        LOGGER.debug("Entered BookController().getBoo(): {}", id);

        Optional<Book> book = bookRepository.findById(id);

        /*return  Optional.ofNullable(book)
                .map(result -> new ResponseEntity<>(
                        result, HttpStatus.OK
                )).orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));*/

        if(book == null) {

            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }else{

            return new ResponseEntity<>(book, HttpStatus.OK);
        }
    }

    @DeleteMapping("/books/{id}")
    public void deleteBook(@PathVariable ("id") long id) {

        bookRepository.deleteById(id);
    }


    @PutMapping("/books/{id}")
    public ResponseEntity<Object> updateBook(@RequestBody Book book, @PathVariable long id) {


      Optional<Book> bookData =   bookRepository.findById(id);

      if(!bookData.isPresent()){

          return ResponseEntity.noContent().build();
      }

        book.setId(id);
        bookRepository.save(book);
        return ResponseEntity.noContent().build();
    }














}
