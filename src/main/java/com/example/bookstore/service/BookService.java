package com.example.bookstore.service;

import com.example.bookstore.model.Book;

import java.util.List;

/**
 * @author Viacheslav Shago
 */
public interface BookService {
    Book getBookById(Long id);
    List<Book> getAllBooks();
    List<Book> findByAuthor(String author);
    void addBook(Book book);
    void editBook(Book book);
}
