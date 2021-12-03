package com.techbook.techbook.entities;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@NoArgsConstructor
@Getter
@Setter
@Entity
@Table
public class Profile implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String fullName;
    private String urlGit;
    private String urlLinkedin;
    private String urlPhoto;

    @Lob
    @Column
    private String description;

    public Profile(String fullName, String urlGit, String urlLinkedin, String description) {
        this.fullName = fullName;
        this.urlGit = urlGit;
        this.urlLinkedin = urlLinkedin;
        this.description = description;
    }

}
