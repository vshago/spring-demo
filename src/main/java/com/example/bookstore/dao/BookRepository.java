package com.example.bookstore.dao;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * @author Viacheslav Shago
 */
public interface BookRepository extends CrudRepository<BookEntity, Long> {
    List<BookEntity> findAllByAuthorContaining(String author);
}
