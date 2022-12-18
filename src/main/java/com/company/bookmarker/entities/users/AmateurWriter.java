
package com.company.bookmarker.entities.users;

import java.util.ArrayList;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import com.company.bookmarker.entities.libraries.AmateurWriterBook;
import com.company.bookmarker.entities.libraries.PremiumLibrary;


@Entity
public class AmateurWriter extends user {

    @OneToMany(mappedBy = "id")
    //@JoinColumn(name = "amauterwriter_id")
    private Set<AmateurWriterBook> amateurWriterBooks;

    private String pseudonym;
    private String Description;

    //private AmateurWriterBook mostPopBook;

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

    public ArrayList<AmateurWriterBook> getWritedBooks() {
        return writedBooks;
    }


    public void setWritedBooks(ArrayList<AmateurWriterBook> writedBooks) {
        this.writedBooks = writedBooks;
    }

    
}
