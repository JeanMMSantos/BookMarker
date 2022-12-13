package com.company.bookmarker.entities.libraries;

import com.company.bookmarker.entities.users.AmateurWriter;

import java.util.Set;

import javax.persistence.*;


@Entity
@DiscriminatorValue(value="AmateurWriterBook")
public class AmateurWriterBook extends Book {


    private Set<AmateurWriter> amateurWriters;
    
    private double bookValue;
    private long id;
    
    public AmateurWriterBook() {
    }

    public double getBookValue() {
        return bookValue;
    }

    public void setBookValue(double bookValue) {
        this.bookValue = bookValue;
    }


    public long getId() {
        return id;
    }


    public void setId(long id) {
        this.id = id;
    }
}
