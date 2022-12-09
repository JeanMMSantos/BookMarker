package com.company.bookmarker.entities.libaries;

import javax.persistence.*;

@Entity
@Inheritance(strategy= InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="classe")
public class BookStatus {
    @OneToOne
    private Book book;
    private int currentPage;
    private String status;

    public BookStatus() {
    }
}
