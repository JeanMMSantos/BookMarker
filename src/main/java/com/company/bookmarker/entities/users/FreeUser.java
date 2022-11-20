package com.company.bookmarker.entities.users;

import java.time.LocalDate;

import com.company.bookmarker.entities.libraries.FreeLibrary;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class FreeUser extends User{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @OneToOne
    private FreeLibrary freeLibrary;

    //private FreeLibrary freeLibrary;    
    //Constructors
    public FreeUser() {
    }

    
}
