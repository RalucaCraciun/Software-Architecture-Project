package com.example.api.service;


import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    private static final String TOPIC = "book-topic";

    public String addBook(String bookDetails) {
        // Simulate adding the book
        kafkaTemplate.send(TOPIC, "New book added: " + bookDetails);
        return "Book added successfully!";
    }

    public String getBook(String bookId) {
        // Simulate retrieving a book
        return "Details of the book with ID: " + bookId;
    }
}
