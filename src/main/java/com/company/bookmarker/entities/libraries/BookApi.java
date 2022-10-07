package com.company.bookmarker.entities.libraries;

public class BookApi {

    private String key;
    private String isbn;

    public BookApi(String key, String isbn) {
        this.key = key;
        this.isbn = isbn;
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
