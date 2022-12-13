package com.company.bookmarker.entities.libraries;

import javax.persistence.*;

@Entity
@Inheritance(strategy= InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="classe")
public class BookStatus {
    @ManyToOne
    private Book book;
    private int currentPage;
    private String status;

    public BookStatus() {
    }
}
