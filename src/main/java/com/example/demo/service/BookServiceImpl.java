package com.example.demo.service;

import com.example.demo.dto.BookDto;
import com.example.demo.repository.BookRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Service
public class BookServiceImpl implements BookService{


    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private BookRepository repository;

    @Override
    public void saveBook(BookDto bookDto) {

    }

    @Override
    public void deleteBook(String bookID) {

    }

    @Override
    public void updateBook(BookDto bookDto) {

    }

    @Override
    public BookDto searchBook(String id) {
        return null;
    }

    @Override
    public List<BookDto> getAllBook() {
        return null;
    }
}
