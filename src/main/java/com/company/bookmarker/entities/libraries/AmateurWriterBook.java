package com.company.bookmarker.entities.libraries;

import com.company.bookmarker.entities.users.AmateurWriter;

import java.util.Set;

import javax.persistence.*;


@Entity
@DiscriminatorValue(value="AmateurWriterBook")
public class AmateurWriterBook extends Book {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)

    @ManyToMany(mappedBy = "amateurWriterBooks")
    private Set<AmateurWriter> amateurWriters;

    private int id;
    private double bookValue;
    
    public AmateurWriterBook() {
    }
}
