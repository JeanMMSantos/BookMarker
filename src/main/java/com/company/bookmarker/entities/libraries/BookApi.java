package com.company.bookmarker.entities.libraries;

import javax.persistence.Entity;

@Entity
public class BookApi extends Book {

    private String key;
    private String isbn;

    public BookApi() {
    }
}
