package com.company.bookmarker.entities.libraries;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Inheritance(strategy= InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="classe")
public class BookStatus {
    @OneToOne
    private Book book;
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private UUID id;
    private int currentPage;
    private String status;

    public BookStatus() {
    }
}
