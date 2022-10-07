
package com.company.bookmarker.entities.users;

import com.company.bookmarker.entities.libraries.AmateurWriterBook;
import java.util.ArrayList;




public class AmateurWriter extends User {
    private String pseudonym;
    private String Description;
    private AmateurWriterBook mostPopBook; 
    private ArrayList<AmateurWriterBook> writedBooks = new ArrayList<AmateurWriterBook>();
    

    public AmateurWriter() {

    }

    
}
