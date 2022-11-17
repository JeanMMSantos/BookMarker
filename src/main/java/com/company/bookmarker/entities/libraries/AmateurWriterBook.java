package com.company.bookmarker.entities.libraries;

import com.company.bookmarker.entities.users.AmateurWriter;

import javax.persistence.*;


@Entity
@DiscriminatorValue(value="AmateurWriterBook")
public class AmateurWriterBook extends Book {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;
    private double bookValue;
    @ManyToOne
    private AmateurWriter amateurWriter;

    public AmateurWriterBook() {
    }
}
