package com.example.bookstore.model;

import lombok.Data;

/**
 * @author Viacheslav Shago
 */
@Data
public class BookRequest {
    private String author;
    private String title;
    private Double price;
}
