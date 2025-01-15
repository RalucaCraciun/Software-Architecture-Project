package com.example.processor.service;

import com.example.processorservice.model.Book;
import com.example.processorservice.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class BorrowService {

    @Autowired
    private BookRepository bookRepository;

    @KafkaListener(topics = "book-topic", groupId = "processor-group")
    public void processBookEvent(String event) {
        // Process the event (e.g., book borrowing)
        System.out.println("Processing event: " + event);
    }

    public String borrowBook(String bookId) {
        Book book = bookRepository.findById(bookId).orElseThrow(() -> new RuntimeException("Book not found"));
        book.setBorrowed(true);
        bookRepository.save(book);
        return "Book borrowed successfully!";
    }
}
