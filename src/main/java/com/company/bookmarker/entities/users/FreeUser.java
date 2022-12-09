package com.company.bookmarker.entities.users;

import com.company.bookmarker.entities.libaries.FreeLibrary;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tbfreeUser")

public class FreeUser extends user {

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
