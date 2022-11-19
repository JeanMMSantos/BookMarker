
package com.company.bookmarker.entities.users;

import com.company.bookmarker.entities.libraries.AmateurWriterBook;
import java.util.ArrayList;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.OneToMany;



@Entity
public class AmateurWriter extends User {

    @OneToMany(mappedBy = "amateurWriterBook")
    Set<AmateurWriterBook> amateurWriterBooks;

    private String pseudonym;
    private String Description;
    private AmateurWriterBook mostPopBook;
    private AmateurWriterBook amateurWriterBook; 
    private ArrayList<AmateurWriterBook> writedBooks = new ArrayList<AmateurWriterBook>();
    

    public AmateurWriter() {

    }

    
}
