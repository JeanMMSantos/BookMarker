package com.company.bookmarker.entities.libraries;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy= InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="classe")
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
