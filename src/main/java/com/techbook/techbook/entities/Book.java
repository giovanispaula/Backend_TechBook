package com.techbook.techbook.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@NoArgsConstructor
@Getter
@Setter
@Entity
@Table
public class Book implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String title;
    private Double price;
    private String description;
    private String image;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id", foreignKey = @ForeignKey(name = "fk_category"))
    @JsonIgnore
    private Category category;

    public Book(String title, Double price, String description, String image, Category category) {
        this.title = title;
        this.price = price;
        this.description = description;
        this.image = image;
        this.category = category;
    }

    public Book(Integer id, String title, Double price, String description, String image) {
        this.id = id;
        this.title = title;
        this.price = price;
        this.description = description;
        this.image = image;
    }
}