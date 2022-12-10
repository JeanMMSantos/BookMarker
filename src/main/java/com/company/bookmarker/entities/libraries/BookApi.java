package com.company.bookmarker.entities.libraries;

import javax.persistence.Entity;

@Entity
public class BookApi extends Book {

    private String key;
    private String isbn;

    public BookApi() {
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
}
