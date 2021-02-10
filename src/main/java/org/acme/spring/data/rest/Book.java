package org.acme.spring.data.rest;

import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Length(min = 2, max = 20)
    @NotBlank(message = "Name may not be blank")
    private String name;

    @Length(min = 2, max = 15)
    @NotBlank(message = "Color may not be blank")
    private String author;

    @ManyToOne
    @JoinColumn(name = "library_id")
    private Library library;

    public Book(){
    }

    public Book(String name, String author){
        this.name = name;
        this.author = author;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Library getLibrary() {
        return library;
    }

    public void setLibrary(Library library) {
        this.library = library;
    }
}
