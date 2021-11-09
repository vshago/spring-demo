package com.example.bookstore.mapper;

import com.example.bookstore.model.Book;
import com.example.bookstore.dao.BookEntity;
import org.mapstruct.Mapper;

/**
 * @author Viacheslav Shago
 */
@Mapper(componentModel = "spring")
public interface BookToEntityMapper {
    BookEntity bookToBookEntity(Book book);
    Book bookEntityToBook(BookEntity bookEntity);
}
