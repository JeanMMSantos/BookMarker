package com.company.bookmarker.entities.libraries;

import com.company.bookmarker.entities.users.AmateurWriter;

import java.util.Set;

import javax.persistence.*;


@Entity
@DiscriminatorValue(value="AmateurWriterBook")
public class AmateurWriterBook extends Book {


    //ManyToOne(mappedBy="")
    private Set<AmateurWriter> amateurWriters;

    
    private double bookValue;
    
    public AmateurWriterBook() {
    }

    public double getBookValue() {
        return bookValue;
    }

    public void setBookValue(double bookValue) {
        this.bookValue = bookValue;
    }
}
