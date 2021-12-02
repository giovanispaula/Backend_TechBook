package com.techbook.techbook.dto;

import com.techbook.techbook.entities.Book;
import lombok.Data;

@Data
public class BookDTO {

    private Integer id;
    private String title;
    private Double price;
    private String description;
    private String image;
    private String category;

    public static BookDTO BookToDTO(Book book) {
        BookDTO b = new BookDTO();
        b.setId(book.getId());
        b.setTitle(book.getTitle());
        b.setPrice(book.getPrice());
        b.setDescription(book.getDescription());
        b.setImage(book.getImage());
        b.setCategory(book.getCategory().getName());
        return b;
    }

}
