package com.techbook.techbook.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@NoArgsConstructor
@Getter
@Setter
@Entity
@Table
public class Category implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;

    private String longName;

    @OneToMany(mappedBy = "category")
    @JsonIgnore
    private Set<Book> books = new HashSet<>();

    public Category(String name, String longName) {
        this.name = name;
        this.longName = longName;
    }
}






