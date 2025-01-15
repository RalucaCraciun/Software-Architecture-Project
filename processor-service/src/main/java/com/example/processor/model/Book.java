package com.example.processor.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor(force = true)
@AllArgsConstructor
public class Book {
    @Id
    private String id;
    private String title;
    private String author;
    private boolean isBorrowed;
}
