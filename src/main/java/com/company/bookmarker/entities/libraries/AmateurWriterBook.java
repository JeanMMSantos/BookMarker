package com.company.bookmarker.entities.libraries;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class AmateurWriterBook extends Book {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;
    private double bookValue;

    public AmateurWriterBook() {
    }
}
