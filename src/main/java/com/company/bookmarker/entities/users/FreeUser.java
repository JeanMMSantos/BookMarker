package com.company.bookmarker.entities.users;

import java.time.LocalDate;

import com.company.bookmarker.entities.libraries.FreeLibrary;

public class FreeUser extends User{

    private FreeLibrary freeLibrary;
    
    //Constructors
    public FreeUser(String name, String password, String email, String gender, String photo, LocalDate date, Long cpf,
            Long phone, FreeLibrary freeLibrary) {
        super(name, password, email, gender, photo, date, cpf, phone);
        this.freeLibrary = freeLibrary;
    }

    public FreeUser() {
    }

    
}
