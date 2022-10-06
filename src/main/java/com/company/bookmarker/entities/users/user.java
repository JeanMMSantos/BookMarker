package com.company.bookmarker.entities.users;

import java.time.LocalDate;

public abstract class User {
    private String name, password, email, gender, photo;
    private LocalDate date;
    private Long cpf, phone;
    
    //Constructors
    public User() {
    }

    public User(String name, String password, String email, String gender, String photo, LocalDate date, Long cpf,
            Long phone) {
        this.name = name;
        this.password = password;
        this.email = email;
        this.gender = gender;
        this.photo = photo;
        this.date = date;
        this.cpf = cpf;
        this.phone = phone;
    }
}


