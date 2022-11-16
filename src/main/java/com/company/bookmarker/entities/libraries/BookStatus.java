package com.company.bookmarker.entities.libraries;

import javax.persistence.Entity;

@Entity
public class BookStatus {
    private Book book;
    private int currentPage;
    private String status;

    public BookStatus() {
    }
}
