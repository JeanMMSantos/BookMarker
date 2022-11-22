package com.company.bookmarker.entities.users;

import java.time.LocalDate;

import com.company.bookmarker.entities.libraries.FreeLibrary;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
public class FreeUser extends User{

    @OneToOne
    private FreeLibrary freeLibrary;

    //private FreeLibrary freeLibrary;    
    //Constructors
    public FreeUser() {
    }

    
}
