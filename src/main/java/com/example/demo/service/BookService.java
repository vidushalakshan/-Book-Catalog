package com.example.demo.service;

import com.example.demo.dto.BookDto;

import java.util.List;

public interface BookService {
    void saveBook(BookDto bookDto);
    void deleteBook(String bookID);
    void updateBook(BookDto bookDto);
    BookDto searchBook(String id);
    List<BookDto> getAllBook();
}
