package com.example.demo.controller;

import com.example.demo.dto.BookDto;
import com.example.demo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import util.ResponseUtil;

@RestController
@CrossOrigin
@RequestMapping("/api/book")
public class BookController {

    @Autowired
    private BookService service;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil getAllBooks(){
        return  new ResponseUtil(200, "OK",service.getAllBook());
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public ResponseUtil saveBook(@RequestBody BookDto dto){
        service.saveBook(dto);
        return new ResponseUtil(200, "Book added Successfully", null);
    }

    @DeleteMapping(params = {"id"},produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil deleteBooks(@RequestParam String id) {
        service.deleteBook(id);
        return new ResponseUtil(200, "Book Delete Successfully", null);
    }

    @GetMapping(path = "/search", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil searchBooks(@PathVariable String search) {
        return new ResponseUtil(200, "OK", service.searchBook(search));
    }

}
