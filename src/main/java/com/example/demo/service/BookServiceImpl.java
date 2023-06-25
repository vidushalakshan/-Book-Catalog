package com.example.demo.service;

import com.example.demo.dto.BookDto;
import com.example.demo.model.Book;
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
        if (!repository.existsById(bookDto.getBook_id())){
            repository.save(modelMapper.map(bookDto, Book.class));
        }else {
            throw new RuntimeException("Book Already Exist..");
        }
    }

    @Override
    public void deleteBook(String bookID) {
        if (repository.existsById(Integer.valueOf(bookID))){
            repository.deleteById(Integer.valueOf(bookID));
        }else {
            throw new RuntimeException("Please cheack the Book ID.. No Such Book...!");
        }
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
