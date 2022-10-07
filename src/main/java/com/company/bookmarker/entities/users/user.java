package com.company.bookmarker.entities.users;

import java.time.LocalDate;

public abstract class User {
    private String name, password, email, gender, photo;
    private LocalDate date;
    private Long cpf, phone;
    
    //Constructors
    public User() {
    }
}


