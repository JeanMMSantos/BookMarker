package com.company.bookmarker.entities.users;
import java.time.LocalDate;
import javax.persistence.Entity;

@Entity
public abstract class User {
    private String name, password, email, gender, photo;
    private LocalDate date;
    private Long cpf, phone;
    
    //Constructors
    public User() {
    }
}