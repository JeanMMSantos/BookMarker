package com.company.bookmarker.entities.users;

import java.time.LocalDate;

import com.company.bookmarker.entities.libraries.FreeLibrary;

import javax.persistence.Entity;

@Entity
public class FreeUser extends User{

    private FreeLibrary freeLibrary;    
    //Constructors
    public FreeUser() {
    }

    
}
