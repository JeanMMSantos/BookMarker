package com.company.bookmarker.entities.users;

import java.time.LocalDate;

public class FreeUser extends User{

    //Methods
    public FreeUser(String name, String password, String email, String gender, String photo, LocalDate date, Long cpf,
            Long phone) {
        super(name, password, email, gender, photo, date, cpf, phone);
    }

    public FreeUser() {
    }

    
}
