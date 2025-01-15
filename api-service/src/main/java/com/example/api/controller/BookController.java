package com.example.api.controller;

import com.example.api.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/books")
public class BookController {

    @Autowired
    private BookService bookService;

    @PostMapping("/add")
    public String addBook(@RequestBody String bookDetails) {
        return bookService.addBook(bookDetails);
    }

    @GetMapping("/get/{id}")
    public String getBook(@PathVariable String id) {
        return bookService.getBook(id);
    }
}

