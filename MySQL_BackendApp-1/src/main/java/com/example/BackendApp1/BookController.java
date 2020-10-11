package com.example.BackendApp1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class BookController {

    @Autowired
    BookRepository repository;
    //  BookRepository repository = new BookRepository();

    @GetMapping("/books")
    public List<Book> getAllBooks(){
        return repository.findAll();
    }

    @GetMapping("/books/{id}")
    public Book getABook(@PathVariable int id){
        Optional<Book> object = repository.findById(id);
        if(object.isPresent()){
            return object.get();
        }
        System.out.println("Could not find the book");
        return null;
        /*
        Book book = repository.findById(id);
        print(book.getName()); */
    }

    @PostMapping("/books")
    public boolean createABook(@RequestBody Book book){
        repository.save(book);
        return true;
    }
}
