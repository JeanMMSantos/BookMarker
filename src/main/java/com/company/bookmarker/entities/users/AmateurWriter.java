
package com.company.bookmarker.entities.users;

import com.company.bookmarker.entities.libraries.AmateurWriterBook;
import java.util.ArrayList;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import org.hibernate.annotations.GeneratorType;



@Entity
public class AmateurWriter extends User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    @ManyToMany
    private Set<AmateurWriterBook> amateurWriterBooks;

    private String pseudonym;
    private String Description;
    private AmateurWriterBook mostPopBook;
    private AmateurWriterBook amateurWriterBook; 
    private ArrayList<AmateurWriterBook> writedBooks = new ArrayList<AmateurWriterBook>();
    

    public AmateurWriter() {

    }

    
}
