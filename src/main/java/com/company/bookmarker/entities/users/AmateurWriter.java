
package com.company.bookmarker.entities.users;

import com.company.bookmarker.entities.libraries.AmateurWriterBook;
import java.util.ArrayList;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;

import org.hibernate.annotations.GeneratorType;



@Entity
public class AmateurWriter extends User {

    @ManyToMany
    private Set<AmateurWriterBook> amateurWriterBooks;

    private String pseudonym;
    private String Description;
    private AmateurWriterBook mostPopBook;
    private AmateurWriterBook amateurWriterBook; 
    private ArrayList<AmateurWriterBook> writedBooks = new ArrayList<AmateurWriterBook>();
    

    public AmateurWriter() {

    }


    public Set<AmateurWriterBook> getAmateurWriterBooks() {
        return amateurWriterBooks;
    }


    public void setAmateurWriterBooks(Set<AmateurWriterBook> amateurWriterBooks) {
        this.amateurWriterBooks = amateurWriterBooks;
    }


    public String getPseudonym() {
        return pseudonym;
    }


    public void setPseudonym(String pseudonym) {
        this.pseudonym = pseudonym;
    }


    public String getDescription() {
        return Description;
    }


    public void setDescription(String description) {
        Description = description;
    }


    public AmateurWriterBook getMostPopBook() {
        return mostPopBook;
    }


    public void setMostPopBook(AmateurWriterBook mostPopBook) {
        this.mostPopBook = mostPopBook;
    }


    public AmateurWriterBook getAmateurWriterBook() {
        return amateurWriterBook;
    }


    public void setAmateurWriterBook(AmateurWriterBook amateurWriterBook) {
        this.amateurWriterBook = amateurWriterBook;
    }


    public ArrayList<AmateurWriterBook> getWritedBooks() {
        return writedBooks;
    }


    public void setWritedBooks(ArrayList<AmateurWriterBook> writedBooks) {
        this.writedBooks = writedBooks;
    }

    
}
