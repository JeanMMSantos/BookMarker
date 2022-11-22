package com.company.bookmarker.entities.libraries;

import com.company.bookmarker.entities.users.AmateurWriter;

import java.util.Set;

import javax.persistence.*;


@Entity
@DiscriminatorValue(value="AmateurWriterBook")
public class AmateurWriterBook extends Book {

    @ManyToMany(mappedBy = "amateurWriterBooks")
    private Set<AmateurWriter> amateurWriters;

    
    private double bookValue;
    
    public AmateurWriterBook() {
    }
}
