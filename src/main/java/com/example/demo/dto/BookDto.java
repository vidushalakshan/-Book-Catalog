package com.example.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class BookDto {
    private int book_id;
    private String book_name;
    private String book_author;
    private String year_off_publication;
    private double book_price;
}
