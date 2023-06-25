package com.example.demo.controller;

import com.example.demo.dto.BookDto;
import com.example.demo.service.BookService;
import org.apache.tomcat.util.http.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/api/book")
public class BookController {

    @Autowired
    private BookService service;

    @PostMapping
    public ResponseEntity saveBook(@RequestBody BookDto dto){
        service.saveBook(dto);
        return new ResponseUtil(200, "Admin added Successfully", null);
    }
}
