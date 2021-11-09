package com.example.bookstore.model;

import lombok.Value;

/**
 * @author Viacheslav Shago
 */
@Value
public class Book {
    Long id;
    String author;
    String title;
    Double price;
}
