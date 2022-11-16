package com.company.bookmarker.entities.libraries;

import javax.persistence.Entity;

@Entity
public class Book {
    private String name;
    private String cover;
    private String idioma;
    private String publishingCompany;
    private int numberOfPages;
    private String description;

    public Book() {
    }


}
