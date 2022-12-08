package com.company.bookmarker.entities.users;

import java.time.LocalDate;

import com.company.bookmarker.entities.libraries.FreeLibrary;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tbfreeUser")

public class FreeUser extends User{

    @OneToOne
    private FreeLibrary freeLibrary;

    //private FreeLibrary freeLibrary;    
    //Constructors
    public FreeUser() {
    }

    public FreeLibrary getFreeLibrary() {
        return freeLibrary;
    }

    public void setFreeLibrary(FreeLibrary freeLibrary) {
        this.freeLibrary = freeLibrary;
    } 
    
    
}
