
package com.company.bookmarker.entities.users;

import com.company.bookmarker.entities.libraries.AmateurWriterBook;
import java.time.LocalDate;



public class AmateurWriter extends User {
    private String pseudonym;
    private String Description;
    private AmateurWriterBook mostPopBook; 
    private AmateurWriterBook[] writedBooks;
    

    public AmateurWriter() {

    }

    
}
